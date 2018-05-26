package week2day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SignupIrctc {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.irctc.co.in/eticketing/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.findElement(By.linkText("Sign up")).click();
		driver.findElement(By.id("userRegistrationForm:userName")).sendKeys("vsdbvkfnlfd");
		driver.findElement(By.linkText("Check Availability")).click();
		driver.findElement(By.id("userRegistrationForm:password")).sendKeys("Redsandal123*");
		driver.findElement(By.id("userRegistrationForm:confpasword")).sendKeys("Redsandal123*");
		WebElement security=driver.findElement(By.id("userRegistrationForm:securityQ"));
		Select dd =new Select(security);
        dd.selectByVisibleText("What is your pet name?");
        driver.findElement(By.id("userRegistrationForm:securityAnswer")).sendKeys("nani");
        WebElement language=driver.findElement(By.id("userRegistrationForm:prelan"));
		Select la =new Select(language);
        la.selectByVisibleText("हिन्दी");
        driver.findElement(By.id("userRegistrationForm:firstName")).sendKeys("amaravadi");
        driver.findElement(By.id("userRegistrationForm:middleName")).sendKeys("lohitha");
        driver.findElement(By.id("userRegistrationForm:lastName")).sendKeys("sowmya");
        driver.findElement(By.id("userRegistrationForm:gender:1")).click();
        driver.findElement(By.id("userRegistrationForm:maritalStatus:0")).click();
        WebElement day=driver.findElement(By.id("userRegistrationForm:dobDay"));
		Select da =new Select(day);
        da.selectByValue("27");
        WebElement month=driver.findElement(By.id("userRegistrationForm:dobMonth"));
		Select mo =new Select(month);
        mo.selectByValue("09");
        WebElement year=driver.findElement(By.id("userRegistrationForm:dateOfBirth"));
		Select ye =new Select(year);
        ye.selectByValue("1991");
        WebElement occupation=driver.findElement(By.id("userRegistrationForm:occupation"));
		Select oc =new Select(occupation);
        oc.selectByVisibleText("Private");
        driver.findElement(By.id("userRegistrationForm:uidno")).sendKeys("390044478746");
        driver.findElement(By.id("userRegistrationForm:idno")).sendKeys("FTUPS5");
        WebElement country=driver.findElement(By.id("userRegistrationForm:countries"));
		Select co =new Select(country);
        co.selectByVisibleText("India");
        driver.findElement(By.id("userRegistrationForm:email")).sendKeys("kpanyams@gmail.com");
        //driver.findElement(By.id("userRegistrationForm:isdCode")).sendKeys("91");
        driver.findElement(By.id("userRegistrationForm:mobile")).sendKeys("7871774170",Keys.TAB);
        WebElement nationality=driver.findElement(By.id("userRegistrationForm:nationalityId"));
		Select na =new Select(nationality);
        na.selectByVisibleText("India");
        driver.findElement(By.id("userRegistrationForm:address")).sendKeys("flatno.10");
        driver.findElement(By.id("userRegistrationForm:street")).sendKeys("sriniva street");
        driver.findElement(By.id("userRegistrationForm:area")).sendKeys("perungalathur");
		driver.findElement(By.id("userRegistrationForm:pincode")).sendKeys("600063",Keys.TAB);
		Thread.sleep(4000);
		//driver.findElement(By.id("userRegistrationForm:otherState")).sendKeys("mmmm",Keys.TAB);
		//Thread.sleep(4000);
		//driver.findElement(By.id("userRegistrationForm:otherCityId")).sendKeys("JCJD",Keys.TAB);
		//Thread.sleep(4000);
		WebElement city=driver.findElement(By.id("userRegistrationForm:cityName"));
		Select ci =new Select(city);
        ci.selectByVisibleText("Kanchipuram");
        Thread.sleep(4000);
        WebElement postoffice=driver.findElement(By.id("userRegistrationForm:postofficeName"));
		Select po =new Select(postoffice);
        po.selectByValue("Old Perungalathur B.O");
        driver.findElement(By.id("userRegistrationForm:landline")).sendKeys("9786851144");
        driver.findElement(By.id("userRegistrationForm:resAndOff:1")).click();
        driver.findElement(By.id("userRegistrationForm:addresso")).sendKeys("perungalathur");
        driver.findElement(By.id("userRegistrationForm:streeto")).sendKeys("omr");
        driver.findElement(By.id("userRegistrationForm:areao")).sendKeys("shriram gateway");
        WebElement untry=driver.findElement(By.id("userRegistrationForm:countrieso"));
		Select un =new Select(untry);
        un.selectByVisibleText("India");
        driver.findElement(By.id("userRegistrationForm:pincodeo")).sendKeys("600063",Keys.TAB);
		Thread.sleep(4000);
		WebElement town=driver.findElement(By.id("userRegistrationForm:cityNameo"));
		Select to =new Select(town);
        to.selectByValue("Kanchipuram");
        Thread.sleep(4000);
        WebElement office=driver.findElement(By.id("userRegistrationForm:postofficeNameo"));
		Select of =new Select(office);
        of.selectByValue("Srinivasanagar East B.O");
        driver.findElement(By.id("userRegistrationForm:landlineo")).sendKeys("0402554282");
        
        
        
        
		
		
		
       
        
		
	}

}
