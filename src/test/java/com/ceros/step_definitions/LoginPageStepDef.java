package com.ceros.step_definitions;

import com.ceros.pages.CerosLogin;
import com.ceros.pages.HomePage;
import com.ceros.utilities.BrowserUtils;
import com.ceros.utilities.ConfigurationReader;
import com.ceros.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageStepDef {

    CerosLogin cerosLogin = new CerosLogin();
    HomePage homePage =  new HomePage();

    @Given("user is on login page")
    public void user_is_on_login_page() {
        String uRL = ConfigurationReader.getProperty("url");
        Driver.get().get(uRL);
    }

    @When("user enters {string} and {string}")
    public void userEntersAnd(String username, String password) {
        cerosLogin.username.sendKeys(username);
        cerosLogin.password.sendKeys(password);

    }

    @When("clicks on login button")
    public void clicks_on_login_button() {
        cerosLogin.loginButton.click();

    }
    @Then("user is on home page")
    public void user_is_on_home_page() {
        BrowserUtils.waitFor(3);
        BrowserUtils.verifyElementDisplayed(homePage.cartBadge);

    }

}
