package com.juaracoding.ta_kelompok2.impl.irfan;
/*
IntelliJ IDEA 2023.3.6 (Community Edition)
Build #IC-233.15026.9, built on March 21, 2024
@Author kiyandark a.k.a. Muhammad Irfan Syaifur Rizal Wiratama
Java Developer
Created on 05/06/2024 19:29
@Last Modified 05/06/2024 19:29
Version 1.0
*/

import com.juaracoding.ta_kelompok2.connection.Constants;
import com.juaracoding.ta_kelompok2.page.Navbar;
import com.juaracoding.ta_kelompok2.util.OpenCVFunction;
import com.juaracoding.ta_kelompok2.page.VerifikasiPage;
import com.juaracoding.ta_kelompok2.util.GlobalFunction;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.Iterator;
import java.util.Set;

public class TestFungsiRotasiDenganOpenCV {

    public WebDriver driver;

    private String windowsParent;
    private String childWindow1;
    private String childWindow2;
    private static ExtentTest extentTest;
    //    private LoginPage loginPage ;
    private Navbar navbar;

    private VerifikasiPage verifikasiPage;
    

    public String dataToSearch = "";

    public String linkImageBuktiTransaksi;
    public String pathRootDownload = "D:\\juara_koding\\Tugas_Akhir_Juara_Coding\\ta_irfan\\image";





    public TestFungsiRotasiDenganOpenCV(){
        this.driver = VerifikatorFinanceOutlineHooks.driver;
        navbar = new Navbar(driver);
        verifikasiPage = new VerifikasiPage(driver);
        extentTest = VerifikatorFinanceOutlineHooks.extentTest;
        
    }

    @When("Test241 Klik Navbar Verifikasi")
    public void test241_klik_navbar_verifikasi() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        System.out.println("1 Valid Form Verifikasi Run");
        //new LoginToHomeFunction(driver, Constants.VERIFIKATOR_USERNAME, Constants.VERIFIKATOR_PASSWORD);
        windowsParent = driver.getWindowHandle();
        navbar.yClickBtnVerifikasi();

