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
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});