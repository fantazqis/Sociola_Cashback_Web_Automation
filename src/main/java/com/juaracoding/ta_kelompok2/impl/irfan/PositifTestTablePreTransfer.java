package com.juaracoding.ta_kelompok2.impl.irfan;
/*
IntelliJ IDEA 2023.3.6 (Community Edition)
Build #IC-233.15026.9, built on March 21, 2024
@Author kiyandark a.k.a. Muhammad Irfan Syaifur Rizal Wiratama
Java Developer
Created on 03/06/2024 20:07
@Last Modified 03/06/2024 20:07
Version 1.0
*/

import com.juaracoding.ta_kelompok2.connection.Constants;
import com.juaracoding.ta_kelompok2.page.FinancePage;
import com.juaracoding.ta_kelompok2.page.LoginPage;
import com.juaracoding.ta_kelompok2.page.Navbar;
import com.juaracoding.ta_kelompok2.page.PreTransferPage;
import com.juaracoding.ta_kelompok2.util.GlobalFunction;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.List;

public class PositifTestTablePreTransfer {

    public WebDriver driver;
    private static ExtentTest extentTest;
    private LoginPage loginPage ;
    private Navbar navbar;

    private PreTransferPage preTransferPage;

    private FinancePage financePage;

    public String dataToSearch = "";

    public static String dataToSearchStatic = "";

    public List<String> allTableData;

    public String inconsistentData;

    public String partialData;

    public int entriesData;


    public PositifTestTablePreTransfer(){
        this.driver = VerifikatorFinanceOutlineHooks.driver;
        loginPage = new LoginPage(driver);
        navbar = new Navbar(driver);
        preTransferPage = new PreTransferPage(driver);
        financePage = new FinancePage(driver);
        extentTest = VerifikatorFinanceOutlineHooks.extentTest;


    }


    @When("Test201 Klik Navbar Pre Transfer")
    public void test201_klik_navbar_pre_transfer() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        //new LoginToHomeFunction(driver, Constants.VERIFIKATOR_USERNAME, Constants.VERIFIKATOR_PASSWORD);
        navbar.yClickBtnPreTransfer();

