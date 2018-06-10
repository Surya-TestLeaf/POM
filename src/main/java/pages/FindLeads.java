package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class FindLeads extends ProjectMethods{
	
	public FindLeads() {		
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.XPATH, using ="(//div[contains(@class,'x-form-element')])[22]/input")
	private WebElement elefirName;
	@FindBy(how=How.XPATH, using ="(//td[contains(@class,'x-btn-center')])[7]/em/button")
	private WebElement eleFindLeadButton;
	
	@FindBy(how=How.XPATH, using= "(//table[contains(@class,'x-grid3-row-table')])[1]/tbody/tr/td/div/a")
	private WebElement eleFirstdata;
	
	public FindLeads typeFirName(String data) {
		type(elefirName, data);
		return this;	
	}
	public FindLeads clickFindLeadButton() {
		click(eleFindLeadButton);
		return this;		
	}
	public ViewLead clickFirstData() {
		click(eleFirstdata);
		return new ViewLead();		
	}
	
	
}
