package com.ceros.pages;

import com.ceros.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage extends CerosLogin{

    public HomePage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//button[normalize-space(text())='Open Menu']")
    public WebElement username;

    @FindBy(xpath = "//span[normalize-space(text())='1']")
    public WebElement cartItem;

    @FindBy(id = "//span[@class='shopping_cart_badge']")
    public WebElement cartBadge;

    @FindBy( xpath = "//button[normalize-space(text())='Add to cart']")
    public List<WebElement> inventoryList;


}
