package stepDefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class NewCustomer {
	
	WebDriver driver;
	
	@Given("^user is already in login page$")
	public void user_is_already_in_login_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jamshed Khan\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		 driver= new ChromeDriver();
		 driver.get("http://demo.guru99.com/v4");
	}

	@When("^title of the page is Guru99$")
	public void title_of_the_page_is_Guru99() {
	    // Write code here that turns the phrase above into concrete actions
		String title= driver.getTitle();
		  Assert.assertEquals(title, "Guru99 Bank Home Page");
		  System.out.println(title);
	}

	@Then("^user enter username and password$")
	public void user_enter_username_and_password(DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
		List<String> data=dataTable.row(0);
		driver.findElement(By.name("uid")).sendKeys(data.get(0));
	    driver.findElement(By.name("password")).sendKeys(data.get(1));
	    
	    driver.findElement(By.name("password")).sendKeys(Keys.ENTER);
	}

	@Then("^user click on new customer tab$")
	public void user_click_on_new_customer_tab() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.xpath("//a[@href='addcustomerpage.php']")).click();
	    
	}

	@Then("^user enter customer details$")
	public void user_enter_customer_details(DataTable customer) {
	    // Write code here that turns the phrase above into concrete actions
		List<String> data= customer.row(0);
	    driver.findElement(By.name("name")).sendKeys(data.get(0));
	    driver.findElement(By.xpath("//input[@type='radio'][@value='m']")).click();
	    driver.findElement(By.xpath("//input[@type='date']")).sendKeys(data.get(2));
	    driver.findElement(By.name("addr")).sendKeys(data.get(3));
	    driver.findElement(By.name("city")).sendKeys(data.get(4));
	    driver.findElement(By.name("state")).sendKeys(data.get(5));
	    driver.findElement(By.name("pinno")).sendKeys(data.get(6));
	    driver.findElement(By.name("telephoneno")).sendKeys(data.get(7));
	    driver.findElement(By.name("emailid")).sendKeys(data.get(8));
	    driver.findElement(By.name("password")).sendKeys(data.get(9));
	    
	}

	@Then("user enter data of birth")
	public void user_enter_submit_button(){
	    // Write code here that turns the phrase above into concrete actions
		 driver.findElement(By.name("sub")).click();
	}



}
