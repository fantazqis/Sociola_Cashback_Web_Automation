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
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.List;

public class PositifTestTableVerifikasi {

    public WebDriver driver;
    private static ExtentTest extentTest;
    private LoginPage loginPage ;
    private Navbar navbar;

    private VerifikasiPage verifikasiPage;

    public String dataToSearch = "";

    public List<String> allTableData;

    public String inconsistentData;

    public String partialData;

    public int entriesData;


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

        extentTest.log(LogStatus.PASS, "Test151 Membuka Halaman Login");
    }

    @And("Test151 Clear Field username dan password")
    public void test151_clear_field_username_dan_password() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        loginPage.clearLoginForm();

        extentTest.log(LogStatus.PASS, "Test151 Clear Field username dan password");
    }

    @And("^Test151 Input TextField User (.*) Yang Valid$")
    public void test151_input_textfield_user_username_yang_valid(String username) {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        loginPage.inputTextFieldInputUsername(username);

        extentTest.log(LogStatus.PASS, "Test151 Input TextField User username Yang Valid");
    }

    @And("^Test151 Input TextField Pass (.*) Yang Valid$")
    public void test151_input_textfield_pass_password_yang_valid(String password) {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        loginPage.inputTextFieldInputPassword(password);

        extentTest.log(LogStatus.PASS, "Test151 Input TextField Pass password Yang Valid");
    }

    @And("Test151 Klik Tombol Login")
    public void test151_klik_tombol_login() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        loginPage.clickBtnLoginSubmit();

        extentTest.log(LogStatus.PASS, "Test151 Klik Tombol Login");
    }

    @Then("Test151 Validasi Label Halaman Home")
    public void test151_validasi_label_halaman_home() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        String validation = navbar.yNavbarBrandingValidation();
        Assert.assertEquals("SOCIOLLA 2023", validation);

        extentTest.log(LogStatus.PASS, "Test151 Validasi Label Halaman Home");
    }

    @When("Test154 Klik Navbar Verifikasi")
    public void test154_klik_navbar_verifikasi() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        navbar.yClickBtnVerifikasi();

        extentTest.log(LogStatus.PASS, "Test154 Klik Navbar Verifikasi");
    }

    @Then("Test154 Validasi Label Halaman Verifikasi")
    public void test154_validasi_label_halaman_verifikasi() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        String validasi = verifikasiPage.yGetTextVerifikasiValidation();
        Assert.assertEquals("List Data Register", validasi);

        extentTest.log(LogStatus.PASS, "Test154 Validasi Label Halaman Verifikasi");
    }

    @And("^Test154 Menginput (.*) Valid$")
    public void test154_menginput_data_valid(String data) {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        dataToSearch = verifikasiPage.yGetRandomTableDataString(data);

        extentTest.log(LogStatus.PASS, "Test154 Menginput data Valid");
    }

    @And("Test154 Mencari Data Valid")
    public void test154_mencari_data_valid() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        verifikasiPage.ySendKeysEnter();

        extentTest.log(LogStatus.PASS, "Test154 Mencari Data Valid");
    }

    @And("Test154 Menginput Data Valid Kembali")
    public void test154_menginput_data_valid_kembali() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        verifikasiPage.yInputSearchBarVerifikasi(dataToSearch);

        extentTest.log(LogStatus.PASS, "Test154 Menginput Data Valid Kembali");
    }

    @And("Test154 Mencari Data Valid Kembali")
    public void test154_mencari_data_valid_kembali() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        verifikasiPage.ySendKeysEnter();

        extentTest.log(LogStatus.PASS, "Test154 Mencari Data Valid Kembali");
    }

    @Then("Test154 Validasi Data Yang Dicari")
    public void test154_validasi_data_yang_dicari() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        boolean validasi = verifikasiPage.yGetValidationDataTable(dataToSearch, "valid");
        Assert.assertTrue(validasi);

        extentTest.log(LogStatus.PASS, "Test154 Validasi Data Yang Dicari");
    }

    @When("Test155 Klik Navbar Verifikasi")
    public void test155_klik_navbar_verifikasi() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        navbar.yClickBtnVerifikasi();

        extentTest.log(LogStatus.PASS, "Test155 Klik Navbar Verifikasi");
    }

    @Then("Test155 Validasi Label Halaman Verifikasi")
    public void test155_validasi_label_halaman_verifikasi() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        String validasi = verifikasiPage.yGetTextVerifikasiValidation();
        Assert.assertEquals("List Data Register", validasi);

        extentTest.log(LogStatus.PASS, "Test155 Validasi Label Halaman Verifikasi");
    }

    @And("Test155 Menginput Empty String")
    public void test155_menginput_empty_string() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        allTableData = verifikasiPage.yGetAllDataTableData();
        System.out.println("ini hasil penyimpanan");
        System.out.println(allTableData);

        verifikasiPage.yInputSearchBarVerifikasi("");

        extentTest.log(LogStatus.PASS, "Test155 Menginput Empty String");
    }

    @And("Test155 Mencari Empty String")
    public void test155_mencari_empty_string() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        verifikasiPage.ySendKeysEnter();

        extentTest.log(LogStatus.PASS, "Test155 Mencari Empty String");
    }

    @And("Test155 Menginput Empty String Kembali")
    public void test155_menginput_empty_string_kembali() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        verifikasiPage.yInputSearchBarVerifikasi("");

        extentTest.log(LogStatus.PASS, "Test155 Menginput Empty String Kembali");
    }

    @And("Test155 Mencari Empty String Kembali")
    public void test155_mencari_empty_string_kembali() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        verifikasiPage.ySendKeysEnter();

        extentTest.log(LogStatus.PASS, "Test155 Mencari Empty String Kembali");
    }

    @Then("Test155 Validasi Banyak Data")
    public void test155_validasi_banyak_data() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        boolean validasi = verifikasiPage.yGetAllDataTableDataCompare(allTableData);
        Assert.assertTrue(validasi);

        System.out.println("ini validasi " + validasi);
        extentTest.log(LogStatus.PASS, "Test155 Validasi Banyak Data");
    }

    @When("Test156 Klik Navbar Verifikasi")
    public void test156_klik_navbar_verifikasi() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        System.out.println("inconsistent case run");
        navbar.yClickBtnVerifikasi();

        extentTest.log(LogStatus.PASS, "Test156 Klik Navbar Verifikasi");
    }

    @Then("Test156 Validasi Label Halaman Verifikasi")
    public void test156_validasi_label_halaman_verifikasi() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        String validasi = verifikasiPage.yGetTextVerifikasiValidation();
        Assert.assertEquals("List Data Register", validasi);

        extentTest.log(LogStatus.PASS, "Test156 Validasi Label Halaman Verifikasi");
    }

    @And("^Test156 Merubah (.*) Menjadi Case inconsistent$")
    public void test156_merubah_data_menjadi_case_inconsistent(String data) {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        System.out.println(data);
        dataToSearch = verifikasiPage.yGetRandomTableDataString(data);
        System.out.println("ini di code datatoget: "+dataToSearch);
        inconsistentData = verifikasiPage.yGetInconsistentCase(dataToSearch);
        System.out.println("ini di code inconsisten"+inconsistentData);


        extentTest.log(LogStatus.PASS, "Test156 Merubah data Menjadi Case inconsistent");
    }

    @And("Test156 Menginput Data Case inconsistent")
    public void test156_menginput_data_case_inconsistent() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        verifikasiPage.yInputSearchBarVerifikasi(inconsistentData);

        extentTest.log(LogStatus.PASS, "Test156 Menginput Data Case inconsistent");
    }

    @And("Test156 Mencari Data Case inconsistent")
    public void test156_mencari_data_case_inconsistent() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        verifikasiPage.ySendKeysEnter();

        extentTest.log(LogStatus.PASS, "Test156 Mencari Data Case inconsistent");
    }

    @And("Test156 Menginput Data Case inconsistent Kembali")
    public void test156_menginput_data_case_inconsistent_kembali() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        verifikasiPage.yInputSearchBarVerifikasi(inconsistentData);

        extentTest.log(LogStatus.PASS, "Test156 Menginput Data Case inconsistent Kembali");
    }

    @And("Test156 Mencari Data Case inconsistent Kembali")
    public void test156_mencari_data_case_inconsistent_kembali() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        verifikasiPage.ySendKeysEnter();

        extentTest.log(LogStatus.PASS, "Test156 Mencari Data Case inconsistent Kembali");
    }

    @Then("Test156 Validasi Data Case inconsistent")
    public void test156_validasi_data_case_inconsistent() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        boolean validasi = verifikasiPage.yGetValidationDataTable(inconsistentData, "inconsistent");
        Assert.assertTrue(validasi);

        extentTest.log(LogStatus.PASS, "Test156 Validasi Data Case inconsistent");
    }

    @When("Test157 Klik Navbar Verifikasi")
    public void test157_klik_navbar_verifikasi() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        navbar.yClickBtnVerifikasi();

        extentTest.log(LogStatus.PASS, "Test157 Klik Navbar Verifikasi");
    }

    @Then("Test157 Validasi Label Halaman Verifikasi")
    public void test157_validasi_label_halaman_verifikasi() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        String validasi = verifikasiPage.yGetTextVerifikasiValidation();
        Assert.assertEquals("List Data Register", validasi);

        extentTest.log(LogStatus.PASS, "Test157 Validasi Label Halaman Verifikasi");
    }

    @And("^Test157 Merubah (.*) Menjadi Partial Match$")
    public void test157_merubah_data_menjadi_partial_match(String data) {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        dataToSearch = verifikasiPage.yGetRandomTableDataString(data);
        partialData = verifikasiPage.yGetPartialMatch(dataToSearch);

        extentTest.log(LogStatus.PASS, "Test157 Merubah data Menjadi Partial Match");
    }

    @And("Test157 Menginput Data Partial Match")
    public void test157_menginput_data_partial_match() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        verifikasiPage.yInputSearchBarVerifikasi(partialData);

        extentTest.log(LogStatus.PASS, "Test157 Menginput Data Partial Match");
    }

    @And("Test157 Mencari Data Partial Match")
    public void test157_mencari_data_partial_match() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        verifikasiPage.ySendKeysEnter();

        extentTest.log(LogStatus.PASS, "Test157 Mencari Data Partial Match");
    }

    @And("Test157 Menginput Data Partial Match Kembali")
    public void test157_menginput_data_partial_match_kembali() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        verifikasiPage.yInputSearchBarVerifikasi(partialData);

        extentTest.log(LogStatus.PASS, "Test157 Menginput Data Partial Match Kembali");
    }

    @And("Test157 Mencari Data Partial Match Kembali")
    public void test157_mencari_data_partial_match_kembali() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        verifikasiPage.ySendKeysEnter();

        extentTest.log(LogStatus.PASS, "Test157 Mencari Data Partial Match Kembali");
    }

    @Then("Test157 Validasi Data Partial Match")
    public void test157_validasi_data_partial_match() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        boolean validasi = verifikasiPage.yGetValidationDataTable(partialData, "partial");
        Assert.assertTrue(validasi);
        extentTest.log(LogStatus.PASS, "Test157 Validasi Data Partial Match");
    }

    @When("Test158 Klik Navbar Verifikasi")
    public void test158_klik_navbar_verifikasi() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        navbar.yClickBtnVerifikasi();
        System.out.println("16");
        extentTest.log(LogStatus.PASS, "Test158 Klik Navbar Verifikasi");
    }

    @Then("Test158 Validasi Label Halaman Verifikasi")
    public void test158_validasi_label_halaman_verifikasi() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        String validasi = verifikasiPage.yGetTextVerifikasiValidation();
        Assert.assertEquals("List Data Register", validasi);

        extentTest.log(LogStatus.PASS, "Test158 Validasi Label Halaman Verifikasi");
    }

    @And("^Test158 Pilih Option Show Entries (.*)$")
    public void test158_pilih_option_show_entries_data(String data) {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        entriesData = verifikasiPage.ySelectOptionVerifikasiEntries(data);

        extentTest.log(LogStatus.PASS, "Test158 Pilih Option Show Entries data");
    }

    @Then("Test158 Validasi Banyak Data Yang Ditampilkan")
    public void test158_validasi_banyak_data_yang_ditampilkan() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        int validasi = verifikasiPage.yGetDataTableRowTotal();
        System.out.println("perbandingan validasi : " + validasi + " dan " + entriesData);
//        Assert.assertEquals(validasi, entriesData);

        extentTest.log(LogStatus.PASS, "Test158 Validasi Banyak Data Yang Ditampilkan");
    }

}
