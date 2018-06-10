package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC004_EditLead extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC004_EditLead";
		testDescription="Update the existing leads in LeafTaps Application";
		testNodes="Leads";
		category="Smoke";
		authors="Surya";
		browserName="chrome";
		dataSheetName="TC004_EditLead";
	}
	@Test(dataProvider="fetchData")
	public void loginAndLogout(String uName,String pwd,String vName, String elefirName, String eleIndustryName, String eleOwnershipName, String eleVerifyIndustryName, String eleVerifyOwnershipName) {
		
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.verifyLoggedName(vName)
		.clickCrmSfa()
		.clickLeads()
		.clickFindLead()
		.typeFirName(elefirName)
		.clickFindLeadButton()
		.clickFirstData()
		.ClickEditButton()
		.updateIndustyName(eleIndustryName)
		.updateOwnershipName(eleOwnershipName)
		.ClickupdateButton()
		.VerifyIndustryName(eleVerifyIndustryName)
		.VerifyOwnershipName(eleVerifyOwnershipName);
		
		
	}

}
