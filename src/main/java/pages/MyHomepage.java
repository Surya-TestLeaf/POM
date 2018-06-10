package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class MyHomepage extends ProjectMethods{

	public MyHomepage() {		
		PageFactory.initElements(driver,this);
	}	

	
	@FindBy(how=How.XPATH, using ="//a[text()='Leads']")
	private WebElement eleLeadsButton;
	@And("Clickon LeadsTab")
	public MyLeads clickLeads() {
		click(eleLeadsButton);
		return new MyLeads();		
	}
	
	
	
}







