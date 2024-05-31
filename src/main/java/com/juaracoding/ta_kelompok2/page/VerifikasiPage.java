package com.juaracoding.ta_kelompok2.page;
/*
IntelliJ IDEA 2023.3.6 (Community Edition)
Build #IC-233.15026.9, built on March 21, 2024
@Author kiyandark a.k.a. Muhammad Irfan Syaifur Rizal Wiratama
Java Developer
Created on 24/05/2024 10:55
@Last Modified 24/05/2024 10:55
Version 1.0
*/

import com.juaracoding.ta_kelompok2.connection.Constants;
import com.juaracoding.ta_kelompok2.connection.DriverSingleton;
import com.juaracoding.ta_kelompok2.util.GlobalFunction;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

public class VerifikasiPage {
    WebDriver driver;

    /** start - webelement verifikasi page, List Data Register*/
    @FindBy(xpath = "//h1[normalize-space()='List Data Register']")
    private WebElement textVerifikasiPageTitle;

    @FindBy(xpath = "//a[contains(text(),'Dashboard')]")
    private WebElement linkVerifikasiToHome;

    @FindBy(xpath = "//li[@class='breadcrumb-item active']")
    private WebElement textVerifikasiCrumbs;

    @FindBy(xpath = "//h3[@class='card-title']")
    private WebElement textVerifikasiTableHeaderListDataRegister;

    @FindBy(id = "table")
    private WebElement idVerifikasiWebTable;

    @FindBy(xpath = "//label[contains(text(),'Show')]")
    private WebElement textVerifikasiLabelShowEntries;

    @FindBy(xpath = "//select[@name='table_length']")
    private WebElement selectVerifikasiEntriesPerPage;

    @FindBy(xpath = "//label[normalize-space()='Search:']")
    private WebElement textVerifikasiSearchTextField;

    @FindBy(xpath = "//input[@class='form-control form-control-sm']")
    private WebElement textFieldVerifikasiSearchBar;

    @FindBy(xpath = "//th[normalize-space()='No']")
    private WebElement textVerifikasiKolomTableNo;

    @FindBy(xpath = "//th[normalize-space()='Nama Customer']")
    private WebElement textVerifikasiKolomTableNamaCustomer;

    @FindBy(xpath = "//th[normalize-space()='Nomor Handphone']")
    private WebElement textVerifikasiKolomTableNomorHandphone;

    @FindBy(xpath = "//th[normalize-space()='Nama Merchant']")
    private WebElement textVerifikasiKolomTableNamaMerchant;

    @FindBy(xpath = "//th[normalize-space()='RRN']")
    private WebElement textVerifikasiKolomTableRRN;

    @FindBy(xpath = "//th[normalize-space()='Reference ID']")
    private WebElement textVerifikasiKolomTableReferenceID;

    @FindBy(xpath = "//th[normalize-space()='Nominal Transaksi']")
    private WebElement textVerifikasiKolomTableNominalTransaksi;

    @FindBy(xpath = "//th[normalize-space()='Nominal Cashback']")
    private WebElement textVerifikasiKolomTableNominalCashback;

    @FindBy(xpath = "//th[normalize-space()='Nama Sales']")
    private WebElement textVerifikasiKolomTableNamaSales;

    @FindBy(xpath = "//th[normalize-space()='Note']")
    private WebElement textVerifikasiKolomTableNote;

    @FindBy(xpath = "//th[normalize-space()='Aksi']")
    private WebElement textVerfikasiKolomTableAksi;

    @FindBy(xpath = "//i[@class='fa fa-eye']")
    private WebElement btnVerifikasiAksi;

//    @FindBy(xpath = "//td[@class='dataTables_empty']")
//    private WebElement textRegisterDataTableEmpty;

    @FindBy(xpath = "//div[@id='table_info']")
    private WebElement textVerifikasiDataTableEntriesInfo;

    @FindBy(xpath = "//li[@id='table_previous']")
    private WebElement btnVerifikasiDataTablePreviousUnactive;

    /**
     * untuk nomor per pages table blm masuk
     */

    @FindBy(xpath = "//a[normalize-space()='Previous']")
    private WebElement btnVerifikasiDataTablePreviousActive;

    @FindBy(xpath = "//li[@id='table_next']")
    private WebElement btnVerifikasiDataTableNextUnactive;

    @FindBy(xpath = "//a[normalize-space()='Next']")
    private WebElement btnVerifikasiDataTableNextActive;


    /** end - webelement verifikasi page, List Data Register*/

