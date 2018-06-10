package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Then;
import wdMethods.ProjectMethods;

public class ViewLead extends ProjectMethods{
	

	public ViewLead() {		
		PageFactory.initElements(driver,this);
	}	
	//Verifying FName
	@FindBy(how=How.XPATH, using ="//*[@id=\"viewLead_firstName_sp\"]")
	private WebElement eleVerifyName;
	//click on EditLead Button
	@FindBy(how=How.XPATH, using ="(//div[contains(@class,'frameSectionExtra')])[2]/a[3]")
	private WebElement eleEditButton;
	@FindBy(how=How.ID, using ="viewLead_industryEnumId_sp")
	private WebElement eleVerifyIndustryName;
	@FindBy(how=How.ID, using ="viewLead_ownershipEnumId_sp")
	private WebElement eleVerifyOwnershipName;
	
	@Then("Verify FirstName")
	public ViewLead VerifyFName(String data) {
		verifyExactText(eleVerifyName, data);
		return this;
	}
	
	public EditLead ClickEditButton() {
		click(eleEditButton);
		return new EditLead();
	}
	
	public ViewLead VerifyIndustryName(String data) {
		verifyExactText(eleVerifyIndustryName, data);
		return this;
	}
	public ViewLead VerifyOwnershipName(String data) {
		verifyExactText(eleVerifyOwnershipName, data);
		return this;
	}
	
	

}
