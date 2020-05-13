package base


import java.util.concurrent.TimeUnit

import org.openqa.selenium.remote.DesiredCapabilities

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

	public static final String USERNAME = "thinhdk1";
	public static final String AUTOMATE_KEY = "MqiGHv5igm2NXi7uFTZq";
	public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

	@Before
	def setupScenario() {
		//init defaut keywords
		// init basic structure for framework
		Random randomValue = new Random()
		GlobalVariable.randomObject = randomValue
		AutomationStructureManager.getInstance().initProjectStructure()
		BasePageObject.setKeyword(new BrowserKeyword());
		WebUI.openBrowser("")
		WebUI.maximizeWindow()
		WebUI.deleteAllCookies(FailureHandling.CONTINUE_ON_FAILURE)
		
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("os", "Windows");
		caps.setCapability("os_version", "10");
		caps.setCapability("browser", "Chrome");
		caps.setCapability("browser_version", "81");
		caps.setCapability("name", "thinhdk1's First Test");
		
		GlobalVariable.driver = DriverFactory.getRemoteWebDriverServerUrl()
//		GlobalVariable.driver = DriverFactory.getWebDriver()
		// for async script
		DriverFactory.getWebDriver().manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS)
	}

	@After
	def teardownScenario() {
		WebUI.closeBrowser()
	}
}
