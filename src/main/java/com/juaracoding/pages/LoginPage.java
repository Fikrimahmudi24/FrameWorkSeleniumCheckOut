package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    private WebDriver driver;

    public LoginPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
        DriverSingleton.scrolling();
    }

    //Locator @FindBy
    @FindBy(xpath = "//*[@id=\"username\"]")
    WebElement username;


    @FindBy(xpath = "//*[@id=\"password\"]")
    WebElement password;

    @FindBy(xpath = "//*[@id=\"customer_login\"]/div[1]/form/p[3]/button")
    WebElement btnLogin;

    @FindBy(xpath = "//*[@id=\"post-8\"]/div/div/div/p[1]/strong[1]")
    WebElement scrapName;

    //custom Method
    //untuk login
    public void login(){
        username.sendKeys("fikri123");
        password.sendKeys("Fikri_240600");
        btnLogin.click();

        //Scraping Akun
        String namaAkun = scrapName.getText();
        System.out.println(namaAkun);

        String result = assertEquals(namaAkun, "fikrimahmudi2406");
        System.out.println(result);

    }

    //Method return yang digunakan untuk assert
    public static String assertEquals(String actual, String expected) {
        if (actual.equals(expected)) {
            String text = " Username Anda Sesuai dan Berhasil Login";
            return actual + text;
        } else {
            String textTwo = " Username Anda Tidak Sesuai dan Tidak Dapat Login";
            return expected + textTwo;
        }
    }
}
