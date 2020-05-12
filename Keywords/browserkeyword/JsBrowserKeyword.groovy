package browserkeyword

import org.openqa.selenium.JavascriptExecutor
import org.openqa.selenium.WebElement

import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.common.WebUiCommonHelper

public class JsBrowserkeyword extends BrowserKeyword {

	private  String methodJsInjectTextToInput = "var element = arguments[0]\n" +
	"\n" +
	"function setNativeValue(element, value) {\n" +
	"  const { set: valueSetter } = Object.getOwnPropertyDescriptor(element, 'value') || {};\n" +
	"  const prototype = Object.getPrototypeOf(element);\n" +
	"  const { set: prototypeValueSetter } = Object.getOwnPropertyDescriptor(prototype, 'value') || {};\n" +
	"\n" +
	"  if (prototypeValueSetter && valueSetter !== prototypeValueSetter) {\n" +
	"    prototypeValueSetter.call(element, value);\n" +
	"  } else if (valueSetter) {\n" +
	"    valueSetter.call(element, value);\n" +
	"  } else {\n" +
	"    throw new Error('The given element does not have a value setter');\n" +
	"  }\n" +
	"  element.dispatchEvent(new Event('input', { bubbles: true }));\n" +
	"}";;

	@Override
	public void clickElement(TestObject object){
		waitUntilPageIsLoaded();
		WebElement element = WebUiCommonHelper.findWebElement(object, getTimeOut())
		JavascriptExecutor executor = (JavascriptExecutor) getWebDriver();
		executor.executeScript("arguments[0].click();", element);
		waitUntilPageIsLoaded()
	}

	@Override
	public void inputText(TestObject object, String text){
		waitUntilWebElementVisible(object)
		WebElement element = WebUiCommonHelper.findWebElement(object, getTimeOut())
		JavascriptExecutor executor = (JavascriptExecutor) getWebDriver();
		String script =  methodJsInjectTextToInput + "setNativeValue(element, '" + text + "')"
		executor.executeScript(script, element);
		waitUntilPageIsLoaded()
	}
}
