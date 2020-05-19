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
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import interfacePageObject.ICreateCorporateForm
import internal.GlobalVariable

public class CreateCorporateForm extends BasePageObject implements ICreateCorporateForm{
	public TestObject getBusinessAddressform(){
		return 	findTestObject('Object Repository/CreateCorporateForm/btnBusinessAddress')
	}
	
	public TestObject getCancelbtn(){
		return findTestObject('Object Repository/CreateCorporateForm/btnCancel')
	}

	public TestObject getCreatebtn(){
		return findTestObject('Object Repository/CreateCorporateForm/btnCreate')
	}

	public TestObject getRequiredmsg(){
		return findTestObject('Object Repository/CreateCorporateForm/msgIntCorporateID_Required')
	}

	public TestObject getSummaryDescriptionfield(){
		return findTestObject('Object Repository/CreateCorporateForm/txaSummaryDescription')
	}

	public TestObject getACRA_UENfield(){
		return findTestObject('Object Repository/CreateCorporateForm/txtACRA_UEN')
	}

	public TestObject getCompanyRegistrationNumberfield(){
		return findTestObject('Object Repository/CreateCorporateForm/txtCompanyRegistrationNumber')
	}

	public TestObject getDUNSNumberfield(){
		return findTestObject('Object Repository/CreateCorporateForm/txtDUNSNumber')
	}

	public TestObject getIntCorporateIDfield(){
		return findTestObject('Object Repository/CreateCorporateForm/txtIntCorporateID')
	}

	public TestObject getInternalRatingfield(){
		return findTestObject('Object Repository/CreateCorporateForm/txtInternalRating')
	}

	public TestObject getLegalentityIdentifierfield(){
		return findTestObject('Object Repository/CreateCorporateForm/txtLegalentityIdentifier')
	}

	public TestObject getNamefield(){
		return findTestObject('Object Repository/CreateCorporateForm/txtName')
	}

	public TestObject getPrivateEmailContactfield(){
		return findTestObject('Object Repository/CreateCorporateForm/txtPrivateEmailContact')
	}

	public TestObject getPrivateNamefield(){
		return findTestObject('Object Repository/CreateCorporateForm/txtPrivateName')
	}

	public TestObject getPrivateNameContactfield(){
		return findTestObject('Object Repository/CreateCorporateForm/txtPrivateNameContact')
	}

	public TestObject getUKCompanyNumberfield(){
		return findTestObject('Object Repository/CreateCorporateForm/txtUKCompanyNumber')
	}

	public TestObject getCorporateScale(){
		return findTestObject('Object Repository/CreateCorporateForm/CorporateRating/selScale')
	}

	public TestObject getCorporateScale_1stitem(){
		return findTestObject('Object Repository/CreateCorporateForm/CorporateRating/selScale_1st_item')
	}

	public TestObject getCorporateRating(){
		return findTestObject('Object Repository/CreateCorporateForm/CorporateRating/selRating')
	}

	public TestObject getCorporateRating_1stitem(){
		return findTestObject('Object Repository/CreateCorporateForm/CorporateRating/selRating_1st_item')
	}

	public TestObject getSectorClassification(){
		return findTestObject('Object Repository/CreateCorporateForm/SectorClassification/selSectorClassification')
	}

	public TestObject getSectorClassification_1stitem(){
		return findTestObject('Object Repository/CreateCorporateForm/SectorClassification/selSectorClassification_1st_item')
	}

	public TestObject getIndustryGroup(){
		return findTestObject('Object Repository/CreateCorporateForm/SectorClassification/selIndustryGroup')
	}

	public TestObject getIndustryGroup_1stitem(){
		return findTestObject('Object Repository/CreateCorporateForm/SectorClassification/selIndustryGroup_1st_item')
	}
}
