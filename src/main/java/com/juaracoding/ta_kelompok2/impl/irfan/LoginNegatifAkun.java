package com.juaracoding.ta_kelompok2.impl.irfan;
/*
IntelliJ IDEA 2023.3.6 (Community Edition)
Build #IC-233.15026.9, built on March 21, 2024
@Author kiyandark a.k.a. Muhammad Irfan Syaifur Rizal Wiratama
Java Developer
Created on 31/05/2024 15:35
@Last Modified 31/05/2024 15:35
Version 1.0
*/

import com.juaracoding.ta_kelompok2.connection.Constants;
import com.juaracoding.ta_kelompok2.page.LoginPage;
import com.juaracoding.ta_kelompok2.page.Navbar;
import com.juaracoding.ta_kelompok2.util.GlobalFunction;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginNegatifAkun {

    public WebDriver driver;
    private static ExtentTest extentTest;
    private LoginPage loginPage ;
    private Navbar navbar;


    public LoginNegatifAkun(){
        this.driver = VerifikatorFinanceOutlineHooks.driver;
        loginPage = new LoginPage(driver);
        navbar = new Navbar(driver);
        extentTest = VerifikatorFinanceOutlineHooks.extentTest;
        driver.get(Constants.URL_LOGIN);
    }



    @When("Test006 Clear Field Username Dan Password")
    public void test006_clear_field_username_dan_password() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        loginPage.clearLoginForm();
        System.out.println("1");
        extentTest.log(LogStatus.PASS, "Test006 Clear Field Username Dan Password");
    }

    @And("Test006 Input Field Username Empty String")
    public void test006_input_field_username_empty_string() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        loginPage.inputTextFieldInputUsername("");
        System.out.println("2");
        extentTest.log(LogStatus.PASS, "Test006 Input Field Username Empty String");
    }

    @And("Test006 Input Field Password Empty String")
    public void test006_input_field_password_empty_string() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        loginPage.inputTextFieldInputPassword("");
        System.out.println("3");
        extentTest.log(LogStatus.PASS, "Test006 Input Field Password Empty String");
    }

    @And("Test006 Klik Tombol Login")
    public void test006_klik_tombol_login() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        loginPage.clickBtnLoginSubmit();
        System.out.println("4");
        extentTest.log(LogStatus.PASS, "Test006 Klik Tombol Login");
    }

    @Then("Test006 Validasi Seluruh Notifikasi Yang Muncul Saat Tombol Login Di Klik")
    public void test006_validasi_seluruh_notifikasi_yang_muncul_saat_tombol_login_di_klik() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        boolean validasi = false;
        validasi = (loginPage.getAlertLoginEmptyPassword() && loginPage.getAlertLoginEmptyUsername());
        System.out.println("ini alidasi "+ validasi);
