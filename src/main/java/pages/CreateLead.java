package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import wdMethods.ProjectMethods;

public class CreateLead extends ProjectMethods{
	
	public CreateLead() {		
		PageFactory.initElements(driver,this);
	}	

	@FindBy(how=How.ID, using ="createLeadForm_companyName")
	private WebElement eleCmpyName;
	@FindBy(how=How.ID, using ="createLeadForm_firstName")
	private WebElement eleFName;
	@FindBy(how=How.ID, using ="createLeadForm_lastName")
	private WebElement eleLName;
	@FindBy(how=How.CLASS_NAME, using ="smallSubmit")
	private WebElement eleCreateLeadButton;
	@And("Enter the CompanyName as (.*)")
	public CreateLead typeCmpyName(String data) {
		type(eleCmpyName,data);
		return this;	
	}
	@And("Enter the FirstName as (.*)")
	public CreateLead typeFName(String data) {
		type(eleFName,data);
		return this;	
	}
	@And("Enter the LastName as (.*)")
	public CreateLead typeLName(String data) {
		type(eleLName, data);
		return this;	
	}
	@When("Click on CreateLead Button")
	public ViewLead clickCreateLeadButton() {
		click(eleCreateLeadButton);
		return new ViewLead();	
	}
	
	
	
	
	

}
