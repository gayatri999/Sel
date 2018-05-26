package week2day1;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		WebElement source=driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select dd =new Select(source);
        dd.selectByVisibleText("Employee");
        WebElement marketing=driver.findElement(By.id("createLeadForm_marketingCampaignId"));
        Select scl = new Select(marketing);
        List<WebElement> alloptions=scl.getOptions();
        for(WebElement eachoption:alloptions)
        {
        	String text=eachoption.getText();
        	System.out.println(text);
        	
        }

	}
}
