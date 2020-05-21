package browserkeyword

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

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
import com.kms.katalon.core.webui.keyword.builtin.getCSSValueKeyword

import browserkeyword.IBrowserKeywords
import browserkeyword.AbstractKeyword
import internal.GlobalVariable
import org.openqa.selenium.WebDriver
import org.openqa.selenium.JavascriptExecutor
import org.openqa.selenium.By
import org.openqa.selenium.Dimension
import org.openqa.selenium.JavascriptException
import com.kms.katalon.core.webui.driver.DriverFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction
import org.openqa.selenium.interactions.touch.TouchActions;
import io.appium.java_client.touch.offset.PointOption
import java.time.Duration;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static io.appium.java_client.touch.offset.PointOption.point;
import static java.time.Duration.ofMillis;
import static java.time.Duration.ofSeconds;
import helper.WaitHelper
import org.openqa.selenium.WebDriverException

public class BrowserKeyword extends AbstractKeyword implements IBrowserKeywords {
	@Override
	public void hoverOn(TestObject object){
		WebUI.waitForElementVisible(object, getTimeOut())
		WebUI.mouseOver(object)
	}

	@Override
	public void clickElement(TestObject object) {
		WebUI.waitForElementVisible(object, getTimeOut())
		WebUI.waitForElementClickable(object, getTimeOut())
		WebUI.click(object)
		waitUntilPageIsLoaded()
	}

	@Override
	public void inputText(TestObject object, String text){
		waitUntilWebElementVisible(object)
		WebUI.setText(object, text)
		//		Mobile.hideKeyboard();
	}

	@Override
	public void navigateToUrl(String URL) {
		WebUI.navigateToUrl(URL)
		waitUntilPageIsLoaded()
	}

	@Override
	public String getURL() {
		waitUntilPageIsLoaded()
		return WebUI.getUrl();
	}

	@Override
	public void switchToAnotherTab(int index) {
		WebUI.switchToWindowIndex(index)
		waitUntilPageIsLoaded()
	}

	@Override
	public void openInNewTab(URL){
		int currentTab = WebUI.getWindowIndex()
		WebUI.executeJavaScript('window.open(' +URL+');', [])
		switchToAnotherTab(currentTab+1)
	}

	@Override
	public String getPageTitle() {
		return WebUI.getWindowTitle();
	}

	@Override
	public void selectLabelInDropdownList(TestObject object, label) {
		waitUntilWebElementVisible(object)
		WebUI.selectOptionByLabel(object, label, false)
	}

	@Override
	public String getTestObjectText(TestObject object) {
		waitUntilWebElementVisible(object)
		return WebUI.getText(object)
	}

	@Override
	public Object getTestObjectAttributValue(TestObject object, String strProperty) {
		waitUntilWebElementVisible(object)
		WebUI.getAttribute(object, strProperty)
	}

	@Override
	public void clearTestObjectText(TestObject object){
		waitUntilWebElementVisible(object)
		WebUI.clearText(object)
	}

	@Override
	public void waitUntilElementVisible(TestObject object){
		WebUI.waitForElementVisible(object, getTimeOut())
	}


	@Override
	public void verifyElementAttributeValue(TestObject object, String strAttribute, String expectedValue) {
		waitUntilElementVisible(object);
		WebUI.verifyElementAttributeValue(object, strAttribute, expectedValue, getTimeOut())
	}

	@Override
	public void verifyElementText(TestObject object, String expected) {
		WebUI.waitForElementVisible(object, getTimeOut())
		WebUI.verifyElementText(object, expected)
	}

	@Override
	public void waitUntilUrlToBe(String inputUrl) {
		WebDriver driver = DriverFactory.getWebDriver();
		WebDriverWait wait=new WebDriverWait(driver, getTimeOut());
		wait.until(ExpectedConditions.urlToBe(inputUrl))
	}


	@Override
	public boolean isTestObjectPresent(TestObject testObject, int timeOut) {
		try {
			WebUI.verifyElementPresent(testObject, timeOut)
		}
		catch(Exception e) {
			return false;
		}
	}

	@Override
	public void verifyTextCondition(String actual, String expected, String condition) {
		if (condition.equals("Equal")) {
			// actual, expected
			WebUI.verifyEqual(actual, expected)
		}
	}

	@Override
	public void scrollToElement(TestObject object) {
		WebUI.scrollToElement(object, getTimeOut())
	}

	@Override
	public void verifyEquals(boolean actual, boolean expected) {
		WebUI.verifyEqual(actual, expected)
	}

	@Override
	public void verifyElementIsPresent(TestObject object) {
		WebUI.verifyElementPresent(object, getTimeOut())
	}

	@Override
	public void verifyElementNotPresent(TestObject object) {
		WebUI.verifyElementNotPresent(object, getTimeOut())
	}

	@Override
	public void waitElementIsClickable(TestObject object) {
		WebUI.waitForElementClickable(object, getTimeOut())
	}

	@Override
	public void verifyElementIsVisible(TestObject object) {
		WebUI.waitForElementVisible(object, getTimeOut())
		WebUI.verifyElementVisible(object)
	}

	@Override
	public void waitUntilPageisLoaded() {
		WebUI.waitForPageLoad(getTimeOut())
	}

	@Override
	public void waitUntilElementIsNotVisible(By selector) {
		WaitHelper.createWaitHelper().waitUntilElementIsNotVisible(selector)
	}

	@Override
	public void switchToFrame(TestObject object) {
		WebUI.waitForElementPresent(object, getTimeOut())
		WebUI.switchToFrame(object, getTimeOut())
	}

	@Override
	public void switchToDefaultContent() {
		WebUI.switchToDefaultContent()
	}

	@Override
	public void refreshPage() {
		WebUI.refresh();
		waitUntilPageIsLoaded()
	}


	@Override
	public void waitUntilUrlContains(String containUrl){
		int retry = 0;
		String currentUrl
		while (retry < 10){
			currentUrl = WebUI.getUrl()
			if(currentUrl.contains(containUrl)) {
				break;
			}
			sleep(2000)
			retry ++
		}
	}
}
