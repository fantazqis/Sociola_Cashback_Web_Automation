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

public class UploadBuktiTransferPage {

    WebDriver driver;

    /** start - webelement Upload Bukti Transfer page, Data Sudah Ditransfer*/
    @FindBy(xpath = "//h1[normalize-space()='Data Sudah Ditransfer']")
    private WebElement textUploadBuktiTransferPageTitle;

    @FindBy(xpath = "//a[contains(text(),'Dashboard')]")
    private WebElement linkUploadBuktiTransferToHome;

    @FindBy(xpath = "//li[@class='breadcrumb-item active']")
    private WebElement textUploadBuktiTransferCrumbs;

    @FindBy(xpath = "//h3[@class='card-title']")
    private WebElement textUploadBuktiTransferTableHeaderListDataRegister;

    @FindBy(xpath = "//label[contains(text(),'Show')]")
    private WebElement textUploadBuktiTransferLabelShowEntries;

    @FindBy(xpath = "//select[@name='table_length']")
    private WebElement selectUploadBuktiTransferEntriesPerPage;

    @FindBy(xpath = "//label[normalize-space()='Search:']")
    private WebElement textUploadBuktiTransferSearchTextField;

    @FindBy(xpath = "//input[@class='form-control form-control-sm']")
    private WebElement texFieldUploadBuktiTransferSearchBar;

    @FindBy(xpath = "//th[normalize-space()='No']")
    private WebElement textUploadBuktiTransferKolomTableNo;

    @FindBy(xpath = "//th[normalize-space()='Nama Customer']")
    private WebElement textUploadBuktiTransferKolomTableNamaCustomer;

    @FindBy(xpath = "//th[normalize-space()='Nomor Handphone']")
    private WebElement textUploadBuktiTransferKolomTableNomorHandphone;

    @FindBy(xpath = "//th[normalize-space()='Nama Merchant']")
    private WebElement textUploadBuktiTransferKolomTableNamaMerchant;

    @FindBy(xpath = "//th[normalize-space()='RRN']")
    private WebElement textUploadBuktiTransferKolomTableRRN;

    @FindBy(xpath = "//th[normalize-space()='Reference ID']")
    private WebElement textUploadBuktiTransferKolomTableReferenceID;

    @FindBy(xpath = "//th[normalize-space()='Nominal Transaksi']")
    private WebElement textUploadBuktiTransferKolomTableNominalTransaksi;

    @FindBy(xpath = "//th[normalize-space()='Nominal Cashback']")
    private WebElement textUploadBuktiTransferKolomTableNominalCashback;

    @FindBy(xpath = "//th[normalize-space()='Nama Sales']")
    private WebElement textUploadBuktiTransferKolomTableNamaSales;

    @FindBy(xpath = "//th[normalize-space()='Nama Verifikator']")
    private WebElement textUploadBuktiTransferKolomTableNamaVerifikator;

    @FindBy(xpath = "//th[normalize-space()='Nama Finance']")
    private WebElement textUploadBuktiTransferKolomTableNamaFinance;

    @FindBy(xpath = "//th[normalize-space()='Aksi']")
    private WebElement textUploadBuktiTransferKolomTableAksi;

//    @FindBy(xpath = "//td[@class='dataTables_empty']")
//    private WebElement textRegisterDataTableEmpty;

//    @FindBy(xpath = "//div[@id='table_info']")
//    private WebElement textVerifikasiDataTableEntriesInfo;

    @FindBy(xpath = "//li[@id='table_previous']")
    private WebElement btnUploadBuktiTransferDataTablePreviousUnactive;

    /**
     * untuk nomor per pages table blm masuk
     */

    @FindBy(xpath = "//a[normalize-space()='Previous']")
    private WebElement btnUploadBuktiTransferDataTablePreviousActive;

    @FindBy(xpath = "//li[@id='table_next']")
    private WebElement btnUploadBuktiTransferDataTableNextUnactive;

    @FindBy(xpath = "//a[normalize-space()='Next']")
    private WebElement btnUploadBuktiTransferDataTableNextActive;


    /** end - webelement Upload Bukti Transfer page, Data Sudah Ditransfer*/

    /** start - webelement Upload Bukti Transfer Form page, Form Penukaran Voucher*/



    /** end - webelement Upload Bukti Transfer Form page, Form Penukaran Voucher*/



    public UploadBuktiTransferPage(WebDriver driver){
        this.driver= DriverSingleton.getDriver();
        PageFactory.initElements(this.driver,this);
    }
}
