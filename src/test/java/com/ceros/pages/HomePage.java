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


    @FindBy(id = "shopping_cart_container")
    public WebElement cartBadge;

    @FindBy( xpath = "//div[@class='inventory_item_price']/following-sibling::button")
    public List<WebElement> inventoryList;

    @FindBy (id = "checkout")
    public WebElement checkOut;

    @FindBy (id = "first-name")
    public WebElement firstName;

    @FindBy (id = "last-name")
    public WebElement lastName;

    @FindBy (id = "postal-code")
    public WebElement zipCode;

    @FindBy (id = "continue")
    public WebElement continueButton;

    @FindBy (id = "finish")
    public WebElement finish;

    @FindBy(xpath = "//span[@class='title']")
    public WebElement title;

    @FindBy(xpath = "//select[@class='product_sort_container']")
    public WebElement sortSign;




}
