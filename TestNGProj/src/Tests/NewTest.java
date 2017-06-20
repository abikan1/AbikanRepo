package Tests;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

import DataUtil.ExcelData;
import Object_Repo.Common;
import Object_Repo.myhcl_Login;
import Object_Repo.myhcl_homefirst;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class NewTest  extends TestExcutor{
		
	

	//public  WebDriver driver; 	
	//public  WebDriverWait wait;
	public  ExtentReports report;
	//public  ExtentTest logger;
	
/////Page Object Declaration
	public myhcl_Login login=new myhcl_Login();
	public myhcl_homefirst hmpg=new myhcl_homefirst();
	public ExcelData xldata= new ExcelData();
	Common common= new Common();
	public String ExcelfilePath;

	
	@BeforeMethod
	public void beforeMethod() throws Exception
	{
		}

	@AfterMethod
	  public void afterMethod() {
			

		
	  }
	
	@BeforeClass
	public void beforeClass() throws Exception
	{
		System.out.println("Before Class");
		
//		intializer();
		//driver=new FirefoxDriver(); 
			String dest = System.getProperty("user.dir");
			ExcelfilePath=dest+"\\src\\InputData.xlsx";
			
			wait = new WebDriverWait(driver, 20);
			
			System.out.println(dest);
			report=new ExtentReports(dest+"\\src\\Report\\LearnAutomation.html");
			
			xldata.setData(ExcelfilePath,"Login");
			driver.get("https://www.myhcl.com");
			driver.manage().window().maximize(); Thread.sleep(2000);	 
			logger=report.startTest("<==========MyHcl Login=========>");
	
		
	}
	  @AfterClass
	  public void afterClass() {
		  report.endTest(logger);
		  report.flush();
		  driver.close();
			System.exit(0);
	  }

	@Test
	
  public void login() throws Exception {
		System.out.println("Hello World");
		logger.log(LogStatus.INFO, "<============My HCL Login===========>");
	
		common.InputXpath(login.username, xldata.getData(1,0), "Username");
		common.InputXpath(login.password, xldata.getData(1,1), "Password");
		common.selectbyValueXpath(login.domain, xldata.getData(1,2), "Domain");
		common.clickXpath(login.enterbutton, "Login");
		 
common.explicitWait(hmpg.hometab, "Home Tab");		
		
		logger.log(LogStatus.PASS, "Logged in");
  //}
	
	
	//@Test
	 // public void CheckHomePage() {

			System.out.println("CheckHomePage");
			 
			Assert.assertTrue(driver.findElement(By.xpath(hmpg.hclicon)).isDisplayed());
			logger.log(LogStatus.PASS, "Home Page Validated");
	//}
	
	
	//@Test 
	  //public void logout() throws InterruptedException {

			System.out.println("Logout MyHcl");
			
			common.clickXpath(hmpg.settingSpan, "Setting Icon");
			common.clickXpath(hmpg.Logout, "Logout");
			
			 Thread.sleep(2000);
			 Thread.sleep(3000);
			
			common.alertAccept();
			
		logger.log(LogStatus.PASS, "Logout Status");


	
	}  
	
	
  

  


}
