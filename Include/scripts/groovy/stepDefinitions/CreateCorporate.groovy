package stepDefinitions
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import base.BaseSteps
import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When
import internal.GlobalVariable
import io.cucumber.datatable.DataTable
import normalKeyword.Corporate


class CreateCorporate extends BaseSteps{
	Corporate corporate = new Corporate(1000)

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

	@And("User inputs all data for Corporate")
	def input_all_data_for_Corporate(DataTable dataTable){
		List<Map<String,String>> AllCorporateData = dataTable.asMaps(String.class, String.class)
		for (CorporateData in AllCorporateData) {
			//Main form
			browserkeyword.inputText(getICorporateForm().getIntCorporateIDfield(), corporate.getTxtIntCorporateID())
			browserkeyword.inputText(getICorporateForm().getDUNSNumberfield(), CorporateData.get("DUNS number"))
			browserkeyword.inputText(getICorporateForm().getLegalentityIdentifierfield(), CorporateData.get("Legal entity identifier"))
			browserkeyword.inputText(getICorporateForm().getUKCompanyNumberfield(), CorporateData.get("UK company number"))
			browserkeyword.inputText(getICorporateForm().getACRA_UENfield(), CorporateData.get("ACRA UEN"))
			browserkeyword.inputText(getICorporateForm().getNamefield(), CorporateData.get("Name"))
			browserkeyword.inputText(getICorporateForm().getSummaryDescriptionfield(), CorporateData.get("Summary description"))
			//		Need execute in order of Corporate Rating
			browserkeyword.clickElement(getICorporateForm().getCorporateScale())
			corporate.setSelScale(browserkeyword.getTestObjectText(getICorporateForm().getCorporateScale_1stitem()))
			browserkeyword.clickElement(getICorporateForm().getCorporateScale_1stitem())
			browserkeyword.clickElement(getICorporateForm().getCorporateRating())
			corporate.setSelRating(browserkeyword.getTestObjectText(getICorporateForm().getCorporateRating_1stitem()))
			browserkeyword.clickElement(getICorporateForm().getCorporateRating_1stitem())
			browserkeyword.inputText(getICorporateForm().getInternalRatingfield(), CorporateData.get("Internal rating"))
			//		Need execute in order of Sector Classification
			browserkeyword.clickElement(getICorporateForm().getSectorClassification())
			corporate.setSelSectorClassification(browserkeyword.getTestObjectText(getICorporateForm().getSectorClassification_1stitem()))
			browserkeyword.clickElement(getICorporateForm().getSectorClassification_1stitem())
			browserkeyword.clickElement(getICorporateForm().getIndustryGroup())
			corporate.setSelIndustryGroup(browserkeyword.getTestObjectText(getICorporateForm().getIndustryGroup_1stitem()))
			browserkeyword.clickElement(getICorporateForm().getIndustryGroup_1stitem())
			//
			browserkeyword.inputText(getICorporateForm().getPrivateNamefield(), CorporateData.get("Private name"))
			browserkeyword.inputText(getICorporateForm().getPrivateNameContactfield(), CorporateData.get("Primary name contact"))
			browserkeyword.inputText(getICorporateForm().getPrivateEmailContactfield(), CorporateData.get("Primary email contact"))
			browserkeyword.inputText(getICorporateForm().getCompanyRegistrationNumberfield(), String.valueOf(CorporateData.get("Company registration number")))
			
			
			
			//Set to Global Variable to verify Corporate details
			corporate.setTxtDUNSNumber(CorporateData.get("DUNS number"))
			corporate.setTxtLegalentityIdentifier(CorporateData.get("Legal entity identifier"))
			corporate.setTxtUKCompanyNumber(CorporateData.get("UK company number"))
			corporate.setTxtACRA_UEN(CorporateData.get("ACRA UEN"))
			corporate.setTxtName(CorporateData.get("Name"))
			corporate.setTxaSummaryDescription(CorporateData.get("Summary description"))
			corporate.setTxtPrivateName(CorporateData.get("Private name"))
			corporate.setTxtPrivateNameContact(CorporateData.get("Primary name contact"))
			corporate.setTxtPrivateEmailContact(CorporateData.get("Primary email contact"))
			corporate.setTxtCompanyRegistrationNumber(CorporateData.get("Company registration number"))
		}
	}

