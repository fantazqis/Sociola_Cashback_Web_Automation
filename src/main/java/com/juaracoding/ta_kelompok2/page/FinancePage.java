package com.juaracoding.ta_kelompok2.page;
/*
IntelliJ IDEA 2023.3.6 (Community Edition)
Build #IC-233.15026.9, built on March 21, 2024
@Author kiyandark a.k.a. Muhammad Irfan Syaifur Rizal Wiratama
Java Developer
Created on 25/05/2024 12:54
@Last Modified 25/05/2024 12:54
Version 1.0
*/

import com.juaracoding.ta_kelompok2.connection.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FinancePage {

    WebDriver driver;

    /** start - webelement finance page, List Data Yang Sudah Diverifikasi*/

    @FindBy(xpath = "//a[contains(text(),'Dashboard')]")
    private WebElement linkFinanceToHome;

    @FindBy(xpath = "//li[contains(text(),'Finance')]")
    private WebElement textFinanceCrumbs;

    @FindBy(xpath = "//h3[@class='card-title']")
    private WebElement textFinanceTableHeaderListDataRegister;

    @FindBy(xpath = "//label[contains(text(),'Show')]")
    private WebElement textFinanceLabelShowEntries;

    @FindBy(xpath = "//select[@name='table_length']")
    private WebElement selectFinanceEntriesPerPage;

    @FindBy(xpath = "//label[normalize-space()='Search:']")
    private WebElement textFinanceSearchTextField;

    @FindBy(xpath = "//input[@class='form-control form-control-sm']")
    private WebElement texFieldFinanceSearchBar;

    @FindBy(xpath = "//input[@onclick='toggle(this);']")
    private WebElement checkBoxFinanceDataTable;

    @FindBy(xpath = "//th[normalize-space()='No']")
    private WebElement textFinanceKolomTableNo;

    @FindBy(xpath = "//th[normalize-space()='Nama Customer']")
    private WebElement textFinanceKolomTableNamaCustomer;

    @FindBy(xpath = "//th[normalize-space()='Nomor Handphone']")
    private WebElement textFinanceKolomTableNomorHandphone;

    @FindBy(xpath = "//th[normalize-space()='Nama Merchant']")
    private WebElement textFinanceKolomTableNamaMerchant;

    @FindBy(xpath = "//th[normalize-space()='RRN']")
    private WebElement textFinanceKolomTableRRN;

    @FindBy(xpath = "//th[normalize-space()='Ref ID']")
    private WebElement textFinanceKolomTableReferenceID;

    @FindBy(xpath = "//th[normalize-space()='Nominal Transaksi']")
    private WebElement textFinanceKolomTableNominalTransaksi;

    @FindBy(xpath = "//th[normalize-space()='Nominal Cashback']")
    private WebElement textFinanceKolomTableNominalCashback;

    @FindBy(xpath = "//th[normalize-space()='Nama Sales']")
    private WebElement textFinanceKolomTableNamaSales;

    @FindBy(xpath = "//th[normalize-space()='Nama Verifikator']")
    private WebElement textFinanceKolomTableNamaVerifikator;

    @FindBy(xpath = "//th[normalize-space()='Action']")
    private WebElement textFinanceKolomTableAksi;

//    @FindBy(xpath = "//td[@class='dataTables_empty']")
//    private WebElement textRegisterDataTableEmpty;

    @FindBy(xpath = "//div[@id='table_info']")
    private WebElement textFinanceDataTableEntriesInfo;

    @FindBy(xpath = "//li[@id='table_previous']")
    private WebElement btnFinanceDataTablePreviousUnactive;

    /**
     * untuk nomor per pages table blm masuk
     */

    @FindBy(xpath = "//a[normalize-space()='Previous']")
    private WebElement btnFinanceDataTablePreviousActive;

    @FindBy(xpath = "//button[normalize-space()='Update Sudah Transfer']")
    private WebElement btnFinanceDataTableUpdateSudahTransfer;

    @FindBy(xpath = "//button[normalize-space()='Kembalikan ke VERIFIKATOR']")
    private WebElement btnFinanceDataTableKembalikanKeVerifikator;


    /** end - webelement finance page, List Data Yang Sudah Diverifikasi*/

    /**
     * finance belum selesai
     */
    public FinancePage(WebDriver driver){
        this.driver= DriverSingleton.getDriver();
        PageFactory.initElements(this.driver,this);
    }
}
