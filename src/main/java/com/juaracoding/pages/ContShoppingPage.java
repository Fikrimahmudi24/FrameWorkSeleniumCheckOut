package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContShoppingPage {
    private WebDriver driver;

    public ContShoppingPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
        DriverSingleton.delay(3);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 700)");

    }
    //Locator @FindBy
    @FindBy(xpath = "//a[@class='continue']")
    WebElement btnContinue;

    public void contShopping(){
        btnContinue.click();
    }
}
