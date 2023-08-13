package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOut {
    private WebDriver driver;

    public CheckOut(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
        DriverSingleton.delay(3);
        DriverSingleton.scrolling();

    }
    //Locator @FindBy
    @FindBy(xpath = "//*[@id=\"post-6\"]/div/div/div[2]/div[2]/div/a")
    WebElement btnCheckOut;

    public void checkout(){
        btnCheckOut.click();
    }
}
