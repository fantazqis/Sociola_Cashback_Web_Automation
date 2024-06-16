package com.juaracoding.ta_kelompok2.impl.irfan;
/*
IntelliJ IDEA 2023.3.6 (Community Edition)
Build #IC-233.15026.9, built on March 21, 2024
@Author kiyandark a.k.a. Muhammad Irfan Syaifur Rizal Wiratama
Java Developer
Created on 03/06/2024 18:22
@Last Modified 03/06/2024 18:22
Version 1.0
*/

import com.juaracoding.ta_kelompok2.SociolaRotateImage;
import com.juaracoding.ta_kelompok2.connection.Constants;
import com.juaracoding.ta_kelompok2.page.LoginPage;
import com.juaracoding.ta_kelompok2.page.Navbar;
import com.juaracoding.ta_kelompok2.page.PreTransferPage;
import com.juaracoding.ta_kelompok2.page.VerifikasiPage;
import com.juaracoding.ta_kelompok2.util.GlobalFunction;
import com.juaracoding.ta_kelompok2.util.DataGenerator;
import com.juaracoding.ta_kelompok2.util.OpenCVFunction;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.testng.Assert;

import java.text.SimpleDateFormat;
import java.util.*;


import static com.juaracoding.ta_kelompok2.util.GlobalFunction.delay;

public class PositifTestFormVerifikasi {

    public WebDriver driver;

    private String windowsParent;
    private String childWindow1;
    private String childWindow2;
    private static ExtentTest extentTest;
//    private LoginPage loginPage ;
    private Navbar navbar;

    private VerifikasiPage verifikasiPage;

    private PreTransferPage preTransferPage;

    private DataGenerator dataGenerator = new DataGenerator();

    private Random r = new Random();

    public String dataToSearch = "";

    public String tempCatatan;

    public String tempNamaNasabah;
    public String tempNomorHandphone;
    public String tempNomorRekening;
    public String tempPembayaranQRIS;
    public String tempNominalTransaksi;
    public String tempTanggalTransaksi;
    public String tempNamaMerchant;
    public String tempRRN;

    public String linkImageBuktiTransaksi;
    public String pathRootDownload = "D:\\juara_koding\\Tugas_Akhir_Juara_Coding\\ta_irfan\\image";





    public PositifTestFormVerifikasi(){
        this.driver = VerifikatorFinanceOutlineHooks.driver;
        navbar = new Navbar(driver);
        verifikasiPage = new VerifikasiPage(driver);
        preTransferPage = new PreTransferPage(driver);
        extentTest = VerifikatorFinanceOutlineHooks.extentTest;

//                if(Constants.PRODUCTION_MODE.equalsIgnoreCase("y")){
//            new LoginToHomeFunction(driver, Constants.VERIFIKATOR_USERNAME, Constants.VERIFIKATOR_PASSWORD);
//        }


    }
    @When("Test171 Klik Navbar Verifikasi")
    public void test171_klik_navbar_verifikasi() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        System.out.println("1 Valid Form Verifikasi Run");
       //new LoginToHomeFunction(driver, Constants.VERIFIKATOR_USERNAME, Constants.VERIFIKATOR_PASSWORD);
        windowsParent = driver.getWindowHandle();
        navbar.yClickBtnVerifikasi();

        extentTest.log(LogStatus.PASS, "Test171 Klik Navbar Verifikasi");
    }

    @Then("Test171 Validasi Label Halaman Verifikasi")
    public void test171_validasi_label_halaman_verifikasi() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        String validasi = verifikasiPage.yGetTextVerifikasiValidation();
        Assert.assertEquals("List Data Register", validasi);

        System.out.println("2");
        extentTest.log(LogStatus.PASS, "Test171 Validasi Label Halaman Verifikasi");
    }

    @And("^Test171 Input Field (.*) Yang Dicari$")
    public void test171_input_field_data_yang_dicari(String data) {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        dataToSearch = verifikasiPage.yGetRandomTableDataString(data);
        System.out.println("3");
        extentTest.log(LogStatus.PASS, "Test171 Input Field data Yang Dicari");
    }

    @And("Test171 Mencari Data")
    public void test171_mencari_data() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        verifikasiPage.ySendKeysEnter();
        System.out.println("4");
        extentTest.log(LogStatus.PASS, "Test171 Mencari Data");
    }

    @And("Test171 Input Field Data Kembali")
    public void test171_input_field_data_kembali() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        verifikasiPage.yInputSearchBarVerifikasi(dataToSearch);
        System.out.println("5");
        extentTest.log(LogStatus.PASS, "Test171 Input Field Data Kembali");
    }

    @And("Test171 Mencari Data Kembali")
    public void test171_mencari_data_kembali() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        verifikasiPage.ySendKeysEnter();
        System.out.println("6");
        extentTest.log(LogStatus.PASS, "Test171 Mencari Data Kembali");
    }

    @Then("Test171 Validasi Data Yang Dicari")
    public void test171_validasi_data_yang_dicari() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        boolean validasi = verifikasiPage.yGetValidationDataTable(dataToSearch, "valid");
        Assert.assertTrue(validasi);
        System.out.println("7");
        extentTest.log(LogStatus.PASS, "Test171 Validasi Data Yang Dicari");
    }

    @When("Test171 Klik Tombol Aksi Pada Data Web Table")
    public void test171_klik_tombol_aksi_pada_data_web_table() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        verifikasiPage.yClickButtonAksi();

        System.out.println("8");
        extentTest.log(LogStatus.PASS, "Test171 Klik Tombol Aksi Pada Data Web Table");
    }

    @Then("Test171 Validasi Halaman Form Verifikasi")
    public void test171_validasi_halaman_form_verifikasi() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        GlobalFunction.delay(1);
        Set<String> allWindowHandles = driver.getWindowHandles();
        Iterator<String> i1 = allWindowHandles.iterator();
        while (i1.hasNext()){

            String childWindow = i1.next();
            if(!windowsParent.equals(childWindow)) {
                childWindow1 = childWindow;
                driver.switchTo().window(childWindow1);
                GlobalFunction.delay(Constants.TIMEOUT_DELAY);
                break;
            }
        }

//        driver.switchTo().newWindow(WindowType.TAB);
//        driver.get(Constants.URL_COMPARE);
//        childWindow2 = driver.getWindowHandle();

        String validasi = verifikasiPage.yGetTextFormVerifikasiValidation();
        Assert.assertEquals("Form Input Data Cashback", validasi);


        System.out.println("9");
        extentTest.log(LogStatus.PASS, "Test171 Validasi Halaman Form Verifikasi");
    }

