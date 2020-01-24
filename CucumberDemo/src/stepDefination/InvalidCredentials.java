package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class InvalidCredentials {
	WebDriver driver;
	@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
		 driver =new ChromeDriver();
		driver.navigate().to("http://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
	}

	@When("^I enter invalid username and password$")
	public void i_enter_valid_username_and_password() throws Throwable {
		driver.findElement(By.id("Email")).sendKeys("pavan.kalluri199y7@gmail.com");
		 driver.findElement(By.name("Password")).sendKeys("pavan@1234");
		 
	}

	@Then("^user should not be able to login$")
	public void user_should_be_able_to_login() throws Throwable {
		  driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		  Thread.sleep(3000);
		  driver.quit();
	}

	


}
