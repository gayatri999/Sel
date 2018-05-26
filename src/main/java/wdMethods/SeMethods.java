package wdMethods;

import java.awt.Window;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class SeMethods implements WdMethods{
	RemoteWebDriver driver;	
	int i = 1;
	public void startApp(String browser, String url) {
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver = new ChromeDriver();			
		} else {
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("The Browser is Launched");

	}

	public WebElement locateElement(String locator, String locValue) {
		switch (locator) {
		case "id":
			return	driver.findElementById(locValue);		
		case "name":
			return	driver.findElementByName(locValue);			
		case "class":
			return	driver.findElementByClassName(locValue);			
		case "link":
			return	driver.findElementByLinkText(locValue);			
		case "tag":
			return	driver.findElementByTagName(locValue);			
		case "xpath":
			return	driver.findElementByXPath(locValue);
		default:
			break;
		}
		return null;
	}

	public WebElement locateElement(String locValue) {
		return locateElement("id", locValue);
	}

	public void type(WebElement ele, String data) {
		ele.clear();
		ele.sendKeys(data);
		System.out.println("The Value is Entered");
		takeSnap();
	}

	public void click(WebElement ele) {
		ele.click();
		System.out.println("The Element Is Clicked");
		takeSnap();
	}

	public void clickWithNoSnap(WebElement ele) {
		// TODO Auto-generated method stub
		ele.click();
		System.out.println("The Element Is Clicked With Out a Snap");

	}

	public String getText(WebElement ele) {
		// TODO Auto-generated method stub
		WebElement element = driver.findElementByClassName("Element of class element");
		element.getText();
		return null;
	}

	public void selectDropDownUsingText(WebElement ele, String value) {
		// TODO Auto-generated method stub
		Select de =new Select(ele);
        de.selectByVisibleText(value);
        System.out.println("The "+ele+ "dropdown is selecyed with value "+value);	
        takeSnap();
		
	}

	public void selectDropDownUsingIndex(WebElement ele, int index) {
		// TODO Auto-generated method stub
		Select da =new Select(ele);
        da.selectByIndex(index);
        System.out.println("The "+ele+ "dropdown is selected with value "+index);
        takeSnap();
	}

	public boolean verifyTitle(String expectedTitle) {
		// TODO Auto-generated method stub
		String actualTitle=driver.getTitle();
	    if(actualTitle.equals(expectedTitle)){
	        System.out.println("Actual Title Is Equal To Expected Title");
	    }
	    else{
	        System.out.println("Actual Title Is Not Equal TO Expected Title");
	    }
		return false;
	}

	public void verifyExactText(WebElement ele, String expectedText) {
		// TODO Auto-generated method stub

	}

	public void verifyPartialText(WebElement ele, String expectedText) {
		// TODO Auto-generated method stub

	}

	public void verifyExactAttribute(WebElement ele, String attribute, String value) {
		// TODO Auto-generated method stub
		
	}

	public void verifyPartialAttribute(WebElement ele, String attribute, String value) {
		// TODO Auto-generated method stub

	}

	public void verifySelected(WebElement ele) {
		// TODO Auto-generated method stub
		driver.findElementByClassName("ele").isSelected();
		ele.isSelected();

		 

	}

	public void verifyDisplayed(WebElement ele) {
		driver.findElementByClassName("ele").isDisplayed();
		ele.isDisplayed();

	}

	public void switchToWindow(int index) {
	Set<String> allWindows= driver.getWindowHandles();
	System.out.println(allWindows.size());
	List<String> listOfWindows=new ArrayList<String>();
	listOfWindows.addAll(allWindows);
	String secWindow=listOfWindows.get(index);
	driver.switchTo().window(secWindow);	
	System.out.println(driver.getCurrentUrl());
	driver.close();
	}

	public void switchToFrame(WebElement ele) {
		// TODO Auto-generated method stub
		WebElement fr = driver.findElementById("theIframe");
		driver.switchTo().frame(fr);
	System.out.println("Switching to the frame");
	}

	public void acceptAlert() {
		// TODO Auto-generated method stub
		driver.switchTo().alert().accept();
		System.out.println("Clicks on 'Ok' button in alert");
	}

	public void dismissAlert() {
		// TODO Auto-generated method stub
		driver.switchTo().alert().dismiss();
		System.out.println("Clicks on 'Cancel' button in alert");
	}

	public String getAlertText() {
		// TODO Auto-generated method stub
		Alert alert = driver.switchTo().alert();
		alert.getText();
		System.out.println("The text of alert is" );
		return null;
	}

	public void takeSnap() {
		File src = driver.getScreenshotAs(OutputType.FILE);
		File desc = new File("./snaps/img"+i+".png");
		try {
			FileUtils.copyFile(src, desc);
		} catch (IOException e) {
			e.printStackTrace();
		}
		i++;
	}

	public void closeBrowser() {
		// TODO Auto-generated method stub
		driver.close();
		System.out.println("Browser is closed");
	}

	public void closeAllBrowsers() {
		// TODO Auto-generated method stub
			driver.quit();
		System.out.println("All browsers are closed");
	}



}
