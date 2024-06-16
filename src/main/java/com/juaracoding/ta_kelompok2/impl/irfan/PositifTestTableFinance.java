package com.juaracoding.ta_kelompok2.impl.irfan;
/*
IntelliJ IDEA 2023.3.6 (Community Edition)
Build #IC-233.15026.9, built on March 21, 2024
@Author kiyandark a.k.a. Muhammad Irfan Syaifur Rizal Wiratama
Java Developer
Created on 01/06/2024 23:03
@Last Modified 01/06/2024 23:03
Version 1.0
*/

import com.juaracoding.ta_kelompok2.connection.Constants;
import com.juaracoding.ta_kelompok2.connection.DriverSingleton;
import com.juaracoding.ta_kelompok2.page.*;
import com.juaracoding.ta_kelompok2.util.GlobalFunction;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class PositifTestTableFinance {
    public WebDriver driver;
    private static ExtentTest extentTest;
    private LoginPage loginPage ;
    private Navbar navbar;

    private FinancePage financePage;
    private VerifikasiPage verifikasiPage;
    private UploadBuktiTransferPage uploadBuktiTransferPage;

    public String dataToSearch = "";

    public static String dataPertama;
    public static String dataKedua;

    public List<String> allTableData;

    public String inconsistentData;

    public String partialData;

    public int entriesData;


    public PositifTestTableFinance(){
        this.driver = VerifikatorFinanceOutlineHooks.driver;
        loginPage = new LoginPage(driver);
        navbar = new Navbar(driver);
        financePage = new FinancePage(driver);
        verifikasiPage = new VerifikasiPage(driver);
        uploadBuktiTransferPage = new UploadBuktiTransferPage(driver);
        extentTest = VerifikatorFinanceOutlineHooks.extentTest;

    }


    @When("Test211 Klik Navbar Finance")
    public void test211_klik_navbar_finance() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        //new LoginToHomeFunction(driver, Constants.FINANCE_USERNAME, Constants.FINANCE_PASSWORD);
        navbar.yClickBtnFinance();

        extentTest.log(LogStatus.PASS, "Test211 Klik Navbar Finance");
    }

    @Then("Test211 Validasi Label Halaman Finance")
    public void test211_validasi_label_halaman_finance() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        String validasi = financePage.yGetTextFinanceValidation();
        Assert.assertEquals("List Data Yang Sudah Diverifikasi", validasi);

        extentTest.log(LogStatus.PASS, "Test211 Validasi Label Halaman Finance");
    }

    @And("^Test211 Menginput (.*) Valid$")
    public void test211_menginput_data_valid(String data) {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        dataToSearch = financePage.yGetRandomTableDataString(data);
        financePage.yInputSearchBarFinance(dataToSearch);

        extentTest.log(LogStatus.PASS, "Test211 Menginput data Valid");
    }

    @And("Test211 Mencari Data Valid")
    public void test211_mencari_data_valid() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        financePage.ySendKeysEnter();

        extentTest.log(LogStatus.PASS, "Test211 Mencari Data Valid");
    }

    @And("Test211 Menginput Data Valid Kembali")
    public void test211_menginput_data_valid_kembali() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        financePage.yInputSearchBarFinance(dataToSearch);

        extentTest.log(LogStatus.PASS, "Test211 Menginput Data Valid Kembali");
    }

    @And("Test211 Mencari Data Valid Kembali")
    public void test211_mencari_data_valid_kembali() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        financePage.ySendKeysEnter();

        extentTest.log(LogStatus.PASS, "Test211 Mencari Data Valid Kembali");
    }

    @Then("Test211 Validasi Data Yang Dicari")
    public void test211_validasi_data_yang_dicari() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        boolean validasi = financePage.yGetValidationDataTable(dataToSearch, "valid");
        Assert.assertTrue(validasi);

        extentTest.log(LogStatus.PASS, "Test211 Validasi Data Yang Dicari");
    }

    @When("Test213 Klik Navbar Finance")
    public void test213_klik_navbar_finance() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        navbar.yClickBtnFinance();

        extentTest.log(LogStatus.PASS, "Test213 Klik Navbar Finance");
    }

    @Then("Test213 Validasi Label Halaman Finance")
    public void test213_validasi_label_halaman_finance() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        String validasi = financePage.yGetTextFinanceValidation();
        Assert.assertEquals("List Data Yang Sudah Diverifikasi", validasi);

        extentTest.log(LogStatus.PASS, "Test213 Validasi Label Halaman Finance");
    }

    @And("Test213 Menginput Empty String")
    public void test213_menginput_empty_string() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        allTableData = financePage.yGetAllDataTableData();
