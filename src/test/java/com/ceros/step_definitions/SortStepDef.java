package com.ceros.step_definitions;

import com.ceros.pages.CerosLogin;
import com.ceros.pages.HomePage;
import com.ceros.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.Arrays;
import java.util.List;

public class SortStepDef {

    CerosLogin cerosLogin = new CerosLogin();
    HomePage homePage =  new HomePage();
    List<WebElement> beforeSort =  homePage.inventoryList;



    @Given("user clicks on sort button")
    public void clicks_on_sort_button() {
        homePage.sortSign.click();
        BrowserUtils.waitFor(2);
    }

    @When("user selects {string}")
    public void user_selects(String string) {
        Select objSelect =new Select(homePage.sortSign);
        switch (string) {
            case "az":
                objSelect.selectByVisibleText("Name (A to Z)");
                break;
            case "za":
                objSelect.selectByVisibleText("Name (Z to A)");
                break;
            case "price low first":
                objSelect.selectByVisibleText("Price (low to high)");
                break;
            case "price high first":
                objSelect.selectByVisibleText("Price (high to low)");
                break;
        }
    }

    @Then("inventory items are sorted")
    public void inventory_items_are_sorted() {
        List<WebElement> afterSort = homePage.inventoryList;
        if(!(afterSort==beforeSort)){
            System.out.println("Sorted");
        }else{
            System.out.println("Not sorted");
        }


        }
    }
