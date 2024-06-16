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
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.*;

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

    @FindBy(xpath = "//td[@class='dataTables_empty']")
    private WebElement textVerifikasiDataTableEmpty;

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

    @FindBy(xpath = "//button[@id='btnUpdate']")
    private  WebElement btnFormSimpan;

    @FindBy(xpath = "//button[@id='btnCancelUpdate']")
    private WebElement btnFormCancel;

    @FindBy(xpath = "//button[@id='btnVerifikasi']")
    private WebElement btnFormVerifikasi;

    @FindBy(css = "button.btn.btn-primary.confirm[disabled]")
    private WebElement btnDisabledFormVerifikasi;

    @FindBy(xpath = "//button[@id='btnNote']")
    private WebElement btnFormSaveNote;
    @FindBy(css = "button.btn.btn-warning.note[disabled='']")
    private WebElement btnDisabledFormSaveNote;

    @FindBy(xpath = "/html/body/div[1]/div/div/div[3]/button[1]")
    private WebElement btnModal2Submit;



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

    public List yGetAllDataTableData(){


        List<String> allTableData = new ArrayList<>();
        int startIndex = 1;
        int endIndex = 6;

        List<WebElement> rows = idVerifikasiWebTable.findElements(By.tagName("tr"));
        for (WebElement row : rows) {
            List<WebElement> cells = row.findElements(By.tagName("td"));
            if (cells.size() >= endIndex) {
                for (int i = startIndex; i < endIndex; i++) {
                    WebElement cell = cells.get(i);
                    String cellText = cell.getText();
                    allTableData.add(cellText);
                }
            } else {
                // Handle scenario where row has less than expected cells (optional)
                System.out.println("Row with insufficient cells found. Skipping...");
            }
        }
        return allTableData;
    }

    public boolean yGetAllDataTableDataCompare(List allTableData)
    {
        List<WebElement> rows = idVerifikasiWebTable.findElements(By.tagName("tr"));
        int i = 0;
        int startIndex = 2;
        int endIndex = 6;
        for (WebElement row : rows) {
            List<WebElement> cells = row.findElements(By.tagName("td"));
                if (cells.size() >= endIndex) {
                    for (int j = startIndex; j < endIndex; j++) {
                        WebElement cell = cells.get(j);
                        String currentCellText = cell.getText();
                        //System.out.println("perbandingan data: " + allTableData.get(i) + " dengan " + currentCellText);
                        if (!allTableData.get(i).equals(currentCellText)) {
                            System.out.println("Validation failed! Expected: " + allTableData.get(i) + ", Actual: " + currentCellText);
                            return false;

                        }
                        i++;

                    }

                } else {
                    // Handle scenario where row has less than expected cells (optional)
                    System.out.println("Row with insufficient cells found. Skipping...");
                }
            break;

        }
        System.out.println("masuk true");
        return true;
    }

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

        return tableData.get(randomIndex);
    }

    public boolean yGetValidationDataTable(String dataTovalidate, String process) {
        // Improved XPath for table with dynamic row count
        List<WebElement> allData = driver.findElements(By.xpath("//table[@id='table']//td"));

        boolean dataStatus = false;
        if (process == "valid" || process == "partial") {
            for (WebElement data : allData) {
                String value = data.getText();
                //System.out.println("process " + process + " value: " + value + "data to validat: " + dataTovalidate);
                if (value.contains(dataTovalidate)) {
                    System.out.println("found " + process + " value: " + value + "data to validat: " + dataTovalidate);
                    dataStatus = true;
                    break;
                }
            }
        } else if (process == "inconsistent") {
            for (WebElement data : allData) {
                String value = data.getText();
                //System.out.println("process " + process + " value: " + value + "data to validat: " + dataTovalidate);
                if (value.toLowerCase().contains(dataTovalidate.toLowerCase())) {
                    System.out.println("Found " + process + " value: " + value + "data to validat: " + dataTovalidate);
                    dataStatus = true;
                    break;
                }
            }
        }
        return dataStatus;
    }

    public String yGetInconsistentCase(String dataToGet) {
        StringBuilder inconsistentData = new StringBuilder();
        for (int i = 0; i < dataToGet.length(); i++) {
            char character = dataToGet.charAt(i);
            if (Character.isLetter(character)) {
                if (i % 2 == 0) {
                    inconsistentData.append(Character.toUpperCase(character));
                } else {
                    inconsistentData.append(Character.toLowerCase(character));
                }
            } else {
                // Append non-letters (spaces) directly
                inconsistentData.append(character);
            }
        }
        return inconsistentData.toString();
    }

    public String yGetPartialMatch(String dataToGet){
        if (dataToGet == null || dataToGet.isEmpty()) {
            return ""; // Handle empty data gracefully
        }
        int halfLength = dataToGet.length() / 2;
        return dataToGet.substring(halfLength, dataToGet.length());
    }


    public void yInputSearchBarVerifikasi(String dataToSearch)
    {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        try
        {
            new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                    .until(ExpectedConditions.visibilityOf(textFieldVerifikasiSearchBar))
                    .sendKeys(dataToSearch);
        }
        catch (Exception e)
        {
            System.out.println("Komponen Text Field SearchBar Tidak Ditemukan !!");
        }
    }

    public void ySendKeysEnter() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        try
        {
            new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                    .until(ExpectedConditions.visibilityOf(textFieldVerifikasiSearchBar))
                    .sendKeys(Keys.ENTER);
        }
        catch (Exception e)
        {
            System.out.println("Komponen Text Field SearchBar Tidak Ditemukan !!");
        }
    }

    public int ySelectOptionVerifikasiEntries(String selected) throws IllegalStateException {
//        List<WebElement> options = new Select(selectVerifikasiEntriesPerPage).getOptions();
//        WebElement desiredOption = options.stream()
//                .filter(option -> option.getAttribute("value").equals("100"))
//                .findFirst()
//                .orElseThrow(() -> new IllegalStateException("100 option not found"));
//
//        desiredOption.click();
        Select select = new Select(selectVerifikasiEntriesPerPage);
        select.selectByValue(selected);

        int validation = 0;
        if (selected.equals("10")) {
            validation = 10;
        } else if (selected.equals("25")) {
            validation = 25;
        } else if (selected.equals("50")) {
            validation = 50;
        }else if (selected.equals("100")) {
            validation = 100;
        }

        return validation;
    }

    public int yGetDataTableRowTotal() {
        int rowCount = driver.findElements(By.xpath("//table[@id=\"table\"]//tbody/tr")).size();

        return rowCount;
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
    public String yGetTextVerifikasiValidationNoData()
    {

        return textVerifikasiDataTableEmpty==null?"":new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(textVerifikasiDataTableEmpty)).getText();
    }

    /**
     * end - Fungsi Web Table Verifikasi
     * Made By Irfan
     * @throws IllegalStateException
     */



    /**
     * Fungsi Form Verifikasi
     *
     */

    public void yClickButtonAksi()
    {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        try
        {
            new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                    .until(ExpectedConditions.visibilityOf(btnVerifikasiAksi)).click();
        }
        catch (Exception e)
        {
            System.out.println("Komponen Tombol Aksi Table Verifikasi Tidak Ditemukan !!");
        }
    }

    public void yClearFormVerifikasi()
    {


        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        try
        {
            /** Set Field Password Empty String */
            new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                    .until(ExpectedConditions.visibilityOf(textFieldFormNamaNasabah)).clear();
            /** Set Field Username Empty String */
            new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                    .until(ExpectedConditions.visibilityOf(textFieldFormNomorHandphone)).clear();
            /** Set Field Username Empty String */
            new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                    .until(ExpectedConditions.visibilityOf(textFieldFormNomorRekening)).clear();
            /** Set Field Username Empty String */
            new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                    .until(ExpectedConditions.visibilityOf(textFieldFormNominalTransaksi)).clear();
            /** Set Field Username Empty String */
            new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                    .until(ExpectedConditions.visibilityOf(dateFormTanggalTransaksi)).clear();
            /** Set Field Username Empty String */

            /** Set Field Username Empty String */
            new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                    .until(ExpectedConditions.visibilityOf(textFieldFormRRN)).clear();

            Select selectQRIS = new Select(selectFormQrisPay);
            selectQRIS.selectByValue("");

            Select selectMerchant = new Select(selectFormNamaMerchant);
            selectMerchant.selectByValue("");


        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

    public void yInputTextFieldNamaNasabah(String namaNasabah)
    {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        try{
            new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                    .until(ExpectedConditions.visibilityOf(textFieldFormNamaNasabah)).sendKeys(namaNasabah);
        }catch (Exception e){
            System.out.println("Komponen Text Field Input Nama Nasabah Tidak Ditemukan !!");
        }
    }

    public void yInputTextFieldNomorHandphone(String nomorHandphone)
    {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        try{
            new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                    .until(ExpectedConditions.visibilityOf(textFieldFormNomorHandphone)).sendKeys(nomorHandphone);
        }catch (Exception e){
            System.out.println("Komponen Text Field Input Nomor Handphone Tidak Ditemukan !!");
        }
    }

    public void yInputTextFieldNomorRekening(String nomorRekening)
    {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        try{
            new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                    .until(ExpectedConditions.visibilityOf(textFieldFormNomorRekening)).sendKeys(nomorRekening);
        }catch (Exception e){
            System.out.println("Komponen Text Field Input Nomor Rekening Tidak Ditemukan !!");
        }
    }

    public void yInputSelectPembayaranQRIS(String pembayaranQRIS)
    {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        try{
            Select select = new Select(selectFormQrisPay);
            select.selectByValue(pembayaranQRIS);
        }catch (Exception e){
            System.out.println("Komponen Select Pembayaran QRIS Tidak Ditemukan !!");
        }
    }

    public void yInputTextFieldNominalTransaksi(String nominalTransaksi)
    {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        try{
            new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                    .until(ExpectedConditions.visibilityOf(textFieldFormNominalTransaksi)).sendKeys(nominalTransaksi);
        }catch (Exception e){
            System.out.println("Komponen Text Field Input Nominal Transaksi Tidak Ditemukan !!");
        }
    }

    public void yInputDatePickerTanggalTransaksi(String tanggalTransaksi)
    {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        try{
            new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                    .until(ExpectedConditions.visibilityOf(dateFormTanggalTransaksi)).sendKeys(tanggalTransaksi);
        }catch (Exception e){
            System.out.println("Komponen Date Picker Tanggal Transaksi Tidak Ditemukan !!");
        }
    }

    public void yInputSelectNamaMerchant(String namaMerchant)
    {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        try{
            new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                    .until(ExpectedConditions.visibilityOf(selectFormNamaMerchant)).sendKeys(namaMerchant);
        }catch (Exception e){
            System.out.println("Komponen Select Nama Merchant Tidak Ditemukan !!");
        }
    }

    public void yInputTextFieldRRN(String rrn)
    {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        try{
            new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                    .until(ExpectedConditions.visibilityOf(textFieldFormRRN)).sendKeys(rrn);
        }catch (Exception e){
            System.out.println("Komponen Text Field Input RRN Tidak Ditemukan !!");
        }
    }

    public void yInputImageBuktiTransaksiSatu()
    {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        try{
            new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                    .until(ExpectedConditions.visibilityOf(btnModalUploadFotoBuktiTransaksiSatu)).sendKeys(Constants.PATH_GAM_AWAL);
        }catch (Exception e){
            System.out.println("Komponen Upload Bukti Transaksi Satu Tidak Ditemukan !!");
        }
    }

    public void yInputImageBuktiTransaksiDua()
    {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        try{
            new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                    .until(ExpectedConditions.visibilityOf(btnModalUploadFotoBuktiTransaksiDua)).sendKeys(Constants.PATH_GAM_AWAL);
        }catch (Exception e){
            System.out.println("Komponen Upload Bukti Transaksi Satu Tidak Ditemukan !!");
        }
    }

    public void yInputImageBuktiTransaksiTiga()
    {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        try{
            new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                    .until(ExpectedConditions.visibilityOf(btnModalUploadFotoBuktiTransaksiTiga)).sendKeys(Constants.PATH_GAM_AWAL);
        }catch (Exception e){
            System.out.println("Komponen Upload Bukti Transaksi Satu Tidak Ditemukan !!");
        }
    }


    public void yUploadImageBuktiTransaksiSatu()
    {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        try{
            new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                    .until(ExpectedConditions.visibilityOf(btnModalSaveFotoBuktiTransaksiSatu)).click();
        }catch (Exception e){
            System.out.println("Komponen Upload Bukti Transaksi Satu Tidak Ditemukan !!");
        }
    }

    public void yUploadImageBuktiTransaksiDua()
    {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        try{
            new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                    .until(ExpectedConditions.visibilityOf(btnModalSaveFotoBuktiTransaksiDua)).click();
        }catch (Exception e){
            System.out.println("Komponen Upload Bukti Transaksi Satu Tidak Ditemukan !!");
        }
    }

    public void yUploadImageBuktiTransaksiTiga()
    {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        try{
            new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                    .until(ExpectedConditions.visibilityOf(btnModalSaveFotoBuktiTransaksiTiga)).click();
        }catch (Exception e){
            System.out.println("Komponen Upload Bukti Transaksi Satu Tidak Ditemukan !!");
        }
    }

    public void yClickButtonRotate90FotoTransaksiSatu()
    {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        try{
            new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                    .until(ExpectedConditions.visibilityOf(btnFormRotate90FotoBuktiTransaksiSatu)).click();
        }catch (Exception e){
            System.out.println("Komponen Upload Bukti Transaksi Satu Tidak Ditemukan !!");
        }
    }

    public void yClickButtonRotate180FotoTransaksiSatu()
    {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        try{
            new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                    .until(ExpectedConditions.visibilityOf(btnFormRotate180FotoBuktiTransaksiSatu)).click();
        }catch (Exception e){
            System.out.println("Komponen Upload Bukti Transaksi Satu Tidak Ditemukan !!");
        }
    }

    public void yClickButtonRotate270FotoTransaksiSatu()
    {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        try{
            new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                    .until(ExpectedConditions.visibilityOf(btnFormRotate270FotoBuktiTransaksiSatu)).click();
        }catch (Exception e){
            System.out.println("Komponen Upload Bukti Transaksi Satu Tidak Ditemukan !!");
        }
    }

    public void yClickButtonRotate90FotoTransaksiDua()
    {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        try{
            new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                    .until(ExpectedConditions.visibilityOf(btnFormRotate90FotoBuktiTransaksiDua)).click();
        }catch (Exception e){
            System.out.println("Komponen Upload Bukti Transaksi Satu Tidak Ditemukan !!");
        }
    }

    public void yClickButtonRotate180FotoTransaksiDua()
    {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        try{
            new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                    .until(ExpectedConditions.visibilityOf(btnFormRotate180FotoBuktiTransaksiDua)).click();
        }catch (Exception e){
            System.out.println("Komponen Upload Bukti Transaksi Satu Tidak Ditemukan !!");
        }
    }

    public void yClickButtonRotate270FotoTransaksiDua()
    {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        try{
            new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                    .until(ExpectedConditions.visibilityOf(btnFormRotate270FotoBuktiTransaksiDua)).click();
        }catch (Exception e){
            System.out.println("Komponen Upload Bukti Transaksi Satu Tidak Ditemukan !!");
        }
    }

    public void yClickButtonRotate90FotoTransaksiTiga()
    {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        try{
            new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                    .until(ExpectedConditions.visibilityOf(btnFormRotate90FotoBuktiTransaksiTiga)).click();
        }catch (Exception e){
            System.out.println("Komponen Upload Bukti Transaksi Satu Tidak Ditemukan !!");
        }
    }

    public void yClickButtonRotate180FotoTransaksiTiga()
    {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        try{
            new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                    .until(ExpectedConditions.visibilityOf(btnFormRotate180FotoBuktiTransaksiTiga)).click();
        }catch (Exception e){
            System.out.println("Komponen Upload Bukti Transaksi Satu Tidak Ditemukan !!");
        }
    }

    public void yClickButtonRotate270FotoTransaksiTiga()
    {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        try{
            new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                    .until(ExpectedConditions.visibilityOf(btnFormRotate270FotoBuktiTransaksiTiga)).click();
        }catch (Exception e){
            System.out.println("Komponen Upload Bukti Transaksi Satu Tidak Ditemukan !!");
        }
    }

    public String yGetTextFormVerifikasiValidation()
    {

        return textFormPageTitle==null?"":new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(textFormPageTitle)).getText();
    }

    public String yGetTextFormVerifikasiNamaNasabah()
    {

        return textFieldFormNamaNasabah==null?"":new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(textFieldFormNamaNasabah)).getAttribute("value");
    }

    public String yGetTextFormVerifikasiNomorHandphone()
    {

        return textFieldFormNomorHandphone==null?"":new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(textFieldFormNomorHandphone)).getAttribute("value");
    }

    public String yGetTextFormVerifikasiNomorRekening()
    {

        return textFieldFormNomorRekening==null?"":new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(textFieldFormNomorRekening)).getAttribute("value");
    }

    public String yGetTextFormVerifikasiPembayaranQRIS()
    {

        return selectFormQrisPay==null?"":new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(selectFormQrisPay)).getAttribute("value");
    }

    public String yGetTextFormVerifikasiNominalTransaksi()
    {

        return textFieldFormNominalTransaksi==null?"":new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(textFieldFormNominalTransaksi)).getAttribute("value");
    }

    public String yGetTextFormVerifikasiTanggalTransaksi()
    {

        return dateFormTanggalTransaksi==null?"":new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(dateFormTanggalTransaksi)).getAttribute("value");
    }

    public String yGetTextFormVerifikasiNamaMerchant()
    {

        return selectFormNamaMerchant==null?"":new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(selectFormNamaMerchant)).getAttribute("value");
    }

    public String yGetTextFormVerifikasiRRN()
    {

        return textFieldFormRRN==null?"":new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(textFieldFormRRN)).getAttribute("value");
    }

    public String yGetTextFormVerifikasiModal()
    {

        return textFormModalTitle==null?"":new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(textFormModalTitle)).getText();
    }



