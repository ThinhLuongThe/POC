package browserkeyword

import org.openqa.selenium.WebDriver

import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.driver.DriverFactory;
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

public abstract class AbstractKeyword {

	private static final int TIME_OUT = 20;
	protected void waitUntilWebElementVisible(TestObject object) {

		WebUI.waitForElementVisible(object, TIME_OUT)
	}

	protected void waitUntilPageIsLoaded(){
		WebUI.waitForPageLoad(TIME_OUT)
	}

	protected WebDriver getWebDriver() {
		WebDriver driver = DriverFactory.getWebDriver();
	}

	public int getTimeOut() {
		return TIME_OUT;
	}
}
