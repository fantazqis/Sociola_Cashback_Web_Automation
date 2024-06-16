package com.juaracoding.ta_kelompok2.page;
/*
IntelliJ IDEA 2023.3.6 (Community Edition)
Build #IC-233.15026.9, built on March 21, 2024
@Author kiyandark a.k.a. Muhammad Irfan Syaifur Rizal Wiratama
Java Developer
Created on 25/05/2024 10:47
@Last Modified 25/05/2024 10:47
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
import java.util.List;
import java.util.Random;

public class PreTransferPage {

    WebDriver driver;

    @FindBy(xpath = "//a[contains(text(),'Dashboard')]")
    private WebElement linkPreTransferToHome;

    @FindBy(xpath = "//li[@class='breadcrumb-item active']")
    private WebElement textPreTransferCrumbs;

    @FindBy(xpath = "//h3[@class='card-title']")
    private WebElement textPreTransferPageTitle;

    @FindBy(xpath = "//a[@id='btn_excel']")
    private WebElement btnPreTransferExortExcel;

    @FindBy(xpath = "//label[contains(text(),'Show')]")
    private WebElement textVerifikasiLabelShowEntries;

    @FindBy(xpath = "//select[@name='table_length']")
    private WebElement selectPreTransferEntriesPerPage;

    @FindBy(xpath = "//input[@class='form-control form-control-sm']")
    private WebElement texFieldPreTransferSearchBar;

    @FindBy(xpath = "//span[@id='btnSearch']")
    private WebElement btnPreTransferSearch;


    @FindBy(xpath = "//th[normalize-space()='No']")
    private WebElement textPreTransferKolomTableNo;

    @FindBy(xpath = "//th[normalize-space()='Nama Customer']")
    private WebElement textPreTransferKolomTableNamaCustomer;

    @FindBy(xpath = "//th[normalize-space()='Nomor Handphone']")
    private WebElement textPreTransferKolomTableNomorHandphone;

    @FindBy(xpath = "//th[normalize-space()='Nama Merchant']")
    private WebElement textPreTransferKolomTableNamaMerchant;

    @FindBy(xpath = "//th[normalize-space()='RRN']")
    private WebElement textPreTransferKolomTableRRN;

    @FindBy(xpath = "//th[normalize-space()='Nominal Transaksi']")
    private WebElement textPreTransferKolomTableNominalTransaksi;

    @FindBy(xpath = "//th[normalize-space()='Nominal Cashback']")
    private WebElement textPreTransferKolomTableNominalCashback;

    @FindBy(xpath = "//th[normalize-space()='Nama Sales']")
    private WebElement textPreTransferKolomTableNamaSales;

    @FindBy(xpath = "//th[normalize-space()='Nama Verifikator']")
    private WebElement textPreTransferKolomNamaVerifikator;

    @FindBy(xpath = "//th[normalize-space()='Nama Finance']")
    private WebElement textPreTransferKolomTableNamaFinance;

    @FindBy(xpath = "//th[normalize-space()='Nama Uploader']")
    private WebElement textPreTransferKolomTableNamaUploader;

    @FindBy(xpath = "//th[normalize-space()='Status']")
    private WebElement textPreTransferKolomTableStatus;

    @FindBy(xpath = "//th[normalize-space()='Aksi']")
    private WebElement textPreTransferKolomTableAksi;

    @FindBy(xpath = "//td[@class='dataTables_empty']")
    private WebElement textPreTransferDataTableEmpty;

    @FindBy(xpath = "//div[@id='table_info']")
    private WebElement textPreTransferDataTableEntriesInfo;

    @FindBy(xpath = "//li[@id='table_previous']")
    private WebElement btnPreTransferDataTablePreviousUnactive;

    @FindBy(id = "table")
    private WebElement idPreTransferWebTable;

//    /**
//     * untuk nomor per pages table blm masuk
//     */
//
//    @FindBy(xpath = "//a[normalize-space()='Previous']")
//    private WebElement btnVerifikasiDataTablePreviousActive;
//
    @FindBy(xpath = "//li[@id='table_next']")
    private WebElement btnPreTransferDataTableNextUnactive;

//    @FindBy(xpath = "//a[normalize-space()='Next']")
//    private WebElement btnRegisterDataTableNextActive;

    public PreTransferPage(WebDriver driver){
        this.driver= DriverSingleton.getDriver();
        PageFactory.initElements(this.driver,this);
    }

    public List yGetAllDataTableData(){


        List<String> allTableData = new ArrayList<>();
        int startIndex = 1;
        int endIndex = 6;

        List<WebElement> rows = idPreTransferWebTable.findElements(By.tagName("tr"));
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
        List<WebElement> rows = idPreTransferWebTable.findElements(By.tagName("tr"));
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

    public void yInputSearchBarPreTransfer(String dataToSearch)
    {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        try
        {
            new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                    .until(ExpectedConditions.visibilityOf(texFieldPreTransferSearchBar))
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
                    .until(ExpectedConditions.visibilityOf(texFieldPreTransferSearchBar))
                    .sendKeys(Keys.ENTER);
        }
        catch (Exception e)
        {
            System.out.println("Komponen Text Field SearchBar Tidak Ditemukan !!");
        }
    }

    public int ySelectOptionVerifikasiEntries(String selected) throws IllegalStateException {
        Select select = new Select(selectPreTransferEntriesPerPage);
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


    public String yGetTextPreTransferValidation()
    {

        return textPreTransferPageTitle==null?"":new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(textPreTransferPageTitle)).getText();
    }

    public void clickBtnExportExcel()
    {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        try
        {
            new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                    .until(ExpectedConditions.visibilityOf(btnPreTransferExortExcel)).click();
        }
        catch (Exception e)
        {
            System.out.println("Komponen Tombol Login Submit Tidak Ditemukan !!");
        }
    }
}
