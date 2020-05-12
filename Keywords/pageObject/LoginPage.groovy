package pageObject

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.testobject.TestObject

import interfacePageObject.ILoginPage

public class LoginPage extends BasePageObject implements ILoginPage {
	void inputEmail(String email){
		browserKeyword.inputText(getEmailfield(), email)
	}
	void inputPass(String pass){
		browserKeyword.inputText(getPassfield(), pass)
	}

	void clickSignin(){
		browserKeyword.clickElement(getSignbutton())
	}

	TestObject getEmailfield(){
		return findTestObject('Object Repository/LoginPage/emailAddresstxt')
	}

	TestObject getPassfield(){
		return findTestObject('Object Repository/LoginPage/passtxt')
	}

	TestObject getSignbutton(){
		return findTestObject('Object Repository/LoginPage/signInbtn')
	}
}
