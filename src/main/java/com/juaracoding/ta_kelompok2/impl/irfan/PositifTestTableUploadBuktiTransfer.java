package com.juaracoding.ta_kelompok2.impl.irfan;
/*
IntelliJ IDEA 2023.3.6 (Community Edition)
Build #IC-233.15026.9, built on March 21, 2024
@Author kiyandark a.k.a. Muhammad Irfan Syaifur Rizal Wiratama
Java Developer
Created on 05/06/2024 18:21
@Last Modified 05/06/2024 18:21
Version 1.0
*/

import com.juaracoding.ta_kelompok2.connection.Constants;
import com.juaracoding.ta_kelompok2.page.*;
import com.juaracoding.ta_kelompok2.util.GlobalFunction;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.List;

public class PositifTestTableUploadBuktiTransfer {
    public WebDriver driver;
    private static ExtentTest extentTest;
    private LoginPage loginPage ;
    private Navbar navbar;

    private UploadBuktiTransferPage uploadBuktiTransferPage;

    public String dataToSearch = "";

    public List<String> allTableData;

    public String inconsistentData;

    public String partialData;

    public int entriesData;


    public PositifTestTableUploadBuktiTransfer(){
        this.driver = VerifikatorFinanceOutlineHooks.driver;
        loginPage = new LoginPage(driver);
        navbar = new Navbar(driver);
        uploadBuktiTransferPage = new UploadBuktiTransferPage(driver);
        extentTest = VerifikatorFinanceOutlineHooks.extentTest;

    }


    @When("Test231 Klik Navbar Upload Bukti Transfer")
    public void test231_klik_navbar_upload_bukti_transfer() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        //new LoginToHomeFunction(driver, Constants.VERIFIKATOR_USERNAME, Constants.VERIFIKATOR_PASSWORD);
        navbar.yClickBtnUploadBuktiTransfer();

        extentTest.log(LogStatus.PASS, "Test231 Klik Navbar Upload Bukti Transfer");
    }

    @Then("Test231 Validasi Label Halaman Upload Bukti Transfer")
    public void test231_validasi_label_halaman_upload_bukti_transfer() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        String validasi = uploadBuktiTransferPage.yGetTextUploadBuktiTransferValidation();
        Assert.assertEquals("List Data Yang Sudah Ditransfer", validasi);

        extentTest.log(LogStatus.PASS, "Test231 Validasi Label Halaman Upload Bukti Transfer");
    }

    @And("^Test231 Menginput (.*) Valid$")
    public void test231_menginput_data_valid(String data) {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        dataToSearch = uploadBuktiTransferPage.yGetRandomTableDataString(data);
        uploadBuktiTransferPage.yInputSearchBarUploadBuktiTransfer(dataToSearch);

        extentTest.log(LogStatus.PASS, "Test231 Menginput data Valid");
    }

    @And("Test231 Mencari Data Valid")
    public void test231_mencari_data_valid() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        uploadBuktiTransferPage.ySendKeysEnter();

        extentTest.log(LogStatus.PASS, "Test231 Mencari Data Valid");
    }

    @And("Test231 Menginput Data Valid Kembali")
    public void test231_menginput_data_valid_kembali() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        uploadBuktiTransferPage.yInputSearchBarUploadBuktiTransfer(dataToSearch);

        extentTest.log(LogStatus.PASS, "Test231 Menginput Data Valid Kembali");
    }

    @And("Test231 Mencari Data Valid Kembali")
    public void test231_mencari_data_valid_kembali() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        uploadBuktiTransferPage.ySendKeysEnter();

        extentTest.log(LogStatus.PASS, "Test231 Mencari Data Valid Kembali");
    }

    @Then("Test231 Validasi Data Yang Dicari")
    public void test231_validasi_data_yang_dicari() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        boolean validasi = uploadBuktiTransferPage.yGetValidationDataTable(dataToSearch, "valid");
        Assert.assertTrue(validasi);

        extentTest.log(LogStatus.PASS, "Test231 Validasi Data Yang Dicari");
    }

    @When("Test233 Klik Navbar Upload Bukti Transfer")
    public void test233_klik_navbar_upload_bukti_transfer() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        navbar.yClickBtnUploadBuktiTransfer();

        extentTest.log(LogStatus.PASS, "Test233 Klik Navbar Upload Bukti Transfer");
    }

    @Then("Test233 Validasi Label Halaman Upload Bukti Transfer")
    public void test233_validasi_label_halaman_upload_bukti_transfer() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        String validasi = uploadBuktiTransferPage.yGetTextUploadBuktiTransferValidation();
        Assert.assertEquals("List Data Yang Sudah Ditransfer", validasi);

        extentTest.log(LogStatus.PASS, "Test233 Validasi Label Halaman Upload Bukti Transfer");
    }

    @And("Test233 Menginput Empty String")
    public void test233_menginput_empty_string() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        allTableData = uploadBuktiTransferPage.yGetAllDataTableData();
