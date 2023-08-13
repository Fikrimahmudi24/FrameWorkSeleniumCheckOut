package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class CheckOutData {
    private WebDriver driver;

    public CheckOutData(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
        DriverSingleton.delay(3);
        DriverSingleton.scrolling();

    }
    //Locator @FindBy
    @FindBy(xpath = "//*[@id=\"billing_first_name\"]")
    WebElement firstName;

    @FindBy(xpath = "//*[@id=\"billing_last_name\"]")
    WebElement lastName;

    @FindBy(xpath = "//*[@id=\"billing_company\"]")
    WebElement companyName;
    //[@id="list"]//a


//    @FindBy(xpath = "//*[@title=\"Indonesia\"]")
//    WebElement country;

    //checkbos
    @FindBy(xpath = "//*[@id=\"payment\"]/div/div/p/label/span")
    WebElement checkBox;
//
    @FindBy(xpath = "//*[@id=\"billing_address_1\"]")
    WebElement streetAddress;

    @FindBy(xpath = "//*[@id=\"billing_city\"]")
    WebElement city;

    //*[@id="billing_postcode"]
    @FindBy(xpath = "//*[@id=\"billing_postcode\"]")
    WebElement kodePos;

    @FindBy(xpath = "//*[@id=\"billing_phone\"]")
    WebElement phone;


    @FindBy(xpath = "//button[@id='place_order']")
    WebElement po;

    @FindBy(xpath = "//p[@class='woocommerce-thankyou-order-received']")
    WebElement validasiCO;
//
//    @FindBy(xpath = "//*[@title=\"Sumatera Utara\"]")
//    WebElement provinsi;

    public void checkoutData(String namaPertama, String namaTerakhir, String namaPerusahaan, String negara,
    String jalan, String kota, String provinsi, String posKode, String hp){

        firstName.clear();
        firstName.sendKeys(namaPertama);

        lastName.clear();
        lastName.sendKeys(namaTerakhir);

        companyName.clear();
        companyName.sendKeys(namaPerusahaan);

        DriverSingleton.selectNegara(negara);

        checkBox.click();

        streetAddress.clear();
        streetAddress.sendKeys(jalan);

        city.clear();
        city.sendKeys(kota);

        DriverSingleton.selectProvinsi(provinsi);

        kodePos.clear();
        kodePos.sendKeys(posKode);

        phone.clear();
        phone.sendKeys(hp);

        DriverSingleton.delay(2);
        po.click();

    }

    public void cekCO(String expect) {
        String scraping = validasiCO.getText();
        String result = assertEquals(scraping, expect);
        System.out.println(result);
    }
    public static String assertEquals(String actual, String expected) {
        if (actual.contains(expected)) {
            String text = " Berhasil CO";
            return actual + text;
        } else {
            String textTwo = " Gagal CO";
            return expected + textTwo;
        }
    }

}
