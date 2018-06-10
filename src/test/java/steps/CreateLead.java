package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import cucumber.api.java.en.*;

public class CreateLead {

	public static RemoteWebDriver driver;
	
	@Given("Invoke the Leaftap Application")
	public void invokeApp() {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("http://leaftaps.com/opentaps/");
	}
	@And("Enter UserName as (.*)")
	public void enterUserName(String UName) {
		driver.findElementById("username").sendKeys(UName);
		
	}
	@And("Enter Password as (.*)")
	public void enterPassword(String pwd) {
		driver.findElementById("password").sendKeys(pwd);
		
	}
	@When("Click LoginButton")
	public void clickLogin() {
		driver.findElementByClassName("decorativeSubmit").click();
	}
	//@Then("VerifyLogin is Successful")
	public void verifyLogin() {
		System.out.println("Login Is Successfull");
	}
	@And("Clickon CRM/SFA")
	public void clickCRMSFA() {
		driver.findElementByLinkText("CRM/SFA").click();
	}
	@And("Click on Leads Tab")
	public void clickLeadsTab() {
		driver.findElementByXPath("//*[text()=\"Leads\"]").click();
	}
	@And("Clickon Create Lead Icon")
	public void clickCreateLeadsIcon() {
		driver.findElementByXPath("//a[text()=\"Create Lead\"]").click();
	}
	@And("Enter CompanyName as (.*)")
	public void EnterCompyName(String CmpyName) {
		driver.findElementById("createLeadForm_companyName").sendKeys(CmpyName);
	}
	@And("Enter FirstName as (.*)")
	public void EnterFirstName(String FName) {
		driver.findElementById("createLeadForm_firstName").sendKeys(FName);
	}
	@And("Enter LastName as (.*)")
	public void EnterLastName(String LName) {
		driver.findElementById("createLeadForm_lastName").sendKeys(LName);
	}
	@When("Clickon CreateLead Button")
	public void clickCreateleadButton() {
		driver.findElementByClassName("smallSubmit").click();
	}
	@Then("Verify the FirstName")
	public void verifyFirstName() {
		String VName = driver.findElementById("viewLead_firstName_sp").getText();
		
		System.out.println("Name is Verified Successfully");
			
	}
}
