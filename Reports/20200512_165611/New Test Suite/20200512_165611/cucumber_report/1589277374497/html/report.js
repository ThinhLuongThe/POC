$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/thinh.luong/Katalon Studio/automationPOC/Include/features/Corporate/CreateCorporate.feature");
formatter.feature({
  "name": "As an End User",
  "description": "  I want to create a Corporate information",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@CreateCorporate"
    }
  ]
});
formatter.scenario({
  "name": "Create a Corporate",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@CreateCorporate"
    },
    {
      "name": "@Create"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "This user can access Operations page",
  "keyword": "Given "
});
formatter.match({
  "location": "CreateCorporate.access_Operations_page()"
});
formatter.result({
  "error_message": "com.kms.katalon.core.exception.StepFailedException: No driver found\r\n\tat com.kms.katalon.core.mobile.helper.MobileScreenCaptor.getAnyAppiumDriver(MobileScreenCaptor.java:64)\r\n\tat com.kms.katalon.core.mobile.helper.MobileScreenCaptor.take(MobileScreenCaptor.java:31)\r\n\tat com.kms.katalon.core.helper.screenshot.ScreenCaptor.takeScreenshotAndGetAttributes(ScreenCaptor.java:37)\r\n\tat com.kms.katalon.core.mobile.keyword.internal.MobileKeywordMain.stepFailed(MobileKeywordMain.groovy:40)\r\n\tat com.kms.katalon.core.mobile.keyword.internal.MobileKeywordMain.runKeyword(MobileKeywordMain.groovy:23)\r\n\tat com.kms.katalon.core.mobile.keyword.internal.MobileKeywordMain$runKeyword.call(Unknown Source)\r\n\tat org.codehaus.groovy.runtime.callsite.CallSiteArray.defaultCall(CallSiteArray.java:48)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.call(AbstractCallSite.java:113)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.call(AbstractCallSite.java:149)\r\n\tat com.kms.katalon.core.mobile.keyword.builtin.HideKeyboardKeyword.hideKeyboard(HideKeyboardKeyword.groovy:66)\r\n\tat com.kms.katalon.core.mobile.keyword.builtin.HideKeyboardKeyword.execute(HideKeyboardKeyword.groovy:62)\r\n\tat com.kms.katalon.core.keyword.internal.KeywordExecutor.executeKeywordForPlatform(KeywordExecutor.groovy:72)\r\n\tat com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords.hideKeyboard(MobileBuiltInKeywords.groovy:1457)\r\n\tat com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords$hideKeyboard.call(Unknown Source)\r\n\tat org.codehaus.groovy.runtime.callsite.CallSiteArray.defaultCall(CallSiteArray.java:48)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.call(AbstractCallSite.java:113)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.call(AbstractCallSite.java:117)\r\n\tat browserkeyword.BrowserKeyword.inputText(BrowserKeyword.groovy:59)\r\n\tat browserkeyword.IBrowserKeywords$inputText$0.call(Unknown Source)\r\n\tat org.codehaus.groovy.runtime.callsite.CallSiteArray.defaultCall(CallSiteArray.java:48)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.call(AbstractCallSite.java:113)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.call(AbstractCallSite.java:133)\r\n\tat stepDefinitions.CreateCorporate.access_Operations_page(CreateCorporate.groovy:14)\r\n\tat ✽.This user can access Operations page(C:/Users/thinh.luong/Katalon Studio/automationPOC/Include/features/Corporate/CreateCorporate.feature:7)\r\n",
  "status": "failed"
});
formatter.after({
  "status": "passed"
});
});