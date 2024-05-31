package com.juaracoding.ta_kelompok2.page;
/*
IntelliJ IDEA 2023.3.6 (Community Edition)
Build #IC-233.15026.9, built on March 21, 2024
@Author kiyandark a.k.a. Muhammad Irfan Syaifur Rizal Wiratama
Java Developer
Created on 25/05/2024 12:55
@Last Modified 25/05/2024 12:55
Version 1.0
*/

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ReportDataPage {

    WebDriver driver;

    /** start - webelement report data page, report data*/

    @FindBy(xpath = "//a[contains(text(),'Dashboard')]")
    private WebElement linkReportDataToHome;

    @FindBy(xpath = "//li[@class='breadcrumb-item active']")
    private WebElement textReportDataCrumbs;

    @FindBy(xpath = "//h3[@class='card-title']")
    private WebElement textReportDataTableHeaderListReportData;

    @FindBy(xpath = "//b[normalize-space()='Status']")
    private WebElement textReportDataLabelStatusEntries;

    @FindBy(xpath = "//select[@id='status']")
    private WebElement selectReportDataEntriesPerPage;

    @FindBy(xpath = "//button[@id='btnEdit']")
    private WebElement btnReportDataFilter;

    @FindBy(xpath = "//a[@id='btn_excel']")
    private WebElement btnReportDataExportExcel;

    @FindBy(xpath = "//label[normalize-space()='Search:']")
    private WebElement textReportDataSearchTextField;

    @FindBy(xpath = "//input[@class='form-control form-control-sm']")
    private WebElement texFieldReportDataSearchBar;

    @FindBy(xpath = "//i[@class='fa fa-search']")
    private WebElement btnReportDataSearchIcon;


    @FindBy(xpath = "//th[normalize-space()='No']")
    private WebElement textReportDataKolomTableNo;

    @FindBy(xpath = "//th[normalize-space()='Nama Customer']")
    private WebElement textReportDataKolomTableNamaCustomer;

    @FindBy(xpath = "//th[normalize-space()='Nomor Handphone']")
    private WebElement textReportDataKolomTableNomorHandphone;

    @FindBy(xpath = "//th[normalize-space()='Nama Merchant']")
    private WebElement textReportDataKolomTableNamaMerchant;

    @FindBy(xpath = "//th[normalize-space()='RRN']")
    private WebElement textReportDataKolomTableRRN;

    @FindBy(xpath = "//th[normalize-space()='Nominal Transaksi']")
    private WebElement textReportDataKolomTableNominalTransaksi;

    @FindBy(xpath = "//th[normalize-space()='Nominal Cashback']")
    private WebElement textReportDataKolomTableNominalCashback;

    @FindBy(xpath = "//th[normalize-space()='Nama Sales']")
    private WebElement textReportDataKolomTableNamaSales;

    @FindBy(xpath = "//th[normalize-space()='Nama Verifikator']")
    private WebElement textReportDataKolomTableNamaVerifikator;

    @FindBy(xpath = "//th[normalize-space()='Nama Finance']")
    private WebElement textReportDataKolomTableNamaFinance;

    @FindBy(xpath = "//th[normalize-space()='Nama Uploader']")
    private WebElement textReportDataKolomTableNamaUploader;

    @FindBy(xpath = "//th[normalize-space()='Status']")
    private WebElement textReportDataKolomTableStatus;

    @FindBy(xpath = "//th[normalize-space()='Aksi']")
    private WebElement textReportDataKolomTableAksi;

    @FindBy(xpath = "//li[@id='table_previous']")
    private WebElement btnReportDataDataTablePreviousUnactive;

    /**
     * untuk nomor per pages table blm masuk
     */

    @FindBy(xpath = "//a[normalize-space()='Previous']")
    private WebElement btnReportDataDataTablePreviousActive;

    @FindBy(xpath = "//li[@id='table_next']")
    private WebElement btnReportDataDataTableNextUnactive;

    @FindBy(xpath = "//a[normalize-space()='Next']")
    private WebElement btnReportDataDataTableNextActive;


    /** end - webelement verifikasi page, List Data Register*/
}
