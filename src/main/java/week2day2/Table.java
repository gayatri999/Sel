package week2day2;

import java.util.List;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Table {

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
		driver.findElementById("createLeadForm_birthDate-button").click();
	driver.findElementByXPath("//table[@class='calendar']");
	
	List<WebElement> allrows = driver.findElements(By.tagName("tr"));
	int rowscount= allrows.size();
	System.out.println(rowscount);
	allrows.get(1);
	List<WebElement> columns = driver.findElementsByTagName("td");
	System.out.println(columns.size());
	columns.get(1).click();
	}

}