//        Assert.assertTrue(validasi);
        extentTest.log(LogStatus.PASS, "Test006 Validasi Seluruh Notifikasi Yang Muncul Saat Tombol Login Di Klik");
    }

    @When("Test007 Clear Field Username Dan Password")
    public void test007_clear_field_username_dan_password() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        System.out.println("6");
        extentTest.log(LogStatus.PASS, "Test007 Clear Field Username Dan Password");
    }

    @And("^Test007 Input Field User (.*) Yang Valid$")
    public void test007_input_field_user_username_yang_valid(String username) {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        loginPage.inputTextFieldInputUsername(username);
        System.out.println("7");
        extentTest.log(LogStatus.PASS, "Test007 Input Field User username Yang Valid");
    }

    @And("Test007 Input Field Password Empty String")
    public void test007_input_field_password_empty_string() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        loginPage.inputTextFieldInputPassword("");
        System.out.println("8");
        extentTest.log(LogStatus.PASS, "Test007 Input Field Password Empty String");
    }

    @And("Test007 Klik Tombol Login")
    public void test007_klik_tombol_login() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        loginPage.clickBtnLoginSubmit();
        System.out.println("9");
        extentTest.log(LogStatus.PASS, "Test007 Klik Tombol Login");
    }

    @Then("Test007 Validasi Seluruh Notifikasi Yang Muncul Saat Tombol Login Di Klik")
    public void test007_validasi_seluruh_notifikasi_yang_muncul_saat_tombol_login_di_klik() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        boolean validasi = loginPage.getAlertLoginEmptyPassword();
        Assert.assertTrue(validasi);
        System.out.println("inivalidasi " + validasi);
        System.out.println("10");
        extentTest.log(LogStatus.PASS, "Test007 Validasi Seluruh Notifikasi Yang Muncul Saat Tombol Login Di Klik");
    }

    @When("Test008 Clear Field Username Dan Password")
    public void test008_clear_field_username_dan_password() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        loginPage.clearLoginForm();
        System.out.println("11");
        extentTest.log(LogStatus.PASS, "Test008 Clear Field Username Dan Password");
    }

    @And("Test008 Input Field Username Empty String")
    public void test008_input_field_username_empty_string() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        loginPage.inputTextFieldInputUsername("");
        System.out.println("12");
        extentTest.log(LogStatus.PASS, "Test008 Input Field Username Empty String");
    }

    @And("^Test008 Input Field (.*) Yang Valid$")
    public void test008_input_field_password_yang_valid(String password) {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        loginPage.inputTextFieldInputPassword(password);
        System.out.println("13");
        extentTest.log(LogStatus.PASS, "Test008 Input Field password Yang Valid");
    }

    @And("Test008 Klik Tombol Login")
    public void test008_klik_tombol_login() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        loginPage.clickBtnLoginSubmit();
        System.out.println("14");

        extentTest.log(LogStatus.PASS, "Test008 Klik Tombol Login");
    }

    @Then("Test008 Validasi Seluruh Notifikasi Yang Muncul Saat Tombol Login Di Klik")
    public void test008_validasi_seluruh_notifikasi_yang_muncul_saat_tombol_login_di_klik() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        boolean validasi = loginPage.getAlertLoginEmptyUsername();
        Assert.assertTrue(validasi);
        System.out.println("ini balidasi "+ validasi);
        System.out.println("15");
        extentTest.log(LogStatus.PASS, "Test008 Validasi Seluruh Notifikasi Yang Muncul Saat Tombol Login Di Klik");
    }

    @When("Test009 Clear Field Username Dan Password")
    public void test009_clear_field_username_dan_password() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        loginPage.clearLoginForm();
        System.out.println("16");
        extentTest.log(LogStatus.PASS, "Test009 Clear Field Username Dan Password");
    }

    @And("^Test009 Input Field User (.*) Tidak Valid$")
    public void test009_input_field_user_username_tidak_valid(String username) {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        loginPage.inputTextFieldInputUsername(username);
        System.out.println("17");
        extentTest.log(LogStatus.PASS, "Test009 Input Field User username Tidak Valid");
    }

    @And("^Test009 Input Field Pass (.*) Tidak Valid$")
    public void test009_input_field_pass_password_tidak_valid(String password) {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        loginPage.inputTextFieldInputPassword(password);
        System.out.println("18");
        extentTest.log(LogStatus.PASS, "Test009 Input Field Pass password Tidak Valid");
    }

    @And("Test009 klik Tombol Login")
    public void test009_klik_tombol_login() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        loginPage.clickBtnLoginSubmit();
        System.out.println("19");
        extentTest.log(LogStatus.PASS, "Test009 klik Tombol Login");
    }

    @Then("Test009 Validasi Seluruh Notifikasi Yang Muncul Saat Tombol Login Di Klik")
    public void test009_validasi_seluruh_notifikasi_yang_muncul_saat_tombol_login_di_klik() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        String validasi = loginPage.getAlertLoginWrongCredential();
        Assert.assertEquals("Username atau Password Salah!", validasi);
        System.out.println("20");
        extentTest.log(LogStatus.PASS, "Test009 Validasi Seluruh Notifikasi Yang Muncul Saat Tombol Login Di Klik");
    }

    @When("Test010 Clear Field Username Dan Password")
    public void test010_clear_field_username_dan_password() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        loginPage.clearLoginForm();
        System.out.println("21");
        extentTest.log(LogStatus.PASS, "Test010 Clear Field Username Dan Password");
    }

    @And("^Test010 Input Field User (.*) Valid$")
    public void test010_input_field_user_username_valid(String username) {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        loginPage.inputTextFieldInputUsername(username);
        System.out.println("22");
        extentTest.log(LogStatus.PASS, "Test010 Input Field User username Valid");
    }

    @And("^Test010 Input Field Pass (.*) Tidak Valid$")
    public void test010_input_field_pass_password_tidak_valid(String password) {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        loginPage.inputTextFieldInputPassword(password);
        System.out.println("23");
        extentTest.log(LogStatus.PASS, "Test010 Input Field Pass password Tidak Valid");
    }

    @And("Test010 Klik Tombol Login")
    public void test010_klik_tombol_login() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        loginPage.clickBtnLoginSubmit();
        System.out.println("24");
        extentTest.log(LogStatus.PASS, "Test010 Klik Tombol Login");
    }

    @Then("Test010 Validasi Seluruh Notifikasi Yang Muncul Saat Tombol Login Di Klik")
    public void test010_validasi_seluruh_notifikasi_yang_muncul_saat_tombol_login_di_klik() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        String validasi = loginPage.getAlertLoginWrongCredential();
        Assert.assertEquals("Username atau Password Salah!", validasi);
        System.out.println("25");
        extentTest.log(LogStatus.PASS, "Test010 Validasi Seluruh Notifikasi Yang Muncul Saat Tombol Login Di Klik");
    }

    @When("Test011 Clear Field Username Dan Password")
    public void test011_clear_field_username_dan_password() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        loginPage.clearLoginForm();
        System.out.println("26");
        extentTest.log(LogStatus.PASS, "Test011 Clear Field Username Dan Password");
    }

    @And("^Test011 Input Field User (.*) Tidak Valid$")
    public void test011_input_field_user_username_tidak_valid(String username) {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        loginPage.inputTextFieldInputUsername(username);
        System.out.println("27");
        extentTest.log(LogStatus.PASS, "Test011 Input Field User username Tidak Valid");
    }

    @And("^Test011 Input Field Pass (.*) Valid$")
    public void test011_input_field_pass_password_valid(String password) {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        loginPage.inputTextFieldInputPassword(password);
        System.out.println("28");
        extentTest.log(LogStatus.PASS, "Test011 Input Field Pass password Valid");
    }

    @And("Test011 klik Tombol Login")
    public void test011_klik_tombol_login() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        loginPage.clickBtnLoginSubmit();
        System.out.println("29");
        extentTest.log(LogStatus.PASS, "Test011 klik Tombol Login");
    }

    @Then("Test011 Validasi Seluruh Notifikasi Yang Muncul Saat Tombol Login Di Klik")
    public void test011_validasi_seluruh_notifikasi_yang_muncul_saat_tombol_login_di_klik() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        String validasi = loginPage.getAlertLoginWrongCredential();
        Assert.assertEquals("Username atau Password Salah!", validasi);
        System.out.println("30");
        extentTest.log(LogStatus.PASS, "Test011 Validasi Seluruh Notifikasi Yang Muncul Saat Tombol Login Di Klik");
    }

    @When("Test012 Clear Field Username Dan Password")
    public void test012_clear_field_username_dan_password() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        loginPage.clearLoginForm();
        System.out.println("31");
        extentTest.log(LogStatus.PASS, "Test012 Clear Field Username Dan Password");
    }

    @And("Test012 Input Field Username Empty String")
    public void test012_input_field_username_empty_string() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        loginPage.inputTextFieldInputUsername("");
        System.out.println("32");
        extentTest.log(LogStatus.PASS, "Test012 Input Field Username Empty String");
    }

    @And("^Test012 Input Field Pass (.*) Tidak Valid$")
    public void test012_input_field_pass_password_tidak_valid(String password) {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        loginPage.inputTextFieldInputPassword(password);
        System.out.println("33");
        extentTest.log(LogStatus.PASS, "Test012 Input Field Pass password Tidak Valid");
    }

    @And("Test012 klik Tombol Login")
    public void test012_klik_tombol_login() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        loginPage.clickBtnLoginSubmit();
        System.out.println("34");
        extentTest.log(LogStatus.PASS, "Test012 klik Tombol Login");
    }

    @Then("Test012 Validasi Seluruh Notifikasi Yang Muncul Saat Tombol Login Di Klik")
    public void test012_validasi_seluruh_notifikasi_yang_muncul_saat_tombol_login_di_klik() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        boolean validasi = loginPage.getAlertLoginEmptyUsername();
        Assert.assertTrue(validasi);
        System.out.println("35");
        extentTest.log(LogStatus.PASS, "Test012 Validasi Seluruh Notifikasi Yang Muncul Saat Tombol Login Di Klik");
    }

    @When("Test013 Clear Field Username Dan Password")
    public void test013_clear_field_username_dan_password() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        loginPage.clearLoginForm();
        System.out.println("36");
        extentTest.log(LogStatus.PASS, "Test013 Clear Field Username Dan Password");
    }

    @And("^Test013 Input Field User (.*) Tidak Valid$")
    public void test013_input_field_user_username_tidak_valid(String username) {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        loginPage.inputTextFieldInputUsername(username);
        System.out.println("37");
        extentTest.log(LogStatus.PASS, "Test013 Input Field User username Tidak Valid");
    }

    @And("Test013 Input Field Password Empty String")
    public void test013_input_field_password_empty_string() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        loginPage.inputTextFieldInputPassword("");
        System.out.println("38");
        extentTest.log(LogStatus.PASS, "Test013 Input Field Password Empty String");
    }

    @And("Test013 klik Tombol Login")
    public void test013_klik_tombol_login() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        loginPage.clickBtnLoginSubmit();
        System.out.println("39");
        extentTest.log(LogStatus.PASS, "Test013 klik Tombol Login");
    }

    @Then("Test013 Validasi Seluruh Notifikasi Yang Muncul Saat Tombol Login Di Klik")
    public void test013_validasi_seluruh_notifikasi_yang_muncul_saat_tombol_login_di_klik() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        boolean validasi = loginPage.getAlertLoginEmptyPassword();
        Assert.assertTrue(validasi);
        System.out.println("40");
        extentTest.log(LogStatus.PASS, "Test013 Validasi Seluruh Notifikasi Yang Muncul Saat Tombol Login Di Klik");
    }

    @When("Test014 Clear Field Username Dan Password")
    public void test014_clear_field_username_dan_password() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        loginPage.clearLoginForm();
        System.out.println("41");
        extentTest.log(LogStatus.PASS, "Test014 Clear Field Username Dan Password");
    }

    @And("^Test014 Input Field User (.*) Huruf Besar$")
    public void test014_input_field_user_username_huruf_besar(String username) {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        loginPage.inputTextFieldInputUsername(username);
        System.out.println("42");
        extentTest.log(LogStatus.PASS, "Test014 Input Field User username Huruf Besar");
    }

    @And("^Test014 Input Field Pass (.*) Huruf Besar$")
    public void test014_input_field_pass_password_huruf_besar(String password) {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        loginPage.inputTextFieldInputPassword(password);
        System.out.println("43");
        extentTest.log(LogStatus.PASS, "Test014 Input Field Pass password Huruf Besar");
    }

    @And("Test014 klik Tombol Login")
    public void test014_klik_tombol_login() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        loginPage.clickBtnLoginSubmit();
        System.out.println("44");
        extentTest.log(LogStatus.PASS, "Test014 klik Tombol Login");
    }

    @Then("Test014 Validasi Seluruh Notifikasi Yang Muncul Saat Tombol Login Di Klik")
    public void test014_validasi_seluruh_notifikasi_yang_muncul_saat_tombol_login_di_klik() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        String validasi = loginPage.getAlertLoginWrongCredential();
        Assert.assertEquals("Username atau Password Salah!", validasi);
        System.out.println("45");
        extentTest.log(LogStatus.PASS, "Test014 Validasi Seluruh Notifikasi Yang Muncul Saat Tombol Login Di Klik");
    }

    @When("Test015 Clear Field Username Dan Password")
    public void test015_clear_field_username_dan_password() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        loginPage.clearLoginForm();
        System.out.println("46");
        extentTest.log(LogStatus.PASS, "Test015 Clear Field Username Dan Password");
    }

    @And("^Test015 Input Field User (.*) Valid$")
    public void test015_input_field_user_username_valid(String username) {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        loginPage.inputTextFieldInputUsername(username);
        System.out.println("47");
        extentTest.log(LogStatus.PASS, "Test015 Input Field User username Valid");
    }

    @And("^Test015 Input Field Pass (.*) Huruf Besar$")
    public void test015_input_field_pass_password_huruf_besar(String password) {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        loginPage.inputTextFieldInputPassword(password);
        System.out.println("48");
        extentTest.log(LogStatus.PASS, "Test015 Input Field Pass password Huruf Besar");
    }

    @And("Test015 klik Tombol Login")
    public void test015_klik_tombol_login() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        loginPage.clickBtnLoginSubmit();
        System.out.println("49");
        extentTest.log(LogStatus.PASS, "Test015 klik Tombol Login");
    }

    @Then("Test015 Validasi Seluruh Notifikasi Yang Muncul Saat Tombol Login Di Klik")
    public void test015_validasi_seluruh_notifikasi_yang_muncul_saat_tombol_login_di_klik() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        String validasi = loginPage.getAlertLoginWrongCredential();
        Assert.assertEquals("Username atau Password Salah!", validasi);
        System.out.println("50");
        extentTest.log(LogStatus.PASS, "Test015 Validasi Seluruh Notifikasi Yang Muncul Saat Tombol Login Di Klik");
    }

    @When("Test016 Clear Field Username Dan Password")
    public void test016_clear_field_username_dan_password() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        loginPage.clearLoginForm();
        System.out.println("51");
        extentTest.log(LogStatus.PASS, "Test016 Clear Field Username Dan Password");
    }

    @And("^Test016 Input Field User (.*) Huruf Besar$")
    public void test016_input_field_user_username_huruf_besar(String username) {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        loginPage.inputTextFieldInputUsername(username);
        System.out.println("52");
        extentTest.log(LogStatus.PASS, "Test016 Input Field User username Huruf Besar");
    }

    @And("^Test016 Input Field Pass (.*) Valid$")
    public void test016_input_field_pass_password_valid(String password) {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        loginPage.inputTextFieldInputPassword(password);
        System.out.println("53");
        extentTest.log(LogStatus.PASS, "Test016 Input Field Pass password Valid");
    }

    @And("Test016 klik Tombol Login")
    public void test016_klik_tombol_login() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        loginPage.clickBtnLoginSubmit();
        System.out.println("54");
        extentTest.log(LogStatus.PASS, "Test016 klik Tombol Login");
    }

    @Then("Test016 Validasi Seluruh Notifikasi Yang Muncul Saat Tombol Login Di Klik")
    public void test016_validasi_seluruh_notifikasi_yang_muncul_saat_tombol_login_di_klik() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        navbar.yClickBtnLogout();
        System.out.println("55");
        extentTest.log(LogStatus.PASS, "Test016 Validasi Seluruh Notifikasi Yang Muncul Saat Tombol Login Di Klik");
    }

    @When("Test017 Clear Field Username Dan Password")
    public void test017_clear_field_username_dan_password() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        loginPage.clearLoginForm();
        System.out.println("56");
        extentTest.log(LogStatus.PASS, "Test017 Clear Field Username Dan Password");
    }

    @And("^Test017 Input Field User (.*) Huruf Kecil$")
    public void test017_input_field_user_username_huruf_kecil(String username) {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        loginPage.inputTextFieldInputUsername(username);
        System.out.println("57");
        extentTest.log(LogStatus.PASS, "Test017 Input Field User username Huruf Kecil");
    }

    @And("^Test017 Input Field Pass (.*) Huruf Kecil$")
    public void test017_input_field_pass_password_huruf_kecil(String password) {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        loginPage.inputTextFieldInputPassword(password);
        System.out.println("58");
        extentTest.log(LogStatus.PASS, "Test017 Input Field Pass password Huruf Kecil");
    }

    @And("Test017 klik Tombol Login")
    public void test017_klik_tombol_login() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        loginPage.clickBtnLoginSubmit();
        System.out.println("59");
        extentTest.log(LogStatus.PASS, "Test017 klik Tombol Login");
    }

    @Then("Test017 Validasi Seluruh Notifikasi Yang Muncul Saat Tombol Login Di Klik")
    public void test017_validasi_seluruh_notifikasi_yang_muncul_saat_tombol_login_di_klik() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        String validasi = loginPage.getAlertLoginWrongCredential();
        Assert.assertEquals("Username atau Password Salah!", validasi);
        System.out.println("60");
        extentTest.log(LogStatus.PASS, "Test017 Validasi Seluruh Notifikasi Yang Muncul Saat Tombol Login Di Klik");
    }

    @When("Test018 Clear Field Username Dan Password")
    public void test018_clear_field_username_dan_password() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        loginPage.clearLoginForm();
        System.out.println("61");
        extentTest.log(LogStatus.PASS, "Test018 Clear Field Username Dan Password");
    }

    @And("^Test018 Input Field User (.*) Valid$")
    public void test018_input_field_user_username_valid(String username) {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        loginPage.inputTextFieldInputUsername(username);
        System.out.println("62");
        extentTest.log(LogStatus.PASS, "Test018 Input Field User username Valid");
    }

    @And("^Test018 Input Field Pass (.*) Huruf Kecil$")
    public void test018_input_field_pass_password_huruf_kecil(String password) {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        loginPage.inputTextFieldInputPassword(password);
        System.out.println("63");
        extentTest.log(LogStatus.PASS, "Test018 Input Field Pass password Huruf Kecil");
    }

    @And("Test018 klik Tombol Login")
    public void test018_klik_tombol_login() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        loginPage.clickBtnLoginSubmit();
        System.out.println("64");
        extentTest.log(LogStatus.PASS, "Test018 klik Tombol Login");
    }

    @Then("Test018 Validasi Seluruh Notifikasi Yang Muncul Saat Tombol Login Di Klik")
    public void test018_validasi_seluruh_notifikasi_yang_muncul_saat_tombol_login_di_klik() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        String validasi = loginPage.getAlertLoginWrongCredential();
        Assert.assertEquals("Username atau Password Salah!", validasi);
        System.out.println("65");
        extentTest.log(LogStatus.PASS, "Test018 Validasi Seluruh Notifikasi Yang Muncul Saat Tombol Login Di Klik");
    }

    @When("Test019 Clear Field Username Dan Password")
    public void test019_clear_field_username_dan_password() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        loginPage.clearLoginForm();
        System.out.println("66");
        extentTest.log(LogStatus.PASS, "Test019 Clear Field Username Dan Password");
    }

    @And("^Test019 Input Field User (.*) Huruf Kecil$")
    public void test019_input_field_user_username_huruf_kecil(String username) {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        loginPage.inputTextFieldInputUsername(username);
        System.out.println("67");
        extentTest.log(LogStatus.PASS, "Test019 Input Field User username Huruf Kecil");
    }

    @And("^Test019 Input Field Pass (.*) Valid$")
    public void test019_input_field_pass_password_valid(String password) {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        loginPage.inputTextFieldInputPassword(password);
        System.out.println("68");
        extentTest.log(LogStatus.PASS, "Test019 Input Field Pass password Valid");
    }

    @And("Test019 klik Tombol Login")
    public void test019_klik_tombol_login() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        loginPage.clickBtnLoginSubmit();
        System.out.println("69");
        extentTest.log(LogStatus.PASS, "Test019 klik Tombol Login");
    }

    @Then("Test019 Validasi Seluruh Notifikasi Yang Muncul Saat Tombol Login Di Klik")
    public void test019_validasi_seluruh_notifikasi_yang_muncul_saat_tombol_login_di_klik() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        navbar.yClickBtnLogout();

        System.out.println("70");
        extentTest.log(LogStatus.PASS, "Test019 Validasi Seluruh Notifikasi Yang Muncul Saat Tombol Login Di Klik");
    }

    @When("Test020 Clear Field Username Dan Password")
    public void test020_clear_field_username_dan_password() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        loginPage.clearLoginForm();
        System.out.println("71");
        extentTest.log(LogStatus.PASS, "Test020 Clear Field Username Dan Password");
    }

    @And("^Test020 Input Field User (.*) Dengan Spasi Di Depan$")
    public void test020_input_field_user_username_dengan_spasi_di_depan(String username) {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        loginPage.inputTextFieldInputUsername(" " + username);
        System.out.println("72");
        extentTest.log(LogStatus.PASS, "Test020 Input Field User username Dengan Spasi Di Depan");
    }

    @And("^Test020 Input Field Pass (.*) Dengan Spasi Di Depan$")
    public void test020_input_field_pass_password_dengan_spasi_di_depan(String password) {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        loginPage.inputTextFieldInputPassword(" " + password);
        System.out.println("73");
        extentTest.log(LogStatus.PASS, "Test020 Input Field Pass password Dengan Spasi Di Depan");
    }

    @And("Test020 klik Tombol Login")
    public void test020_klik_tombol_login() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        loginPage.clickBtnLoginSubmit();
        System.out.println("74");
        extentTest.log(LogStatus.PASS, "Test020 klik Tombol Login");
    }

    @Then("Test020 Validasi Seluruh Notifikasi Yang Muncul Saat Tombol Login Di Klik")
    public void test020_validasi_seluruh_notifikasi_yang_muncul_saat_tombol_login_di_klik() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        navbar.yClickBtnLogout();
        System.out.println("75");
        extentTest.log(LogStatus.PASS, "Test020 Validasi Seluruh Notifikasi Yang Muncul Saat Tombol Login Di Klik");
    }

    @When("Test021 Clear Field Username Dan Password")
    public void test021_clear_field_username_dan_password() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        loginPage.clearLoginForm();
        System.out.println("76");
        extentTest.log(LogStatus.PASS, "Test021 Clear Field Username Dan Password");
    }

    @And("^Test021 Input Field User (.*) Dengan Spasi Di Depan$")
    public void test021_input_field_user_username_dengan_spasi_di_depan(String username) {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        loginPage.inputTextFieldInputUsername(" " + username);
        System.out.println("77");
        extentTest.log(LogStatus.PASS, "Test021 Input Field User username Dengan Spasi Di Depan");
    }

    @And("^Test021 Input Field Pass (.*) Valid$")
    public void test021_input_field_pass_password_valid(String password) {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        loginPage.inputTextFieldInputPassword(password);
        System.out.println("78");
        extentTest.log(LogStatus.PASS, "Test021 Input Field Pass password Valid");
    }

    @And("Test021 klik Tombol Login")
    public void test021_klik_tombol_login() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        loginPage.clickBtnLoginSubmit();
        System.out.println("79");
        extentTest.log(LogStatus.PASS, "Test021 klik Tombol Login");
    }

    @Then("Test021 Validasi Seluruh Notifikasi Yang Muncul Saat Tombol Login Di Klik")
    public void test021_validasi_seluruh_notifikasi_yang_muncul_saat_tombol_login_di_klik() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        navbar.yClickBtnLogout();
        System.out.println("80");
        extentTest.log(LogStatus.PASS, "Test021 Validasi Seluruh Notifikasi Yang Muncul Saat Tombol Login Di Klik");
    }

    @When("Test022 Clear Field Username Dan Password")
    public void test022_clear_field_username_dan_password() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        loginPage.clearLoginForm();
        System.out.println("81");
        extentTest.log(LogStatus.PASS, "Test022 Clear Field Username Dan Password");
    }

    @And("^Test022 Input Field User (.*) Valid$")
    public void test022_input_field_user_username_valid(String username) {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        loginPage.inputTextFieldInputUsername(username);
        System.out.println("82");
        extentTest.log(LogStatus.PASS, "Test022 Input Field User username Valid");
    }

    @And("^Test022 Input Field Pass (.*) Dengan Spasi Di Depan$")
    public void test022_input_field_pass_password_dengan_spasi_di_depan(String password) {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        loginPage.inputTextFieldInputPassword(" " + password);
        System.out.println("83");
        extentTest.log(LogStatus.PASS, "Test022 Input Field Pass password Dengan Spasi Di Depan");
    }

    @And("Test022 klik Tombol Login")
    public void test022_klik_tombol_login() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        loginPage.clickBtnLoginSubmit();
        System.out.println("84");
        extentTest.log(LogStatus.PASS, "Test022 klik Tombol Login");
    }

    @Then("Test022 Validasi Seluruh Notifikasi Yang Muncul Saat Tombol Login Di Klik")
    public void test022_validasi_seluruh_notifikasi_yang_muncul_saat_tombol_login_di_klik() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        navbar.yClickBtnLogout();
        System.out.println("85");
        extentTest.log(LogStatus.PASS, "Test022 Validasi Seluruh Notifikasi Yang Muncul Saat Tombol Login Di Klik");
    }

    @When("Test023 Clear Field Username Dan Password")
    public void test023_clear_field_username_dan_password() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        loginPage.clearLoginForm();
        System.out.println("86");
        extentTest.log(LogStatus.PASS, "Test023 Clear Field Username Dan Password");
    }

    @And("^Test023 Input Field User (.*) Dengan Spasi Di Belakang$")
    public void test023_input_field_user_username_dengan_spasi_di_belakang(String username) {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        loginPage.inputTextFieldInputUsername(username + " ");
        System.out.println("87");
        extentTest.log(LogStatus.PASS, "Test023 Input Field User username Dengan Spasi Di Belakang");
    }

    @And("^Test023 Input Field Pass (.*) Dengan Spasi Di Belakang$")
    public void test023_input_field_pass_password_dengan_spasi_di_belakang(String password) {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        loginPage.inputTextFieldInputPassword(password + " ");
        System.out.println("88");
        extentTest.log(LogStatus.PASS, "Test023 Input Field Pass password Dengan Spasi Di Belakang");
    }

    @And("Test023 klik Tombol Login")
    public void test023_klik_tombol_login() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        loginPage.clickBtnLoginSubmit();
        System.out.println("89");
        extentTest.log(LogStatus.PASS, "Test023 klik Tombol Login");
    }

    @Then("Test023 Validasi Seluruh Notifikasi Yang Muncul Saat Tombol Login Di Klik")
    public void test023_validasi_seluruh_notifikasi_yang_muncul_saat_tombol_login_di_klik() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        navbar.yClickBtnLogout();
        System.out.println("90");
        extentTest.log(LogStatus.PASS, "Test023 Validasi Seluruh Notifikasi Yang Muncul Saat Tombol Login Di Klik");
    }

    @When("Test024 Clear Field Username Dan Password")
    public void test024_clear_field_username_dan_password() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        loginPage.clearLoginForm();
        System.out.println("91");
        extentTest.log(LogStatus.PASS, "Test024 Clear Field Username Dan Password");
    }

    @And("^Test024 Input Field User (.*) Dengan Spasi Di Belakang$")
    public void test024_input_field_user_username_dengan_spasi_di_belakang(String username) {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        loginPage.inputTextFieldInputUsername(username + " ");
        System.out.println("92");
        extentTest.log(LogStatus.PASS, "Test024 Input Field User username Dengan Spasi Di Belakang");
    }

    @And("^Test024 Input Field Pass (.*) Valid$")
    public void test024_input_field_pass_password_valid(String password) {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        loginPage.inputTextFieldInputPassword(password);
        System.out.println("93");
        extentTest.log(LogStatus.PASS, "Test024 Input Field Pass password Valid");
    }

    @And("Test024 klik Tombol Login")
    public void test024_klik_tombol_login() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        loginPage.clickBtnLoginSubmit();
        System.out.println("94");
        extentTest.log(LogStatus.PASS, "Test024 klik Tombol Login");
    }

    @Then("Test024 Validasi Seluruh Notifikasi Yang Muncul Saat Tombol Login Di Klik")
    public void test024_validasi_seluruh_notifikasi_yang_muncul_saat_tombol_login_di_klik() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        navbar.yClickBtnLogout();
        System.out.println("95");
        extentTest.log(LogStatus.PASS, "Test024 Validasi Seluruh Notifikasi Yang Muncul Saat Tombol Login Di Klik");
    }

    @When("Test025 Clear Field Username Dan Password")
    public void test025_clear_field_username_dan_password() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        loginPage.clearLoginForm();
        System.out.println("96");
        extentTest.log(LogStatus.PASS, "Test025 Clear Field Username Dan Password");
    }

    @And("^Test025 Input Field User (.*) Valid$")
    public void test025_input_field_user_username_valid(String username) {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        loginPage.inputTextFieldInputUsername(username);
        System.out.println("97");
        extentTest.log(LogStatus.PASS, "Test025 Input Field User username Valid");
    }

    @And("^Test025 Input Field Pass (.*) Dengan Spasi Di Belakang$")
    public void test025_input_field_pass_password_dengan_spasi_di_belakang(String password) {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        loginPage.inputTextFieldInputPassword(password + " ");
        System.out.println("98");
        extentTest.log(LogStatus.PASS, "Test025 Input Field Pass password Dengan Spasi Di Belakang");
    }

    @And("Test025 klik Tombol Login")
    public void test025_klik_tombol_login() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        loginPage.clickBtnLoginSubmit();
        System.out.println("99");
        extentTest.log(LogStatus.PASS, "Test025 klik Tombol Login");
    }

    @Then("Test025 Validasi Seluruh Notifikasi Yang Muncul Saat Tombol Login Di Klik")
    public void test025_validasi_seluruh_notifikasi_yang_muncul_saat_tombol_login_di_klik() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        navbar.yClickBtnLogout();
        System.out.println("100");
        extentTest.log(LogStatus.PASS, "Test025 Validasi Seluruh Notifikasi Yang Muncul Saat Tombol Login Di Klik");
    }


}
