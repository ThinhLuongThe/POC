package pageObject

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.common.BaseObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import interfacePageObject.ICorporateDetails
import internal.GlobalVariable

public class CorporateDetails extends BaseObject implements ICorporateDetails{
	public TestObject getSummaryDescriptionfield(){
		return findTestObject('Object Repository/CorporateDetailsPage/txaSummaryDescription')
	}

	public TestObject getIntCorporateIDfield(){
		return findTestObject('Object Repository/CorporateDetailsPage/txtIntCorporateID')
	}

	public TestObject getDUNSNumberfield(){
		return findTestObject('Object Repository/CorporateDetailsPage/txtDUNSNumber')
	}

	public TestObject getLegalentityIdentifierfield(){
		return findTestObject('Object Repository/CorporateDetailsPage/txtLegalentityIdentifier')
	}

	public TestObject getUKCompanyNumberfield(){
		return findTestObject('Object Repository/CorporateDetailsPage/txtUKCompanyNumber')
	}

	public TestObject getACRA_UENfield(){
		return findTestObject('Object Repository/CorporateDetailsPage/txtACRA_UEN')
	}

	public TestObject getPrivateNamefield(){
		return findTestObject('Object Repository/CorporateDetailsPage/txtPrivateName')
	}

	public TestObject getPrivateNameContactfield(){
		return findTestObject('Object Repository/CorporateDetailsPage/txtPrivateNameContact')
	}

	public TestObject getPrivateEmailContact(){
		return findTestObject('Object Repository/CorporateDetailsPage/txtPrivateEmailContact')
	}

	public TestObject getCompanyRegistrationNumberfield(){
		return findTestObject('Object Repository/CorporateDetailsPage/txtCompanyRegistrationNumber')
	}

	public TestObject getcombineBusinessAddressfield(){
		return findTestObject('Object Repository/CorporateDetailsPage/combinetxtBusinessAddress')
	}
}