	@And("User inputs all data for Business Address")
	def input_all_data_for_Business_Address(DataTable dataTable){
		List<Map<String,String>> AllBusinessAdd = dataTable.asMaps(String.class, String.class)
		for (BusinessAdd in AllBusinessAdd) {
			//on BusinessAddress
			browserkeyword.clickElement(getICorporateForm().getBusinessAddressform())
			browserkeyword.waitUntilElementVisible(getIBusinessAddressForm().getBAAddress1field())
			browserkeyword.inputText(getIBusinessAddressForm().getBAAddress1field(), BusinessAdd.get("Address 1"))
			browserkeyword.inputText(getIBusinessAddressForm().getBAAddress2field(), BusinessAdd.get("Address 2"))
			browserkeyword.inputText(getIBusinessAddressForm().getBACityfield(), BusinessAdd.get("City"))
			browserkeyword.inputText(getIBusinessAddressForm().getBARegionfield(), BusinessAdd.get("Region"))
			browserkeyword.inputText(getIBusinessAddressForm().getBAPostalCodefield(), BusinessAdd.get("Postal code"))
			browserkeyword.clickElement(getIBusinessAddressForm().getBACountrylist())
			corporate.setTxtBusinessAddress_Country(browserkeyword.getTestObjectText(getIBusinessAddressForm().getBACountry1stitem()))
			browserkeyword.clickElement(getIBusinessAddressForm().getBACountry1stitem())
			//Back to Main form
			browserkeyword.clickElement(getIBusinessAddressForm().getBAOKbtn())
			
			
			//Set to Global Variable to verify Corporate details
			corporate.setTxtBusinessAddress_Add1(BusinessAdd.get("Address 1"))
			corporate.setTxtBusinessAddress_Add2(BusinessAdd.get("Address 2"))
			corporate.setTxtBusinessAddress_City(BusinessAdd.get("City"))
			corporate.setTxtBusinessAddress_Region(BusinessAdd.get("Region"))
			corporate.setTxtBusinessAddress_PostalCode(BusinessAdd.get("Postal code"))
		}
	}

	@And("User clicks on CREATE button")
	def click_on_Create_button(){
		browserkeyword.clickElement(getICorporateForm().getCreatebtn())
	}

	@Then("User sees details page with input data")
	def details_page_with_input_data(){
		browserkeyword.verifyElementText(getICorporateDetails().getIntCorporateIDfield(), corporate.getTxtIntCorporateID())
		browserkeyword.verifyElementText(getICorporateDetails().getDUNSNumberfield(), corporate.getTxtDUNSNumber())
		browserkeyword.verifyElementText(getICorporateDetails().getLegalentityIdentifierfield(), corporate.getTxtLegalentityIdentifier())
		browserkeyword.verifyElementText(getICorporateDetails().getUKCompanyNumberfield(), corporate.getTxtUKCompanyNumber())
		browserkeyword.verifyElementText(getICorporateDetails().getACRA_UENfield(), corporate.getTxtACRA_UEN())

		browserkeyword.verifyElementText(getICorporateDetails().getPrivateNamefield(), corporate.getTxtPrivateName())
		browserkeyword.verifyElementText(getICorporateDetails().getPrivateNameContactfield(), corporate.getTxtPrivateNameContact())
		browserkeyword.verifyElementText(getICorporateDetails().getPrivateEmailContact(), corporate.getTxtPrivateEmailContact())
		browserkeyword.verifyElementText(getICorporateDetails().getCompanyRegistrationNumberfield(), corporate.getTxtCompanyRegistrationNumber())
		browserkeyword.verifyElementText(getICorporateDetails().getcombineBusinessAddressfield(),
				corporate.getTxtBusinessAddress_Add1()+", "
				+corporate.getTxtBusinessAddress_Add2()+", "
				+corporate.getTxtBusinessAddress_City()+", "
				+corporate.getTxtBusinessAddress_Region()+", "
				+corporate.getTxtBusinessAddress_PostalCode()+", "
				+corporate.getTxtBusinessAddress_Country())
	}

	@And("User clicks on the Internal corporate ID field")
	def click_Internal_corporate_ID_field(){
		browserkeyword.clickElement(getICorporateForm().getIntCorporateIDfield())
	}

	@And("User does not input any data into this field and clicks other field")
	def click_DUNS_Number_field(){
		browserkeyword.clickElement(getICorporateForm().getDUNSNumberfield())
	}

	@Then("An error message is displayed for this field")
	def an_error_message_display_for_the_field(DataTable dataTable){
		List<Map<String,String>> errorMsgs = dataTable.asMaps(String.class, String.class)
		for (errorMsg in errorMsgs) {
			browserkeyword.verifyElementText(findTestObject('Object Repository/CreateCorporateForm/msgIntCorporateID_Required'), errorMsg.get("error message"))
		}
	}
}