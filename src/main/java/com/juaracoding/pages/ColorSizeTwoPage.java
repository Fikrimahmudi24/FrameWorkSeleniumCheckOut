package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ColorSizeTwoPage {
    private WebDriver driver;

    public ColorSizeTwoPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
        DriverSingleton.delay(3);
        DriverSingleton.scrolling();
    }
    //Locator @FindBy
    @FindBy(xpath = "//*[@id=\"pa_color\"]/option[2]")
    WebElement btnColor;

    @FindBy(xpath = "//*[@id=\"pa_size\"]/option[2]")
    WebElement btnSize;

    @FindBy(xpath = "//*[@id=\"product-1485\"]/div[1]/div[2]/form/div/div[2]/button")
    WebElement btnAdd;

    @FindBy(css = "div[role='alert']")
    WebElement scrapAdd;

    public void colorSizeTwo(){
        btnColor.click();
        btnSize.click();
        btnAdd.click();

        //Scraping Add Cart
        String addC = scrapAdd.getText();
        System.out.println("\n" + addC + "Note: Teks VIEW CART yang ada pada console merupakan 1 bagian \n ke teks bawahnya maka dari itu saya menggunakan CONTAINS pada assertnya");

        String hasil = assertEquals(addC, "black lux graphic t-shirt” has been added to your cart");
        System.out.println("\n"+hasil);
    }

    //Method assert
    public static String assertEquals(String actual, String expected) {
        if (actual.contains(expected)) {
            return "Produk Berhasil Ditambahkan ke dalam Cart";
        } else {
            return "Tidak berhasil menambahkan produk ke Cart";
        }
    }
}
