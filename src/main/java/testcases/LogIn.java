package testcases;

//import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import wdMethods.SeMethods;

public class LogIn extends SeMethods{
	@Test
	public void run() {
		startApp("chrome", "http://leaftaps.com/opentaps");
		WebElement userName = locateElement("id","username");
		type(userName, "DemoSalesManager");
		WebElement passWord = locateElement("id", "password");
		type(passWord, "crmsfa");
		WebElement login = locateElement("class", "decorativeSubmit");
		click(login);	
		WebElement crmsfa = locateElement("link", "CRM/SFA");
		click(crmsfa);
		WebElement lead = locateElement("link", "Leads");
		click(lead);
		WebElement createlead = locateElement("link", "Create Lead");
		click(createlead);
		WebElement companyname=locateElement ("id", "createLeadForm_companyName");
			 type(companyname,"ibm");
			 WebElement firstname=locateElement ("id", "createLeadForm_firstName");
			 type(firstname,"SOWMYA");
			 WebElement lastname=locateElement ("id", "createLeadForm_lastName");
			 type(lastname,"m");
			 /*WebElement source=locateElement("id","createLeadForm_dataSourceId");
			 selectDropDownUsingIndex(source, 2);
			 WebElement Market=locateElement("link","createLeadForm_marketingCampaignId");
			 selectDropDownUsingText(Market, "Automobile");*/
			 WebElement button = locateElement("name", "submitButton");
			 click(button);
			 
	}
}

	
	


 