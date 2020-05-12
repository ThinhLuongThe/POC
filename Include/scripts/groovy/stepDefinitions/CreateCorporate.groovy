package stepDefinitions
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import java.sql.Date

import base.BaseSteps
import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.When
import internal.GlobalVariable
import net.bytebuddy.utility.RandomString

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
		browserkeyword.inputText(findTestObject('Object Repository/CreateCorporateForm/txtCompanyRegistrationNumber'), CurrentTime+rand.nextInt(20))

		browserkeyword.clickElement(findTestObject('Object Repository/CreateCorporateForm/btnBusinessAddress'))
		browserkeyword.inputText(findTestObject('Object Repository/CreateCorporateForm/txtBusinessAddress_Add1'), CurrentTime+rand.nextInt())
		browserkeyword.inputText(findTestObject('Object Repository/CreateCorporateForm/txtBusinessAddress_City'), CurrentTime+rand.nextInt())
	}
}