package com.ceros.pages;

import com.ceros.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CerosLogin {

    public CerosLogin(){
        PageFactory.initElements(Driver.get(), this);
    }

    // @FindBy (id = "user-name")
    @FindBy(id = "user-name")
    public WebElement username;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(id = "login-button")
    public WebElement loginButton;


}
