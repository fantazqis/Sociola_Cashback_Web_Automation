package com.juaracoding.ta_kelompok2.impl.irfan;
/*
IntelliJ IDEA 2023.3.6 (Community Edition)
Build #IC-233.15026.9, built on March 21, 2024
@Author kiyandark a.k.a. Muhammad Irfan Syaifur Rizal Wiratama
Java Developer
Created on 03/06/2024 16:16
@Last Modified 03/06/2024 16:16
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

import java.util.List;

public class NegatifTestTableVerifikasi {
    public WebDriver driver;
    private static ExtentTest extentTest;
    private LoginPage loginPage ;
    private Navbar navbar;

    private VerifikasiPage verifikasiPage;

    public String dataToSearch = "";



    public NegatifTestTableVerifikasi(){
        this.driver = VerifikatorFinanceOutlineHooks.driver;
        navbar = new Navbar(driver);
        verifikasiPage = new VerifikasiPage(driver);
        extentTest = VerifikatorFinanceOutlineHooks.extentTest;

//        if(Constants.PRODUCTION_MODE.equalsIgnoreCase("y")){
//            new LoginToHomeFunction(driver, Constants.VERIFIKATOR_USERNAME, Constants.VERIFIKATOR_PASSWORD);
//        }



    }

    @When("Test161 Klik Navbar Verifikasi")
    public void test161_klik_navbar_verifikasi() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        //new LoginToHomeFunction(driver, Constants.VERIFIKATOR_USERNAME, Constants.VERIFIKATOR_PASSWORD);
        navbar.yClickBtnVerifikasi();

        extentTest.log(LogStatus.PASS, "Test161 Klik Navbar Verifikasi");
    }

    @Then("Test161 Validasi Label Halaman Verifikasi")
    public void test161_validasi_label_halaman_verifikasi() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        String validasi = verifikasiPage.yGetTextVerifikasiValidation();
        Assert.assertEquals("List Data Register", validasi);

        extentTest.log(LogStatus.PASS, "Test161 Validasi Label Halaman Verifikasi");
    }

    @And("^Test161 Menginput (.*) Invalid$")
    public void test161_menginput_data_invalid(String data) {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        dataToSearch = data;
        verifikasiPage.yInputSearchBarVerifikasi(dataToSearch);

        extentTest.log(LogStatus.PASS, "Test161 Menginput data Invalid");
    }

    @And("Test161 Mencari Data Invalid")
    public void test161_mencari_data_invalid() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        verifikasiPage.ySendKeysEnter();

        extentTest.log(LogStatus.PASS, "Test161 Mencari Data Invalid");
    }

    @And("Test161 Menginput Data invalid Kembali")
    public void test161_menginput_data_invalid_kembali() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        verifikasiPage.yInputSearchBarVerifikasi(dataToSearch);

        extentTest.log(LogStatus.PASS, "Test161 Menginput Data invalid Kembali");
    }

    @And("Test161 Mencari Data Invalid Kembali")
    public void test161_mencari_data_invalid_kembali() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        verifikasiPage.ySendKeysEnter();

        extentTest.log(LogStatus.PASS, "Test161 Mencari Data Invalid Kembali");
    }

    @Then("Test161 Validasi Data Invalid")
    public void test161_validasi_data_invalid() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        String validasi = verifikasiPage.yGetTextVerifikasiValidationNoData();
        Assert.assertEquals("No data available in table", validasi);

        extentTest.log(LogStatus.PASS, "Test161 Validasi Data Invalid");
    }

    @When("Test163 Klik Navbar Verifikasi")
    public void test163_klik_navbar_verifikasi() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        navbar.yClickBtnVerifikasi();

        extentTest.log(LogStatus.PASS, "Test163 Klik Navbar Verifikasi");
    }

    @Then("Test163 Validasi Label Halaman Verifikasi")
    public void test163_validasi_label_halaman_verifikasi() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        String validasi = verifikasiPage.yGetTextVerifikasiValidation();
        Assert.assertEquals("List Data Register", validasi);

        extentTest.log(LogStatus.PASS, "Test163 Validasi Label Halaman Verifikasi");
    }

    @And("^Test163 Menginput (.*) Valid Dengan Spasi Di Depan$")
    public void test163_menginput_data_valid_dengan_spasi_di_depan(String data) {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        dataToSearch = "       " + verifikasiPage.yGetRandomTableDataString(data);
 //       System.out.println("ini datatosearch negatif: "+dataToSearch);
        verifikasiPage.yInputSearchBarVerifikasi(dataToSearch);

        extentTest.log(LogStatus.PASS, "Test163 Menginput data Valid Dengan Spasi Di Depan");
    }

    @And("Test163 Mencari Data Valid Dengan Spasi Di Depan")
    public void test163_mencari_data_valid_dengan_spasi_di_depan() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        verifikasiPage.ySendKeysEnter();

        extentTest.log(LogStatus.PASS, "Test163 Mencari Data Valid Dengan Spasi Di Depan");
    }

    @And("Test163 Menginput Data Valid Dengan Spasi Di Depan Kembali")
    public void test163_menginput_data_valid_dengan_spasi_di_depan_kembali() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        verifikasiPage.yInputSearchBarVerifikasi(dataToSearch);

        extentTest.log(LogStatus.PASS, "Test163 Menginput Data Valid Dengan Spasi Di Depan Kembali");
    }

    @And("Test163 Mencari Data Valid Dengan Spasi Di Depan Kembali")
    public void test163_mencari_data_valid_dengan_spasi_di_depan_kembali() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        verifikasiPage.ySendKeysEnter();

        extentTest.log(LogStatus.PASS, "Test163 Mencari Data Valid Dengan Spasi Di Depan Kembali");
    }

    @Then("Test163 Validasi Data Valid Dengan Spasi Di Depan")
    public void test163_validasi_data_valid_dengan_spasi_di_depan() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        String validasi = verifikasiPage.yGetTextVerifikasiValidationNoData();
        Assert.assertEquals("No data available in table", validasi);

        extentTest.log(LogStatus.PASS, "Test163 Validasi Data Valid Dengan Spasi Di Depan");
    }

    @When("Test165 Klik Navbar Verifikasi")
    public void test165_klik_navbar_verifikasi() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        navbar.yClickBtnVerifikasi();

        extentTest.log(LogStatus.PASS, "Test165 Klik Navbar Verifikasi");
    }

    @Then("Test165 Validasi Label Halaman Verifikasi")
    public void test165_validasi_label_halaman_verifikasi() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        String validasi = verifikasiPage.yGetTextVerifikasiValidation();
        Assert.assertEquals("List Data Register", validasi);

        extentTest.log(LogStatus.PASS, "Test165 Validasi Label Halaman Verifikasi");
    }

    @And("^Test165 Menginput (.*) Valid Dengan Banyak Spasi Di Belakang$")
    public void test165_menginput_data_valid_dengan_banyak_spasi_di_belakang(String data) {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        dataToSearch = verifikasiPage.yGetRandomTableDataString(data) + "      ";
        verifikasiPage.yInputSearchBarVerifikasi(dataToSearch);
//        System.out.println(dataToSearch + "negatif spasi belakang");
        extentTest.log(LogStatus.PASS, "Test165 Menginput data Valid Dengan Banyak Spasi Di Belakang");
    }

    @And("Test165 Mencari Data Valid Dengan Banyak Spasi Di Belakang")
    public void test165_mencari_data_valid_dengan_banyak_spasi_di_belakang() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        verifikasiPage.ySendKeysEnter();

        extentTest.log(LogStatus.PASS, "Test165 Mencari Data Valid Dengan Banyak Spasi Di Belakang");
    }

    @And("Test165 Menginput Data Valid Dengan Banyak Spasi Di Belakang Kembali")
    public void test165_menginput_data_valid_dengan_banyak_spasi_di_belakang_kembali() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        verifikasiPage.yInputSearchBarVerifikasi(dataToSearch);

        extentTest.log(LogStatus.PASS, "Test165 Menginput Data Valid Dengan Banyak Spasi Di Belakang Kembali");
    }

    @And("Test165 Mencari Data Valid Dengan Banyak Spasi Di Belakang Kembali")
    public void test165_mencari_data_valid_dengan_banyak_spasi_di_belakang_kembali() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        verifikasiPage.ySendKeysEnter();

        extentTest.log(LogStatus.PASS, "Test165 Mencari Data Valid Dengan Banyak Spasi Di Belakang Kembali");
    }

    @Then("Test165 Validasi Data Valid Dengan Spasi Di Belakang")
    public void test165_validasi_data_valid_dengan_spasi_di_belakang() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        String validasi = verifikasiPage.yGetTextVerifikasiValidationNoData();
        Assert.assertEquals("No data available in table", validasi);
        extentTest.log(LogStatus.PASS, "Test165 Validasi Data Valid Dengan Spasi Di Belakang");
    }

//    @When("Test167 Klik Navbar Verifikasi")
//    public void test167_klik_navbar_verifikasi() {
//        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
//        System.out.println("22");
//        extentTest.log(LogStatus.PASS, "Test167 Klik Navbar Verifikasi");
//    }
//
//    @Then("Test167 Validasi Label Halaman Verifikasi")
//    public void test167_validasi_label_halaman_verifikasi() {
//        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
//        System.out.println("23");
//        extentTest.log(LogStatus.PASS, "Test167 Validasi Label Halaman Verifikasi");
//    }
//
//    @And("^Test167 Menginput (.*) Valid Yang Dicari$")
//    public void test167_menginput_data_valid_yang_dicari() {
//        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
//        System.out.println("24");
//        extentTest.log(LogStatus.PASS, "Test167 Menginput data Valid Yang Dicari");
//    }
//
//    @And("Test167 Mencari Data Valid Yang Dicari")
//    public void test167_mencari_data_valid_yang_dicari() {
//        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
//        System.out.println("25");
//        extentTest.log(LogStatus.PASS, "Test167 Mencari Data Valid Yang Dicari");
//    }
//
//    @And("Test167 Menginput Data Valid Yang Dicari Kembali")
//    public void test167_menginput_data_valid_yang_dicari_kembali() {
//        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
//        System.out.println("26");
//        extentTest.log(LogStatus.PASS, "Test167 Menginput Data Valid Yang Dicari Kembali");
//    }
//
//    @And("Test167 Mencari Data Valid Yang Dicari Kembali")
//    public void test167_mencari_data_valid_yang_dicari_kembali() {
//        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
//        System.out.println("27");
//        extentTest.log(LogStatus.PASS, "Test167 Mencari Data Valid Yang Dicari Kembali");
//    }
//
//    @Then("Test167 Validasi Data Yang Dicari")
//    public void test167_validasi_data_yang_dicari() {
//        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
//        System.out.println("28");
//        extentTest.log(LogStatus.PASS, "Test167 Validasi Data Yang Dicari");
//    }
}
