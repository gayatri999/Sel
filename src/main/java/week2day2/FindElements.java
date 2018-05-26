package week2day2;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.get("http://leafground.com");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		List<WebElement> buttons = driver.findElementsById("buttons");
		int bttn = buttons.size();
		System.out.println("bttn");
		for(WebElement eachButton:buttons)
		{
			System.out.println("eachButton.gettext()");
			
		}
		WebElement fourthElement=buttons.get(3);
		fourthElement.click();
	}
	

}
