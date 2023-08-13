package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewCartTwoPage {
    private WebDriver driver;

    public ViewCartTwoPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);

    }
    //Locator @FindBy
    @FindBy(xpath = "//*[@id=\"noo-site\"]/div[2]/div/div/div[1]/div/a")
    WebElement btnView;

    public void viewCartTwo(){
        btnView.click();
    }
}
