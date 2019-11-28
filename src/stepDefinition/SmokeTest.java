package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SmokeTest {

    WebDriver driver;
    @Given("^open browser$")
    public void open_browser() throws Throwable {
        System.setProperty("webdriver.chrome.driver","C:\\chromedr\\chromedriver.exe");
        driver = new ChromeDriver();
//        System.setProperty("webdriver.firefox.marionette","C:\\geckodriverFirefox\\geckodriver.exe");
//        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
    }

//    @When("^Enter valid username and pw$")
//    public void Enter_valid_username_and_pw() throws Throwable {
//        driver.findElement(By.id("email")).sendKeys("kasunaratthanage@gmail.com");
//        driver.findElement(By.id("pass")).sendKeys("DANTHA13");
//    }

    @When("^Enter valid \"([^\"]*)\" and \"([^\"]*)\"$")
    public void Enter_valid_and(String username, String password) throws Throwable {
        driver.findElement(By.id("email")).sendKeys("username");
        driver.findElement(By.id("pass")).sendKeys("password");
    }

    @Then("^User can login$")
    public void User_can_login() throws Throwable {
        driver.findElement(By.id("loginbutton")).click();
        driver.close();

    }

}
