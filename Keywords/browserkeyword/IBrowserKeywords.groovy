package browserkeyword

import com.kms.katalon.core.testobject.TestObject
import org.openqa.selenium.By

public interface IBrowserKeywords {
	void clickElement(TestObject object);

	void inputText(TestObject object, String text);

	void navigateToUrl(String URL);

	String getURL();

	void switchToAnotherTab(int index);

	void openInNewTab(URL);

	String getPageTitle();

	void selectLabelInDropdownList(TestObject object, label);

	Object getTestObjectAttributValue(TestObject object, String strProperty);

	String getTestObjectText(TestObject object);

	void clearTestObjectText(TestObject object);

	void waitUntilElementVisible(TestObject object);

	void verifyElementAttributeValue(TestObject object, String strAttribute, String expectedValue)

	void verifyElementText(TestObject object, String expected)

	void waitUntilUrlToBe(String inputUrl)

	void waitUntilElementIsNotVisible(By selector)

	void verifyTextCondition(String actual, String expected, String condition)

	void scrollToElement(TestObject object)

	void verifyEquals(boolean actual, boolean expected)

	void verifyElementIsPresent(TestObject object)

	void verifyElementNotPresent(TestObject object)

	void waitElementIsClickable(TestObject object)

	void verifyElementIsVisible(TestObject object)

	void waitUntilPageisLoaded()

	void switchToFrame(TestObject object)

	void switchToDefaultContent()

	void refreshPage()

	void waitUntilUrlContains(String containUrl)

	boolean isTestObjectPresent(TestObject testObject, int timeOut)
}
