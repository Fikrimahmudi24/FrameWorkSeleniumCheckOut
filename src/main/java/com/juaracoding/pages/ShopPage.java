package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShopPage {
    private WebDriver driver;

    public ShopPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
        JavascriptExecutor js = (JavascriptExecutor) driver;// untuk menambahkan scroll
        js.executeScript("window.scrollBy(0,600)"); //scroll vertical 600px
    }

    //Locator @FindBy
    @FindBy(xpath = "/html/body/div[2]/div[2]/div[3]/div/div[2]/div/div/div/div[2]/div[2]/div[1]/div/div[1]/a")
    WebElement btnShop;

    public void shop(){
        btnShop.click();
    }
}
