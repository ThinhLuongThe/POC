package helper

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
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.ui.ExpectedConditions
import org.openqa.selenium.support.ui.WebDriverWait
import internal.GlobalVariable



public class WaitHelper {


	private WebDriverWait wait;

	private static final int time_out = 60

	private WaitHelper() {
		wait = new WebDriverWait(GlobalVariable.driver, time_out)
	}

	public static WaitHelper createWaitHelper() {
		return new WaitHelper()
	}


	// isDisplayed()
	public void waitUntilElementIsVisible(WebElement element)
	{
		wait.until(ExpectedConditions.visibilityOf(element))
	}

	public void waitUntilElementIsVisible(By selector)
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(selector))
	}

	public WebElement waitUntilPresenceOfNestedElementsLocatedBy(WebElement parent, By childLocator)
	{
		return wait.until(ExpectedConditions.presenceOfNestedElementLocatedBy(parent, childLocator))
	}

	public WebElement waitUntilElementisClickable(WebElement)
	{
		return wait.until(ExpectedConditions.elementToBeClickable(WebElement));
	}


	public List<WebElement> waitUntilPresenceOfAllElementsLocatedBy(By selector)
	{
		return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(selector))
	}

	public void waitUntilElementIsNotVisible(By selector)
	{
		wait.until(ExpectedConditions.invisibilityOfElementLocated(selector))
	}
}
