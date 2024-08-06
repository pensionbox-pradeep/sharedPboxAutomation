package testScripts;


import org.testng.annotations.Test;
import java.awt.AWTException;

import org.testng.annotations.Test;

import generic.BaseClass;
import pageObjects.DashboardPage;
import pageObjects.Nps1RegistrationPage;
import pageObjects.PersonalDetailsPage;

public class NpsTier1Flow extends BaseClass{
	@Test
	public void openNPST1account() throws InterruptedException, AWTException {
		Nps1RegistrationPage nps1=new Nps1RegistrationPage(driver);
		PersonalDetailsPage pdp=new PersonalDetailsPage(driver);
		DashboardPage dp=new DashboardPage(driver);
		
		dp.getnpsOpenNowBtn().click();
		
		Thread.sleep(5000);
		nps1.getLetsDoItNowBtn().click();
		
		pdp.fillAutoPersonalDetails("npradeeppai10@11gmail.com");
		
		pdp.fillPersonalDetails('s', "N Pradeep", "P", "Pai", "Udupi", 'u');
		
		pdp.fillFamilyDetailsFather("N Pramod", "S", "Pai");
		
		//pdp.fillFamilyDetailsMother(null, null, null);
		
		pdp.fillCommunicationsDetails("3-33, Shri Mahalasa", "Naikanakatte Kergal", "-", "Naikanakatte Kergal", "Kundapura Taluk", "576219", "Udupi", "Karnataka");
		
		pdp.getpDSaveNextBtn().click();
		
		nps1.fillPranCardDetails('f', false, false);
		
		nps1.fillNomineeDetails("N Pramod", "S", "Pai", true, "father", "59", "100");
		
		nps1.fillBankDetails("private", "CNRB0003678", 's', "74103678963");
		
		nps1.fillDocumentUpload("\"/home/pensionbox_pradeep/Downloads/signature.png\"");
		
		nps1.fillSchemePreferencePt1(0, "ICICI");
		
		nps1.fillSchemePreferencePt2('a', 'a');
		
		/*
		 * Overview (need to write logic to crosscheck data 
		 */
		nps1.getNpsOverViewModalProceedBtn().click();
		
		nps1.getInitNPScontributeFinishBtn().click();
	}
}