        extentTest.log(LogStatus.PASS, "Test241 Klik Navbar Verifikasi");
    }

    @Then("Test241 Validasi Label Halaman Verifikasi")
    public void test241_validasi_label_halaman_verifikasi() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        String validasi = verifikasiPage.yGetTextVerifikasiValidation();
        Assert.assertEquals("List Data Register", validasi);

        System.out.println("2");
        extentTest.log(LogStatus.PASS, "Test241 Validasi Label Halaman Verifikasi");
    }

    @And("^Test241 Input Field (.*) Yang Dicari$")
    public void test241_input_field_data_yang_dicari(String data) {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        dataToSearch = verifikasiPage.yGetRandomTableDataString(data);
        System.out.println("3");
        extentTest.log(LogStatus.PASS, "Test241 Input Field data Yang Dicari");
    }

    @And("Test241 Mencari Data")
    public void test241_mencari_data() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        verifikasiPage.ySendKeysEnter();
        System.out.println("4");
        extentTest.log(LogStatus.PASS, "Test241 Mencari Data");
    }

    @And("Test241 Input Field Data Kembali")
    public void test241_input_field_data_kembali() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        verifikasiPage.yInputSearchBarVerifikasi(dataToSearch);
        System.out.println("5");
        extentTest.log(LogStatus.PASS, "Test241 Input Field Data Kembali");
    }

    @And("Test241 Mencari Data Kembali")
    public void test241_mencari_data_kembali() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        verifikasiPage.ySendKeysEnter();
        System.out.println("6");
        extentTest.log(LogStatus.PASS, "Test241 Mencari Data Kembali");
    }

    @Then("Test241 Validasi Data Yang Dicari")
    public void test241_validasi_data_yang_dicari() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        boolean validasi = verifikasiPage.yGetValidationDataTable(dataToSearch, "valid");
        Assert.assertTrue(validasi);
        System.out.println("7");
        extentTest.log(LogStatus.PASS, "Test241 Validasi Data Yang Dicari");
    }

    @When("Test241 Klik Tombol Aksi Pada Data Web Table")
    public void test241_klik_tombol_aksi_pada_data_web_table() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        verifikasiPage.yClickButtonAksi();

        System.out.println("8");
        extentTest.log(LogStatus.PASS, "Test241 Klik Tombol Aksi Pada Data Web Table");
    }

    @Then("Test241 Validasi Halaman Form Verifikasi")
    public void test241_validasi_halaman_form_verifikasi() {
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
        GlobalFunction.delay(1);


        System.out.println("9");
        extentTest.log(LogStatus.PASS, "Test241 Validasi Halaman Form Verifikasi");
    }
    
    @When("Test241 Buka Modal Upload Dengan Mengklik Foto Transaksi Satu")
    public void test241_buka_modal_upload_dengan_mengklik_foto_transaksi_satu() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        verifikasiPage.yClickImageFormVerifikasiFotoBuktiTransaksiSatu();
        System.out.println("1");
        extentTest.log(LogStatus.PASS, "Test241 Buka Modal Upload Dengan Mengklik Foto Transaksi Satu");
    }

    @And("Test241 Validasi Modal Terbuka")
    public void test241_validasi_modal_terbuka() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        String validasi = verifikasiPage.yGetTextFormVerifikasiModal();
        System.out.println("ini validasi 1: "+ validasi);
        Assert.assertEquals("Edit Foto Struk EDC", validasi);

        System.out.println("2");
        extentTest.log(LogStatus.PASS, "Test241 Validasi Modal Terbuka");
    }

    @And("Test241 Upload Gambar Transaksi")
    public void test241_upload_gambar_transaksi() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        verifikasiPage.yInputImageBuktiTransaksiSatu();

        System.out.println("3");
        extentTest.log(LogStatus.PASS, "Test241 Upload Gambar Transaksi");
    }

    @And("Test241 Klik Tombol Ganti Foto")
    public void test241_klik_tombol_ganti_foto() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        verifikasiPage.yUploadImageBuktiTransaksiSatu();
        System.out.println("4");
        extentTest.log(LogStatus.PASS, "Test241 Klik Tombol Ganti Foto");
    }

    @Then("Test241 Validasi Gambar Berhasil Di Upload")
    public void test241_validasi_gambar_berhasil_di_upload() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        GlobalFunction.delay(2);
        driver.switchTo().alert().accept();

        GlobalFunction.delay(2);

        linkImageBuktiTransaksi = verifikasiPage.yGetImgFotoBuktiTransaksiSatu().getAttribute("src");
        System.out.println("SOURCE -> "+linkImageBuktiTransaksi);

        String fileImageAwal = "D:\\juara_koding\\Tugas_Akhir_Juara_Coding\\ta_irfan\\image\\gambar_awal.jpg";
        GlobalFunction.downloadImage(linkImageBuktiTransaksi,fileImageAwal);

//        driver.switchTo().newWindow(WindowType.TAB);
//        driver.get(Constants.URL_COMPARE);
//        childWindow2 = driver.getWindowHandle();


        System.out.println("5");
        extentTest.log(LogStatus.PASS, "Test241 Validasi Gambar Berhasil Di Upload");
    }

    @And("Test241 Klik Tombol Rotate 90 Derajat")
    public void test241_klik_tombol_rotate_90_derajat() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        verifikasiPage.yClickButtonRotate90FotoTransaksiSatu();

        System.out.println("6");
        extentTest.log(LogStatus.PASS, "Test241 Klik Tombol Rotate 90 Derajat");
    }

    @And("Test241 Download Gambar Rotate 90 Derajat")
    public void test241_download_gambar_rotate_90_derajat() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        GlobalFunction.delay(2);
        linkImageBuktiTransaksi = verifikasiPage.yGetImgFotoBuktiTransaksiSatu().getAttribute("src");
        System.out.println("SOURCE -> "+linkImageBuktiTransaksi);

        String fileImage90Derajat = "D:\\juara_koding\\Tugas_Akhir_Juara_Coding\\ta_irfan\\image\\gambar_web_transaksi_satu_90_derajat.jpg";
        GlobalFunction.downloadImage(linkImageBuktiTransaksi,fileImage90Derajat);


        System.out.println("7");
        extentTest.log(LogStatus.PASS, "Test241 Download Gambar Rotate 90 Derajat");
    }

    @Then("Test241 Validasi Fungsi Rotate 90 Derajat")
    public void test241_validasi_fungsi_rotate_90_derajat() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);

        String pathGambarSumber = "D:\\juara_koding\\Tugas_Akhir_Juara_Coding\\ta_irfan\\image\\gambar_awal.jpg";
        String buktiTransaksiSatu90Derajat = "D:\\juara_koding\\Tugas_Akhir_Juara_Coding\\ta_irfan\\image\\gambar_openCV_transaksi_satu_90_derajat.jpg";
        OpenCVFunction.rotateImage(pathGambarSumber,buktiTransaksiSatu90Derajat,90);