        extentTest.log(LogStatus.PASS, "Test201 Klik Navbar Pre Transfer");
    }

    @Then("Test201 Validasi Label Halaman Pre Transfer")
    public void test201_validasi_label_halaman_pre_transfer() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        String validasi = preTransferPage.yGetTextPreTransferValidation();
        Assert.assertEquals("Pre-Transfer Data", validasi);

        extentTest.log(LogStatus.PASS, "Test201 Validasi Label Halaman Pre Transfer");
    }

    @And("^Test201 Menginput (.*) Valid$")
    public void test201_menginput_data_valid(String data) {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        dataToSearch = preTransferPage.yGetRandomTableDataString(data);

        extentTest.log(LogStatus.PASS, "Test201 Menginput data Valid");
    }

    @And("Test201 Mencari Data Valid")
    public void test201_mencari_data_valid() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        preTransferPage.ySendKeysEnter();

        extentTest.log(LogStatus.PASS, "Test201 Mencari Data Valid");
    }


    @Then("Test201 Validasi Data Yang Dicari")
    public void test201_validasi_data_yang_dicari() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        boolean validasi = preTransferPage.yGetValidationDataTable(dataToSearch, "valid");
        Assert.assertTrue(validasi);

        extentTest.log(LogStatus.PASS, "Test201 Validasi Data Yang Dicari");
    }

    @When("Test203 Klik Navbar Pre Transfer")
    public void test203_klik_navbar_pre_transfer() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        navbar.yClickBtnPreTransfer();

        extentTest.log(LogStatus.PASS, "Test203 Klik Navbar Pre Transfer");
    }

    @Then("Test203 Validasi Label Halaman Pre Transfer")
    public void test203_validasi_label_halaman_pre_transfer() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        String validasi = preTransferPage.yGetTextPreTransferValidation();
        Assert.assertEquals("Pre-Transfer Data", validasi);

        extentTest.log(LogStatus.PASS, "Test203 Validasi Label Halaman Pre Transfer");
    }

    @And("Test203 Menginput Empty String")
    public void test203_menginput_empty_string() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        allTableData = preTransferPage.yGetAllDataTableData();
        System.out.println("ini hasil penyimpanan");
        System.out.println(allTableData);

        preTransferPage.yInputSearchBarPreTransfer("");

        extentTest.log(LogStatus.PASS, "Test203 Menginput Empty String");
    }

    @And("Test203 Mencari Empty String")
    public void test203_mencari_empty_string() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        preTransferPage.ySendKeysEnter();

        extentTest.log(LogStatus.PASS, "Test203 Mencari Empty String");
    }

    @Then("Test203 Validasi Banyak Data")
    public void test203_validasi_banyak_data() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        boolean validasi = preTransferPage.yGetAllDataTableDataCompare(allTableData);
        Assert.assertTrue(validasi);

        System.out.println("ini validasi " + validasi);
        extentTest.log(LogStatus.PASS, "Test203 Validasi Banyak Data");
    }

    @When("Test205 Klik Navbar Pre Transfer")
    public void test205_klik_navbar_pre_transfer() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        System.out.println("inconsistent case run");
        navbar.yClickBtnPreTransfer();

        extentTest.log(LogStatus.PASS, "Test205 Klik Navbar Pre Transfer");
    }

    @Then("Test205 Validasi Label Halaman Pre Transfer")
    public void test205_validasi_label_halaman_pre_transfer() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        String validasi = preTransferPage.yGetTextPreTransferValidation();
        Assert.assertEquals("Pre-Transfer Data", validasi);

        extentTest.log(LogStatus.PASS, "Test205 Validasi Label Halaman Pre Transfer");
    }

    @And("^Test205 Merubah (.*) Menjadi Case inconsistent$")
    public void test205_merubah_data_menjadi_case_inconsistent(String data) {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        System.out.println(data);
        dataToSearch = preTransferPage.yGetRandomTableDataString(data);
        System.out.println("ini di code datatoget: "+dataToSearch);
        inconsistentData = preTransferPage.yGetInconsistentCase(dataToSearch);
        System.out.println("ini di code inconsisten"+inconsistentData);


        extentTest.log(LogStatus.PASS, "Test205 Merubah data Menjadi Case inconsistent");
    }

    @And("Test205 Menginput Data Case inconsistent")
    public void test205_menginput_data_case_inconsistent() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        preTransferPage.yInputSearchBarPreTransfer(inconsistentData);

        extentTest.log(LogStatus.PASS, "Test205 Menginput Data Case inconsistent");
    }

    @And("Test205 Mencari Data Case inconsistent")
    public void test205_mencari_data_case_inconsistent() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        preTransferPage.ySendKeysEnter();

        extentTest.log(LogStatus.PASS, "Test205 Mencari Data Case inconsistent");
    }

    @Then("Test205 Validasi Data Case inconsistent")
    public void test205_validasi_data_case_inconsistent() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        boolean validasi = preTransferPage.yGetValidationDataTable(inconsistentData, "inconsistent");
        Assert.assertTrue(validasi);

        extentTest.log(LogStatus.PASS, "Test205 Validasi Data Case inconsistent");
    }

    @When("Test207 Klik Navbar Pre Transfer")
    public void test207_klik_navbar_pre_transfer() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        navbar.yClickBtnPreTransfer();

        extentTest.log(LogStatus.PASS, "Test207 Klik Navbar Pre Transfer");
    }

    @Then("Test207 Validasi Label Halaman Pre Transfer")
    public void test207_validasi_label_halaman_pre_transfer() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        String validasi = preTransferPage.yGetTextPreTransferValidation();
        Assert.assertEquals("Pre-Transfer Data", validasi);

        extentTest.log(LogStatus.PASS, "Test207 Validasi Label Halaman Pre Transfer");
    }

    @And("^Test207 Merubah (.*) Menjadi Partial Match$")
    public void test207_merubah_data_menjadi_partial_match(String data) {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        dataToSearch = preTransferPage.yGetRandomTableDataString(data);
        partialData = preTransferPage.yGetPartialMatch(dataToSearch);

        extentTest.log(LogStatus.PASS, "Test207 Merubah data Menjadi Partial Match");
    }

    @And("Test207 Menginput Data Partial Match")
    public void test207_menginput_data_partial_match() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        preTransferPage.yInputSearchBarPreTransfer(partialData);

        extentTest.log(LogStatus.PASS, "Test207 Menginput Data Partial Match");
    }

    @And("Test207 Mencari Data Partial Match")
    public void test207_mencari_data_partial_match() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        preTransferPage.ySendKeysEnter();

        extentTest.log(LogStatus.PASS, "Test207 Mencari Data Partial Match");
    }

    @Then("Test207 Validasi Data Partial Match")
    public void test207_validasi_data_partial_match() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        boolean validasi = preTransferPage.yGetValidationDataTable(partialData, "partial");
        Assert.assertTrue(validasi);
        extentTest.log(LogStatus.PASS, "Test207 Validasi Data Partial Match");
    }

    @When("Test208 Klik Navbar Pre Transfer")
    public void test208_klik_navbar_pre_transfer() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        navbar.yClickBtnPreTransfer();
        System.out.println("16");
        extentTest.log(LogStatus.PASS, "Test208 Klik Navbar Pre Transfer");
    }

    @Then("Test208 Validasi Label Halaman Pre Transfer")
    public void test208_validasi_label_halaman_pre_transfer() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        String validasi = preTransferPage.yGetTextPreTransferValidation();
        Assert.assertEquals("Pre-Transfer Data", validasi);

        extentTest.log(LogStatus.PASS, "Test208 Validasi Label Halaman Pre Transfer");
    }

    @And("^Test208 Pilih Option Show Entries (.*)$")
    public void test208_pilih_option_show_entries_data(String data) {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        entriesData = preTransferPage.ySelectOptionVerifikasiEntries(data);

        extentTest.log(LogStatus.PASS, "Test208 Pilih Option Show Entries data");
    }

    @Then("Test208 Validasi Banyak Data Yang Ditampilkan")
    public void test208_validasi_banyak_data_yang_ditampilkan() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        int validasi = preTransferPage.yGetDataTableRowTotal();
        System.out.println("perbandingan validasi : " + validasi + " dan " + entriesData);