    /** start - Webelement Form Verifikasi Penukaran Voucher*/
    @FindBy(xpath = "//h1[normalize-space()='Form Input Data Cashback']")
    private WebElement  textFormPageTitle;

    @FindBy(xpath = "//h3[normalize-space()='Form Verifikasi Penukaran Voucher']")
    private WebElement textFormTableHeaderFormVerifikasiPenukaranVoucher;

    @FindBy(xpath = "//label[@for='Customer_Name']")
    private WebElement textFormNamaNasabah;

    @FindBy(xpath = "//label[@for='Customer_Name']//code[contains(text(),'*')]")
    private WebElement iconFormNamaNasabah;

    @FindBy(xpath = "//input[@id='Customer_Name']")
    private WebElement textFieldFormNamaNasabah;

    @FindBy(xpath = "//div[@class='col-md-8']//div[3]//label[1]")
    private WebElement textFormNomorHandphone;

    @FindBy(xpath = "//div[3]//label[1]//code[1]")
    private WebElement iconFormNomorHandphone;

    @FindBy(xpath = "//input[@id='Phone_Number']")
    private WebElement textFieldFormNomorHandphone;

    @FindBy(xpath = "//div[@class='col-md-8']//div[4]//label[1]")
    private WebElement textFormNomorRekening;

    @FindBy(xpath = "//div[4]//label[1]//code[1]")
    private WebElement iconFormNomorRekening;

    @FindBy(xpath = "//input[@id='No_Rek_bca']")
    private WebElement textFieldFormNomorRekening;

    @FindBy(xpath = "//label[@for='Qris_Pay']")
    private WebElement textFormQrisPay;

    @FindBy(xpath = "//label[@for='Qris_Pay']//code[contains(text(),'*')]")
    private WebElement iconFormQrisPay;

    @FindBy(xpath = "//select[@id='Qris_Pay']")
    private WebElement selectFormQrisPay;

    private WebElement optionFormQrisPayEmpty;

    private WebElement optionFormQrisPayMyBca;

    private WebElement optionFormQrisPayBCAMobile;

    @FindBy(xpath = "//label[@for='Amount']")
    private WebElement textFormNominalTransaksi;

    @FindBy(xpath = "//label[@for='Amount']//code[contains(text(),'*')]")
    private WebElement iconFormNominalTransaksi;

    @FindBy(xpath = "//input[@id='Amount']")
    private WebElement textFieldFormNominalTransaksi;

    @FindBy(xpath = "//label[@for='Amount_cashback']")
    private WebElement textFormNominalCashback;

    @FindBy(xpath = "//label[@for='Amount_cashback']//code[contains(text(),'*')]")
    private WebElement iconFormNominalCashback;

    @FindBy(xpath = "//input[@id='Amount_cashback']")
    private WebElement textFieldFormNominalCashback;

    @FindBy(xpath = "//label[@for='Transaction_Date']")
    private WebElement textFormTanggalTransaksi;

    @FindBy(xpath = "//label[@for='Transaction_Date']//code[contains(text(),'*')]")
    private WebElement iconFormTanggalTransaksi;

    @FindBy(xpath = "//input[@id='Transaction_Date']")
    private WebElement dateFormTanggalTransaksi;

    @FindBy(xpath = "//label[@for='Merchant_Name']")
    private WebElement textFormNamaMerchant;

    @FindBy(xpath = "//label[@for='Merchant_Name']//code[contains(text(),'*')]")
    private WebElement iconFormNamaMerchant;

    @FindBy(xpath = "//select[@id='Merchant_Name']")
    private WebElement selectFormNamaMerchant;

//    private WebElement selectFormNamaMerchantEmpty;
//
//    private WebElement optionFormNamaMerchantSOCIOLLA;


    @FindBy(xpath = "//label[@for='RRN']")
    private WebElement textFormRRN;

    @FindBy(xpath = "//label[@for='RRN']//code[contains(text(),'*')]")
    private WebElement iconFormRRN;

    @FindBy(xpath = "//input[@id='RRN']")
    private WebElement textFieldFormRRN;

    /** end - Webelement Form Verifikasi Penukaran Voucher*/

    /** start - Webelement Form Verifikasi Foto*/

    @FindBy(xpath = "//h3[normalize-space()='Foto']")
    private  WebElement textFormTableHeaderFoto;

    @FindBy(xpath = "//label[@for='Foto_Struk_EDC']")
    private  WebElement textFormFotoBuktiTransaksiSatu;