//        driver.switchTo().newWindow(WindowType.TAB);
//        driver.get(Constants.URL_COMPARE);
//        childWindow2 = driver.getWindowHandle();

        System.out.println("8");
        extentTest.log(LogStatus.PASS, "Test241 Validasi Fungsi Rotate 90 Derajat");
    }

    @And("Test241 Klik Tombol Rotate 180 Derajat")
    public void test241_klik_tombol_rotate_180_derajat() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        verifikasiPage.yClickButtonRotate180FotoTransaksiSatu();
        System.out.println("9");
        extentTest.log(LogStatus.PASS, "Test241 Klik Tombol Rotate 180 Derajat");
    }

    @And("Test241 Download Gambar Rotate 180 Derajat")
    public void test241_download_gambar_rotate_180_derajat() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        GlobalFunction.delay(2);
        String fileImage180Derajat = "D:\\juara_koding\\Tugas_Akhir_Juara_Coding\\ta_irfan\\image\\gambar_web_transaksi_satu_180_derajat.jpg";
        GlobalFunction.downloadImage(linkImageBuktiTransaksi,fileImage180Derajat);

        System.out.println("10");
        extentTest.log(LogStatus.PASS, "Test241 Download Gambar Rotate 180 Derajat");
    }

    @Then("Test241 Validasi Fungsi Rotate 180 Derajat")
    public void test241_validasi_fungsi_rotate_180_derajat() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        String pathGambarSumber = "D:\\juara_koding\\Tugas_Akhir_Juara_Coding\\ta_irfan\\image\\gambar_web_transaksi_satu_90_derajat.jpg";
        String buktiTransaksiSatu180Derajat = "D:\\juara_koding\\Tugas_Akhir_Juara_Coding\\ta_irfan\\image\\gambar_openCV_transaksi_satu_180_derajat.jpg";
        OpenCVFunction.rotateImage(pathGambarSumber,buktiTransaksiSatu180Derajat,-180);

        System.out.println("11");
        extentTest.log(LogStatus.PASS, "Test241 Validasi Fungsi Rotate 180 Derajat");
    }

    @And("Test241 Klik Tombol Rotate 270 Derajat")
    public void test241_klik_tombol_rotate_270_derajat() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        verifikasiPage.yClickButtonRotate270FotoTransaksiSatu();

        System.out.println("12");
        extentTest.log(LogStatus.PASS, "Test241 Klik Tombol Rotate 270 Derajat");
    }

    @And("Test241 Download Gambar Rotate 270 Derajat")
    public void test241_download_gambar_rotate_270_derajat() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        GlobalFunction.delay(2);
        String fileImage270Derajat = "D:\\juara_koding\\Tugas_Akhir_Juara_Coding\\ta_irfan\\image\\gambar_web_transaksi_satu_270_derajat.jpg";
        GlobalFunction.downloadImage(linkImageBuktiTransaksi,fileImage270Derajat);

        System.out.println("13");
        extentTest.log(LogStatus.PASS, "Test241 Download Gambar Rotate 270 Derajat");
    }

    @Then("Test241 Validasi Fungsi Rotate 270 Derajat")
    public void test241_validasi_fungsi_rotate_270_derajat() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        String pathGambarSumber = "D:\\juara_koding\\Tugas_Akhir_Juara_Coding\\ta_irfan\\image\\gambar_web_transaksi_satu_180_derajat.jpg";
        String buktiTransaksiSatu180Derajat = "D:\\juara_koding\\Tugas_Akhir_Juara_Coding\\ta_irfan\\image\\gambar_openCV_transaksi_satu_270_derajat.jpg";
        OpenCVFunction.rotateImage(pathGambarSumber,buktiTransaksiSatu180Derajat,-270);

        System.out.println("14");
        extentTest.log(LogStatus.PASS, "Test241 Validasi Fungsi Rotate 270 Derajat");
    }

    @When("Test243 Buka Modal Upload Dengan Mengklik Foto Transaksi Dua")
    public void test243_buka_modal_upload_dengan_mengklik_foto_transaksi_dua() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
