package base


import java.util.concurrent.TimeUnit

import org.openqa.selenium.JavascriptExecutor

import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import browserkeyword.BrowserKeyword
import cucumber.api.java.After
import cucumber.api.java.Before
import helper.AutomationStructureManager
import internal.GlobalVariable
import pageObject.BasePageObject


public class Hooks {
	/**
	 * Hooks for feature files
	 */

	private static String strPlatform;

	public static String getStrPlatform() {
		return strPlatform;
	}

	@Before
	def setupScenario() {
		//init defaut keywords
		// init basic structure for framework
		Random randomValue = new Random()
		GlobalVariable.randomObject = randomValue
		AutomationStructureManager.getInstance().initProjectStructure()
		BasePageObject.setKeyword(new BrowserKeyword());
		WebUI.openBrowser("")
		WebUI.deleteAllCookies(FailureHandling.CONTINUE_ON_FAILURE)
		GlobalVariable.driver = DriverFactory.getWebDriver()
		// for async script
		DriverFactory.getWebDriver().manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS)
	}

	@After
	def teardownScenario() {
		WebUI.closeBrowser()
	}
}
