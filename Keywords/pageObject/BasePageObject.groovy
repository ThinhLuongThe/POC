package pageObject

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.JavascriptExecutor

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.testobject.TestObject

import browserkeyword.Environment
import browserkeyword.IBrowserKeywords
import interfacePageObject.IBasePageObject

public abstract class BasePageObject  implements IBasePageObject{

	protected static IBrowserKeywords browserKeyword;

	protected Environment environment = Environment.init()

	public static void setKeyword(IBrowserKeywords keyword) {
		browserKeyword = keyword;
	}

	@Override
	public String getTestObjectText(TestObject object){
		return browserKeyword.getTestObjectText(object);
	}

	@Override
	void inputTextTo(TestObject object, String text){
		browserKeyword.inputText(object, text)
	}

	@Override
	public Object getAttributeValue(TestObject object, String strProperty) {
		return browserKeyword.getTestObjectAttributValue(object, strProperty)
	}

	protected String getUserSessionId() {
		JavascriptExecutor js = (JavascriptExecutor) MobileDriverFactory.getDriver();
		def userProfile = js.executeScript("return JSON.parse(localStorage.getItem('user'))");
		return userProfile.get("sessionId")
	}

	protected TestObject getBtnCloseGoogleAppStoreBannerTestObject() {
		return findTestObject("GlobalObject/btnCloseGoogleAppStoreBanner")
	}
}
