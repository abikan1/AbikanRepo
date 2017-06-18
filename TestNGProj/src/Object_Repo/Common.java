package Object_Repo;

import java.io.File;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

//import test.java.com.lol.utils.WebElement;

import com.relevantcodes.extentreports.LogStatus;

import Tests.TestExcutor;

public class Common extends TestExcutor{
	//WebElement element = null;
	//List<WebElement> rows = null;
	//Select select = null;
	public Common()
	{
		System.out.println("Common Intinalized");
	}
	
	public void InputXpath(String xpath, String input, String element)
	{
		try{
			driver.findElement(By.xpath(xpath)).sendKeys(input);
			logger.log(LogStatus.PASS, "Entered Details of"+element);
		}
		catch (Exception e){
			logger.log(LogStatus.FAIL, "Failed to Input"+element+"Error: "+e);
			getScreenshots();
		}
	}
	
	public void clickXpath(String xpath, String element)
	{
		try{
			driver.findElement(By.xpath(xpath)).click();
			logger.log(LogStatus.PASS, "Clicked on element"+ element);
		}
		catch (Exception e){
			logger.log(LogStatus.FAIL, "Failed to Click"+element+"Error: "+e);
			getScreenshots();
		}
	}
	
	public void selectbyValueXpath(String xpath, String value, String element)
	{
		try{
			Select select=new Select(driver.findElement(By.xpath(xpath)));
			select.selectByValue(value);
			logger.log(LogStatus.PASS, "Selected element"+ element);
		}
		catch (Exception e){
			logger.log(LogStatus.FAIL, "Failed to Select"+element+"Error: "+e);
			getScreenshots();
		}
	}
	
	public void explicitWait(String xpath, String element)
	{
		try{
			wait.until(ExpectedConditions.elementToBeSelected(By.xpath(xpath)));
			logger.log(LogStatus.PASS, "Wait element"+ element+"found");
		}
		catch (Exception e){
			logger.log(LogStatus.FAIL, "Wait Element"+element+"Error: "+e);
			getScreenshots();
		}
	}

	
	public void alertAccept()
	{
		try{
			Alert alert=driver.switchTo().alert();
			alert.accept();Thread.sleep(3000);
			
		}
		catch (Exception e){
			logger.log(LogStatus.FAIL, "Alert PopUp Error: "+e);
			getScreenshots();
		}
	}

	public void alertDismiss()
	{
		try{
			Alert alert=driver.switchTo().alert();
			alert.dismiss(); Thread.sleep(3000);
			
		}
		catch (Exception e){
			logger.log(LogStatus.FAIL, "Alert PopUp Error: "+e);
			getScreenshots();
		}
	}
	public void getScreenshots()
	{
		try{
			File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	           //The below method will save the screen shot in d drive with name "screenshot.png"
	              
			String destFile="C:\\Users\\Hp-pc\\workspace\\TestNGProj\\src\\Report\\Screenshots\\Error.png";
			FileUtils.copyFile(scrFile, new File(destFile));
	              logger.log(LogStatus.FAIL, "Snapshot below: " + logger.addScreenCapture(destFile));
		}
		catch (Exception e){
	
			logger.log(LogStatus.FAIL, "Failed to Get Screenshot Error: "+e);
		}
	}
	
}