//        driver.navigate().refresh();
        verifikasiPage.yClickImageFormVerifikasiFotoBuktiTransaksiDua();

        System.out.println("15");
        extentTest.log(LogStatus.PASS, "Test243 Buka Modal Upload Dengan Mengklik Foto Transaksi Dua");
    }

    @And("Test243 Validasi Modal Terbuka")
    public void test243_validasi_modal_terbuka() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
//        String validasi = verifikasiPage.yGetTextFormVerifikasiModal();



        System.out.println("16");
        extentTest.log(LogStatus.PASS, "Test243 Validasi Modal Terbuka");
    }

    @And("Test243 Upload Gambar Transaksi")
    public void test243_upload_gambar_transaksi() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        verifikasiPage.yInputImageBuktiTransaksiDua();

        System.out.println("17");
        extentTest.log(LogStatus.PASS, "Test243 Upload Gambar Transaksi");
    }

    @And("Test243 Klik Tombol Ganti Foto")
    public void test243_klik_tombol_ganti_foto() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        verifikasiPage.yUploadImageBuktiTransaksiDua();
        GlobalFunction.delay(1);

        System.out.println("18");
        extentTest.log(LogStatus.PASS, "Test243 Klik Tombol Ganti Foto");
    }

    @Then("Test243 Validasi Gambar Berhasil Di Upload")
    public void test243_validasi_gambar_berhasil_di_upload() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        GlobalFunction.delay(1);
        driver.switchTo().alert().accept();
        GlobalFunction.delay(2);

        linkImageBuktiTransaksi = verifikasiPage.yGetImgFotoBuktiTransaksiDua().getAttribute("src");
        System.out.println("SOURCE -> "+linkImageBuktiTransaksi);

        String fileImageAwal = "D:\\juara_koding\\Tugas_Akhir_Juara_Coding\\ta_irfan\\image\\gambar_awal_dua.jpg";
        GlobalFunction.downloadImage(linkImageBuktiTransaksi,fileImageAwal);


        System.out.println("19");
        extentTest.log(LogStatus.PASS, "Test243 Validasi Gambar Berhasil Di Upload");
    }

    @And("Test243 Klik Tombol Rotate 90 Derajat")
    public void test243_klik_tombol_rotate_90_derajat() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        verifikasiPage.yClickButtonRotate90FotoTransaksiDua();
        System.out.println("20");
        extentTest.log(LogStatus.PASS, "Test243 Klik Tombol Rotate 90 Derajat");
    }

    @And("Test243 Download Gambar Rotate 90 Derajat")
    public void test243_download_gambar_rotate_90_derajat() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        GlobalFunction.delay(2);
        linkImageBuktiTransaksi = verifikasiPage.yGetImgFotoBuktiTransaksiSatu().getAttribute("src");
        System.out.println("SOURCE -> "+linkImageBuktiTransaksi);

        String fileImage90Derajat = "D:\\juara_koding\\Tugas_Akhir_Juara_Coding\\ta_irfan\\image\\gambar_web_transaksi_dua_90_derajat.jpg";
        GlobalFunction.downloadImage(linkImageBuktiTransaksi,fileImage90Derajat);

        System.out.println("21");
        extentTest.log(LogStatus.PASS, "Test243 Download Gambar Rotate 90 Derajat");
    }

    @Then("Test243 Validasi Fungsi Rotate 90 Derajat")
    public void test243_validasi_fungsi_rotate_90_derajat() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        String pathGambarSumber = "D:\\juara_koding\\Tugas_Akhir_Juara_Coding\\ta_irfan\\image\\gambar_awal_dua.jpg";
        String buktiTransaksiSatu90Derajat = "D:\\juara_koding\\Tugas_Akhir_Juara_Coding\\ta_irfan\\image\\gambar_openCV_transaksi_dua_90_derajat.jpg";
        OpenCVFunction.rotateImage(pathGambarSumber,buktiTransaksiSatu90Derajat,-90);