    @FindBy(xpath = "//label[@for='Foto_Struk_EDC']//code[contains(text(),'*')]")
    private WebElement iconFormFotoBuktiTransaksiSatu;

    @FindBy(xpath = "//div[@id='div-Foto_Struk_EDC']//img")
    private  WebElement imgFormFotoBuktiTransaksiSatu;

    @FindBy(xpath = "//div[@id='div-Foto_Struk_EDC']//a[1]")
    private  WebElement btnFormRotate90FotoBuktiTransaksiSatu;

    @FindBy(xpath = "//div[@id='div-Foto_Struk_EDC']//a[2]")
    private  WebElement btnFormRotate180FotoBuktiTransaksiSatu;

    @FindBy(xpath = "//div[@id='div-Foto_Struk_EDC']//a[3]")
    private  WebElement btnFormRotate270FotoBuktiTransaksiSatu;

    @FindBy(xpath = "//label[normalize-space()='Foto Bukti Transaksi 2']")
    private  WebElement textFormFotoBuktiTransaksiDua;

    @FindBy(xpath = "//form[@id='rotate_form1']//img")
    private  WebElement imgFormFotoBuktiTransaksiDua;

    @FindBy(xpath = "//form[@id='rotate_form1']//a[1]")
    private  WebElement btnFormRotate90FotoBuktiTransaksiDua;

    @FindBy(xpath = "//form[@id='rotate_form1']//a[2]")
    private  WebElement btnFormRotate180FotoBuktiTransaksiDua;

    @FindBy(xpath = "//form[@id='rotate_form1']//a[3]")
    private  WebElement btnFormRotate270FotoBuktiTransaksiDua;

    @FindBy(xpath = "//label[normalize-space()='Foto Bukti Transaksi 3']")
    private  WebElement textFormFotoBuktiTransaksiTiga;

    @FindBy(xpath = "//form[@id='rotate_form2']//img")
    private  WebElement imgFormFotoBuktiTransaksiTiga;

    @FindBy(xpath = "//form[@id='rotate_form2']//a[1]")
    private  WebElement btnFormRotate90FotoBuktiTransaksiTiga;

    @FindBy(xpath = "//form[@id='rotate_form2']//a[2]")
    private  WebElement btnFormRotate180FotoBuktiTransaksiTiga;

    @FindBy(xpath = "//form[@id='rotate_form2']//a[3]")
    private  WebElement btnFormRotate270FotoBuktiTransaksiTiga;

    @FindBy(xpath = "//label[@for='Note']")
    private WebElement textFormNote;

    @FindBy(xpath = "//textarea[@id='Note']")
    private WebElement textFieldFormNote;

    @FindBy(xpath = "//span[@class='fa fa-pencil-alt']")
    private WebElement btnFormEdit;

    @FindBy(xpath = "//button[@id='btnVerifikasi']")
    private WebElement btnFormVerifikasi;

    @FindBy(xpath = "//button[@id='btnNote']")
    private WebElement btnFormSaveNote;



    /**
     * Modal
     */
    @FindBy(id = "modalimgLabel")
    private  WebElement textFormModalTitle;

    @FindBy(css = "close")
    private  WebElement btnModalCloseModal;

    @FindBy(id = "previewing_edc")
    private WebElement imgModalPreviewFotoBuktiTransaksiSatu;

    @FindBy(id = "imgInp_edc")
    private WebElement btnModalUploadFotoBuktiTransaksiSatu;

    @FindBy(id = "btnupload")
    private WebElement btnModalSaveFotoBuktiTransaksiSatu;

    @FindBy(id = "previewing")
    private WebElement imgModalPreviewFotoBuktiTransaksiDua;

    @FindBy(id = "imgInp")
    private WebElement btnModalUploadFotoBuktiTransaksiDua;

    @FindBy(id = "btnupload2")
    private WebElement btnModalSaveFotoBuktiTransaksiDua;

    @FindBy(id = "previewing_3")
    private WebElement imgModalPreviewFotoBuktiTransaksiTiga;

    @FindBy(id = "imgInp3")
    private WebElement btnModalUploadFotoBuktiTransaksiTiga;

    @FindBy(id = "btnupload3")
    private WebElement btnModalSaveFotoBuktiTransaksiTiga;

    public VerifikasiPage(WebDriver driver){
        this.driver= DriverSingleton.getDriver();
        PageFactory.initElements(this.driver,this);
    }

    /**
     * start - Fungsi Web Table Verifikasi
     * Made By Irfan
     * @throws IllegalStateException
     */

