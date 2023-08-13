package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
    private WebDriver driver;

    public DashboardPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }
    //Locator @FindBy
    @FindBy(xpath = "/html/body/p/a")
    WebElement btnDismiss;

    @FindBy(xpath = "//*[@id=\"noo-site\"]/header/div[2]/div/div/div/div/a/img")
    WebElement shopTools;

    //untuk dashbboard
    public void dashboard(){
        btnDismiss.click();
        DriverSingleton.delay(3);
        shopTools.click();
    }
}
