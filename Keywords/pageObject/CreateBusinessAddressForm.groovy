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

import internal.GlobalVariable
import interfacePageObject.ICreateBusinessAddressForm

public class CreateBusinessAddressForm extends BaseObject implements ICreateBusinessAddressForm{
	public TestObject getBACancelbtn(){
		return findTestObject('Object Repository/CreateCorporateForm/BusinessAddress/btnBusinessAddress_Cancel')
	}

	public TestObject getBAOKbtn(){
		return findTestObject('Object Repository/CreateCorporateForm/BusinessAddress/btnBusinessAddress_Ok')
	}

	public TestObject getBAAddress1field(){
		return findTestObject('Object Repository/CreateCorporateForm/BusinessAddress/txtBusinessAddress_Add1')
	}

	public TestObject getBAAddress2field(){
		return findTestObject('Object Repository/CreateCorporateForm/BusinessAddress/txtBusinessAddress_Add2')
	}

	public TestObject getBACityfield(){
		return findTestObject('Object Repository/CreateCorporateForm/BusinessAddress/txtBusinessAddress_City')
	}

	public TestObject getBACountrylist(){
		return findTestObject('Object Repository/CreateCorporateForm/BusinessAddress/txtBusinessAddress_Country')
	}

	public TestObject getBACountry1stitem(){
		return findTestObject('Object Repository/CreateCorporateForm/BusinessAddress/txtBusinessAddress_Country_1st_item')
	}

	public TestObject getBAPostalCodefield(){
		return findTestObject('Object Repository/CreateCorporateForm/BusinessAddress/txtBusinessAddress_PostalCode')
	}

	public TestObject getBARegionfield(){
		return findTestObject('Object Repository/CreateCorporateForm/BusinessAddress/txtBusinessAddress_Region')
	}
}
