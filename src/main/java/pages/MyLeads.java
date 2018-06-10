package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class MyLeads extends ProjectMethods{
	
	public MyLeads() {		
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.XPATH, using ="//a[text()='Create Lead']")
	private WebElement eleCreateLeadIcon;
	@FindBy(how=How.XPATH, using ="//a[text()=\"Find Leads\"]")
	private WebElement eleFindLeadIcon;
	@FindBy(how=How.XPATH, using ="//a[text()=\"Merge Leads\"]")
	private WebElement eleMergeLeadIcon;
	@And("Click on Create Lead Icon")
	public CreateLead clickCreateLead() {
		click(eleCreateLeadIcon);
		return new CreateLead();		
	}
	public FindLeads clickFindLead() {
		click(eleFindLeadIcon);
		return new FindLeads();
	}
	public MergeLeads clickMergeLead() {
		click(eleMergeLeadIcon);
		return new MergeLeads();		
	}
	
	
	
	
	
	
	

}
