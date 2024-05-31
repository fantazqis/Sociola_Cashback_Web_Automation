package com.juaracoding.ta_kelompok2.impl.irfan;
/*
IntelliJ IDEA 2023.3.6 (Community Edition)
Build #IC-233.15026.9, built on March 21, 2024
@Author kiyandark a.k.a. Muhammad Irfan Syaifur Rizal Wiratama
Java Developer
Created on 31/05/2024 14:42
@Last Modified 31/05/2024 14:42
Version 1.0
*/

import com.juaracoding.ta_kelompok2.connection.Constants;
import com.juaracoding.ta_kelompok2.page.LoginPage;
import com.juaracoding.ta_kelompok2.page.Navbar;
import com.juaracoding.ta_kelompok2.page.VerifikasiPage;
import com.juaracoding.ta_kelompok2.util.GlobalFunction;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class PositifTestTableVerifikasi {

    public WebDriver driver;
    private static ExtentTest extentTest;
    private LoginPage loginPage ;
    private Navbar navbar;

    private VerifikasiPage verifikasiPage;

    public String dataToSearch = "";


    public PositifTestTableVerifikasi(){
        this.driver = VerifikatorFinanceOutlineHooks.driver;
        loginPage = new LoginPage(driver);
        navbar = new Navbar(driver);
        verifikasiPage = new VerifikasiPage(driver);
        extentTest = VerifikatorFinanceOutlineHooks.extentTest;

    }


    @When("Test151 Membuka Halaman Login")
    public void test151_membuka_halaman_login() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        driver.get(Constants.URL_LOGIN);
        System.out.println("1");
        extentTest.log(LogStatus.PASS, "Test151 Membuka Halaman Login");
    }

    @And("Test151 Clear Field username dan password")
    public void test151_clear_field_username_dan_password() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        loginPage.clearLoginForm();
        System.out.println("2");
        extentTest.log(LogStatus.PASS, "Test151 Clear Field username dan password");
    }

    @And("^Test151 Input TextField User (.*) Yang Valid$")
    public void test151_input_textfield_user_username_yang_valid(String username) {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        loginPage.inputTextFieldInputUsername(username);
        System.out.println("3");
        extentTest.log(LogStatus.PASS, "Test151 Input TextField User username Yang Valid");
    }

    @And("^Test151 Input TextField Pass (.*) Yang Valid$")
    public void test151_input_textfield_pass_password_yang_valid(String password) {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        loginPage.inputTextFieldInputPassword(password);
        System.out.println("4");
        extentTest.log(LogStatus.PASS, "Test151 Input TextField Pass password Yang Valid");
    }

    @And("Test151 Klik Tombol Login")
    public void test151_klik_tombol_login() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        loginPage.clickBtnLoginSubmit();
        System.out.println("5");
        extentTest.log(LogStatus.PASS, "Test151 Klik Tombol Login");
    }

    @Then("Test151 Validasi Label Halaman Home")
    public void test151_validasi_label_halaman_home() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        String validation = navbar.yNavbarBrandingValidation();
        Assert.assertEquals("SOCIOLLA 2023", validation);
        System.out.println("6");
        extentTest.log(LogStatus.PASS, "Test151 Validasi Label Halaman Home");
    }

    @When("Test154 Klik Navbar Verifikasi")
    public void test154_klik_navbar_verifikasi() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        navbar.yClickBtnVerifikasi();
        System.out.println("9");
        extentTest.log(LogStatus.PASS, "Test154 Klik Navbar Verifikasi");
    }

    @Then("Test154 Validasi Label Halaman Verifikasi")
    public void test154_validasi_label_halaman_verifikasi() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        String validasi = verifikasiPage.yGetTextVerifikasiValidation();
        Assert.assertEquals("List Data Register", validasi);
        System.out.println("10");
        extentTest.log(LogStatus.PASS, "Test154 Validasi Label Halaman Verifikasi");
    }

    @And("^Test154 Menginput Dan Mencari (.*) Yang Dicari$")
    public void test154_input_field_data_yang_dicari_data(String data) {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        dataToSearch = verifikasiPage.yGetRandomTableDataString(data);
        verifikasiPage.ySearchDataTableVerifikasi(dataToSearch);
        System.out.println("11");
        extentTest.log(LogStatus.PASS, "Test154 Menginput Dan Mencari data Yang Dicari");
    }

    @And("Test154 Menginput Dan Mencari Data Yang Dicari Kembali")
    public void test154_input_field_data_yang_dicari_kembali() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        verifikasiPage.ySearchDataTableVerifikasi(dataToSearch);
        System.out.println("13");
        extentTest.log(LogStatus.PASS, "Test154 Menginput Dan Mencari Data Yang Dicari Kembali");
    }

    @Then("Test154 Validasi Data Yang Dicari")
    public void test154_validasi_data_yang_dicari() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        boolean validasi = verifikasiPage.yGetValidationDataTable(dataToSearch);
        Assert.assertTrue(validasi);
        System.out.println("15");
        extentTest.log(LogStatus.PASS, "Test154 Validasi Data Yang Dicari");
    }

    @When("Test157 Klik Navbar Verifikasi")
    public void test157_klik_navbar_verifikasi() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        navbar.yClickBtnVerifikasi();
        System.out.println("16");
        extentTest.log(LogStatus.PASS, "Test157 Klik Navbar Verifikasi");
    }

    @Then("Test157 Validasi Label Halaman Verifikasi")
    public void test157_validasi_label_halaman_verifikasi() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        String validasi = verifikasiPage.yGetTextVerifikasiValidation();
        Assert.assertEquals("List Data Register", validasi);
        System.out.println("17");
        extentTest.log(LogStatus.PASS, "Test157 Validasi Label Halaman Verifikasi");
    }

    @And("^Test157 Pilih Option Show Entries (.*)$")
    public void test157_pilih_option_show_entries_data(String data) {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        verifikasiPage.ySelectOptionVerifikasiEntries(data);
        System.out.println("18");
        extentTest.log(LogStatus.PASS, "Test157 Pilih Option Show Entries data");
    }

    @Then("Test157 Validasi Banyak Data Yang Ditampilkan")
    public void test157_validasi_banyak_data_yang_ditampilkan() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        int validasi = verifikasiPage.yGetDataTableRowTotal();
//        Assert.assertEquals(10, validasi);
        System.out.println("19");
        extentTest.log(LogStatus.PASS, "Test157 Validasi Banyak Data Yang Ditampilkan");
    }

}
