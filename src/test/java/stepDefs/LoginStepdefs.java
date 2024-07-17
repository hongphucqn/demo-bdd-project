package stepDefs;

import driver.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginStepdefs {
    //1. Init WebDriver session
    WebDriver driver;

    @Given("user is in login page")
    public void userIsInLoginPage() {
        //1. Init WebDriver session
        driver = DriverFactory.getChromeDriver322(); //Select once on 4 ways to initial WebDriver

        //2. Open target page
        driver.get("https://the-internet.herokuapp.com/login");
    }

    @When("user login with username and password")
    public void userLoginWithUsernameAndPassword() {
        //3. Find elements
        WebElement ipEmail = driver.findElement(By.id("username"));
        WebElement ipPassword = driver.findElement(By.id("password"));
        WebElement btnLogin = driver.findElement(By.xpath("//button[@type='submit']"));

        //4. Action elements
        ipEmail.sendKeys("hongphuc");
        ipPassword.sendKeys("Aa@123456");
        btnLogin.click();
    }

    @Then("user sees the error message displays correct")
    public void userSeesTheErrorMessageDisplaysCorrect() {

    }
}
