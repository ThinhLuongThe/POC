package interfacePageObject

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

import internal.GlobalVariable

public interface ICreateCorporateForm {
	TestObject getBusinessAddressform()
	TestObject getCancelbtn()
	TestObject getCreatebtn()
	TestObject getRequiredmsg()
	TestObject getSummaryDescriptionfield()
	TestObject getACRA_UENfield()
	TestObject getCompanyRegistrationNumberfield()
	TestObject getDUNSNumberfield()
	TestObject getIntCorporateIDfield()
	TestObject getInternalRatingfield()
	TestObject getLegalentityIdentifierfield()
	TestObject getNamefield()
	TestObject getPrivateEmailContactfield()
	TestObject getPrivateNamefield()
	TestObject getPrivateNameContactfield()
	TestObject getUKCompanyNumberfield()
	//Input fields
	TestObject getCorporateScale()
	TestObject getCorporateScale_1stitem()
	TestObject getCorporateRating()
	TestObject getCorporateRating_1stitem()
	TestObject getSectorClassification()
	TestObject getSectorClassification_1stitem()
	TestObject getIndustryGroup()
	TestObject getIndustryGroup_1stitem()
}
