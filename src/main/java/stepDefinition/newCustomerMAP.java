package stepDefinition;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class newCustomerMAP {
	
WebDriver driver;
	
	@Given("^user is already login page$")
	public void user_is_already_login_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jamshed Khan\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		 driver= new ChromeDriver();
		 driver.get("http://demo.guru99.com/v4");
	}

	@When("^title of the page is Guru$")
	public void title_of_the_page_is_Guru() {
	    // Write code here that turns the phrase above into concrete actions
		String title= driver.getTitle();
		  Assert.assertEquals(title, "Guru99 Bank Home Page");
		  System.out.println(title);
	}

	@Then("^user enters username and password$")
	public void user_enters_username_and_password(DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
		for(Map<String, String> data : dataTable.asMaps()) {
			
			driver.findElement(By.name("uid")).sendKeys(data.get("username"));;
			driver.findElement(By.name("password")).sendKeys(data.get("password"));
	    
			driver.findElement(By.name("password")).sendKeys(Keys.ENTER);
		}
		
	}

	@Then("^user clicks on new customer tab$")
	public void user_clicks_on_new_customer_tab() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.xpath("//a[@href='addcustomerpage.php']")).click();
	    
	}

	@Then("^user enters customer details$")
	public void user_enters_customer_details(DataTable customer) {
	    // Write code here that turns the phrase above into concrete actions
		for(Map<String, String> data :customer.asMaps())
		{
			 	driver.findElement(By.name("name")).sendKeys(data.get("customer"));
			    driver.findElement(By.xpath("//input[@type='radio'][@value='m']")).click();
			    driver.findElement(By.xpath("//input[@type='date']")).sendKeys(data.get("DOB"));
//			    driver.findElement(By.name("addr")).sendKeys(data.get("add"));
			    driver.findElement(By.name("city")).sendKeys(data.get("city"));
			    driver.findElement(By.name("state")).sendKeys(data.get("state"));
			    driver.findElement(By.name("pinno")).sendKeys(data.get("pin"));
			    driver.findElement(By.name("telephoneno")).sendKeys(data.get("mobile"));
			    driver.findElement(By.name("emailid")).sendKeys(data.get("emailid"));
			    driver.findElement(By.name("password")).sendKeys(data.get("password"));
			    
		}
	   
	    
	}

	@Then("user clicks submit button")
	public void user_clicks_submit_button(){
	    // Write code here that turns the phrase above into concrete actions
		 driver.findElement(By.name("sub")).click();
		 driver.findElement(By.xpath("//a[@href='addcustomerpage.php']")).click();
	}


}
