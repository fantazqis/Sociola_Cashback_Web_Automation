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

import com.juaracoding.ta_kelompok2.connection.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PreTransferPage {

    WebDriver driver;

    @FindBy(xpath = "//a[contains(text(),'Dashboard')]")
    private WebElement linkPreTransferToHome;

    @FindBy(xpath = "//li[@class='breadcrumb-item active']")
    private WebElement textPreTransferCrumbs;

    @FindBy(xpath = "//h3[@class='card-title']")
    private WebElement textPreTransferTableHeaderPreTransferData;

    @FindBy(xpath = "//a[@id='btn_excel']")
    private WebElement btnPreTransferExortExcel;

    @FindBy(xpath = "//label[contains(text(),'Show')]")
    private WebElement textVerifikasiLabelShowEntries;

    @FindBy(xpath = "//select[@name='table_length']")
    private WebElement selectPreTransferEntriesPerPage;

    @FindBy(xpath = "//label[normalize-space()='Search:']")
    private WebElement textPreTransferSearchTextField;

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
}