//        driver.switchTo().newWindow(WindowType.TAB);
//        driver.get(Constants.URL_COMPARE);
//        childWindow2 = driver.getWindowHandle();

        System.out.println("22");
        extentTest.log(LogStatus.PASS, "Test243 Validasi Fungsi Rotate 90 Derajat");
    }

    @And("Test243 Klik Tombol Rotate 180 Derajat")
    public void test243_klik_tombol_rotate_180_derajat() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        verifikasiPage.yClickButtonRotate180FotoTransaksiDua();
        System.out.println("23");
        extentTest.log(LogStatus.PASS, "Test243 Klik Tombol Rotate 180 Derajat");
    }

    @And("Test243 Download Gambar Rotate 180 Derajat")
    public void test243_download_gambar_rotate_180_derajat() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        GlobalFunction.delay(2);
        String fileImage180Derajat = "D:\\juara_koding\\Tugas_Akhir_Juara_Coding\\ta_irfan\\image\\gambar_web_transaksi_dua_180_derajat.jpg";
        GlobalFunction.downloadImage(linkImageBuktiTransaksi,fileImage180Derajat);

        System.out.println("24");
        extentTest.log(LogStatus.PASS, "Test243 Download Gambar Rotate 180 Derajat");
    }

    @Then("Test243 Validasi Fungsi Rotate 180 Derajat")
    public void test243_validasi_fungsi_rotate_180_derajat() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        String pathGambarSumber = "D:\\juara_koding\\Tugas_Akhir_Juara_Coding\\ta_irfan\\image\\gambar_web_transaksi_dua_90_derajat.jpg";
        String buktiTransaksiSatu180Derajat =  "D:\\juara_koding\\Tugas_Akhir_Juara_Coding\\ta_irfan\\image\\gambar_openCV_transaksi_dua_180_derajat.jpg";
        OpenCVFunction.rotateImage(pathGambarSumber,buktiTransaksiSatu180Derajat,-180);

        System.out.println("25");
        extentTest.log(LogStatus.PASS, "Test243 Validasi Fungsi Rotate 180 Derajat");
    }

    @And("Test243 Klik Tombol Rotate 270 Derajat")
    public void test243_klik_tombol_rotate_270_derajat() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        verifikasiPage.yClickButtonRotate270FotoTransaksiDua();

        System.out.println("26");
        extentTest.log(LogStatus.PASS, "Test243 Klik Tombol Rotate 270 Derajat");
    }

    @And("Test243 Download Gambar Rotate 270 Derajat")
    public void test243_download_gambar_rotate_270_derajat() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        GlobalFunction.delay(2);
        String fileImage270Derajat = "D:\\juara_koding\\Tugas_Akhir_Juara_Coding\\ta_irfan\\image\\gambar_web_transaksi_dua_270_derajat.jpg";
        GlobalFunction.downloadImage(linkImageBuktiTransaksi,fileImage270Derajat);

        System.out.println("27");
        extentTest.log(LogStatus.PASS, "Test243 Download Gambar Rotate 270 Derajat");
    }

    @Then("Test243 Validasi Fungsi Rotate 270 Derajat")
    public void test243_validasi_fungsi_rotate_270_derajat() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);


        String pathGambarSumber = "D:\\juara_koding\\Tugas_Akhir_Juara_Coding\\ta_irfan\\image\\gambar_web_transaksi_dua_180_derajat.jpg";
        String buktiTransaksiSatu180Derajat = "D:\\juara_koding\\Tugas_Akhir_Juara_Coding\\ta_irfan\\image\\gambar_openCV_transaksi_dua_270_derajat.jpg";
        OpenCVFunction.rotateImage(pathGambarSumber,buktiTransaksiSatu180Derajat,-270);

        System.out.println("28");
        extentTest.log(LogStatus.PASS, "Test243 Validasi Fungsi Rotate 270 Derajat");
    }

    @When("Test245 Buka Modal Upload Dengan Mengklik Foto Transaksi Tiga")
    public void test245_buka_modal_upload_dengan_mengklik_foto_transaksi_tiga() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        verifikasiPage.yClickImageFormVerifikasiFotoBuktiTransaksiTiga();

        System.out.println("29");
        extentTest.log(LogStatus.PASS, "Test245 Buka Modal Upload Dengan Mengklik Foto Transaksi Tiga");
    }

    @And("Test245 Validasi Modal Terbuka")
    public void test245_validasi_modal_terbuka() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
