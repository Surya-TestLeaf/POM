package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import cucumber.api.java.en.*;

public class Login {

	public static RemoteWebDriver driver;
	
	@Given("Invoke the LeaftapApplication")
	public void invokeApp() {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("http://leaftaps.com/opentaps/");
	}
	@And("Enter the UserName as (.*)")
	public void enterUserName(String UName) {
		driver.findElementById("username").sendKeys(UName);
		
	}
	@And("Enter the Password as (.*)")
	public void enterPassword(String pwd) {
		driver.findElementById("password").sendKeys(pwd);
		
	}
	@When("Click on LoginButton")
	public void clickLogin() {
		driver.findElementByClassName("decorativeSubmit").click();
	}
	@Then("Verify Login is Successfull")
	public void verifyLogin() {
		System.out.println("Login Is Successfull");
	}
}
