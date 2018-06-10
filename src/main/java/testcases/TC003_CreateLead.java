package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC003_CreateLead extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC003_CreateLead";
		testDescription="Creating New leads in LeafTaps Application";
		testNodes="Leads";
		category="Smoke";
		authors="Surya";
		browserName="chrome";
		dataSheetName="TC003_CreateLead";
	}
	@Test(dataProvider="fetchData")
	public void loginAndLogout(String uName,String pwd,String vName, String CmpyName, String FName, String LName, String VerifyName) {
		
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.verifyLoggedName(vName)
		.clickCrmSfa()
		.clickLeads()
		.clickCreateLead()
		.typeCmpyName(CmpyName)
		.typeFName(FName)
		.typeLName(LName)
		.clickCreateLeadButton()
		.VerifyFName(VerifyName);
		
		
	}

}