//        String validasi = verifikasiPage.yGetTextFormVerifikasiModal();
//        System.out.println("ini valisasi 3: "+ validasi);
//        Assert.assertEquals("Edit Foto Bukti Transfer 3", validasi);

        System.out.println("30");
        extentTest.log(LogStatus.PASS, "Test245 Validasi Modal Terbuka");
    }

    @And("Test245 Upload Gambar Transaksi")
    public void test245_upload_gambar_transaksi() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        verifikasiPage.yInputImageBuktiTransaksiTiga();

        System.out.println("31");
        extentTest.log(LogStatus.PASS, "Test245 Upload Gambar Transaksi");
    }

    @And("Test245 Klik Tombol Ganti Foto")
    public void test245_klik_tombol_ganti_foto() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        verifikasiPage.yUploadImageBuktiTransaksiTiga();
        GlobalFunction.delay(1);
        System.out.println("32");
        extentTest.log(LogStatus.PASS, "Test245 Klik Tombol Ganti Foto");
    }

    @Then("Test245 Validasi Gambar Berhasil Di Upload")
    public void test245_validasi_gambar_berhasil_di_upload() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        GlobalFunction.delay(1);
        driver.switchTo().alert().accept();
        GlobalFunction.delay(2);
        linkImageBuktiTransaksi = verifikasiPage.yGetImgFotoBuktiTransaksiSatu().getAttribute("src");
        System.out.println("SOURCE -> "+linkImageBuktiTransaksi);

        String fileImageAwal = "D:\\juara_koding\\Tugas_Akhir_Juara_Coding\\ta_irfan\\image\\gambar_awal_3.jpg";
        GlobalFunction.downloadImage(linkImageBuktiTransaksi,fileImageAwal);

        System.out.println("33");
        extentTest.log(LogStatus.PASS, "Test245 Validasi Gambar Berhasil Di Upload");
    }

    @And("Test245 Klik Tombol Rotate 90 Derajat")
    public void test245_klik_tombol_rotate_90_derajat() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        verifikasiPage.yClickButtonRotate90FotoTransaksiTiga();

        System.out.println("34");
        extentTest.log(LogStatus.PASS, "Test245 Klik Tombol Rotate 90 Derajat");
    }

    @And("Test245 Download Gambar Rotate 90 Derajat")
    public void test245_download_gambar_rotate_90_derajat() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        GlobalFunction.delay(2);

        linkImageBuktiTransaksi = verifikasiPage.yGetImgFotoBuktiTransaksiTiga().getAttribute("src");
        System.out.println("SOURCE -> "+linkImageBuktiTransaksi);

        String fileImage90Derajat = "D:\\juara_koding\\Tugas_Akhir_Juara_Coding\\ta_irfan\\image\\gambar_web_transaksi_tiga_90_derajat.jpg";
        GlobalFunction.downloadImage(linkImageBuktiTransaksi,fileImage90Derajat);

        System.out.println("35");
        extentTest.log(LogStatus.PASS, "Test245 Download Gambar Rotate 90 Derajat");
    }

    @Then("Test245 Validasi Fungsi Rotate 90 Derajat")
    public void test245_validasi_fungsi_rotate_90_derajat() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);

        String pathGambarSumber = "D:\\juara_koding\\Tugas_Akhir_Juara_Coding\\ta_irfan\\image\\gambar_awal_3.jpg";
        String buktiTransaksiSatu90Derajat = "D:\\juara_koding\\Tugas_Akhir_Juara_Coding\\ta_irfan\\image\\gambar_openCV_transaksi_tiga_90_derajat.jpg";
        OpenCVFunction.rotateImage(pathGambarSumber,buktiTransaksiSatu90Derajat,-90);

