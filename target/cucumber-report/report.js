$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/main/java/Feature/newCustomerMAP.feature");
formatter.feature({
  "name": "New Customer creation",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Add new Creation",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user is already login page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinition.newCustomerMAP.user_is_already_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "title of the page is Guru",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinition.newCustomerMAP.title_of_the_page_is_Guru()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters username and password",
  "rows": [
    {},
    {}
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.newCustomerMAP.user_enters_username_and_password(io.cucumber.datatable.DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on new customer tab",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.newCustomerMAP.user_clicks_on_new_customer_tab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters customer details",
  "rows": [
    {},
    {},
    {}
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.newCustomerMAP.user_enters_customer_details(io.cucumber.datatable.DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks submit button",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.newCustomerMAP.user_clicks_submit_button()"
});
formatter.result({
  "error_message": "org.openqa.selenium.UnhandledAlertException: unexpected alert open: {Alert text : please fill all fields}\n  (Session info: chrome\u003d79.0.3945.130): please fill all fields\nBuild info: version: \u00274.0.0-alpha-4\u0027, revision: \u0027c2d955b49e\u0027\nSystem info: host: \u0027DESKTOP-9E5ICTO\u0027, ip: \u0027192.168.56.1\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_241\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 79.0.3945.130, chrome: {chromedriverVersion: 78.0.3904.105 (60e2d8774a81..., userDataDir: C:\\Users\\JAMSHE~1\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:52208}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: af5f9a8505eb6fca9270fe58dc7c2d62\n*** Element info: {Using\u003dxpath, value\u003d//a[@href\u003d\u0027addcustomerpage.php\u0027]}\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:127)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:53)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:161)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:582)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:333)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:451)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:394)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:325)\r\n\tat stepDefinition.newCustomerMAP.user_clicks_submit_button(newCustomerMAP.java:88)\r\n\tat ✽.user clicks submit button(file:///C:/Users/Jamshed%20Khan/eclipse-workspace/FreeCRMBDD/src/main/java/Feature/newCustomerMAP.feature:16)\r\n",
  "status": "failed"
});
});