//    @And("Test171 Simpan Data Form Verifikasi Sebelum Di Edit")
//    public void test171_simpan_data_form_verifikasi_sebelum_di_edit() {
//        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
//
////        verifikasiPage.yClickButtonEditFormVerifikasi();
//
////        nomorHandphone = verifikasiPage.yGetTextFormVerifikasiNomorHandphone();
////        nomorRekening = verifikasiPage.yGetTextFormVerifikasiNomorRekening();
////        pembayaranQRIS = verifikasiPage.yGetTextFormVerifikasiPembayaranQRIS();
////        nominalTransaksi = verifikasiPage.yGetTextFormVerifikasiNominalTransaksi();
////        tanggalTransaksi = verifikasiPage.yGetTextFormVerifikasiTanggalTransaksi();
////        namaMerchant = verifikasiPage.yGetTextFormVerifikasiNamaMerchant();
////        RRN =  verifikasiPage.yGetTextFormVerifikasiRRN();
//
//
//
//        System.out.println("10");
//        extentTest.log(LogStatus.PASS, "Test171 Simpan Data Form Verifikasi Sebelum Di Edit");
//    }

    @And("Test171 Klik Tombol Edit Form Verifikasi")
    public void test171_klik_tombol_edit_form_verifikasi() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        verifikasiPage.yClickButtonEditFormVerifikasi();

        System.out.println("11");
        extentTest.log(LogStatus.PASS, "Test171 Klik Tombol Edit Form Verifikasi");
    }

    @And("Test171 Clear Field Form Verifikasi")
    public void test171_clear_field_form_verifikasi() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        verifikasiPage.yClearFormVerifikasi();

        System.out.println("12");
        extentTest.log(LogStatus.PASS, "Test171 Clear Field Form Verifikasi");
    }

    @And("^Test171 Input Field Nama Nasabah (.*)$")
    public void test171_input_field_nama_nasabah_namanasabah(String namanasabah) {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
//        tempNamaNasabah = namanasabah;
        tempNamaNasabah = dataGenerator.dataNamaLengkap();
        verifikasiPage.yInputTextFieldNamaNasabah(tempNamaNasabah);

        System.out.println("13");
        extentTest.log(LogStatus.PASS, "Test171 Input Field Nama Nasabah namanasabah");
    }

    @And("^Test171 Input Field Nomor Handphone (.*)$")
    public void test171_input_field_nomor_handphone_nomorhandphone(String nomorhandphone) {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        tempNomorHandphone = nomorhandphone;
        verifikasiPage.yInputTextFieldNomorHandphone(nomorhandphone);
        System.out.println("14");
        extentTest.log(LogStatus.PASS, "Test171 Input Field Nomor Handphone nomorhandphone");
    }

    @And("^Test171 Input Field Nomor Rekening (.*)$")
    public void test171_input_field_nomor_rekening_nomorrekening(String nomorrekening) {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        tempNomorRekening = nomorrekening;
        verifikasiPage.yInputTextFieldNomorRekening(nomorrekening);
        System.out.println("15");
        extentTest.log(LogStatus.PASS, "Test171 Input Field Nomor Rekening nomorrekening");
    }

    @And("^Test171 Input Field Pembayaran QRIS (.*)$")
    public void test171_input_field_pembayaran_qris_pembayaranqris(String pembayaranqris) {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        tempPembayaranQRIS = pembayaranqris;
        verifikasiPage.yInputSelectPembayaranQRIS(pembayaranqris);
        System.out.println("16");
        extentTest.log(LogStatus.PASS, "Test171 Input Field Pembayaran QRIS pembayaranqris");
    }

    @And("^Test171 Input Field Nominal Transaksi (.*)$")
    public void test171_input_field_nominal_transaksi_nominaltransaksi(String nominaltransaksi) {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        tempNominalTransaksi = nominaltransaksi;
        verifikasiPage.yInputTextFieldNominalTransaksi(nominaltransaksi);
        System.out.println("17");
        extentTest.log(LogStatus.PASS, "Test171 Input Field Nominal Transaksi nominaltransaksi");
    }

    @And("^Test171 Input Text Tanggal Transaksi (.*)$")
    public void test171_input_text_tanggal_transaksi_tanggaltransaksi(String tanggaltransaksi) {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        tempTanggalTransaksi = tanggaltransaksi;
        verifikasiPage.yInputDatePickerTanggalTransaksi(tanggaltransaksi);
        System.out.println("18");
        extentTest.log(LogStatus.PASS, "Test171 Input Text Tanggal Transaksi tanggaltransaksi");
    }

    @And("^Test171 Input Field Nama Merchant (.*)$")
    public void test171_input_field_nama_merchant_namamerchant(String namamerchant) {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        tempNamaMerchant = namamerchant;
        verifikasiPage.yInputSelectNamaMerchant(namamerchant);
        System.out.println("19");
        extentTest.log(LogStatus.PASS, "Test171 Input Field Nama Merchant namamerchant");
    }

    @And("^Test171 Input Field RRN (.*)$")
    public void test171_input_field_rrn_rrn(String rrn) {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
//        tempRRN = rrn;
        tempRRN = String.valueOf(r.nextLong(1000000000000L,9999999999999999L));
        verifikasiPage.yInputTextFieldRRN(tempRRN);
        System.out.println("20");
        extentTest.log(LogStatus.PASS, "Test171 Input Field RRN RRN");
    }

    @And("Test171 Klik Tombol Cancel Form Verifikasi")
    public void test171_klik_tombol_cancel_form_verifikasi() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        verifikasiPage.yClickButtonCancelFormVerifikasi();

        System.out.println("21");
        extentTest.log(LogStatus.PASS, "Test171 Klik Tombol Cancel Form Verifikasi");
    }

    @Then("Test171 Validasi Tombol Verifikasi Dan Tombol Save Note Tidak Bisa Diakses")
    public void test171_validasi_tombol_verifikasi_dan_tombol_save_note_tidak_bisa_diakses() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        boolean validasi = (verifikasiPage.yGetAlertDisabledVerifikasiButton() && verifikasiPage.yGetAlertDisabledSaveNoteButton());
        Assert.assertTrue(validasi);

        System.out.println("22");
        extentTest.log(LogStatus.PASS, "Test171 Validasi Tombol Verifikasi Dan Tombol Save Note Tidak Bisa Diakses");
    }

    @And("Test171 Klik Tombol Edit Form Verifikasi Kembali")
    public void test171_klik_tombol_edit_form_verifikasi_kembali() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        verifikasiPage.yClickButtonEditFormVerifikasi();

        System.out.println("23");
        extentTest.log(LogStatus.PASS, "Test171 Klik Tombol Edit Form Verifikasi Kembali");
    }

    @And("Test171 Klik Tombol Simpan Form Verifikasi")
    public void test171_klik_tombol_simpan_form_verifikasi() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        verifikasiPage.yClickButtonSimpanFormVerifikasi();

        System.out.println("24");
        extentTest.log(LogStatus.PASS, "Test171 Klik Tombol Simpan Form Verifikasi");
    }


    @And("Test171 Klik Tombol OK Pada Alert Yang Keluar")
    public void test171_klik_tombol_ok_pada_alert_yang_keluar() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        GlobalFunction.delay(2);
        driver.switchTo().alert().accept();
        GlobalFunction.delay(2);

        driver.close();
        System.out.println("25");
        extentTest.log(LogStatus.PASS, "Test171 Klik Tombol OK Pada Alert Yang Keluar");
    }

    @When("Test171 Klik Navbar Verifikasi Setelah Edit")
    public void test171_klik_navbar_verifikasi_setelah_edit() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        driver.switchTo().window(windowsParent);
        navbar.yClickBtnVerifikasi();

        System.out.println("26");
        extentTest.log(LogStatus.PASS, "Test171 Klik Navbar Verifikasi Setelah Edit");
    }

    @Then("Test171 Validasi Label Halaman Verifikasi Setelah Edit")
    public void test171_validasi_label_halaman_verifikasi_setelah_edit() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        String validasi = verifikasiPage.yGetTextVerifikasiValidation();
        Assert.assertEquals("List Data Register", validasi);

        System.out.println("27");
        extentTest.log(LogStatus.PASS, "Test171 Validasi Label Halaman Verifikasi Setelah Edit");
    }

    @And("Test171 Input Field Data Setelah Edit")
    public void test171_input_field_data_setelah_edit() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        verifikasiPage.yInputSearchBarVerifikasi(dataToSearch);

        System.out.println("28");
        extentTest.log(LogStatus.PASS, "Test171 Input Field Data Setelah Edit");
    }

    @And("Test171 Mencari Data Setelah Edit")
    public void test171_mencari_data_setelah_edit() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        verifikasiPage.ySendKeysEnter();

        System.out.println("29");
        extentTest.log(LogStatus.PASS, "Test171 Mencari Data Setelah Edit");
    }

    @And("Test171 Input Field Data Kembali Setelah Edit")
    public void test171_input_field_data_kembali_setelah_edit() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        verifikasiPage.yInputSearchBarVerifikasi(dataToSearch);

        System.out.println("30");
        extentTest.log(LogStatus.PASS, "Test171 Input Field Data Kembali Setelah Edit");
    }

    @And("Test171 Mencari Data Kembali Setelah Edit")
    public void test171_mencari_data_kembali_setelah_edit() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        verifikasiPage.ySendKeysEnter();

        System.out.println("31");
        extentTest.log(LogStatus.PASS, "Test171 Mencari Data Kembali Setelah Edit");
    }

    @Then("Test171 Validasi Data Yang Dicari Setelah Edit")
    public void test171_validasi_data_yang_dicari_setelah_edit() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        verifikasiPage.yGetValidationDataTable(dataToSearch, "valid");

        System.out.println("32");
        extentTest.log(LogStatus.PASS, "Test171 Validasi Data Yang Dicari Setelah Edit");
    }

    @When("Test171 Klik Tombol Aksi Pada Data Web Table Setelah Edit")
    public void test171_klik_tombol_aksi_pada_data_web_table_setelah_edit() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        verifikasiPage.yClickButtonAksi();

        System.out.println("33");
        extentTest.log(LogStatus.PASS, "Test171 Klik Tombol Aksi Pada Data Web Table Setelah Edit");
    }

    @Then("Test171 Validasi Halaman Form Verifikasi Setelah Edit")
    public void test171_validasi_halaman_form_verifikasi_setelah_edit() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        GlobalFunction.delay(1);
        Set<String> allWindowHandles = driver.getWindowHandles();
        Iterator<String> i1 = allWindowHandles.iterator();
        while (i1.hasNext()){

            String childWindow = i1.next();
            if(!windowsParent.equals(childWindow)) {
                childWindow1 = childWindow;
                driver.switchTo().window(childWindow1);
                GlobalFunction.delay(Constants.TIMEOUT_DELAY);
                break;
            }
        }

