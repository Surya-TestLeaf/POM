package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class HomePage extends ProjectMethods{

	public HomePage() {		
		PageFactory.initElements(driver,this);
	}	

	@FindBy(how=How.CLASS_NAME,using="decorativeSubmit")
	private WebElement eleLogOut;
	@FindBy(how=How.XPATH,using="//h2[text()[contains(.,'Welcome')]]")
	private WebElement eleLoggedName;
	@FindBy(how=How.XPATH,using="(//div[@id=\"label\"])[1]/a")
	private WebElement elecrmsfa;

	public LoginPage clickLogOut() {
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleLogOut);
		return new LoginPage();		
	}
	@And("VerifyLogin is Successfull")
	public HomePage verifyLoggedName(String data) {
		verifyPartialText(eleLoggedName, data);
		return this;		
	}
	@And("Clickon CRM/SFA")
	public MyHomepage clickCrmSfa() {
		click(elecrmsfa);
		return new MyHomepage();		
	}





}
