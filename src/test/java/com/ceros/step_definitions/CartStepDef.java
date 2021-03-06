package com.ceros.step_definitions;

import com.ceros.pages.CerosLogin;
import com.ceros.pages.HomePage;
import com.ceros.utilities.BrowserUtils;
import com.ceros.utilities.ConfigurationReader;
import com.ceros.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class CartStepDef {
    CerosLogin cerosLogin =  new CerosLogin();
    HomePage homePage = new HomePage();

    @Given("user is logged in main page as {string}")
    public void user_is_logged_in_main_page_as(String string) {
        String uRL = ConfigurationReader.getProperty("url");

        Driver.get().get(uRL);
        switch (string){
            case "standard user" :
                String username = ConfigurationReader.getProperty("username");
                String password = ConfigurationReader.getProperty("password");
                cerosLogin.username.sendKeys(username);
                cerosLogin.password.sendKeys(password);
                cerosLogin.loginButton.click();
                break;
            case "locked user"   :
                String lockedUsername = ConfigurationReader.getProperty("lockedUsername");
                String LockedPassword = ConfigurationReader.getProperty("password");
                cerosLogin.username.sendKeys(lockedUsername);
                cerosLogin.password.sendKeys(lockedUsername);
                cerosLogin.loginButton.click();
                break;
            case "problem user"  :
                String problemUsername = ConfigurationReader.getProperty("problemUsername");
                String problemPassword = ConfigurationReader.getProperty("password");
                cerosLogin.username.sendKeys(problemUsername);
                cerosLogin.password.sendKeys(problemPassword);
                cerosLogin.loginButton.click();
                break;
            case "performance user" :
                String performanceUsername = ConfigurationReader.getProperty("performanceUsername");
                String performPassword = ConfigurationReader.getProperty("password");
                cerosLogin.username.sendKeys(performanceUsername);
                cerosLogin.password.sendKeys(performPassword);
                cerosLogin.loginButton.click();
                break;

        }
        BrowserUtils.waitFor(2);

    }
    @When("user adds <{int}> item to cart")
    public void user_adds_item_to_cart(Integer int1) {
        for (int i = 0; i < int1; i++) {
            homePage.inventoryList.get(i).click();
        }
        System.out.println(homePage.inventoryList.size());
        BrowserUtils.waitFor(2);
    }


    @Then("user should see {string} item in cart")
    public void user_should_see_item_in_cart(String string) {
        homePage.cartBadge.click();
        BrowserUtils.waitFor(2);

        String actual=
Driver.get().findElement(By.xpath("//span[normalize-space(text())='"+ string +"']")).getText();

        Assert.assertEquals(string,actual);
        BrowserUtils.waitFor(2);


    }

}
