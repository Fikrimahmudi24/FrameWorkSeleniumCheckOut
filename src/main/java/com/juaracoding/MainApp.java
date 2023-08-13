package com.juaracoding;

import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.pages.*;
import org.openqa.selenium.WebDriver;

public class MainApp {

    static WebDriver driver;

    public static void main(String[] args) {
        DriverSingleton.getInstance("chrome");
        driver = DriverSingleton.getDriver();
        driver.get("https://shop.demoqa.com/my-account/");

        //Akses Halaman Login
        LoginPage loginPage = new LoginPage();
        loginPage.login();

        //Akses Halaman Dashboard & Masuk ke shop
        DashboardPage dashboardPage = new DashboardPage();
        dashboardPage.dashboard();
        System.out.println("Akses Dashboard menuju Halaman Shop");

        //Halaman Shop dengan memilih baju oversized Pink
        ShopPage shopPage = new ShopPage();
        shopPage.shop();
        System.out.println("\n Berhasil Memilih Baju Oversized Pink");

        //Halaman Add to Cart dan Pemilihan warna dan ukuran baju
        ColorSizePage colorSizePage = new ColorSizePage();
        colorSizePage.colorsize();
        System.out.println("Berhasil ditambahkan/Add ke dalam Keranjangt/Cart");

        //Halaman View Add to Cart
        ViewCartPage viewCartPage = new ViewCartPage();
        viewCartPage.viewcart();
        System.out.println("Silahkan Lihat produk terlebih dahulu pada halaman Cart");

        //Halaman Shop setelah mengklik button continnue shopping
        ContShoppingPage contShoppingPage = new ContShoppingPage();
        contShoppingPage.contShopping();
        System.out.println("Continue Shopping");

        //Halaman Shop, untuk memilih dan adding ke cart
        ShopTwoPage shopTwoPage = new ShopTwoPage();
        shopTwoPage.shopTwo();
        System.out.println("Silahkan pilih Product kembali");

        //Halaman Add to Cart dan pemilihan warna dan ukuran baju 2
        ColorSizeTwoPage colorSizeTwoPage = new ColorSizeTwoPage();
        colorSizeTwoPage.colorSizeTwo();
        System.out.println("Klik Add setelah Anda memilih warna dan ukuran product");

        //Halaman View Cart 2
        ViewCartTwoPage viewCartTwoPage = new ViewCartTwoPage();
        viewCartTwoPage.viewCartTwo();
        System.out.println("\n Silahkan Check Out, jika product Anda sudah sesuai");

        //Button Checkout
        CheckOut checkOut = new CheckOut();
        checkOut.checkout();
        System.out.println("Tekan button chekout");

        //Biodata checkout
        CheckOutData checkOutData = new CheckOutData();
        checkOutData.checkoutData("fikri", "mahmudi", "USU", "ID",
                "Jl.Elang", "Medan", "SU", "22325", "082274774485");
        System.out.println("Data Anda Bewrhasil Diisi");

        //Scraping PO
        checkOutData.cekCO("\n makasih yooo. Your order has been received.");


        DriverSingleton.delay(90);
        DriverSingleton.closeObjectInstance();
    }
}