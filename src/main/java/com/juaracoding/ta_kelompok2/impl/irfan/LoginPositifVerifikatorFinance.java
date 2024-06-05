package com.juaracoding.ta_kelompok2.impl.irfan;
/*
IntelliJ IDEA 2023.3.6 (Community Edition)
Build #IC-233.15026.9, built on March 21, 2024
@Author kiyandark a.k.a. Muhammad Irfan Syaifur Rizal Wiratama
Java Developer
Created on 27/05/2024 6:00
@Last Modified 27/05/2024 6:00
Version 1.0
*/

import com.juaracoding.ta_kelompok2.connection.Constants;
import com.juaracoding.ta_kelompok2.page.LoginPage;
import com.juaracoding.ta_kelompok2.page.Navbar;
import com.juaracoding.ta_kelompok2.util.GlobalFunction;
import com.relevantcodes.extentreports.ExtentTest;
import com.juaracoding.ta_kelompok2.connection.DriverSingleton;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginPositifVerifikatorFinance {

    public WebDriver driver;
    private static ExtentTest extentTest;
    private LoginPage loginPage ;
    private Navbar navbar;

    public LoginPositifVerifikatorFinance(){
        this.driver = VerifikatorFinanceOutlineHooks.driver;
        loginPage = new LoginPage(driver);
        navbar = new Navbar(driver);
        extentTest = VerifikatorFinanceOutlineHooks.extentTest;
    }

    @When("Test002 Membuka Halaman Login")
    public void test002_membuka_halaman_login() {
        driver.get(Constants.URL_LOGIN);
        extentTest.log(LogStatus.PASS, "Test002 Membuka Halaman Login");
    }

    @And("Test002 Clear Field username dan password")
    public void test002_clear_field_username_dan_password() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        loginPage.clearLoginForm();
        extentTest.log(LogStatus.PASS, "Test002 Clear Field username dan password");
    }

    @And("^Test002 Input TextField User (.*) Yang Valid$")
    public void test002_input_textfield_user_username_yang_valid(String  username) {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        loginPage.inputTextFieldInputUsername(username);
        extentTest.log(LogStatus.PASS, "Test002 Input TextField User username Yang Valid");
    }

    @And("^Test002 Input TextField Pass (.*) Yang Valid$")
    public void test002_input_textfield_pass_password_yang_valid(String password) {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        loginPage.inputTextFieldInputPassword(password);
        extentTest.log(LogStatus.PASS, "Test002 Input TextField Pass password Yang Valid");
    }

    @And("Test002 Klik Tombol Login")
    public void test002_klik_tombol_login() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        loginPage.clickBtnLoginSubmit();
        extentTest.log(LogStatus.PASS, "Test002 Klik Tombol Login");
    }

    @Then("Test002 Validasi Label Halaman Home")
    public void test002_validasi_label_halaman_home() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        String validation = navbar.yNavbarBrandingValidation();
        Assert.assertEquals("SOCIOLLA 2023", validation);
        extentTest.log(LogStatus.PASS, "Test002 Validasi Label Halaman Home");
    }

    @When("Test002 Tekan Tombol Logout")
    public void test002_tekan_tombol_logout() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        navbar.yClickBtnLogout();
        extentTest.log(LogStatus.PASS, "Test002 Tekan Tombol Logout");
    }

    @Then("Test002 Validasi Label Halaman Login")
    public void test002_validasi_label_halaman_login() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        String validation = loginPage.yGetTextLoginValidation();
        Assert.assertEquals("SOCIOLLA TUNJUNGAN SURABAYA", validation);
        extentTest.log(LogStatus.PASS, "Test002 Validasi Label Halaman Login");
    }

    @When("Test003 Clear Field username dan password")
    public void test003_clear_field_username_dan_password() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        loginPage.clearLoginForm();
        extentTest.log(LogStatus.PASS, "Test003 Clear Field username dan password");
    }

    @And("^Test003 Input TextField User (.*) Yang Valid$")
    public void test003_input_textfield_user_username_yang_valid(String username) {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        loginPage.inputTextFieldInputUsername(username);
        extentTest.log(LogStatus.PASS, "Test003 Input TextField User username Yang Valid");
    }

    @And("^Test003 Input TextField Pass (.*) Yang Valid$")
    public void test003_input_textfield_pass_password_yang_valid(String password) {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        loginPage.inputTextFieldInputPassword(password);
        extentTest.log(LogStatus.PASS, "Test003 Input TextField Pass password Yang Valid");
    }

    @And("Test003 Klik Tombol Login")
    public void test003_klik_tombol_login() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        loginPage.clickBtnLoginSubmit();
        extentTest.log(LogStatus.PASS, "Test003 Klik Tombol Login");
    }

    @Then("Test003 Validasi Label Halaman Home")
    public void test003_validasi_label_halaman_home() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        GlobalFunction.delay(2);
        String validation = navbar.yNavbarBrandingValidation();
        Assert.assertEquals("SOCIOLLA 2023", validation);
        extentTest.log(LogStatus.PASS, "Test003 Validasi Label Halaman Home" + validation);
    }

    @When("Test003 Tekan Tombol Logout")
    public void test003_tekan_tombol_logout() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        navbar.yClickBtnLogout();
        extentTest.log(LogStatus.PASS, "Test003 Tekan Tombol Logout");
    }

    @Then("Test003 Validasi Label Halaman Login")
    public void test003_validasi_label_halaman_login() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        String validation = loginPage.yGetTextLoginValidation();
        Assert.assertEquals("SOCIOLLA TUNJUNGAN SURABAYA", validation);
        extentTest.log(LogStatus.PASS, "Test003 Validasi Label Halaman Login");
    }

}
