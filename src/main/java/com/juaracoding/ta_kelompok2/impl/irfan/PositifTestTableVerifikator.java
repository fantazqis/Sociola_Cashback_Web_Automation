package com.juaracoding.ta_kelompok2.impl.irfan;
/*
IntelliJ IDEA 2023.3.6 (Community Edition)
Build #IC-233.15026.9, built on March 21, 2024
@Author kiyandark a.k.a. Muhammad Irfan Syaifur Rizal Wiratama
Java Developer
Created on 28/05/2024 13:52
@Last Modified 28/05/2024 13:52
Version 1.0
*/

import com.juaracoding.ta_kelompok2.connection.Constants;
import com.juaracoding.ta_kelompok2.connection.DriverSingleton;
import com.juaracoding.ta_kelompok2.page.LoginPage;
import com.juaracoding.ta_kelompok2.page.Navbar;
import com.juaracoding.ta_kelompok2.page.VerifikasiPage;
import com.juaracoding.ta_kelompok2.util.GlobalFunction;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class PositifTestTableVerifikator {
    public WebDriver driver;
    private static ExtentTest extentTest;
    private LoginPage loginPage ;
    private Navbar navbar;

    private VerifikasiPage verifikasiPage;

    @BeforeTest
    public void initCase(){
        DriverSingleton.getInstance(Constants.FIREFOX);
        driver = DriverSingleton.getDriver();
        driver.get(Constants.URL_LOGIN);
        loginPage = new LoginPage(driver);
        navbar = new Navbar(driver);
        verifikasiPage = new VerifikasiPage(driver);
    }

    @Test(priority = 0)
    public void validLogin(){
        System.out.println("Valid Login Run");
        loginPage.clearLoginForm();
        loginPage.inputTextFieldInputUsername("admintiara2");
        loginPage.inputTextFieldInputPassword("a");
        loginPage.clickBtnLoginSubmit();
        GlobalFunction.delay(2);
        String validation = navbar.yNavbarBrandingValidation();
        System.out.println(validation);

        System.out.println("Valid Login End");

    }

//    @Test(priority = 1)
//    public void testTableVerifikasi10Entries(){
//        System.out.println("Valid Login Run");
//        navbar.yClickBtnVerifikasi();
//        GlobalFunction.delay(2);
//        String validationVerifikasi = verifikasiPage.yGetTextVerifikasiValidation();
//        System.out.println(validationVerifikasi);
//        verifikasiPage.ySelectOptionVerifikasiEntries10();
//        GlobalFunction.delay(5);
//        int verifikasiEntries = verifikasiPage.yGetRowNumberByElement();
//        System.out.println(verifikasiEntries);
//
//        System.out.println("Valid Login End");
//
//    }
//
//    @Test(priority = 2)
//    public void testTableVerifikasi25Entries(){
//        System.out.println("Valid Login Run");
//        navbar.yClickBtnVerifikasi();
//        GlobalFunction.delay(2);
//        String validationVerifikasi = verifikasiPage.yGetTextVerifikasiValidation();
//        System.out.println(validationVerifikasi);
//        verifikasiPage.ySelectOptionVerifikasiEntries25();
//        GlobalFunction.delay(5);
//        int verifikasiEntries = verifikasiPage.yGetRowNumberByElement();
//        System.out.println(verifikasiEntries);
//
//
//        verifikasiPage.getTableDataAsHashSet();
//
//
//
//    }
//
//    @Test(priority = 3)
//    public void testTableVerifikasi50Entries(){
//        System.out.println("Valid Login Run");
//        navbar.yClickBtnVerifikasi();
//        GlobalFunction.delay(2);
//        String validationVerifikasi = verifikasiPage.yGetTextVerifikasiValidation();
//        System.out.println(validationVerifikasi);
//        verifikasiPage.ySelectOptionVerifikasiEntries50();
//        GlobalFunction.delay(5);
//        int verifikasiEntries = verifikasiPage.yGetRowNumberByElement();
//        System.out.println(verifikasiEntries);
//
//        System.out.println("Valid Login End");
//
//    }
//
//    @Test(priority = 4)
//    public void testTableVerifikasi100Entries(){
//        System.out.println("Valid Login Run");
//        navbar.yClickBtnVerifikasi();
//        GlobalFunction.delay(2);
//        String validationVerifikasi = verifikasiPage.yGetTextVerifikasiValidation();
//        System.out.println(validationVerifikasi);
//        verifikasiPage.ySelectOptionVerifikasiEntries100();
//        GlobalFunction.delay(5);
//        int verifikasiEntries = verifikasiPage.yGetRowNumberByElement();
//        System.out.println(verifikasiEntries);
//
//        System.out.println("Valid Login End");
//
//    }
//
//    @Test(priority = 4)
//    public void testTableVerifikasiSearchValidData(){
//        System.out.println("Valid Login Run");
//        navbar.yClickBtnVerifikasi();
//        GlobalFunction.delay(2);
//        String validationVerifikasi = verifikasiPage.yGetTextVerifikasiValidation();
//        System.out.println(validationVerifikasi);
//
//
//        System.out.println("Valid Login End");
//
//    }

    @Test(priority = 1)
    public void testSearchDataTable() {
        System.out.println("Valid Login Run");
        System.out.println("Valid Login Run");
        navbar.yClickBtnVerifikasi();
        GlobalFunction.delay(2);
        String validationVerifikasi = verifikasiPage.yGetTextVerifikasiValidation();
        System.out.println(validationVerifikasi);
        GlobalFunction.delay(1);
        System.out.println("masuk pencarian data");
        String dataToSearch = verifikasiPage.yGetRandomTableDataString("Nama Customer");
        verifikasiPage.ySearchDataTableVerifikasi(dataToSearch);
        verifikasiPage.ySearchDataTableVerifikasi(dataToSearch);
        GlobalFunction.delay(2);

        navbar.yClickBtnVerifikasi();
        GlobalFunction.delay(2);
        System.out.println(validationVerifikasi);
        GlobalFunction.delay(1);
        System.out.println("masuk pencarian data");
        String dataToSearchnomorhp = verifikasiPage.yGetRandomTableDataString("Nomor Handphone");
        verifikasiPage.ySearchDataTableVerifikasi(dataToSearchnomorhp);
        verifikasiPage.ySearchDataTableVerifikasi(dataToSearchnomorhp);

        navbar.yClickBtnVerifikasi();
        GlobalFunction.delay(2);

        System.out.println(validationVerifikasi);
        GlobalFunction.delay(1);
        System.out.println("masuk pencarian data");
        String dataToSearchRRN = verifikasiPage.yGetRandomTableDataString("RRN");
        verifikasiPage.ySearchDataTableVerifikasi(dataToSearchRRN);
        verifikasiPage.ySearchDataTableVerifikasi(dataToSearchRRN);
        GlobalFunction.delay(2);

        navbar.yClickBtnVerifikasi();
        GlobalFunction.delay(2);

        System.out.println(validationVerifikasi);
        GlobalFunction.delay(1);
        System.out.println("masuk pencarian data");
        String dataToSearchref = verifikasiPage.yGetRandomTableDataString("Reference ID");
        verifikasiPage.ySearchDataTableVerifikasi(dataToSearchref);
        verifikasiPage.ySearchDataTableVerifikasi(dataToSearchref);
        GlobalFunction.delay(2);
    }

    @Test(priority = 4)
    public void testTableVerifikasiSearchValidData(){
        System.out.println("Valid Login Run");
        navbar.yClickBtnVerifikasi();
        GlobalFunction.delay(2);
        String validationVerifikasi = verifikasiPage.yGetTextVerifikasiValidation();
        System.out.println(validationVerifikasi);


        System.out.println("Valid Login End");

    }


//        List<WebElement> allheader = verifikasiPage.getTableDataAsHashSet();
//
//        System.out.println("print list \n ======================================================    ");
//        for (WebElement ele:allheader)
//        {
//            String value = ele.getText();
//            System.out.println(value);
//        }
//        List<WebElement> allHeader = driver.findElements(By.xpath("//table[@id='table']//td"));
//
//        System.out.println(allHeader.size());
//
//        for (WebElement ele:allHeader)
//        {
//            String value = ele.getText();
//            System.out.println(value);
//        }







}