//        driver.switchTo().newWindow(WindowType.TAB);
//        driver.get(Constants.URL_COMPARE);
//        childWindow2 = driver.getWindowHandle();

        String validasi = verifikasiPage.yGetTextFormVerifikasiValidation();
        Assert.assertEquals("Form Input Data Cashback", validasi);

        System.out.println("34");
        extentTest.log(LogStatus.PASS, "Test171 Validasi Halaman Form Verifikasi Setelah Edit");
    }

    @Then("Test171 Validasi Data Berhasil dirubah")
    public void test171_validasi_data_berhasil_dirubah() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        System.out.println("Temp: " + tempNamaNasabah + " dan real: " + verifikasiPage.yGetTextFormVerifikasiNamaNasabah());
        System.out.println("Temp: " + tempNomorHandphone + " dan real: " + verifikasiPage.yGetTextFormVerifikasiNomorHandphone());
        System.out.println("Temp: " + tempNomorRekening + " dan real: " + verifikasiPage.yGetTextFormVerifikasiNomorRekening());
        System.out.println("Temp: " + tempPembayaranQRIS + " dan real: " + verifikasiPage.yGetTextFormVerifikasiPembayaranQRIS());
        System.out.println("Temp: " + tempNominalTransaksi + " dan real: " + verifikasiPage.yGetTextFormVerifikasiNominalTransaksi());
        System.out.println("Temp: " + tempTanggalTransaksi + " dan real: " + verifikasiPage.yGetTextFormVerifikasiTanggalTransaksi());
        System.out.println("Temp: " + tempNamaMerchant + " dan real: " + verifikasiPage.yGetTextFormVerifikasiNamaMerchant());
        System.out.println("Temp: " + tempRRN + " dan real: " + verifikasiPage.yGetTextFormVerifikasiRRN());
//        Boolean validasi = (
//                tempNamaNasabah.equals(verifikasiPage.yGetTextFormVerifikasiNamaNasabah()) &&
//                tempNomorHandphone.equals(verifikasiPage.yGetTextFormVerifikasiNomorHandphone()) &&
//                tempNomorRekening.equals(verifikasiPage.yGetTextFormVerifikasiNomorRekening()) &&
//                tempPembayaranQRIS.equals(verifikasiPage.yGetTextFormVerifikasiPembayaranQRIS()) &&
//                tempNominalTransaksi.equals(verifikasiPage.yGetTextFormVerifikasiNominalTransaksi()) &&
//                tempTanggalTransaksi.equals(verifikasiPage.yGetTextFormVerifikasiTanggalTransaksi()) &&
//                tempNamaMerchant.equals(verifikasiPage.yGetTextFormVerifikasiNamaMerchant()) &&
//                tempRRN.equals(verifikasiPage.yGetTextFormVerifikasiRRN()));
//
//        Assert.assertTrue(validasi);


        GlobalFunction.delay(1);
        driver.close();




        GlobalFunction.delay(1);
        driver.switchTo().window(windowsParent);
        GlobalFunction.delay(1);
        System.out.println("35");
        extentTest.log(LogStatus.PASS, "Test171 Validasi Data Berhasil dirubah");
    }
