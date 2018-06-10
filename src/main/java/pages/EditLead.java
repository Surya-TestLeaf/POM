package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class EditLead extends ProjectMethods{
	

	public EditLead() {		
		PageFactory.initElements(driver,this);
	}	
	//Verifying FName
	@FindBy(how=How.XPATH, using ="//*[@id=\"viewLead_firstName_sp\"]")
	private WebElement eleVerifyName;
	//click on EditLead Button
	@FindBy(how=How.XPATH, using ="(//div[contains(@class,'frameSectionExtra')])[2]/a[3]")
	private WebElement eleEditButton;
	@FindBy(how=How.ID, using ="updateLeadForm_industryEnumId")
	private WebElement eleIndustryName;
	@FindBy(how=How.ID, using ="updateLeadForm_ownershipEnumId")
	private WebElement eleOwnershipName;
	@FindBy(how=How.CLASS_NAME, using ="smallSubmit")
	private WebElement eleUpdateButton;
	
	public EditLead updateIndustyName(String data) {
		selectDropDownUsingText(eleIndustryName, data);
		return this;
	}
	
	public EditLead updateOwnershipName(String data) {
		selectDropDownUsingText(eleOwnershipName, data);
		return this;
	}
	public ViewLead ClickupdateButton() {
		click(eleUpdateButton);
		return new ViewLead();
	}
	
	
	
	

}
