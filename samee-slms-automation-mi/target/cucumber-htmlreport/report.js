$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("test1.feature");
formatter.feature({
  "line": 2,
  "name": "Do nothing",
  "description": "",
  "id": "do-nothing",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@smilogin"
    },
    {
      "line": 1,
      "name": "@TEST"
    }
  ]
});
formatter.scenario({
  "line": 4,
  "name": "test api",
  "description": "",
  "id": "do-nothing;test-api",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I open a browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I am on the student access page",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});