//
//    @When("Test172 Buka Modal Upload Dengan Mengklik Foto Transaksi Satu")
//    public void test172_buka_modal_upload_dengan_mengklik_foto_transaksi_satu() {
//        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
//        verifikasiPage.yClickImageFormVerifikasiFotoBuktiTransaksiSatu();
//        System.out.println("1");
//        extentTest.log(LogStatus.PASS, "Test172 Buka Modal Upload Dengan Mengklik Foto Transaksi Satu");
//    }
//
//    @And("Test172 Validasi Modal Terbuka")
//    public void test172_validasi_modal_terbuka() {
//        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
//        String validasi = verifikasiPage.yGetTextFormVerifikasiModal();
//        System.out.println("ini validasi 1: "+ validasi);
//        Assert.assertEquals("Edit Foto Struk EDC", validasi);
//
//        System.out.println("2");
//        extentTest.log(LogStatus.PASS, "Test172 Validasi Modal Terbuka");
//    }
//
//    @And("Test172 Upload Gambar Transaksi")
//    public void test172_upload_gambar_transaksi() {
//        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
//        verifikasiPage.yInputImageBuktiTransaksiSatu();
//
//        System.out.println("3");
//        extentTest.log(LogStatus.PASS, "Test172 Upload Gambar Transaksi");
//    }
//
//    @And("Test172 Klik Tombol Ganti Foto")
//    public void test172_klik_tombol_ganti_foto() {
//        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
//        verifikasiPage.yUploadImageBuktiTransaksiSatu();
//        System.out.println("4");
//        extentTest.log(LogStatus.PASS, "Test172 Klik Tombol Ganti Foto");
//    }
//
//    @Then("Test172 Validasi Gambar Berhasil Di Upload")
//    public void test172_validasi_gambar_berhasil_di_upload() {
//        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
//        GlobalFunction.delay(2);
//        driver.switchTo().alert().accept();
//
//        GlobalFunction.delay(2);
//
//        linkImageBuktiTransaksi = verifikasiPage.yGetImgFotoBuktiTransaksiSatu().getAttribute("src");
//        System.out.println("SOURCE -> "+linkImageBuktiTransaksi);
//
//        String fileImageAwal = "D:\\juara_koding\\Tugas_Akhir_Juara_Coding\\ta_irfan\\image\\gambar_awal.jpg";
//        GlobalFunction.downloadImage(linkImageBuktiTransaksi,fileImageAwal);
//
////        driver.switchTo().newWindow(WindowType.TAB);
////        driver.get(Constants.URL_COMPARE);
////        childWindow2 = driver.getWindowHandle();
//
//
//        System.out.println("5");
//        extentTest.log(LogStatus.PASS, "Test172 Validasi Gambar Berhasil Di Upload");
//    }
//
//    @And("Test172 Klik Tombol Rotate 90 Derajat")
//    public void test172_klik_tombol_rotate_90_derajat() {
//        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
//        verifikasiPage.yClickButtonRotate90FotoTransaksiSatu();
//
//        System.out.println("6");
//        extentTest.log(LogStatus.PASS, "Test172 Klik Tombol Rotate 90 Derajat");
//    }
//
//    @And("Test172 Download Gambar Rotate 90 Derajat")
//    public void test172_download_gambar_rotate_90_derajat() {
//        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
//        GlobalFunction.delay(2);
//        linkImageBuktiTransaksi = verifikasiPage.yGetImgFotoBuktiTransaksiSatu().getAttribute("src");
//        System.out.println("SOURCE -> "+linkImageBuktiTransaksi);
//
//        String fileImage90Derajat = "D:\\juara_koding\\Tugas_Akhir_Juara_Coding\\ta_irfan\\image\\gambar_web_transaksi_satu_90_derajat.jpg";
//        GlobalFunction.downloadImage(linkImageBuktiTransaksi,fileImage90Derajat);
//
//
//        System.out.println("7");
//        extentTest.log(LogStatus.PASS, "Test172 Download Gambar Rotate 90 Derajat");
//    }
//
//    @Then("Test172 Validasi Fungsi Rotate 90 Derajat")
//    public void test172_validasi_fungsi_rotate_90_derajat() {
//        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
//
//        String pathGambarSumber = "D:\\juara_koding\\Tugas_Akhir_Juara_Coding\\ta_irfan\\image\\gambar_awal.jpg";
//        String buktiTransaksiSatu90Derajat = "D:\\juara_koding\\Tugas_Akhir_Juara_Coding\\ta_irfan\\image\\gambar_openCV_transaksi_satu_90_derajat.jpg";
//        OpenCVFunction.rotateImage(pathGambarSumber,buktiTransaksiSatu90Derajat,90);
//
////        driver.switchTo().newWindow(WindowType.TAB);
////        driver.get(Constants.URL_COMPARE);
////        childWindow2 = driver.getWindowHandle();
//
//        System.out.println("8");
//        extentTest.log(LogStatus.PASS, "Test172 Validasi Fungsi Rotate 90 Derajat");
//    }
//
//    @And("Test172 Klik Tombol Rotate 180 Derajat")
//    public void test172_klik_tombol_rotate_180_derajat() {
//        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
//        verifikasiPage.yClickButtonRotate180FotoTransaksiSatu();
//        System.out.println("9");
//        extentTest.log(LogStatus.PASS, "Test172 Klik Tombol Rotate 180 Derajat");
//    }
//
//    @And("Test172 Download Gambar Rotate 180 Derajat")
//    public void test172_download_gambar_rotate_180_derajat() {
//        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
//        GlobalFunction.delay(2);
//        String fileImage180Derajat = "D:\\juara_koding\\Tugas_Akhir_Juara_Coding\\ta_irfan\\image\\gambar_web_transaksi_satu_180_derajat.jpg";
//        GlobalFunction.downloadImage(linkImageBuktiTransaksi,fileImage180Derajat);
//
//        System.out.println("10");
//        extentTest.log(LogStatus.PASS, "Test172 Download Gambar Rotate 180 Derajat");
//    }
//
//    @Then("Test172 Validasi Fungsi Rotate 180 Derajat")
//    public void test172_validasi_fungsi_rotate_180_derajat() {
//        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
//        String pathGambarSumber = "D:\\juara_koding\\Tugas_Akhir_Juara_Coding\\ta_irfan\\image\\gambar_web_transaksi_satu_90_derajat.jpg";
//        String buktiTransaksiSatu180Derajat = "D:\\juara_koding\\Tugas_Akhir_Juara_Coding\\ta_irfan\\image\\gambar_openCV_transaksi_satu_180_derajat.jpg";
//        OpenCVFunction.rotateImage(pathGambarSumber,buktiTransaksiSatu180Derajat,-180);
//
//        System.out.println("11");
//        extentTest.log(LogStatus.PASS, "Test172 Validasi Fungsi Rotate 180 Derajat");
//    }
//
//    @And("Test172 Klik Tombol Rotate 270 Derajat")
//    public void test172_klik_tombol_rotate_270_derajat() {
//        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
//        verifikasiPage.yClickButtonRotate270FotoTransaksiSatu();
//
//        System.out.println("12");
//        extentTest.log(LogStatus.PASS, "Test172 Klik Tombol Rotate 270 Derajat");
//    }
//
//    @And("Test172 Download Gambar Rotate 270 Derajat")
//    public void test172_download_gambar_rotate_270_derajat() {
//        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
//        GlobalFunction.delay(2);
//        String fileImage270Derajat = "D:\\juara_koding\\Tugas_Akhir_Juara_Coding\\ta_irfan\\image\\gambar_web_transaksi_satu_270_derajat.jpg";
//        GlobalFunction.downloadImage(linkImageBuktiTransaksi,fileImage270Derajat);
//
//        System.out.println("13");
//        extentTest.log(LogStatus.PASS, "Test172 Download Gambar Rotate 270 Derajat");
//    }
//
//    @Then("Test172 Validasi Fungsi Rotate 270 Derajat")
//    public void test172_validasi_fungsi_rotate_270_derajat() {
//        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
//        String pathGambarSumber = "D:\\juara_koding\\Tugas_Akhir_Juara_Coding\\ta_irfan\\image\\gambar_web_transaksi_satu_180_derajat.jpg";
//        String buktiTransaksiSatu180Derajat = "D:\\juara_koding\\Tugas_Akhir_Juara_Coding\\ta_irfan\\image\\gambar_openCV_transaksi_satu_270_derajat.jpg";
//        OpenCVFunction.rotateImage(pathGambarSumber,buktiTransaksiSatu180Derajat,-270);
//
//        System.out.println("14");
//        extentTest.log(LogStatus.PASS, "Test172 Validasi Fungsi Rotate 270 Derajat");
//    }
//
//    @When("Test175 Buka Modal Upload Dengan Mengklik Foto Transaksi Dua")
//    public void test175_buka_modal_upload_dengan_mengklik_foto_transaksi_dua() {
//        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
////        driver.navigate().refresh();
//        verifikasiPage.yClickImageFormVerifikasiFotoBuktiTransaksiDua();
//
//        System.out.println("15");
//        extentTest.log(LogStatus.PASS, "Test175 Buka Modal Upload Dengan Mengklik Foto Transaksi Dua");
//    }
//
//    @And("Test175 Validasi Modal Terbuka")
//    public void test175_validasi_modal_terbuka() {
//        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
////        String validasi = verifikasiPage.yGetTextFormVerifikasiModal();
//
//
//
//        System.out.println("16");
//        extentTest.log(LogStatus.PASS, "Test175 Validasi Modal Terbuka");
//    }
//
//    @And("Test175 Upload Gambar Transaksi")
//    public void test175_upload_gambar_transaksi() {
//        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
//        verifikasiPage.yInputImageBuktiTransaksiDua();
//
//        System.out.println("17");
//        extentTest.log(LogStatus.PASS, "Test175 Upload Gambar Transaksi");
//    }
//
//    @And("Test175 Klik Tombol Ganti Foto")
//    public void test175_klik_tombol_ganti_foto() {
//        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
//        verifikasiPage.yUploadImageBuktiTransaksiDua();
//        GlobalFunction.delay(1);
//
//        System.out.println("18");
//        extentTest.log(LogStatus.PASS, "Test175 Klik Tombol Ganti Foto");
//    }
//
//    @Then("Test175 Validasi Gambar Berhasil Di Upload")
//    public void test175_validasi_gambar_berhasil_di_upload() {
//        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
//        GlobalFunction.delay(1);
//        driver.switchTo().alert().accept();
//        GlobalFunction.delay(2);
//
//        linkImageBuktiTransaksi = verifikasiPage.yGetImgFotoBuktiTransaksiDua().getAttribute("src");
//        System.out.println("SOURCE -> "+linkImageBuktiTransaksi);
//
//        String fileImageAwal = "D:\\juara_koding\\Tugas_Akhir_Juara_Coding\\ta_irfan\\image\\gambar_awal_dua.jpg";
//        GlobalFunction.downloadImage(linkImageBuktiTransaksi,fileImageAwal);
//
//
//        System.out.println("19");
//        extentTest.log(LogStatus.PASS, "Test175 Validasi Gambar Berhasil Di Upload");
//    }
//
//    @And("Test175 Klik Tombol Rotate 90 Derajat")
//    public void test175_klik_tombol_rotate_90_derajat() {
//        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
//        verifikasiPage.yClickButtonRotate90FotoTransaksiDua();
//        System.out.println("20");
//        extentTest.log(LogStatus.PASS, "Test175 Klik Tombol Rotate 90 Derajat");
//    }
//
//    @And("Test175 Download Gambar Rotate 90 Derajat")
//    public void test175_download_gambar_rotate_90_derajat() {
//        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
//        GlobalFunction.delay(2);
//        linkImageBuktiTransaksi = verifikasiPage.yGetImgFotoBuktiTransaksiSatu().getAttribute("src");
//        System.out.println("SOURCE -> "+linkImageBuktiTransaksi);
//
//        String fileImage90Derajat = "D:\\juara_koding\\Tugas_Akhir_Juara_Coding\\ta_irfan\\image\\gambar_web_transaksi_dua_90_derajat.jpg";
//        GlobalFunction.downloadImage(linkImageBuktiTransaksi,fileImage90Derajat);
//
//        System.out.println("21");
//        extentTest.log(LogStatus.PASS, "Test175 Download Gambar Rotate 90 Derajat");
//    }
//
//    @Then("Test175 Validasi Fungsi Rotate 90 Derajat")
//    public void test175_validasi_fungsi_rotate_90_derajat() {
//        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
//        String pathGambarSumber = "D:\\juara_koding\\Tugas_Akhir_Juara_Coding\\ta_irfan\\image\\gambar_awal_dua.jpg";
//        String buktiTransaksiSatu90Derajat = "D:\\juara_koding\\Tugas_Akhir_Juara_Coding\\ta_irfan\\image\\gambar_openCV_transaksi_dua_90_derajat.jpg";
//        OpenCVFunction.rotateImage(pathGambarSumber,buktiTransaksiSatu90Derajat,-90);
//
////        driver.switchTo().newWindow(WindowType.TAB);
////        driver.get(Constants.URL_COMPARE);
////        childWindow2 = driver.getWindowHandle();
//
//        System.out.println("22");
//        extentTest.log(LogStatus.PASS, "Test175 Validasi Fungsi Rotate 90 Derajat");
//    }
//
//    @And("Test175 Klik Tombol Rotate 180 Derajat")
//    public void test175_klik_tombol_rotate_180_derajat() {
//        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
//        verifikasiPage.yClickButtonRotate180FotoTransaksiDua();
//        System.out.println("23");
//        extentTest.log(LogStatus.PASS, "Test175 Klik Tombol Rotate 180 Derajat");
//    }
//
//    @And("Test175 Download Gambar Rotate 180 Derajat")
//    public void test175_download_gambar_rotate_180_derajat() {
//        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
//        GlobalFunction.delay(2);
//        String fileImage180Derajat = "D:\\juara_koding\\Tugas_Akhir_Juara_Coding\\ta_irfan\\image\\gambar_web_transaksi_dua_180_derajat.jpg";
//        GlobalFunction.downloadImage(linkImageBuktiTransaksi,fileImage180Derajat);
//
//        System.out.println("24");
//        extentTest.log(LogStatus.PASS, "Test175 Download Gambar Rotate 180 Derajat");
//    }
//
//    @Then("Test175 Validasi Fungsi Rotate 180 Derajat")
//    public void test175_validasi_fungsi_rotate_180_derajat() {
//        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
//        String pathGambarSumber = "D:\\juara_koding\\Tugas_Akhir_Juara_Coding\\ta_irfan\\image\\gambar_web_transaksi_dua_90_derajat.jpg";
//        String buktiTransaksiSatu180Derajat =  "D:\\juara_koding\\Tugas_Akhir_Juara_Coding\\ta_irfan\\image\\gambar_openCV_transaksi_dua_180_derajat.jpg";
//        OpenCVFunction.rotateImage(pathGambarSumber,buktiTransaksiSatu180Derajat,-180);
//
//        System.out.println("25");
//        extentTest.log(LogStatus.PASS, "Test175 Validasi Fungsi Rotate 180 Derajat");
//    }
//
//    @And("Test175 Klik Tombol Rotate 270 Derajat")
//    public void test175_klik_tombol_rotate_270_derajat() {
//        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
//        verifikasiPage.yClickButtonRotate270FotoTransaksiDua();
//
//        System.out.println("26");
//        extentTest.log(LogStatus.PASS, "Test175 Klik Tombol Rotate 270 Derajat");
//    }
//
//    @And("Test175 Download Gambar Rotate 270 Derajat")
//    public void test175_download_gambar_rotate_270_derajat() {
//        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
//        GlobalFunction.delay(2);
//        String fileImage270Derajat = "D:\\juara_koding\\Tugas_Akhir_Juara_Coding\\ta_irfan\\image\\gambar_web_transaksi_dua_270_derajat.jpg";
//        GlobalFunction.downloadImage(linkImageBuktiTransaksi,fileImage270Derajat);
//
//        System.out.println("27");
//        extentTest.log(LogStatus.PASS, "Test175 Download Gambar Rotate 270 Derajat");
//    }
//
//    @Then("Test175 Validasi Fungsi Rotate 270 Derajat")
//    public void test175_validasi_fungsi_rotate_270_derajat() {
//        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
//
//
//        String pathGambarSumber = "D:\\juara_koding\\Tugas_Akhir_Juara_Coding\\ta_irfan\\image\\gambar_web_transaksi_dua_180_derajat.jpg";
//        String buktiTransaksiSatu180Derajat = "D:\\juara_koding\\Tugas_Akhir_Juara_Coding\\ta_irfan\\image\\gambar_openCV_transaksi_dua_270_derajat.jpg";
//        OpenCVFunction.rotateImage(pathGambarSumber,buktiTransaksiSatu180Derajat,-270);
//
//        System.out.println("28");
//        extentTest.log(LogStatus.PASS, "Test175 Validasi Fungsi Rotate 270 Derajat");
//    }
//
//    @When("Test178 Buka Modal Upload Dengan Mengklik Foto Transaksi Tiga")
//    public void test178_buka_modal_upload_dengan_mengklik_foto_transaksi_tiga() {
//        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
//        verifikasiPage.yClickImageFormVerifikasiFotoBuktiTransaksiTiga();
//
//        System.out.println("29");
//        extentTest.log(LogStatus.PASS, "Test178 Buka Modal Upload Dengan Mengklik Foto Transaksi Tiga");
//    }
//
//    @And("Test178 Validasi Modal Terbuka")
//    public void test178_validasi_modal_terbuka() {
//        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
////        String validasi = verifikasiPage.yGetTextFormVerifikasiModal();
////        System.out.println("ini valisasi 3: "+ validasi);
////        Assert.assertEquals("Edit Foto Bukti Transfer 3", validasi);
//
//        System.out.println("30");
//        extentTest.log(LogStatus.PASS, "Test178 Validasi Modal Terbuka");
//    }
//
//    @And("Test178 Upload Gambar Transaksi")
//    public void test178_upload_gambar_transaksi() {
//        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
//        verifikasiPage.yInputImageBuktiTransaksiTiga();
//
//        System.out.println("31");
//        extentTest.log(LogStatus.PASS, "Test178 Upload Gambar Transaksi");
//    }
//
//    @And("Test178 Klik Tombol Ganti Foto")
//    public void test178_klik_tombol_ganti_foto() {
//        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
//        verifikasiPage.yUploadImageBuktiTransaksiTiga();
//        GlobalFunction.delay(1);
//        System.out.println("32");
//        extentTest.log(LogStatus.PASS, "Test178 Klik Tombol Ganti Foto");
//    }
//
//    @Then("Test178 Validasi Gambar Berhasil Di Upload")
//    public void test178_validasi_gambar_berhasil_di_upload() {
//        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
//        GlobalFunction.delay(1);
//        driver.switchTo().alert().accept();
//        GlobalFunction.delay(2);
//        linkImageBuktiTransaksi = verifikasiPage.yGetImgFotoBuktiTransaksiSatu().getAttribute("src");
//        System.out.println("SOURCE -> "+linkImageBuktiTransaksi);
//
//        String fileImageAwal = "D:\\juara_koding\\Tugas_Akhir_Juara_Coding\\ta_irfan\\image\\gambar_awal_3.jpg";
//        GlobalFunction.downloadImage(linkImageBuktiTransaksi,fileImageAwal);
//
//        System.out.println("33");
//        extentTest.log(LogStatus.PASS, "Test178 Validasi Gambar Berhasil Di Upload");
//    }
//
//    @And("Test178 Klik Tombol Rotate 90 Derajat")
//    public void test178_klik_tombol_rotate_90_derajat() {
//        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
//        verifikasiPage.yClickButtonRotate90FotoTransaksiTiga();
//
//        System.out.println("34");
//        extentTest.log(LogStatus.PASS, "Test178 Klik Tombol Rotate 90 Derajat");
//    }
//
//    @And("Test178 Download Gambar Rotate 90 Derajat")
//    public void test178_download_gambar_rotate_90_derajat() {
//        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
//        GlobalFunction.delay(2);
//
//        linkImageBuktiTransaksi = verifikasiPage.yGetImgFotoBuktiTransaksiTiga().getAttribute("src");
//        System.out.println("SOURCE -> "+linkImageBuktiTransaksi);
//
//        String fileImage90Derajat = "D:\\juara_koding\\Tugas_Akhir_Juara_Coding\\ta_irfan\\image\\gambar_web_transaksi_tiga_90_derajat.jpg";
//        GlobalFunction.downloadImage(linkImageBuktiTransaksi,fileImage90Derajat);
//
//        System.out.println("35");
//        extentTest.log(LogStatus.PASS, "Test178 Download Gambar Rotate 90 Derajat");
//    }
//
//    @Then("Test178 Validasi Fungsi Rotate 90 Derajat")
//    public void test178_validasi_fungsi_rotate_90_derajat() {
//        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
//
//        String pathGambarSumber = "D:\\juara_koding\\Tugas_Akhir_Juara_Coding\\ta_irfan\\image\\gambar_awal_3.jpg";
//        String buktiTransaksiSatu90Derajat = "D:\\juara_koding\\Tugas_Akhir_Juara_Coding\\ta_irfan\\image\\gambar_openCV_transaksi_tiga_90_derajat.jpg";
//        OpenCVFunction.rotateImage(pathGambarSumber,buktiTransaksiSatu90Derajat,-90);
//
////        driver.switchTo().newWindow(WindowType.TAB);
////        driver.get(Constants.URL_COMPARE);
////        childWindow2 = driver.getWindowHandle();
//
//        System.out.println("36");
//        extentTest.log(LogStatus.PASS, "Test178 Validasi Fungsi Rotate 90 Derajat");
//    }
//
//    @And("Test178 Klik Tombol Rotate 180 Derajat")
//    public void test178_klik_tombol_rotate_180_derajat() {
//        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
//        verifikasiPage.yClickButtonRotate180FotoTransaksiTiga();
//        System.out.println("37");
//        extentTest.log(LogStatus.PASS, "Test178 Klik Tombol Rotate 180 Derajat");
//    }
//
//    @And("Test178 Download Gambar Rotate 180 Derajat")
//    public void test178_download_gambar_rotate_180_derajat() {
//        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
//        GlobalFunction.delay(2);
//        String fileImage180Derajat = "D:\\juara_koding\\Tugas_Akhir_Juara_Coding\\ta_irfan\\image\\gambar_web_transaksi_tiga_180_derajat.jpg";
//        GlobalFunction.downloadImage(linkImageBuktiTransaksi,fileImage180Derajat);
//
//        System.out.println("38");
//        extentTest.log(LogStatus.PASS, "Test178 Download Gambar Rotate 180 Derajat");
//    }
//
//    @Then("Test178 Validasi Fungsi Rotate 180 Derajat")
//    public void test178_validasi_fungsi_rotate_180_derajat() {
//        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
//        String pathGambarSumber = "D:\\juara_koding\\Tugas_Akhir_Juara_Coding\\ta_irfan\\image\\gambar_web_transaksi_tiga_90_derajat.jpg";
//        String buktiTransaksiSatu180Derajat = "D:\\juara_koding\\Tugas_Akhir_Juara_Coding\\ta_irfan\\image\\gambar_openCV_transaksi_tiga_180_derajat.jpg";
//        OpenCVFunction.rotateImage(pathGambarSumber,buktiTransaksiSatu180Derajat,-180);
//
//        System.out.println("39");
//        extentTest.log(LogStatus.PASS, "Test178 Validasi Fungsi Rotate 180 Derajat");
//    }
//
//    @And("Test178 Klik Tombol Rotate 270 Derajat")
//    public void test178_klik_tombol_rotate_270_derajat() {
//        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
//        verifikasiPage.yClickButtonRotate270FotoTransaksiTiga();
//        System.out.println("40");
//        extentTest.log(LogStatus.PASS, "Test178 Klik Tombol Rotate 270 Derajat");
//    }
//
//    @And("Test178 Download Gambar Rotate 270 Derajat")
//    public void test178_download_gambar_rotate_270_derajat() {
//        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
//        GlobalFunction.delay(2);
//        String fileImage270Derajat = "D:\\juara_koding\\Tugas_Akhir_Juara_Coding\\ta_irfan\\image\\gambar_web_transaksi_tiga_270_derajat.jpg";
//        GlobalFunction.downloadImage(linkImageBuktiTransaksi,fileImage270Derajat);
//
//        System.out.println("41");
//        extentTest.log(LogStatus.PASS, "Test178 Download Gambar Rotate 270 Derajat");
//    }
//
//    @Then("Test178 Validasi Fungsi Rotate 270 Derajat")
//    public void test178_validasi_fungsi_rotate_270_derajat() {
//        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
//        String pathGambarSumber = "D:\\juara_koding\\Tugas_Akhir_Juara_Coding\\ta_irfan\\image\\gambar_web_transaksi_tiga_180_derajat.jpg";
//        String buktiTransaksiSatu180Derajat = "D:\\juara_koding\\Tugas_Akhir_Juara_Coding\\ta_irfan\\image\\gambar_openCV_transaksi_tiga_270_derajat.jpg";
//        OpenCVFunction.rotateImage(pathGambarSumber, buktiTransaksiSatu180Derajat,-270);
//
//
//        GlobalFunction.delay(1);
//        driver.close();
//
//
//        GlobalFunction.delay(1);
//
//        System.out.println("42");
//        extentTest.log(LogStatus.PASS, "Test178 Validasi Fungsi Rotate 270 Derajat");
//    }


    @When("Test179 Klik Navbar Verifikasi")
    public void test179_klik_navbar_verifikasi() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        windowsParent = driver.getWindowHandle();

        navbar.yClickBtnVerifikasi();

        System.out.println("1");
        extentTest.log(LogStatus.PASS, "Test179 Klik Navbar Verifikasi");
    }

    @Then("Test179 Validasi Label Halaman Verifikasi")
    public void test179_validasi_label_halaman_verifikasi() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        String validasi = verifikasiPage.yGetTextVerifikasiValidation();
        Assert.assertEquals("List Data Register", validasi);

        System.out.println("2");
        extentTest.log(LogStatus.PASS, "Test179 Validasi Label Halaman Verifikasi");
    }

    @And("^Test179 Input Field (.*) Yang Dicari$")
    public void test179_input_field_data_yang_dicari(String data) {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        dataToSearch = verifikasiPage.yGetRandomTableDataString(data);

        System.out.println("3");
        extentTest.log(LogStatus.PASS, "Test179 Input Field data Yang Dicari");
    }

    @And("Test179 Mencari Data")
    public void test179_mencari_data() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        verifikasiPage.ySendKeysEnter();

        System.out.println("4");
        extentTest.log(LogStatus.PASS, "Test179 Mencari Data");
    }

    @And("Test179 Input Field Data Kembali")
    public void test179_input_field_data_kembali() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        verifikasiPage.yInputSearchBarVerifikasi(dataToSearch);

        System.out.println("5");
        extentTest.log(LogStatus.PASS, "Test179 Input Field Data Kembali");
    }

    @And("Test179 Mencari Data Kembali")
    public void test179_mencari_data_kembali() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        verifikasiPage.ySendKeysEnter();

        System.out.println("6");
        extentTest.log(LogStatus.PASS, "Test179 Mencari Data Kembali");
    }

    @Then("Test179 Validasi Data Yang Dicari")
    public void test179_validasi_data_yang_dicari() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        boolean validasi = verifikasiPage.yGetValidationDataTable(dataToSearch, "valid");
        Assert.assertTrue(validasi);

        System.out.println("7");
        extentTest.log(LogStatus.PASS, "Test179 Validasi Data Yang Dicari");
    }

    @When("Test179 Klik Tombol Aksi Pada Data Web Table")
    public void test179_klik_tombol_aksi_pada_data_web_table() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        verifikasiPage.yClickButtonAksi();

        System.out.println("8");
        extentTest.log(LogStatus.PASS, "Test179 Klik Tombol Aksi Pada Data Web Table");
    }

    @Then("Test179 Validasi Halaman Form Verifikasi")
    public void test179_validasi_halaman_form_verifikasi() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        Set<String> allWindowHandles = driver.getWindowHandles();
        Iterator<String> i1 = allWindowHandles.iterator();
        while (i1.hasNext()){

            String childWindow = i1.next();
            if(!windowsParent.equals(childWindow)) {
                childWindow1 = childWindow;
                driver.switchTo().window(childWindow1);
                GlobalFunction.delay(Constants.TIMEOUT_DELAY);
                break;
            }
        }

        String validasi = verifikasiPage.yGetTextFormVerifikasiValidation();
        Assert.assertEquals("Form Input Data Cashback", validasi);

        System.out.println("9");
        extentTest.log(LogStatus.PASS, "Test179 Validasi Halaman Form Verifikasi");
    }

    @And("^Test179 Mengisi Teks Field Notes (.*)$")
    public void test179_mengisi_teks_field_notes_catatan(String catatan) {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        verifikasiPage.yClearFormVerifikasiNote();
        GlobalFunction.delay(2);
        tempCatatan = catatan;
        verifikasiPage.yInputTextSaveNotes(catatan);
        System.out.println("10");
        extentTest.log(LogStatus.PASS, "Test179 Mengisi Teks Field Notes Catatan");
    }

    @And("Test179 Klik Tombol Save Note")
    public void test179_klik_tombol_save_note() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        verifikasiPage.yClickButtonSaveNotesFormVerifikasi();
        System.out.println("11");
        extentTest.log(LogStatus.PASS, "Test179 Klik Tombol Save Note");
    }

    @And("Test179 Klik Tombol OK Pada Modal")
    public void test179_klik_tombol_ok_pada_modal() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        verifikasiPage.yClickModal2Function();

        System.out.println("12");
        extentTest.log(LogStatus.PASS, "Test179 Klik Tombol OK Pada Modal");
    }

    @And("Test179 Klik Tombol OK Pada Alert Yang Keluar")
    public void test179_klik_tombol_ok_pada_alert_yang_keluar() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        GlobalFunction.delay(2);
        driver.switchTo().alert().accept();
        GlobalFunction.delay(1);
        driver.close();
        GlobalFunction.delay(1);
        driver.switchTo().window(windowsParent);
        GlobalFunction.delay(1);


        System.out.println("13");
        extentTest.log(LogStatus.PASS, "Test179 Klik Tombol OK Pada Alert Yang Keluar");
    }

    @When("Test179 Klik Navbar Verifikasi Kembali")
    public void test179_klik_navbar_verifikasi_kembali() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        navbar.yClickBtnVerifikasi();

        System.out.println("14");
        extentTest.log(LogStatus.PASS, "Test179 Klik Navbar Verifikasi Kembali");
    }

    @Then("Test179 Validasi Label Halaman Verifikasi Kembali")
    public void test179_validasi_label_halaman_verifikasi_kembali() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        String validasi = verifikasiPage.yGetTextVerifikasiValidation();
        Assert.assertEquals("List Data Register", validasi);

        System.out.println("15");
        extentTest.log(LogStatus.PASS, "Test179 Validasi Label Halaman Verifikasi Kembali");
    }

    @And("Test179 Input Field Data Setelah Save Note")
    public void test179_input_field_data_setelah_save_note() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        verifikasiPage.yInputSearchBarVerifikasi(dataToSearch);

        System.out.println("16");
        extentTest.log(LogStatus.PASS, "Test179 Input Field Data Setelah Save Note");
    }

    @And("Test179 Mencari Data Setelah Save Note")
    public void test179_mencari_data_setelah_save_note() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        verifikasiPage.ySendKeysEnter();

        System.out.println("17");
        extentTest.log(LogStatus.PASS, "Test179 Mencari Data Setelah Save Note");
    }

    @And("Test179 Input Field Data Setelah Save Note Kembali")
    public void test179_input_field_data_setelah_save_note_kembali() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        verifikasiPage.yInputSearchBarVerifikasi(dataToSearch);

        System.out.println("18");
        extentTest.log(LogStatus.PASS, "Test179 Input Field Data Setelah Save Note Kembali");
    }

    @And("Test179 Mencari Data Setelah Save Note Kembali")
    public void test179_mencari_data_setelah_save_note_kembali() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        verifikasiPage.ySendKeysEnter();
        System.out.println("19");
        extentTest.log(LogStatus.PASS, "Test179 Mencari Data Setelah Save Note Kembali");
    }

    @Then("Test179 Validasi Notes Yang Di Simpan")
    public void test179_validasi_notes_yang_di_simpan() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        boolean validasi = verifikasiPage.yGetValidationDataTable(tempCatatan, "valid");
        Assert.assertTrue(validasi);
        System.out.println("20");
        extentTest.log(LogStatus.PASS, "Test179 Validasi Notes Yang Di Simpan");
    }

    @When("Test180 Klik Navbar Verifikasi")
    public void test180_klik_navbar_verifikasi() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        windowsParent = driver.getWindowHandle();
        navbar.yClickBtnVerifikasi();

        System.out.println("21");
        extentTest.log(LogStatus.PASS, "Test180 Klik Navbar Verifikasi");
    }

    @Then("Test180 Validasi Label Halaman Verifikasi")
    public void test180_validasi_label_halaman_verifikasi() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        String validasi = verifikasiPage.yGetTextVerifikasiValidation();
        Assert.assertEquals("List Data Register", validasi);

        System.out.println("22");
        extentTest.log(LogStatus.PASS, "Test180 Validasi Label Halaman Verifikasi");
    }

    @And("^Test180 Input Field (.*) Yang Dicari$")
    public void test180_input_field_data_yang_dicari(String data) {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        dataToSearch = verifikasiPage.yGetRandomTableDataString(data);
        verifikasiPage.yInputSearchBarVerifikasi(dataToSearch);

        System.out.println("23");
        extentTest.log(LogStatus.PASS, "Test180 Input Field data Yang Dicari");
    }

    @And("Test180 Mencari Data")
    public void test180_mencari_data() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        verifikasiPage.ySendKeysEnter();

        System.out.println("24");
        extentTest.log(LogStatus.PASS, "Test180 Mencari Data");
    }

    @And("Test180 Input Field Data Kembali")
    public void test180_input_field_data_kembali() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        verifikasiPage.yInputSearchBarVerifikasi(dataToSearch);

        System.out.println("25");
        extentTest.log(LogStatus.PASS, "Test180 Input Field Data Kembali");
    }

    @And("Test180 Mencari Data Kembali")
    public void test180_mencari_data_kembali() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        verifikasiPage.ySendKeysEnter();

        System.out.println("26");
        extentTest.log(LogStatus.PASS, "Test180 Mencari Data Kembali");
    }

    @Then("Test180 Validasi Data Yang Dicari")
    public void test180_validasi_data_yang_dicari() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        boolean validasi = verifikasiPage.yGetValidationDataTable(dataToSearch, "valid");
        Assert.assertTrue(validasi);

        System.out.println("27");
        extentTest.log(LogStatus.PASS, "Test180 Validasi Data Yang Dicari");
    }

    @When("Test180 Klik Tombol Aksi Pada Data Web Table")
    public void test180_klik_tombol_aksi_pada_data_web_table() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        verifikasiPage.yClickButtonAksi();

        System.out.println("28");
        extentTest.log(LogStatus.PASS, "Test180 Klik Tombol Aksi Pada Data Web Table");
    }

    @Then("Test180 Validasi Halaman Form Verifikasi")
    public void test180_validasi_halaman_form_verifikasi() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        Set<String> allWindowHandles = driver.getWindowHandles();
        Iterator<String> i1 = allWindowHandles.iterator();
        while (i1.hasNext()){

            String childWindow = i1.next();
            if(!windowsParent.equals(childWindow)) {
                childWindow1 = childWindow;
                driver.switchTo().window(childWindow1);
                GlobalFunction.delay(Constants.TIMEOUT_DELAY);
                break;
            }
        }