//        System.out.println("ini hasil penyimpanan");
//        System.out.println(allTableData);

        financePage.yInputSearchBarFinance("");

        extentTest.log(LogStatus.PASS, "Test213 Menginput Empty String");
    }

    @And("Test213 Mencari Empty String")
    public void test213_mencari_empty_string() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        financePage.ySendKeysEnter();

        extentTest.log(LogStatus.PASS, "Test213 Mencari Empty String");
    }

    @And("Test213 Menginput Empty String Kembali")
    public void test213_menginput_empty_string_kembali() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        financePage.yInputSearchBarFinance("");

        extentTest.log(LogStatus.PASS, "Test213 Menginput Empty String Kembali");
    }

    @And("Test213 Mencari Empty String Kembali")
    public void test213_mencari_empty_string_kembali() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        financePage.ySendKeysEnter();

        extentTest.log(LogStatus.PASS, "Test213 Mencari Empty String Kembali");
    }

    @Then("Test213 Validasi Banyak Data")
    public void test213_validasi_banyak_data() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        boolean validasi = financePage.yGetAllDataTableDataCompare(allTableData);
        Assert.assertTrue(validasi);

        System.out.println("ini validasi " + validasi);
        extentTest.log(LogStatus.PASS, "Test213 Validasi Banyak Data");
    }

    @When("Test215 Klik Navbar Finance")
    public void test215_klik_navbar_finance() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        System.out.println("inconsistent case run");
        navbar.yClickBtnFinance();

        extentTest.log(LogStatus.PASS, "Test215 Klik Navbar Finance");
    }

    @Then("Test215 Validasi Label Halaman Finance")
    public void test215_validasi_label_halaman_finance() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        String validasi = financePage.yGetTextFinanceValidation();
        Assert.assertEquals("List Data Yang Sudah Diverifikasi", validasi);

        extentTest.log(LogStatus.PASS, "Test215 Validasi Label Halaman Finance");
    }

    @And("^Test215 Merubah (.*) Menjadi Case inconsistent$")
    public void test215_merubah_data_menjadi_case_inconsistent(String data) {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        System.out.println(data);
        dataToSearch = financePage.yGetRandomTableDataString(data);
        System.out.println("ini di code datatoget: "+dataToSearch);
        inconsistentData = financePage.yGetInconsistentCase(dataToSearch);
        System.out.println("ini di code inconsisten"+inconsistentData);


        extentTest.log(LogStatus.PASS, "Test215 Merubah data Menjadi Case inconsistent");
    }

    @And("Test215 Menginput Data Case inconsistent")
    public void test215_menginput_data_case_inconsistent() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        financePage.yInputSearchBarFinance(inconsistentData);

        extentTest.log(LogStatus.PASS, "Test215 Menginput Data Case inconsistent");
    }

    @And("Test215 Mencari Data Case inconsistent")
    public void test215_mencari_data_case_inconsistent() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        financePage.ySendKeysEnter();

        extentTest.log(LogStatus.PASS, "Test215 Mencari Data Case inconsistent");
    }

    @And("Test215 Menginput Data Case inconsistent Kembali")
    public void test215_menginput_data_case_inconsistent_kembali() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        financePage.yInputSearchBarFinance(inconsistentData);

        extentTest.log(LogStatus.PASS, "Test215 Menginput Data Case inconsistent Kembali");
    }

    @And("Test215 Mencari Data Case inconsistent Kembali")
    public void test215_mencari_data_case_inconsistent_kembali() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        financePage.ySendKeysEnter();

        extentTest.log(LogStatus.PASS, "Test215 Mencari Data Case inconsistent Kembali");
    }

    @Then("Test215 Validasi Data Case inconsistent")
    public void test215_validasi_data_case_inconsistent() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        boolean validasi = financePage.yGetValidationDataTable(inconsistentData, "inconsistent");
        Assert.assertTrue(validasi);

        extentTest.log(LogStatus.PASS, "Test215 Validasi Data Case inconsistent");
    }

    @When("Test217 Klik Navbar Finance")
    public void test217_klik_navbar_finance() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        navbar.yClickBtnFinance();

        extentTest.log(LogStatus.PASS, "Test217 Klik Navbar Finance");
    }

    @Then("Test217 Validasi Label Halaman Finance")
    public void test217_validasi_label_halaman_finance() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        String validasi = financePage.yGetTextFinanceValidation();
        Assert.assertEquals("List Data Yang Sudah Diverifikasi", validasi);

        extentTest.log(LogStatus.PASS, "Test217 Validasi Label Halaman Finance");
    }

    @And("^Test217 Merubah (.*) Menjadi Partial Match$")
    public void test217_merubah_data_menjadi_partial_match(String data) {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        dataToSearch = financePage.yGetRandomTableDataString(data);
        partialData = financePage.yGetPartialMatch(dataToSearch);

        extentTest.log(LogStatus.PASS, "Test217 Merubah data Menjadi Partial Match");
    }

    @And("Test217 Menginput Data Partial Match")
    public void test217_menginput_data_partial_match() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        financePage.yInputSearchBarFinance(partialData);

        extentTest.log(LogStatus.PASS, "Test217 Menginput Data Partial Match");
    }

    @And("Test217 Mencari Data Partial Match")
    public void test217_mencari_data_partial_match() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        financePage.ySendKeysEnter();

        extentTest.log(LogStatus.PASS, "Test217 Mencari Data Partial Match");
    }

    @And("Test217 Menginput Data Partial Match Kembali")
    public void test217_menginput_data_partial_match_kembali() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        financePage.yInputSearchBarFinance(partialData);

        extentTest.log(LogStatus.PASS, "Test217 Menginput Data Partial Match Kembali");
    }

    @And("Test217 Mencari Data Partial Match Kembali")
    public void test217_mencari_data_partial_match_kembali() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        financePage.ySendKeysEnter();

        extentTest.log(LogStatus.PASS, "Test217 Mencari Data Partial Match Kembali");
    }

    @Then("Test217 Validasi Data Partial Match")
    public void test217_validasi_data_partial_match() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        boolean validasi = financePage.yGetValidationDataTable(partialData, "partial");
        Assert.assertTrue(validasi);
        extentTest.log(LogStatus.PASS, "Test217 Validasi Data Partial Match");
    }

    @When("Test218 Klik Navbar Finance")
    public void test218_klik_navbar_finance() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        navbar.yClickBtnFinance();
        System.out.println("16");
        extentTest.log(LogStatus.PASS, "Test218 Klik Navbar Finance");
    }

    @Then("Test218 Validasi Label Halaman Finance")
    public void test218_validasi_label_halaman_finance() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        String validasi = financePage.yGetTextFinanceValidation();
        Assert.assertEquals("List Data Yang Sudah Diverifikasi", validasi);

        extentTest.log(LogStatus.PASS, "Test218 Validasi Label Halaman Finance");
    }

    @And("^Test218 Pilih Option Show Entries (.*)$")
    public void test218_pilih_option_show_entries_data(String data) {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        entriesData = financePage.ySelectOptionVerifikasiEntries(data);

        extentTest.log(LogStatus.PASS, "Test218 Pilih Option Show Entries data");
    }

    @Then("Test218 Validasi Banyak Data Yang Ditampilkan")
    public void test218_validasi_banyak_data_yang_ditampilkan() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        int validasi = financePage.yGetDataTableRowTotal();
        System.out.println("perbandingan validasi : " + validasi + " dan " + entriesData);