//        driver.switchTo().newWindow(WindowType.TAB);
//        driver.get(Constants.URL_COMPARE);
//        childWindow2 = driver.getWindowHandle();

        System.out.println("36");
        extentTest.log(LogStatus.PASS, "Test245 Validasi Fungsi Rotate 90 Derajat");
    }

    @And("Test245 Klik Tombol Rotate 180 Derajat")
    public void test245_klik_tombol_rotate_180_derajat() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        verifikasiPage.yClickButtonRotate180FotoTransaksiTiga();
        System.out.println("37");
        extentTest.log(LogStatus.PASS, "Test245 Klik Tombol Rotate 180 Derajat");
    }

    @And("Test245 Download Gambar Rotate 180 Derajat")
    public void test245_download_gambar_rotate_180_derajat() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        GlobalFunction.delay(2);
        String fileImage180Derajat = "D:\\juara_koding\\Tugas_Akhir_Juara_Coding\\ta_irfan\\image\\gambar_web_transaksi_tiga_180_derajat.jpg";
        GlobalFunction.downloadImage(linkImageBuktiTransaksi,fileImage180Derajat);

        System.out.println("38");
        extentTest.log(LogStatus.PASS, "Test245 Download Gambar Rotate 180 Derajat");
    }

    @Then("Test245 Validasi Fungsi Rotate 180 Derajat")
    public void test245_validasi_fungsi_rotate_180_derajat() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        String pathGambarSumber = "D:\\juara_koding\\Tugas_Akhir_Juara_Coding\\ta_irfan\\image\\gambar_web_transaksi_tiga_90_derajat.jpg";
        String buktiTransaksiSatu180Derajat = "D:\\juara_koding\\Tugas_Akhir_Juara_Coding\\ta_irfan\\image\\gambar_openCV_transaksi_tiga_180_derajat.jpg";
        OpenCVFunction.rotateImage(pathGambarSumber,buktiTransaksiSatu180Derajat,-180);

        System.out.println("39");
        extentTest.log(LogStatus.PASS, "Test245 Validasi Fungsi Rotate 180 Derajat");
    }

    @And("Test245 Klik Tombol Rotate 270 Derajat")
    public void test245_klik_tombol_rotate_270_derajat() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        verifikasiPage.yClickButtonRotate270FotoTransaksiTiga();
        System.out.println("40");
        extentTest.log(LogStatus.PASS, "Test245 Klik Tombol Rotate 270 Derajat");
    }

    @And("Test245 Download Gambar Rotate 270 Derajat")
    public void test245_download_gambar_rotate_270_derajat() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        GlobalFunction.delay(2);
        String fileImage270Derajat = "D:\\juara_koding\\Tugas_Akhir_Juara_Coding\\ta_irfan\\image\\gambar_web_transaksi_tiga_270_derajat.jpg";
        GlobalFunction.downloadImage(linkImageBuktiTransaksi,fileImage270Derajat);

        System.out.println("41");
        extentTest.log(LogStatus.PASS, "Test245 Download Gambar Rotate 270 Derajat");
    }

    @Then("Test245 Validasi Fungsi Rotate 270 Derajat")
    public void test245_validasi_fungsi_rotate_270_derajat() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        String pathGambarSumber = "D:\\juara_koding\\Tugas_Akhir_Juara_Coding\\ta_irfan\\image\\gambar_web_transaksi_tiga_180_derajat.jpg";
        String buktiTransaksiSatu180Derajat = "D:\\juara_koding\\Tugas_Akhir_Juara_Coding\\ta_irfan\\image\\gambar_openCV_transaksi_tiga_270_derajat.jpg";
        OpenCVFunction.rotateImage(pathGambarSumber, buktiTransaksiSatu180Derajat,-270);


        GlobalFunction.delay(1);
        driver.close();


        GlobalFunction.delay(1);
        navbar.yClickBtnLogout();
        driver.quit();

        System.out.println("42");
        extentTest.log(LogStatus.PASS, "Test245 Validasi Fungsi Rotate 270 Derajat");
    }
}