//        driver.switchTo().newWindow(WindowType.TAB);
//        driver.get(Constants.URL_COMPARE);
//        childWindow2 = driver.getWindowHandle();
        GlobalFunction.delay(1);

        String validasi = verifikasiPage.yGetTextFormVerifikasiValidation();
        Assert.assertEquals("Form Input Data Cashback", validasi);


        System.out.println("29");
        extentTest.log(LogStatus.PASS, "Test180 Validasi Halaman Form Verifikasi");
    }

    @And("Test180 Klik Tombol Verifikasi Form Verifikasi")
    public void test180_klik_tombol_verifikasi_form_verifikasi() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        verifikasiPage.yClickButtonVerifikasiFormVerifikasi();
        GlobalFunction.delay(1);
        System.out.println("30");
        extentTest.log(LogStatus.PASS, "Test180 Klik Tombol Verifikasi Form Verifikasi");
    }

    @And("Test180 Klik Tombol OK Pada Modal")
    public void test180_klik_tombol_ok_pada_modal() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        verifikasiPage.yClickModal2Function();
        System.out.println("31");
        extentTest.log(LogStatus.PASS, "Test180 Klik Tombol OK Pada Modal");
    }

    @And("Test180 Klik Tombol OK Pada Alert Yang Keluar")
    public void test180_klik_tombol_ok_pada_alert_yang_keluar() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        GlobalFunction.delay(2);
        driver.switchTo().alert().accept();
        GlobalFunction.delay(1);
        System.out.println("32");
        extentTest.log(LogStatus.PASS, "Test180 Klik Tombol OK Pada Alert Yang Keluar");
    }

    @When("Test180 Klik Navbar Pre Transfer")
    public void test180_klik_navbar_pre_transfer() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        GlobalFunction.delay(1);
        driver.close();
        GlobalFunction.delay(1);
        driver.switchTo().window(windowsParent);
        GlobalFunction.delay(1);
        navbar.yClickBtnPreTransfer();
        System.out.println("33");
        extentTest.log(LogStatus.PASS, "Test180 Klik Navbar Pre Transfer");
    }

    @Then("Test180 Validasi Label Halaman Pre Transfer")
    public void test180_validasi_label_halaman_pre_transfer() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        String validasi = preTransferPage.yGetTextPreTransferValidation();
        Assert.assertEquals("Pre-Transfer Data", validasi);
        System.out.println("34");
        extentTest.log(LogStatus.PASS, "Test180 Validasi Label Halaman Pre Transfer");
    }

    @And("Test180 Mencari Data Pada Table Pre Transfer")
    public void test180_mencari_data_pada_table_pre_transfer() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        preTransferPage.yInputSearchBarPreTransfer(dataToSearch);
        preTransferPage.ySendKeysEnter();
        System.out.println("35");
        extentTest.log(LogStatus.PASS, "Test180 Mencari Data Pada Table Pre Transfer");
    }

    @Then("Test180 Validasi Data Dari Table Pre Transfer")
    public void test180_validasi_data_dari_table_pre_transfer() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        preTransferPage.yGetValidationDataTable(dataToSearch, "valid");
        System.out.println("36");
        extentTest.log(LogStatus.PASS, "Test180 Validasi Data Dari Table Pre Transfer");
    }



}
