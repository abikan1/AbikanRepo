package Tests;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import DataUtil.ExcelData;
import Object_Repo.Common;
import Object_Repo.myhcl_Login;
import Object_Repo.myhcl_homefirst;



public class TestExcutor {

	public  WebDriver driver=new FirefoxDriver();  	
	public static WebDriverWait wait;
//	public static ExtentReports report;
	public static ExtentTest logger;
//	
///////Page Object Declaration
//	public myhcl_Login login=new myhcl_Login();
//	myhcl_homefirst hmpg=new myhcl_homefirst();
//	public ExcelData xldata= new ExcelData();
//	Common common= new Common();
//	public String ExcelfilePath;
//
//	
//	@BeforeMethod
//	public void beforeMethod() throws Exception
//	{
//		}
//
//	@AfterMethod
//	  public void afterMethod() {
//			
//
//		
//	  }
//	
//	@BeforeClass
//	public void beforeClass() throws Exception
//	{
//			
//		
////		intializer();
//		
//			String dest = System.getProperty("user.dir");
//			ExcelfilePath=dest+"\\src\\InputData.xlsx";
//			
//			wait = new WebDriverWait(driver, 20);
//			
//			System.out.println(dest);
////			SimpleDateFormat sp=new SimpleDateFormat("dd-MM-yy HH:mm");
////			Date date=new Date();
////			d=(sp.format(d));
//			report=new ExtentReports(dest+"\\src\\Report\\LearnAutomation.html");
//			
//			xldata.setData(ExcelfilePath,"Login");
//			driver.get("https:/www.myhcl.com");
//			driver.manage().window().maximize(); Thread.sleep(2000);	 
//			logger=report.startTest("<==========MyHcl Login=========>");
//	
//		
//	}
//	  @AfterClass
//	  public void afterClass() {
//		  report.endTest(logger);
//		  report.flush();
//		  driver.close();
//			System.exit(0);
//	  }
////	public void intializer()
////	{
////	//General Declarations
////	 	
////	String dest = System.getProperty("user.dir");
////	ExcelfilePath=dest+"\\src\\InputData.xlsx";
////	
////	wait = new WebDriverWait(driver, 20);
////	
////	
////	System.out.println(dest);
//////	SimpleDateFormat sp=new SimpleDateFormat("dd-MM-yy HH:mm");
//////	Date date=new Date();
//////	d=(sp.format(d));
////	report=new ExtentReports(dest+"\\src\\Report\\LearnAutomation.html");
////	
////	
////	}
//
}
