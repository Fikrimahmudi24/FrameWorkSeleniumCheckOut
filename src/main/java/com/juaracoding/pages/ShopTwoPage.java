package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShopTwoPage {
    private WebDriver driver;

    public ShopTwoPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
        JavascriptExecutor js = (JavascriptExecutor) driver;// untuk menambahkan scroll
        js.executeScript("window.scrollBy(0,300)"); //scroll vertical 300px
    }

    //Locator @FindBy
    @FindBy(xpath = "//*[@id=\"noo-site\"]/div[2]/div[2]/div/div/div[2]/div/div[1]/div[2]/div[1]/div/div[1]/a/img")
    WebElement btnShopTwo;

    public void shopTwo(){
        btnShopTwo.click();
    }
}