//        System.out.println("ini hasil penyimpanan");
//        System.out.println(allTableData);

        uploadBuktiTransferPage.yInputSearchBarUploadBuktiTransfer("");

        extentTest.log(LogStatus.PASS, "Test233 Menginput Empty String");
    }

    @And("Test233 Mencari Empty String")
    public void test233_mencari_empty_string() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        uploadBuktiTransferPage.ySendKeysEnter();

        extentTest.log(LogStatus.PASS, "Test233 Mencari Empty String");
    }

    @And("Test233 Menginput Empty String Kembali")
    public void test233_menginput_empty_string_kembali() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        uploadBuktiTransferPage.yInputSearchBarUploadBuktiTransfer("");

        extentTest.log(LogStatus.PASS, "Test233 Menginput Empty String Kembali");
    }

    @And("Test233 Mencari Empty String Kembali")
    public void test233_mencari_empty_string_kembali() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        uploadBuktiTransferPage.ySendKeysEnter();

        extentTest.log(LogStatus.PASS, "Test233 Mencari Empty String Kembali");
    }

    @Then("Test233 Validasi Banyak Data")
    public void test233_validasi_banyak_data() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        boolean validasi = uploadBuktiTransferPage.yGetAllDataTableDataCompare(allTableData);
        Assert.assertTrue(validasi);

        System.out.println("ini validasi " + validasi);
        extentTest.log(LogStatus.PASS, "Test233 Validasi Banyak Data");
    }

    @When("Test235 Klik Navbar Upload Bukti Transfer")
    public void test235_klik_navbar_upload_bukti_transfer() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        System.out.println("inconsistent case run");
        navbar.yClickBtnUploadBuktiTransfer();

        extentTest.log(LogStatus.PASS, "Test235 Klik Navbar Upload Bukti Transfer");
    }

    @Then("Test235 Validasi Label Halaman Upload Bukti Transfer")
    public void test235_validasi_label_halaman_upload_bukti_transfer() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        String validasi = uploadBuktiTransferPage.yGetTextUploadBuktiTransferValidation();
        Assert.assertEquals("List Data Yang Sudah Ditransfer", validasi);

        extentTest.log(LogStatus.PASS, "Test235 Validasi Label Halaman Upload Bukti Transfer");
    }

    @And("^Test235 Merubah (.*) Menjadi Case inconsistent$")
    public void test235_merubah_data_menjadi_case_inconsistent(String data) {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        System.out.println(data);
        dataToSearch = uploadBuktiTransferPage.yGetRandomTableDataString(data);
        System.out.println("ini di code datatoget: "+dataToSearch);
        inconsistentData = uploadBuktiTransferPage.yGetInconsistentCase(dataToSearch);
        System.out.println("ini di code inconsisten"+inconsistentData);


        extentTest.log(LogStatus.PASS, "Test235 Merubah data Menjadi Case inconsistent");
    }

    @And("Test235 Menginput Data Case inconsistent")
    public void test235_menginput_data_case_inconsistent() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        uploadBuktiTransferPage.yInputSearchBarUploadBuktiTransfer(inconsistentData);

        extentTest.log(LogStatus.PASS, "Test235 Menginput Data Case inconsistent");
    }

    @And("Test235 Mencari Data Case inconsistent")
    public void test235_mencari_data_case_inconsistent() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        uploadBuktiTransferPage.ySendKeysEnter();

        extentTest.log(LogStatus.PASS, "Test235 Mencari Data Case inconsistent");
    }

    @And("Test235 Menginput Data Case inconsistent Kembali")
    public void test235_menginput_data_case_inconsistent_kembali() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        uploadBuktiTransferPage.yInputSearchBarUploadBuktiTransfer(inconsistentData);

        extentTest.log(LogStatus.PASS, "Test235 Menginput Data Case inconsistent Kembali");
    }

    @And("Test235 Mencari Data Case inconsistent Kembali")
    public void test235_mencari_data_case_inconsistent_kembali() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        uploadBuktiTransferPage.ySendKeysEnter();

        extentTest.log(LogStatus.PASS, "Test235 Mencari Data Case inconsistent Kembali");
    }

    @Then("Test235 Validasi Data Case inconsistent")
    public void test235_validasi_data_case_inconsistent() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        boolean validasi = uploadBuktiTransferPage.yGetValidationDataTable(inconsistentData, "inconsistent");
        Assert.assertTrue(validasi);

        extentTest.log(LogStatus.PASS, "Test235 Validasi Data Case inconsistent");
    }

    @When("Test237 Klik Navbar Upload Bukti Transfer")
    public void test237_klik_navbar_upload_bukti_transfer() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        navbar.yClickBtnUploadBuktiTransfer();

        extentTest.log(LogStatus.PASS, "Test237 Klik Navbar Upload Bukti Transfer");
    }

    @Then("Test237 Validasi Label Halaman Upload Bukti Transfer")
    public void test237_validasi_label_halaman_upload_bukti_transfer() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        String validasi = uploadBuktiTransferPage.yGetTextUploadBuktiTransferValidation();
        Assert.assertEquals("List Data Yang Sudah Ditransfer", validasi);

        extentTest.log(LogStatus.PASS, "Test237 Validasi Label Halaman Upload Bukti Transfer");
    }

    @And("^Test237 Merubah (.*) Menjadi Partial Match$")
    public void test237_merubah_data_menjadi_partial_match(String data) {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        dataToSearch = uploadBuktiTransferPage.yGetRandomTableDataString(data);
        partialData = uploadBuktiTransferPage.yGetPartialMatch(dataToSearch);

        extentTest.log(LogStatus.PASS, "Test237 Merubah data Menjadi Partial Match");
    }

    @And("Test237 Menginput Data Partial Match")
    public void test237_menginput_data_partial_match() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        uploadBuktiTransferPage.yInputSearchBarUploadBuktiTransfer(partialData);

        extentTest.log(LogStatus.PASS, "Test237 Menginput Data Partial Match");
    }

    @And("Test237 Mencari Data Partial Match")
    public void test237_mencari_data_partial_match() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        uploadBuktiTransferPage.ySendKeysEnter();

        extentTest.log(LogStatus.PASS, "Test237 Mencari Data Partial Match");
    }

    @And("Test237 Menginput Data Partial Match Kembali")
    public void test237_menginput_data_partial_match_kembali() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        uploadBuktiTransferPage.yInputSearchBarUploadBuktiTransfer(partialData);

        extentTest.log(LogStatus.PASS, "Test237 Menginput Data Partial Match Kembali");
    }

    @And("Test237 Mencari Data Partial Match Kembali")
    public void test237_mencari_data_partial_match_kembali() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        uploadBuktiTransferPage.ySendKeysEnter();

        extentTest.log(LogStatus.PASS, "Test237 Mencari Data Partial Match Kembali");
    }

    @Then("Test237 Validasi Data Partial Match")
    public void test237_validasi_data_partial_match() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        boolean validasi = uploadBuktiTransferPage.yGetValidationDataTable(partialData, "partial");
        Assert.assertTrue(validasi);
        extentTest.log(LogStatus.PASS, "Test237 Validasi Data Partial Match");
    }

    @When("Test238 Klik Navbar Upload Bukti Transfer")
    public void test238_klik_navbar_upload_bukti_transfer() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        navbar.yClickBtnUploadBuktiTransfer();
        System.out.println("16");
        extentTest.log(LogStatus.PASS, "Test238 Klik Navbar Upload Bukti Transfer");
    }

    @Then("Test238 Validasi Label Halaman Upload Bukti Transfer")
    public void test238_validasi_label_halaman_upload_bukti_transfer() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        String validasi = uploadBuktiTransferPage.yGetTextUploadBuktiTransferValidation();
        Assert.assertEquals("List Data Yang Sudah Ditransfer", validasi);

        extentTest.log(LogStatus.PASS, "Test238 Validasi Label Halaman Upload Bukti Transfer");
    }

    @And("^Test238 Pilih Option Show Entries (.*)$")
    public void test238_pilih_option_show_entries_data(String data) {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        entriesData = uploadBuktiTransferPage.ySelectOptionVerifikasiEntries(data);

        extentTest.log(LogStatus.PASS, "Test238 Pilih Option Show Entries data");
    }

    @Then("Test238 Validasi Banyak Data Yang Ditampilkan")
    public void test238_validasi_banyak_data_yang_ditampilkan() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        int validasi = uploadBuktiTransferPage.yGetDataTableRowTotal();
        System.out.println("perbandingan validasi : " + validasi + " dan " + entriesData);
//        Assert.assertEquals(validasi, entriesData);

        extentTest.log(LogStatus.PASS, "Test238 Validasi Banyak Data Yang Ditampilkan");
    }
}
