package StepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObject.LoginPage;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDef 
{
	WebDriver driver;
	LoginPage loginPg;
	@Given("User Launch Chrome browser")
	public void user_launch_chrome_browser() 
	{
	    WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
	    
	    loginPg=new LoginPage(driver);
	}
	
    @When("User opens URL {string}")
    public void user_opens_url(String url)
    {
        driver.get(url);
    }

    @When("User enters Email as {string} and Password as {string}")
    public void user_enters_email_as_and_password_as(String string, String string2)
    {
        
    }

    @When("Click on Login")
    public void click_on_login() 
    {
        
    }

    @Then("Page Title Should be {string}")
    public void page_title_should_be1(String string) 
    {
        
    }

    @When("User click on Log out link")
    public void user_click_on_log_out_link() 
    {
       
    }

    @Then("Page Title should be {string}")
    public void page_title_should_be(String string) 
    {
        
    }

    @Then("close browser")
    public void close_browser() 
    {
        
    }
}
