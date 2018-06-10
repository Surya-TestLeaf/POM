package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class MergeLeads extends ProjectMethods{
	
	public MergeLeads() {		
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.XPATH, using ="//a[text()='Create Lead']")
	private WebElement eleCreateLeadIcon;
	@FindBy(how=How.XPATH, using ="//a[text()=\"Find Leads\"]")
	private WebElement eleFindLeadIcon;
	@FindBy(how=How.XPATH, using ="//a[text()=\"Merge Leads\"]")
	private WebElement eleMergeLeadIcon;
	
	public CreateLead clickCreateLead() {
		click(eleCreateLeadIcon);
		return new CreateLead();		
	}
	public CreateLead clickFindLead() {
		click(eleFindLeadIcon);
		return new CreateLead();		
	}
	public CreateLead clickMergeLead() {
		click(eleMergeLeadIcon);
		return new CreateLead();		
	}
	
	
	
	
	
	
	

}
