package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.indexeddb.model.Key;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class freeCRMTest 

{
	
	WebDriver driver;
	
	@Given("^user is already in Test$")
	public void user_is_already_in_Test() {
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jamshed Khan\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
	 driver= new ChromeDriver();
	 driver.get("http://demo.guru99.com/v4");
	}

	@When("^user is verify the Title$")
	public void user_is_verify_the_Title() {
	  String title= driver.getTitle();
	  Assert.assertEquals(title, "Guru99 Bank Home Page");
	  System.out.println(title);
	}

	@Then("^user is clicking on login$")
	public void user_is_clicking_on_login()
	{
		
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
	    
	}


	@Then("^user enter \"(.*)\" and \"(.*)\"$")
	public void user_check_for_login_credential(String username, String password) {
    // Write code here that turns the phrase above into concrete actions
	
		driver.findElement(By.name("uid")).sendKeys(username);
	    driver.findElement(By.name("password")).sendKeys(password);
	    
	    driver.findElement(By.name("password")).sendKeys(Keys.ENTER);
   
}

	@Then("^verify homepage title$")
	public void verify_homepage_title() {
    // Write code here that turns the phrase above into concrete actions
		
		String title= driver.getTitle();
		Assert.assertEquals(title, "Guru99 Bank Manager HomePage");
	}
	@Then("close the browser")
	public void close_the_browser() {
	    // Write code here that turns the phrase above into concrete actions
	   driver.quit();
	}
}