//        Assert.assertEquals(validasi, entriesData);

        extentTest.log(LogStatus.PASS, "Test218 Validasi Banyak Data Yang Ditampilkan");
    }

    @When("Test219 Klik Navbar Finance")
    public void test219_klik_navbar_finance() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        navbar.yClickBtnFinance();
        System.out.println("1");
        extentTest.log(LogStatus.PASS, "Test219 Klik Navbar Finance");
    }

    @Then("Test219 Validasi Label Halaman Finance")
    public void test219_validasi_label_halaman_finance() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        String validasi = financePage.yGetTextFinanceValidation();
        Assert.assertEquals("List Data Yang Sudah Diverifikasi", validasi);

        System.out.println("2");
        extentTest.log(LogStatus.PASS, "Test219 Validasi Label Halaman Finance");
    }

    @And("^Test219 Menginput (.*) Valid Pertama$")
    public void test219_menginput_datasatu_valid_pertama(String datasatu) {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        dataPertama = financePage.yGetRandomTableDataString(datasatu);
        financePage.yInputSearchBarFinance(dataPertama);

        System.out.println("3");
        extentTest.log(LogStatus.PASS, "Test219 Menginput datasatu Valid Pertama");
    }

    @And("Test219 Mencari Data Valid Pertama")
    public void test219_mencari_data_valid_pertama() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        financePage.ySendKeysEnter();

        System.out.println("4");
        extentTest.log(LogStatus.PASS, "Test219 Mencari Data Valid Pertama");
    }

    @And("Test219 Menginput Data Valid Pertama Kembali")
    public void test219_menginput_data_valid_pertama_kembali() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        financePage.yInputSearchBarFinance(dataPertama);

        System.out.println("5");
        extentTest.log(LogStatus.PASS, "Test219 Menginput Data Valid Pertama Kembali");
    }

    @And("Test219 Mencari Data Valid Pertama Kembali")
    public void test219_mencari_data_valid_pertama_kembali() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        financePage.ySendKeysEnter();

        System.out.println("6");
        extentTest.log(LogStatus.PASS, "Test219 Mencari Data Valid Pertama Kembali");
    }

    @Then("Test219 Validasi Data Pertama")
    public void test219_validasi_data_pertama() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        financePage.yGetValidationDataTable(dataPertama, "valid");
        System.out.println("7");
        extentTest.log(LogStatus.PASS, "Test219 Validasi Data Pertama");
    }

    @And("Test219 Klik Checkbox Data Pertama")
    public void test219_klik_checkbox_data_pertama() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        financePage.yClickCheckboxFinance();
        GlobalFunction.delay(1);

        System.out.println("8");
        extentTest.log(LogStatus.PASS, "Test219 Klik Checkbox Data Pertama");
    }

    @And("Test219 Klik Kembalikan Ke Verifikator")
    public void test219_klik_kembalikan_ke_verifikator() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        GlobalFunction.delay(1);
        financePage.yClickKembalikanKeVerifikator();
        GlobalFunction.delay(1);

        System.out.println("9");
        extentTest.log(LogStatus.PASS, "Test219 Klik Kembalikan Ke Verifikator");
    }

    @And("Test219 Klik Tombol Modal Data Pertama")
    public void test219_klik_tombol_modal_data_pertama() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        financePage.yClickModalKembalikanKeVerif();

        System.out.println("10");
        extentTest.log(LogStatus.PASS, "Test219 Klik Tombol Modal Data Pertama");
    }

    @When("Test219 Klik Navbar Finance Kedua")
    public void test219_klik_navbar_finance_kedua() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        navbar.yClickBtnFinance();

        System.out.println("11");
        extentTest.log(LogStatus.PASS, "Test219 Klik Navbar Finance Kedua");
    }

    @Then("Test219 Validasi Label Halaman Finance Kedua")
    public void test219_validasi_label_halaman_finance_kedua() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        String validasi = financePage.yGetTextFinanceValidation();
        Assert.assertEquals("List Data Yang Sudah Diverifikasi", validasi);

        System.out.println("12");
        extentTest.log(LogStatus.PASS, "Test219 Validasi Label Halaman Finance Kedua");
    }

    @And("^Test219 Menginput (.*) Valid Kedua$")
    public void test219_menginput_datadua_valid_kedua(String datadua) {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        dataKedua = financePage.yGetRandomTableDataString(datadua);
        financePage.yInputSearchBarFinance(dataKedua);

        System.out.println("13");
        extentTest.log(LogStatus.PASS, "Test219 Menginput datadua Valid Kedua");
    }

    @And("Test219 Mencari Data Valid Kedua")
    public void test219_mencari_data_valid_kedua() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        financePage.ySendKeysEnter();

        System.out.println("14");
        extentTest.log(LogStatus.PASS, "Test219 Mencari Data Valid Kedua");
    }

    @And("Test219 Menginput Data Valid Kedua Kembali")
    public void test219_menginput_data_valid_kedua_kembali() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        financePage.yInputSearchBarFinance(dataKedua);

        System.out.println("15");
        extentTest.log(LogStatus.PASS, "Test219 Menginput Data Valid Kedua Kembali");
    }

    @And("Test219 Mencari Data Valid Kedua Kembali")
    public void test219_mencari_data_valid_kedua_kembali() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        financePage.ySendKeysEnter();

        System.out.println("16");
        extentTest.log(LogStatus.PASS, "Test219 Mencari Data Valid Kedua Kembali");
    }

    @Then("Test219 Validasi Data Kedua")
    public void test219_validasi_data_kedua() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        financePage.yGetValidationDataTable(dataPertama, "valid");

        System.out.println("17");
        extentTest.log(LogStatus.PASS, "Test219 Validasi Data Kedua");
    }

    @And("Test219 Klik Checkbox Data Kedua")
    public void test219_klik_checkbox_data_kedua() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        financePage.yClickCheckboxFinance();

        System.out.println("18");
        extentTest.log(LogStatus.PASS, "Test219 Klik Checkbox Data Kedua");
    }

    @And("Test219 Klik Update Sudah Transfer")
    public void test219_klik_update_sudah_transfer() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        financePage.yClickUploadSudahTransfer();

        System.out.println("19");
        extentTest.log(LogStatus.PASS, "Test219 Klik Update Sudah Transfer");
    }

    @And("Test219 Klik Tombol Modal Data Kedua")
    public void test219_klik_tombol_modal_data_kedua() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        financePage.yClickModalUpdateSudahTransfer();

        System.out.println("data pertama: " + dataPertama);
        System.out.println("data kedua: " + dataKedua);

        System.out.println("20");
        extentTest.log(LogStatus.PASS, "Test219 Klik Tombol Modal Data Kedua");
    }

    @And("Test219 Klik Logout")
    public void test219_klik_logout() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        navbar.yClickBtnLogout();

        System.out.println("21");
        extentTest.log(LogStatus.PASS, "Test219 Klik Logout");
    }

    @When("Test221 Membuka Halaman Login")
    public void test221_membuka_halaman_login() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        GlobalFunction.delay(2);

        System.out.println("22");
        extentTest.log(LogStatus.PASS, "Test221 Membuka Halaman Login");
    }

    @And("Test221 Clear Field username dan password")
    public void test221_clear_field_username_dan_password() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        loginPage.clearLoginForm();

        System.out.println("23");
        extentTest.log(LogStatus.PASS, "Test221 Clear Field username dan password");
    }

    @And("^Test221 Input TextField User (.*) Yang Valid$")
    public void test221_input_textfield_user_username_yang_valid(String username) {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        loginPage.inputTextFieldInputUsername(username);
        System.out.println("24");
        extentTest.log(LogStatus.PASS, "Test221 Input TextField User username Yang Valid");
    }

    @And("^Test221 Input TextField Pass (.*) Yang Valid$")
    public void test221_input_textfield_pass_password_yang_valid(String password) {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        loginPage.inputTextFieldInputPassword(password);
        System.out.println("25");
        extentTest.log(LogStatus.PASS, "Test221 Input TextField Pass password Yang Valid");
    }

    @And("Test221 Klik Tombol Login")
    public void test221_klik_tombol_login() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        loginPage.clickBtnLoginSubmit();

        System.out.println("26");
        extentTest.log(LogStatus.PASS, "Test221 Klik Tombol Login");
    }

    @Then("Test221 Validasi Label Halaman Home")
    public void test221_validasi_label_halaman_home() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        String validation = navbar.yNavbarBrandingValidation();
        Assert.assertEquals("SOCIOLLA 2023", validation);

        System.out.println("27");
        extentTest.log(LogStatus.PASS, "Test221 Validasi Label Halaman Home");
    }

    @When("Test221 Klik Navbar Verifikasi")
    public void test221_klik_navbar_verifikasi() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        navbar.yClickBtnVerifikasi();

        System.out.println("30");
        extentTest.log(LogStatus.PASS, "Test221 Klik Navbar Verifikasi");
    }

    @Then("Test221 Validasi Label Halaman Verifikasi")
    public void test221_validasi_label_halaman_verifikasi() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        String validasi = verifikasiPage.yGetTextVerifikasiValidation();
        Assert.assertEquals("List Data Register", validasi);

        System.out.println("data pertama verif : " + dataPertama);
        System.out.println("data kedua verif: " + dataKedua);

        System.out.println("31");
        extentTest.log(LogStatus.PASS, "Test221 Validasi Label Halaman Verifikasi");
    }

    @And("Test221 Menginput Data Pertama Di Pencarian")
    public void test221_menginput_data_pertama_di_pencarian() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        GlobalFunction.delay(1);
        verifikasiPage.yInputSearchBarVerifikasi(dataPertama);
        GlobalFunction.delay(1);

        System.out.println("32");
        extentTest.log(LogStatus.PASS, "Test221 Menginput Data Pertama Di Pencarian");
    }

    @And("Test221 Mencari Data Pertama")
    public void test221_mencari_data_pertama() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        verifikasiPage.ySendKeysEnter();
        GlobalFunction.delay(1);

        System.out.println("33");
        extentTest.log(LogStatus.PASS, "Test221 Mencari Data Pertama");
    }

    @And("Test221 Menginput Data Pertama Kembali")
    public void test221_menginput_data_pertama_kembali() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        verifikasiPage.yInputSearchBarVerifikasi(dataPertama);
        GlobalFunction.delay(1);

        System.out.println("34");
        extentTest.log(LogStatus.PASS, "Test221 Menginput Data Pertama Kembali");
    }

    @And("Test221 Mencari Data Pertama Kembali")
    public void test221_mencari_data_pertama_kembali() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        verifikasiPage.ySendKeysEnter();
        GlobalFunction.delay(1);

        System.out.println("35");
        extentTest.log(LogStatus.PASS, "Test221 Mencari Data Pertama Kembali");
    }

    @Then("Test221 Validasi Data Pertama")
    public void test221_validasi_data_pertama() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        verifikasiPage.yGetValidationDataTable(dataPertama, "valid");
        System.out.println("36");
        extentTest.log(LogStatus.PASS, "Test221 Validasi Data Pertama");
    }

    @When("Test221 Klik Navbar Upload Bukti Transfer")
    public void test221_klik_navbar_upload_bukti_transfer() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        navbar.yClickBtnUploadBuktiTransfer();

        System.out.println("37");
        extentTest.log(LogStatus.PASS, "Test221 Klik Navbar Upload Bukti Transfer");
    }

    @Then("Test221 Validasi Label Halaman Upload Bukti Transfer")
    public void test221_validasi_label_halaman_upload_bukti_transfer() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        String validasi = uploadBuktiTransferPage.yGetTextUploadBuktiTransferValidation();
        Assert.assertEquals("List Data Yang Sudah Ditransfer", validasi);

        System.out.println("38");
        extentTest.log(LogStatus.PASS, "Test221 Validasi Label Halaman Upload Bukti Transfer");
    }

    @And("Test221 Menginput Data Kedua Di Pencarian")
    public void test221_menginput_data_kedua_di_pencarian() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        uploadBuktiTransferPage.yInputSearchBarUploadBuktiTransfer(dataKedua);

        System.out.println("39");
        extentTest.log(LogStatus.PASS, "Test221 Menginput Data Kedua Di Pencarian");
    }

    @And("Test221 Mencari Data Kedua")
    public void test221_mencari_data_kedua() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        uploadBuktiTransferPage.ySendKeysEnter();

        System.out.println("40");
        extentTest.log(LogStatus.PASS, "Test221 Mencari Data Kedua");
    }

    @And("Test221 Menginput Data Kedua Kembali")
    public void test221_menginput_data_kedua_kembali() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        uploadBuktiTransferPage.yInputSearchBarUploadBuktiTransfer(dataKedua);

        System.out.println("41");
        extentTest.log(LogStatus.PASS, "Test221 Menginput Data Kedua Kembali");
    }

    @And("Test221 Mencari Data Kedua Kembali")
    public void test221_mencari_data_kedua_kembali() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        uploadBuktiTransferPage.ySendKeysEnter();

        System.out.println("42");
        extentTest.log(LogStatus.PASS, "Test221 Mencari Data Kedua Kembali");
    }

    @Then("Test221 Validasi Data Kedua")
    public void test221_validasi_data_kedua() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        uploadBuktiTransferPage.yGetValidationDataTable(dataKedua, "valid");
        System.out.println("43");
        extentTest.log(LogStatus.PASS, "Test221 Validasi Data Kedua");
    }
}
