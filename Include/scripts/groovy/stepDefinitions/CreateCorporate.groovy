package stepDefinitions
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import base.BaseSteps
import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When
import internal.GlobalVariable
import normalKeyword.Corporate

class CreateCorporate extends BaseSteps{
	@Given("This user can access Operations page")
	def access_Operations_page(){
		browserkeyword.navigateToUrl(environment.getLoginPageURL())
		browserkeyword.inputText(getILoginPageObject().getEmailfield(), GlobalVariable.email)
		browserkeyword.inputText(getILoginPageObject().getPassfield(), GlobalVariable.pass)
		browserkeyword.clickElement(getILoginPageObject().getSignbutton())
	}

	@And("User belongs to company that it is set Originator")
	def user_belongs_to_Originator(){
		//
	}

	@When("User clicks on CREATE NEW CORPORATE button")
	def click_on_New_Corporate_button(){
		browserkeyword.clickElement(findTestObject('Object Repository/CorporateListPage/Create_Corporate_button'))
	}

	@And("User inputs all data")
	def input_all_data(){
		Corporate corporate = new Corporate(1000)
		//Main form
		browserkeyword.inputText(findTestObject('Object Repository/CreateCorporateForm/txtIntCorporateID'), corporate.getTxtIntCorporateID())
		browserkeyword.inputText(findTestObject('Object Repository/CreateCorporateForm/txtDUNSNumber'), corporate.getTxtDUNSNumber())
		browserkeyword.inputText(findTestObject('Object Repository/CreateCorporateForm/txtLegalentityIdentifier'), corporate.getTxtLegalentityIdentifier())
		browserkeyword.inputText(findTestObject('Object Repository/CreateCorporateForm/txtUKCompanyNumber'), corporate.getTxtUKCompanyNumber())
		browserkeyword.inputText(findTestObject('Object Repository/CreateCorporateForm/txtACRA_UEN'), corporate.getTxtACRA_UEN())
		browserkeyword.inputText(findTestObject('Object Repository/CreateCorporateForm/txtName'), corporate.getTxtName())
		browserkeyword.inputText(findTestObject('Object Repository/CreateCorporateForm/txaSummaryDescription'), corporate.getTxaSummaryDescription())
		//		Need execute in order of Corporate Rating
		browserkeyword.clickElement(findTestObject('Object Repository/CreateCorporateForm/CorporateRating/selScale'))
		corporate.setSelScale(browserkeyword.getTestObjectText(findTestObject('Object Repository/CreateCorporateForm/CorporateRating/selScale_1st_item')))
		browserkeyword.clickElement(findTestObject('Object Repository/CreateCorporateForm/CorporateRating/selScale_1st_item'))
		browserkeyword.clickElement(findTestObject('Object Repository/CreateCorporateForm/CorporateRating/selRating'))
		corporate.setSelRating(browserkeyword.getTestObjectText(findTestObject('Object Repository/CreateCorporateForm/CorporateRating/selRating_1st_item')))
		browserkeyword.clickElement(findTestObject('Object Repository/CreateCorporateForm/CorporateRating/selRating_1st_item'))
		browserkeyword.inputText(findTestObject('Object Repository/CreateCorporateForm/txtInternalRating'), corporate.getTxtIntCorporateID())
		//		Need execute in order of Sector Classification
		browserkeyword.clickElement(findTestObject('Object Repository/CreateCorporateForm/SectorClassification/selSectorClassification'))
		corporate.setSelSectorClassification(browserkeyword.getTestObjectText(findTestObject('Object Repository/CreateCorporateForm/SectorClassification/selSectorClassification_1st_item')))
		browserkeyword.clickElement(findTestObject('Object Repository/CreateCorporateForm/SectorClassification/selSectorClassification_1st_item'))
		browserkeyword.clickElement(findTestObject('Object Repository/CreateCorporateForm/SectorClassification/selIndustryGroup'))
		corporate.setSelIndustryGroup(browserkeyword.getTestObjectText(findTestObject('Object Repository/CreateCorporateForm/SectorClassification/selIndustryGroup_1st_item')))
		browserkeyword.clickElement(findTestObject('Object Repository/CreateCorporateForm/SectorClassification/selIndustryGroup_1st_item'))
		//
		browserkeyword.inputText(findTestObject('Object Repository/CreateCorporateForm/txtPrivateName'), corporate.getTxtPrivateName())
		browserkeyword.inputText(findTestObject('Object Repository/CreateCorporateForm/txtPrivateNameContact'), corporate.getTxtPrivateNameContact())
		browserkeyword.inputText(findTestObject('Object Repository/CreateCorporateForm/txtPrivateEmailContact'), corporate.getTxtPrivateEmailContact())
		browserkeyword.inputText(findTestObject('Object Repository/CreateCorporateForm/txtCompanyRegistrationNumber'), String.valueOf(corporate.getTxtCompanyRegistrationNumber()))
		//on BusinessAddress
		browserkeyword.clickElement(findTestObject('Object Repository/CreateCorporateForm/BusinessAddress/btnBusinessAddress'))
		browserkeyword.waitUntilElementVisible(findTestObject('Object Repository/CreateCorporateForm/BusinessAddress/txtBusinessAddress_Add1'))
		browserkeyword.inputText(findTestObject('Object Repository/CreateCorporateForm/BusinessAddress/txtBusinessAddress_Add1'), corporate.getTxtBusinessAddress_Add1())
		browserkeyword.inputText(findTestObject('Object Repository/CreateCorporateForm/BusinessAddress/txtBusinessAddress_Add2'), corporate.getTxtBusinessAddress_Add2())
		browserkeyword.inputText(findTestObject('Object Repository/CreateCorporateForm/BusinessAddress/txtBusinessAddress_City'), corporate.getTxtBusinessAddress_City())
		browserkeyword.inputText(findTestObject('Object Repository/CreateCorporateForm/BusinessAddress/txtBusinessAddress_Region'), corporate.getTxtBusinessAddress_Region())
		browserkeyword.inputText(findTestObject('Object Repository/CreateCorporateForm/BusinessAddress/txtBusinessAddress_PostalCode'), corporate.getTxtBusinessAddress_PostalCode())
		browserkeyword.clickElement(findTestObject('Object Repository/CreateCorporateForm/BusinessAddress/txtBusinessAddress_Country'))
		corporate.setTxtBusinessAddress_Country(browserkeyword.getTestObjectText(findTestObject('Object Repository/CreateCorporateForm/BusinessAddress/txtBusinessAddress_Country_1st_item')))
		browserkeyword.clickElement(findTestObject('Object Repository/CreateCorporateForm/BusinessAddress/txtBusinessAddress_Country_1st_item'))
		//Back to Main form
		browserkeyword.clickElement(findTestObject('Object Repository/CreateCorporateForm/BusinessAddress/btnBusinessAddress_Ok'))
	}

	@And("User clicks on CREATE button")
	def click_on_Create_button(){
		browserkeyword.clickElement(findTestObject('Object Repository/CreateCorporateForm/btnCreate'))
	}


	@And("User clicks on the Internal corporate ID field")
	def click_Internal_corporate_ID_field(){
		browserkeyword.clickElement(findTestObject('Object Repository/CreateCorporateForm/txtIntCorporateID'))
	}

	@And("User does not input any data into this field and clicks other field")
	def click_DUNS_Number_field(){
		browserkeyword.clickElement(findTestObject('Object Repository/CreateCorporateForm/txtDUNSNumber'))
	}

	@Then("An error message is displayed \"(.*)\" for this field")
	def error_message_display(String errMsg){
		browserkeyword.verifyElementText(findTestObject('Object Repository/CreateCorporateForm/msgIntCorporateID_Required'), errMsg)
	}
}