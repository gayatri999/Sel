package week2day2;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions op= new ChromeOptions();
		op.addArguments("disable-Infobars");
		op.setHeadless(true);
		ChromeDriver driver =new ChromeDriver(op);
		driver.get("http://leaftaps.com/opentaps");
		File screenshotAs=driver.getScreenshotAs(OutputType.FILE);
				File snap=new File("./snap/chrome.png");
		FileUtils.copyFile(screenshotAs,snap);
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElementByClassName("inputBox").sendKeys("csscorp");
		//driver.findElementById("createLeadForm_firstName").click();
		driver.findElementById("createLeadForm_firstName").sendKeys("Amaravadi");
		//driver.findElementById("createLeadForm_lastName").click();
		driver.findElementById("createLeadForm_lastName").sendKeys("lohitha");
		//driver.findElementById("createLeadForm_firstNameLocal").click();
		driver.findElementById("createLeadForm_firstNameLocal").sendKeys("sow");
		//driver.findElementById("createLeadForm_lastNameLocal").click();
		driver.findElementById("createLeadForm_lastNameLocal").sendKeys("raja");
		//driver.findElementById("createLeadForm_personalTitle").click();
		driver.findElementById("createLeadForm_personalTitle").sendKeys("correct");
		WebElement source=driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select dd =new Select(source);
        dd.selectByVisibleText("Conference");
       // driver.findElementById("createLeadForm_generalProfTitle").click();
        driver.findElementById("createLeadForm_generalProfTitle").sendKeys("created a lead");
        //driver.findElementById("createLeadForm_annualRevenue").click();
        driver.findElementById("createLeadForm_annualRevenue").sendKeys("400000");
        WebElement industry=driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select in =new Select(industry);
        in.selectByVisibleText("Computer Hardware");
        //driver.findElementById("createLeadForm_sicCode").click();
        driver.findElementById("createLeadForm_sicCode").sendKeys("4444");
        //driver.findElementById("createLeadForm_description").click();
        driver.findElementById("createLeadForm_description").sendKeys("Its my create lead page");
        //driver.findElementById("createLeadForm_importantNote").click();
        driver.findElementById("createLeadForm_importantNote").sendKeys("Sorry");
        driver.findElementById("createLeadForm_primaryPhoneCountryCode").clear();
        driver.findElementById("createLeadForm_primaryPhoneCountryCode").sendKeys("19601");
        //driver.findElementById("createLeadForm_primaryPhoneAreaCode").click();
        driver.findElementById("createLeadForm_primaryPhoneAreaCode").sendKeys("12345");
        //driver.findElementById("createLeadForm_primaryPhoneExtension").click();
        driver.findElementById("createLeadForm_primaryPhoneExtension").sendKeys("040");
        //driver.findElementById("createLeadForm_departmentName").click();
        driver.findElementById("createLeadForm_departmentName").sendKeys("computerscience");
        driver.findElementById("createLeadForm_annualRevenue").sendKeys("400000");
        WebElement currency=driver.findElement(By.id("createLeadForm_currencyUomId"));
		Select cu =new Select(currency);
		 cu.selectByVisibleText("DZD - Algerian Dinar");
		 //driver.findElementById("createLeadForm_numberEmployees").click();
		 driver.findElementById("createLeadForm_numberEmployees").sendKeys("45");
		 //driver.findElementById("createLeadForm_tickerSymbol").click();
		 driver.findElementById("createLeadForm_tickerSymbol").sendKeys("AAAA");
		 driver.findElementById("createLeadForm_primaryPhoneAskForName").sendKeys("karthik");
		 driver.findElementById("createLeadForm_primaryWebUrl").sendKeys("google.com");
		 driver.findElementById("createLeadForm_generalToName").sendKeys("ammullu");
		 driver.findElementById("createLeadForm_generalAddress1").sendKeys("gandhi street");
		 driver.findElementById("createLeadForm_generalAddress2").sendKeys("new perungalathur");
		 driver.findElementById("createLeadForm_generalCity").sendKeys("chennai");
		 WebElement state=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		 	Select sa =new Select(state);
			 sa.selectByVisibleText("Alaska");
		 WebElement country=driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
			Select co =new Select(country);
			co.selectByVisibleText("American Samoa");
		driver.findElementById("createLeadForm_generalPostalCode").sendKeys("19601");
		driver.findElementById("createLeadForm_generalPostalCodeExt").sendKeys("044");
		WebElement Market=driver.findElement(By.id("createLeadForm_marketingCampaignId"));
	 	Select ma =new Select(Market);
		 ma.selectByVisibleText("Car and Driver");
		 driver.findElementById("createLeadForm_primaryEmail").sendKeys("kpanyams@gmail.com");
		 driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("7871774170");
		 driver.findElementByClassName("smallSubmit").click();
		
		
		
				 
			 
		 
        
        
}
}
