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
  "error_message": "java.lang.ClassNotFoundException: Object Repository/LoginPage\r\n\tat java.net.URLClassLoader.findClass(URLClassLoader.java:381)\r\n\tat java.lang.ClassLoader.loadClass(ClassLoader.java:424)\r\n\tat sun.misc.Launcher$AppClassLoader.loadClass(Launcher.java:349)\r\n\tat java.lang.ClassLoader.loadClass(ClassLoader.java:357)\r\n\tat java_lang_ClassLoader$loadClass.call(Unknown Source)\r\n\tat org.codehaus.groovy.runtime.callsite.CallSiteArray.defaultCall(CallSiteArray.java:48)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.call(AbstractCallSite.java:113)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.call(AbstractCallSite.java:125)\r\n\tat base.BaseSteps.getPageObjectImplementation(BaseSteps.groovy:18)\r\n\tat base.BaseSteps.getPageObject(BaseSteps.groovy:26)\r\n\tat base.BaseSteps.getILoginPageObject(BaseSteps.groovy:33)\r\n\tat base.BaseSteps$getILoginPageObject.callCurrent(Unknown Source)\r\n\tat org.codehaus.groovy.runtime.callsite.CallSiteArray.defaultCallCurrent(CallSiteArray.java:52)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.callCurrent(AbstractCallSite.java:154)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.callCurrent(AbstractCallSite.java:158)\r\n\tat stepDefinitions.CreateCorporate.access_Operations_page(CreateCorporate.groovy:14)\r\n\tat ✽.This user can access Operations page(C:/Users/thinh.luong/Katalon Studio/automationPOC/Include/features/Corporate/CreateCorporate.feature:7)\r\n",
  "status": "failed"
});
formatter.after({
  "status": "passed"
});
});