package pageObject

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import interfacePageObject.ILoginPageObject


public class LoginPageObject extends BasePageObject implements ILoginPageObject {


	public LoginPageObject() {
	}

	public void login(email, password) {
		WebUI.navigateToUrl(environment.getLoginPageURL())
		inputToEmailField(email)
		clickBtnSubmit()
		inputToPasswordField(password)
		clickBtnSubmit()
	}

	public void register(email, password) {
		inputToEmailField(email)
		clickBtnSubmit()
		inputToPasswordField(password)
		clickCkTermsAndCondition()
		clickBtnSubmit()
	}

	public void clickFacebookButton() {
		browserKeyword.clickElement(findTestObject("LoginPage/btnFacebook"))
	}

	public void clickCookiesButton() {
		browserKeyword.clickElement(findTestObject("LoginPage/btnCookiesPopUp"))
	}

	public void clickBtnOtherLogin() {
		browserKeyword.clickElement(findTestObject("LoginPage/btnOthersLogin"))
	}

	public void clickBtnContinueWithGoogle() {
		browserKeyword.clickElement(findTestObject("LoginPage/btnContinueLoginWithGoogle"))
	}

	public TestObject getEmailField() {
		return findTestObject("LoginPage/emailField")
	}

	public TestObject getPasswordField() {
		return findTestObject('RegistrationPage/passwordField')
	}

	@Override
	public void clickInputEmailField() {
		browserKeyword.clickElement(getEmailField())
	}

	@Override
	public void inputToEmailField(String strData) {

		browserKeyword.inputText(getEmailField(), strData)
	}

	@Override
	public void inputToPasswordField(String strData) {

		browserKeyword.inputText(getPasswordField(), strData)
	}


	@Override
	public TestObject getMsgEmailError(String data) {
		return findTestObject("LoginPage/msgEmailErrorMessage", ["msgError" : data])
	}

	@Override
	public TestObject getValidationMsg(){
		return findTestObject('Object Repository/RegistrationPage/errorMsg')
	}

	@Override
	public TestObject getValidationImg(){
		return findTestObject('Object Repository/RegistrationPage/errorEmptyEmailImg')
	}


	@Override
	public void clickBtnSubmit() {
		browserKeyword.waitElementIsClickable(findTestObject('LoginPage/submitBtn'))
		browserKeyword.clickElement(findTestObject('LoginPage/submitBtn'))
	}

	public TestObject getCkTermsAndCondition() {
		return findTestObject("RegistrationPage/termsAndConditionCbx")
	}

	@Override
	public void clickCkTermsAndCondition() {
		browserKeyword.clickElement(getCkTermsAndCondition())
	}
}