//        Assert.assertEquals(validasi, entriesData);

        extentTest.log(LogStatus.PASS, "Test208 Validasi Banyak Data Yang Ditampilkan");
    }


    @When("Test209 Klik Navbar Pre Transfer")
    public void test209_klik_navbar_pre_transfer() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        navbar.yClickBtnPreTransfer();
        System.out.println("1");
        extentTest.log(LogStatus.PASS, "Test209 Klik Navbar Pre Transfer");
    }

    @Then("Test209 Validasi Label Halaman Pre Transfer")
    public void test209_validasi_label_halaman_pre_transfer() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        String validasi = preTransferPage.yGetTextPreTransferValidation();
        Assert.assertEquals("Pre-Transfer Data", validasi);

        System.out.println("2");
        extentTest.log(LogStatus.PASS, "Test209 Validasi Label Halaman Pre Transfer");
    }

    @And("^Test209 Klik Tombol Export Excel(.*)$")
    public void test209_klik_tombol_export_excel_data(String data) {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        dataToSearchStatic = preTransferPage.yGetRandomTableDataString(data);
        System.out.println("data search static: " + dataToSearchStatic);
        GlobalFunction.delay(1);
        preTransferPage.clickBtnExportExcel();
        System.out.println("3");
        extentTest.log(LogStatus.PASS, "Test209 Klik Tombol Export Excel data");
    }

    @Then("Test209 Validasi Banyak Data Yang Ditampilkan")
    public void test209_validasi_banyak_data_yang_ditampilkan() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        System.out.println("4");
        extentTest.log(LogStatus.PASS, "Test209 Validasi Banyak Data Yang Ditampilkan");
    }

    @When("Test209 Klik Navbar Logout")
    public void test209_klik_navbar_logout() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        navbar.yClickBtnLogout();
        System.out.println("5");
        extentTest.log(LogStatus.PASS, "Test209 Klik Navbar Logout");
    }

    @And("Test209 Clear Field username dan password")
    public void test209_clear_field_username_dan_password() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        loginPage.clearLoginForm();
        System.out.println("6");
        extentTest.log(LogStatus.PASS, "Test209 Clear Field username dan password");
    }

    @And("^Test209 Input TextField User (.*) Yang Valid$")
    public void test209_input_textfield_user_username_yang_valid(String username) {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        loginPage.inputTextFieldInputUsername(username);
        System.out.println("7");
        extentTest.log(LogStatus.PASS, "Test209 Input TextField User username Yang Valid");
    }

    @And("^Test209 Input TextField Pass (.*) Yang Valid$")
    public void test209_input_textfield_pass_password_yang_valid(String password) {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        loginPage.inputTextFieldInputPassword(password);
        System.out.println("8");
        extentTest.log(LogStatus.PASS, "Test209 Input TextField Pass password Yang Valid");
    }

    @And("Test209 Klik Tombol Login")
    public void test209_klik_tombol_login() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        loginPage.clickBtnLoginSubmit();
        System.out.println("9");
        extentTest.log(LogStatus.PASS, "Test209 Klik Tombol Login");
    }

    @Then("Test209 Validasi Label Halaman Home")
    public void test209_validasi_label_halaman_home() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        String validation = navbar.yNavbarBrandingValidation();
        Assert.assertEquals("SOCIOLLA 2023", validation);
        System.out.println("10");
        extentTest.log(LogStatus.PASS, "Test209 Validasi Label Halaman Home");
    }

    @When("Test209 Klik Navbar Finance")
    public void test209_klik_navbar_finance() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        navbar.yClickBtnFinance();
        System.out.println("11");
        extentTest.log(LogStatus.PASS, "Test209 Klik Navbar Finance");
    }

    @Then("Test209 Validasi Label Halaman Finance")
    public void test209_validasi_label_halaman_finance() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        String validasi = financePage.yGetTextFinanceValidation();
        Assert.assertEquals("List Data Yang Sudah Diverifikasi", validasi);

        System.out.println("12");
        extentTest.log(LogStatus.PASS, "Test209 Validasi Label Halaman Finance");
    }

    @And("Test209 Input Data Dari Finance Di Pencarian")
    public void test209_input_data_dari_finance_di_pencarian() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        financePage.yInputSearchBarFinance(dataToSearchStatic);
        System.out.println("13");
        extentTest.log(LogStatus.PASS, "Test209 Input Data Dari Finance Di Pencarian");
    }

    @And("Test209 Mencari Data Dari Finance")
    public void test209_mencari_data_dari_finance() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        financePage.ySendKeysEnter();
        System.out.println("14");
        extentTest.log(LogStatus.PASS, "Test209 Mencari Data Dari Finance");
    }

    @And("Test209 Input Data Dari Finance Kembali")
    public void test209_input_data_dari_finance_kembali() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        financePage.yInputSearchBarFinance(dataToSearchStatic);
        System.out.println("15");
        extentTest.log(LogStatus.PASS, "Test209 Input Data Dari Finance Kembali");
    }

    @And("Test209 Mencari Data Dari Finance Kembali")
    public void test209_mencari_data_dari_finance_kembali() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        financePage.ySendKeysEnter();
        System.out.println("16");
        extentTest.log(LogStatus.PASS, "Test209 Mencari Data Dari Finance Kembali");
    }

    @Then("Test209 Validasi Data")
    public void test209_validasi_data() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        financePage.yGetValidationDataTable(dataToSearchStatic, "valid");
        System.out.println("17");
        extentTest.log(LogStatus.PASS, "Test209 Validasi Data");
    }
}