    public String yGetRandomTableDataString(String dataToGet) {
        List<String> tableData = new ArrayList<>();

        int getData = 0;
        switch (dataToGet){

            case "Nama Customer":
                getData = 1;
                break;
            case "Nomor Handphone":
                getData = 2;
                break;
            case "RRN":
                getData = 4;
                break;
            case "Reference ID":
                getData = 5;
                break;
        }

        // Improved XPath for table with dynamic row count
        List<WebElement> allRows = driver.findElements(By.xpath("//table[@id='table']//tbody/tr"));

        for (WebElement row : allRows) {
            List<WebElement> cells = row.findElements(By.tagName("td"));
            if (cells.size() >= 2) {  // Check if there are at least 2 columns
                tableData.add(cells.get(getData).getText().trim());
            }
        }

        if (tableData.isEmpty()) {
            throw new RuntimeException("No data found in the second column of the table.");
        }

        // Generate a random index within the list bounds
        Random random = new Random();
        int randomIndex = random.nextInt(tableData.size());
//
//        System.out.println("ini row");
//
//        for (WebElement ele:allRows)
//        {
//            String value = ele.getText();
//            System.out.println(value);
//        }
//
//        System.out.println("ini tabledata" + tableData.get(randomIndex));
//        System.out.println("Extracted data from the second column:");
//        for (String data : tableData) {
//            System.out.println(data);
//        }
        return tableData.get(randomIndex);
    }

    public boolean yGetValidationDataTable(String dataToGet) {
        // Improved XPath for table with dynamic row count
        List<WebElement> allData = driver.findElements(By.xpath("//table[@id='table']//td"));

        boolean dataStatus = false;
        for (WebElement data : allData) {
            String value = data.getText();
            System.out.println(value);
            if (value.contains(dataToGet))
            {
                dataStatus = true;
                break;
            }
        }

        return dataStatus;
    }

    public void ySearchDataTableVerifikasi(String dataToSearch)
    {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        try
        {
            new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                    .until(ExpectedConditions.visibilityOf(textFieldVerifikasiSearchBar))
                    .sendKeys(dataToSearch, Keys.ENTER);
        }
        catch (Exception e)
        {
            System.out.println("Komponen Text Field SearchBar Tidak Ditemukan !!");
        }
    }

    public void ySelectOptionVerifikasiEntries(String selected) throws IllegalStateException {
//        List<WebElement> options = new Select(selectVerifikasiEntriesPerPage).getOptions();
//        WebElement desiredOption = options.stream()
//                .filter(option -> option.getAttribute("value").equals("100"))
//                .findFirst()
//                .orElseThrow(() -> new IllegalStateException("100 option not found"));
//
//        desiredOption.click();
        Select select = new Select(selectVerifikasiEntriesPerPage);
        select.selectByValue(selected);
//
//        if (selected.equals("10")) {
//            select.selectByValue("10");
//        } else if (selected.equals("25")) {
//            select.selectByValue("25");
//        } else if (selected.equals("50")) {
//            select.selectByValue("50");
//        }else if (selected.equals("100")) {
//            select.selectByValue("100");
//        }
    }

    public int yGetDataTableRowTotal() {
        int rowCount = driver.findElements(By.xpath("//table[@id=\"table\"]//tbody/tr")).size();

        return rowCount;
    }

    public void yClickBtnVerifikasiAksi()
    {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        try
        {
            new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                    .until(ExpectedConditions.visibilityOf(btnVerifikasiAksi)).click();
        }
        catch (Exception e)
        {
            System.out.println("Komponen Tombol Login Submit Tidak Ditemukan !!");
        }
    }

    public String yGetTextVerifikasiFormValidation()
    {
        return this.textFormPageTitle == null ? "" : new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(textFormPageTitle)).getText();
    }



    public String yGetTextVerifikasiValidation()
    {

        return textVerifikasiPageTitle==null?"":new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(textVerifikasiPageTitle)).getText();
    }

    public void ySelectOptionVerifikasiFormQrisPay(String selected) throws IllegalStateException {
        Select select = new Select(selectFormQrisPay);
        select.selectByValue(selected);
    }

    public void ySelectOptionVerifikasiFormNamaMerchant(String selected) throws IllegalStateException {
        Select select = new Select(selectFormNamaMerchant);
        select.selectByValue(selected);
    }



    /**
     * end - Fungsi Web Table Verifikasi
     * Made By Irfan
     * @throws IllegalStateException
     */





}
