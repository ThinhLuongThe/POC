package stepDefinitions
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import base.BaseSteps
import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When
import internal.GlobalVariable

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
		Random rand = new Random()
		String CurrentTime = java.time.LocalTime.now()
		//Main form
		browserkeyword.inputText(findTestObject('Object Repository/CreateCorporateForm/txtIntCorporateID'), CurrentTime+rand.nextInt())
		browserkeyword.inputText(findTestObject('Object Repository/CreateCorporateForm/txtDUNSNumber'), CurrentTime+rand.nextInt())
		browserkeyword.inputText(findTestObject('Object Repository/CreateCorporateForm/txtLegalentityIdentifier'), CurrentTime+rand.nextInt())
		browserkeyword.inputText(findTestObject('Object Repository/CreateCorporateForm/txtUKCompanyNumber'), CurrentTime+rand.nextInt())
		browserkeyword.inputText(findTestObject('Object Repository/CreateCorporateForm/txtACRA_UEN'), CurrentTime+rand.nextInt())
		browserkeyword.inputText(findTestObject('Object Repository/CreateCorporateForm/txtName'), CurrentTime+rand.nextInt())
		browserkeyword.inputText(findTestObject('Object Repository/CreateCorporateForm/txaSummaryDescription'), CurrentTime+rand.nextInt())
		browserkeyword.inputText(findTestObject('Object Repository/CreateCorporateForm/txtPrivateName'), CurrentTime+rand.nextInt())
		browserkeyword.inputText(findTestObject('Object Repository/CreateCorporateForm/txtPrivateNameContact'), CurrentTime+rand.nextInt())
		browserkeyword.inputText(findTestObject('Object Repository/CreateCorporateForm/txtPrivateEmailContact'), 'soul1@mailinator.com')
		browserkeyword.inputText(findTestObject('Object Repository/CreateCorporateForm/txtCompanyRegistrationNumber'), String.valueOf(rand.nextInt(50)))
		//on BusinessAddress
		browserkeyword.clickElement(findTestObject('Object Repository/CreateCorporateForm/BusinessAddress/btnBusinessAddress'))
		browserkeyword.waitUntilElementVisible(findTestObject('Object Repository/CreateCorporateForm/BusinessAddress/txtBusinessAddress_Add1'))
		browserkeyword.inputText(findTestObject('Object Repository/CreateCorporateForm/BusinessAddress/txtBusinessAddress_Add1'), CurrentTime+rand.nextInt())
		browserkeyword.inputText(findTestObject('Object Repository/CreateCorporateForm/BusinessAddress/txtBusinessAddress_City'), CurrentTime+rand.nextInt())
		browserkeyword.clickElement(findTestObject('Object Repository/CreateCorporateForm/BusinessAddress/txtBusinessAddress_Country'))
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