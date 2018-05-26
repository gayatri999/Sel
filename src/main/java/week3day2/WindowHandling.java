package week3day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		driver.manage().window().maximize();
		driver.findElementByLinkText("Contact Us").click();
		Set<String> allWindows= driver.getWindowHandles();
		System.out.println(allWindows.size());
	List<String> listOfWindows=new ArrayList<String>();
	listOfWindows.addAll(allWindows);
	String secWindow=listOfWindows.get(1);
	driver.switchTo().window(secWindow);	
	System.out.println(driver.getCurrentUrl());
	driver.close();
	
	
	}

}
