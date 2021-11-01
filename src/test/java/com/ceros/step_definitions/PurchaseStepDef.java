package com.ceros.step_definitions;

import com.ceros.pages.CerosLogin;
import com.ceros.pages.HomePage;
import com.ceros.utilities.BrowserUtils;
import com.ceros.utilities.ConfigurationReader;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class PurchaseStepDef {

    CerosLogin cerosLogin = new CerosLogin();
    HomePage homePage =  new HomePage();




    @Then("user clicks on {string} button")
    public void user_clicks_on_button(String string) {

        switch (string) {
            case "cart badge":
                homePage.cartBadge.click();
                break;
            case "check out":
                homePage.checkOut.click();
                break;
            case "continue":
                homePage.continueButton.click();
                break;
            case "finish":
                homePage.finish.click();
                break;
        }

    }

    @Then("user enters zipcode,first and last name")
    public void user_enters_zipcode_first_and_last_name() {
        String first = ConfigurationReader.getProperty("firstName");
        String last = ConfigurationReader.getProperty("lastName");
        String zip = ConfigurationReader.getProperty("zipCode");

        BrowserUtils.waitFor(2);

        homePage.firstName.sendKeys(first);
        homePage.lastName.sendKeys(last);
        homePage.zipCode.sendKeys(zip);

    }

    @Then("user should see check out complete in title")
    public void user_should_see_check_out_complete() {
        String expected = "CHECKOUT: COMPLETE!";
        String actual = homePage.title.getText();

        Assert.assertEquals(actual,expected);
    }

}