//    public void ySelectOptionVerifikasiFormQrisPay(String selected) throws IllegalStateException {
//        Select select = new Select(selectFormQrisPay);
//        select.selectByValue(selected);
//    }
//
//    public void ySelectOptionVerifikasiFormNamaMerchant(String selected) throws IllegalStateException {
//        Select select = new Select(selectFormNamaMerchant);
//        select.selectByValue(selected);
//    }

    public void yClickButtonEditFormVerifikasi()
    {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        try
        {
            new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                    .until(ExpectedConditions.visibilityOf(btnFormEdit)).click();
        }
        catch (Exception e)
        {
            System.out.println("Komponen Tombol Edit Form Verifikasi Tidak Ditemukan !!");
        }
    }

    public void yClickButtonSimpanFormVerifikasi()
    {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        try
        {
            new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                    .until(ExpectedConditions.visibilityOf(btnFormSimpan)).click();
        }
        catch (Exception e)
        {
            System.out.println("Komponen Tombol Simpan Form Verifikasi Tidak Ditemukan !!");
        }
    }

    public void yClickButtonCancelFormVerifikasi()
    {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        try
        {
            new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                    .until(ExpectedConditions.visibilityOf(btnFormCancel)).click();
        }
        catch (Exception e)
        {
            System.out.println("Komponen Tombol Cancel Form Verifikasi Tidak Ditemukan !!");
        }
    }

    public void yClickButtonVerifikasiFormVerifikasi()
    {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        try
        {
            new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                    .until(ExpectedConditions.visibilityOf(btnFormVerifikasi)).click();
        }
        catch (Exception e)
        {
            System.out.println("Komponen Tombol Verifikasi Data Tidak Ditemukan !!");
        }
    }

    public void yClickButtonSaveNotesFormVerifikasi()
    {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        try
        {
            new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                    .until(ExpectedConditions.visibilityOf(btnFormSaveNote)).click();
        }
        catch (Exception e)
        {
            System.out.println("Komponen Tombol Save Note Verifikasi Tidak Ditemukan !!");
        }
    }
    public void yClickImageFormVerifikasiFotoBuktiTransaksiSatu()
    {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        try
        {
            new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                    .until(ExpectedConditions.visibilityOf(imgFormFotoBuktiTransaksiSatu)).click();
        }
        catch (Exception e)
        {
            System.out.println("Komponen Image Foto Transaksi 1 Form Verifikasi Tidak Ditemukan !!");
        }
    }

    public void yClickImageFormVerifikasiFotoBuktiTransaksiDua()
    {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        try
        {
            new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                    .until(ExpectedConditions.visibilityOf(imgFormFotoBuktiTransaksiDua)).click();
        }
        catch (Exception e)
        {
            System.out.println("Komponen Image Foto Transaksi 1 Form Verifikasi Tidak Ditemukan !!");
        }
    }

    public void yClickImageFormVerifikasiFotoBuktiTransaksiTiga()
    {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        try
        {
            new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                    .until(ExpectedConditions.visibilityOf(imgFormFotoBuktiTransaksiTiga)).click();
        }
        catch (Exception e)
        {
            System.out.println("Komponen Image Foto Transaksi 1 Form Verifikasi Tidak Ditemukan !!");
        }
    }


    public boolean yGetAlertDisabledVerifikasiButton()
    {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        try
        {
            new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                    .until(ExpectedConditions.visibilityOf(btnDisabledFormVerifikasi));
            return true;
        }
        catch (Exception e)
        {
            System.out.println("Komponen Alert Disabled Button Verifikasi Tidak Ditemukan !!");
            return false;
        }

    }

    public boolean yGetAlertDisabledSaveNoteButton()
    {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        try
        {
            new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                    .until(ExpectedConditions.visibilityOf(btnDisabledFormSaveNote));
            return true;
        }
        catch (Exception e)
        {
            System.out.println("Komponen Alert Disabled Button Save Note Tidak Ditemukan !!");
            return false;
        }

    }
    public void yInputTextSaveNotes(String catatan)
    {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        try{
            new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                    .until(ExpectedConditions.visibilityOf(textFieldFormNote)).sendKeys(catatan);
        }catch (Exception e){
            System.out.println("Komponen Notes Tidak Ditemukan !!");
        }
    }

    public void yClickModal2Function()
    {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        try
        {
            new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                    .until(ExpectedConditions.visibilityOf(btnModal2Submit)).click();
        }
        catch (Exception e)
        {
            System.out.println("Komponen Image Foto Transaksi 1 Form Verifikasi Tidak Ditemukan !!");
        }
    }

    public void yClearFormVerifikasiNote()
    {


        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        try
        {
            /** Set Field Password Empty String */
            new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                    .until(ExpectedConditions.visibilityOf(textFieldFormNote)).clear();
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

    public WebElement yGetImgFotoBuktiTransaksiSatu()
    {
        return imgFormFotoBuktiTransaksiSatu;
    }

    public WebElement yGetImgFotoBuktiTransaksiDua()
    {
        return imgFormFotoBuktiTransaksiDua;
    }

    public WebElement yGetImgFotoBuktiTransaksiTiga()
    {
        return imgFormFotoBuktiTransaksiTiga;
    }

}
