package DataUtil;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.*;
public class ExcelData {

	/**
	 * @param args
	 */
	
	public XSSFWorkbook myhclbook;
	public XSSFSheet ExcelWSheet;
	public XSSFRow row;
public XSSFCell Cell;
	
	public void setData(String Path,String SheetName) throws Exception {

			try {

   			// Open the Excel file

			FileInputStream ExcelFile = new FileInputStream(Path);

			// Access the required test data sheet

			myhclbook = new XSSFWorkbook(ExcelFile);

			ExcelWSheet = myhclbook.getSheet(SheetName);

			} catch (Exception e){

				throw (e);

			}

	}
	
	 public String getData(int RowNum, int ColNum) throws Exception{

			try{

   			Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);
   			
   			String CellData = Cell.getStringCellValue();

   			return CellData;

   			}catch (Exception e){

					return"";

   			}

	    }
}
