package com.juaracoding.ta_kelompok2.page;
/*
IntelliJ IDEA 2023.3.6 (Community Edition)
Build #IC-233.15026.9, built on March 21, 2024
@Author kiyandark a.k.a. Muhammad Irfan Syaifur Rizal Wiratama
Java Developer
Created on 23/05/2024 13:58
@Last Modified 23/05/2024 13:58
Version 1.0
*/

import com.juaracoding.ta_kelompok2.connection.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
    WebDriver driver;

    @FindBy(xpath = "//a[contains(text(),'Dashboard')]")
    private WebElement linkDashboardToHome;

    @FindBy(xpath = "//h3[normalize-space()='Filter Data']")
    private WebElement textDashboardTableHeaderFilterData;

    @FindBy(xpath = "//b[normalize-space()='Periode']")
    private WebElement textDashboardTableFilterDataPeriode;

    @FindBy(xpath = "//b[normalize-space()='S/D']")
    private WebElement textDashboardTableFilterDataSD;

    @FindBy(xpath = "//input[@name='start_date']")
    private WebElement dateDashboardTableFilterDataStartDate;

    @FindBy(xpath = "//input[@name='end_date']")
    private WebElement dateDashboardTableFilterDataEndDate;

    @FindBy(xpath = "//button[@id='btn-filter']")
    private WebElement btnDashboardTableFilterDataSubmit;

    @FindBy(xpath = "//span[normalize-space()='Maaf, range tanggal maksimal 31 hari']")
    private WebElement alertDashboardTableFilterData;

    @FindBy(xpath = "//h3[normalize-space()='Dashboard SPG']")
    private WebElement textDashboardTableHeaderDashboardSPG;

    @FindBy(xpath = "//div[@id='table_spg_wrapper']//span[contains(text(),'Export Excel')]")
    private WebElement btnDashboardTableSPGExportExcel;

    @FindBy(xpath = "//div[@id='table_spg_filter']//label[contains(text(),'Search:')]")
    private WebElement textDashboardTableSPGSearch;

    @FindBy(xpath = "//input[@aria-controls='table_spg']")
    private WebElement textFieldDashboardTableSPGSearchBox;

    @FindBy(xpath = "//div[@id='table_spg_filter']//i[@class='fa fa-search']")
    private WebElement btnDashboardTableSPGSearchButton;

    @FindBy(xpath = "//th[normalize-space()='Nama SPG']")
    private WebElement textDashboardTableSPGKolomNamaSPG;

    @FindBy(xpath = "//table[@id='table_spg']//th[@class='sorting_disabled'][normalize-space()='Transaksi']")
    private WebElement textDashboardTableSPGKolomTransaksi;

    @FindBy(xpath = "//th[normalize-space()='Jumlah Cashback']")
    private WebElement textDashboardTableSPGKolomJumlahCashback;

    @FindBy(xpath = "//th[normalize-space()='Nominal Cashback']")
    private WebElement textDashboardTableSPGKolomNominalCashback;

    @FindBy(xpath = "//td[@class='dataTables_empty']")
    private WebElement textDashboardTableSPGEmpty;

    @FindBy(xpath = "//div[@id='table_spg_info']")
    private WebElement textDashboardtableSPGEntriesInfo;

    @FindBy(xpath = "//li[@id='table_spg_previous']")
    private WebElement btnDashboardTableSPGPrevious;

    @FindBy(xpath = "//li[@id='table_next']")
    private WebElement btnDashboardTableSPGNext;

    @FindBy(xpath = "//a[@aria-controls='table_spg'][normalize-space()='1']")
    private WebElement btnDashboardTableSPGnumber;

    @FindBy(xpath = "//h3[normalize-space()='Dashboard Nominal Cashback']")
    private WebElement textDashboardTableHeaderDashboardNominalCashback;

    @FindBy(xpath = "//div[@id='table_transaksi_wrapper']//span[contains(text(),'Export Excel')]")
    private WebElement btnDashboardTableNominalCashbackExportExcel;

    @FindBy(xpath = "//div[@id='table_transaksi_filter']//label[contains(text(),'Search:')]")
    private WebElement textDashboardTableNominalCashbackSearch;

    @FindBy(xpath = "//input[@aria-controls='table_transaksi']")
    private WebElement textFieldDashboardTableNominalCashbackSearchBox;

    @FindBy(xpath = "//div[@id='table_transaksi_filter']//i[@class='fa fa-search']")
    private WebElement btnDashboardTableNominalCashbackSearchButton;

    @FindBy(xpath = "//table[@id='table_transaksi']//th[@class='sorting_disabled'][normalize-space()='Transaksi']")
    private WebElement textDashboardTableNominalCashbackKolomTransaksi;

    @FindBy(xpath = "//th[normalize-space()='Jumlah Customer']")
    private WebElement textDashboardTableNominalCashbackKolomJumlahCustomer;

    @FindBy(xpath = "//th[normalize-space()='Total Nominal Cashback']")
    private WebElement textDashboardTableNominalCashbackKolomTotalNominalCashback;

    @FindBy(xpath = "//th[normalize-space()='Cashback Paid']")
    private WebElement textDashboardTableNominalCashbackKolomCashbackPaid;

    @FindBy(xpath = "//th[normalize-space()='Cashback Not Paid']")
    private WebElement textDashboardTableNominalCashbackKolomCashbackNotPaid;

    @FindBy(xpath = "//th[normalize-space()='Total Nominal Transaksi']")
    private WebElement textDashboardTableNominalCashbackKolomTotalNominalTransaksi;

    @FindBy(xpath = "//td[normalize-space()='Cashback Rp.100.000']")
    private WebElement textDashboardTableNominalCashbackDataTransaksi;

    @FindBy(xpath = "//tbody/tr[@role='row']/td[2]/span[1]")
    private WebElement textDashboardTableNominalCashbackDataJumlahCustomer;

    @FindBy(xpath = "//tbody/tr[@role='row']/td[3]/span[1]")
    private WebElement textDashboardTableNominalCashbackDataTotalNominalCashback;

    @FindBy(xpath = "//tbody/tr[@role='row']/td[4]/span[1]")
    private WebElement textDashboardTableNominalCashbackDataCashbackPaid;

    @FindBy(xpath = "//tbody/tr[@role='row']/td[5]/span[1]")
    private WebElement textDashboardTableNominalCashbackDataCashbackNotPaid;

    @FindBy(xpath = "//span[@title='Sukses']")
    private WebElement textDashboardTableNominalCashbackDataTotalNominalTransaksi;

    @FindBy(xpath = "//div[@id='table_transaksi_info']")
    private WebElement textDashboardTableNominalCashbackEntriesInfo;

    @FindBy(xpath = "//li[@id='table_transaksi_previous']")
    private WebElement btnDashboardTableNominalCashbackPreviousUnactive;

    /**
     * untuk nomor per pages table blm masuk
     */

//    @FindBy(xpath = "//a[normalize-space()='Previous']")
//    private WebElement btnVerifikasiDataTablePreviousActive;

    @FindBy(xpath = "//li[@id='table_transaksi_next']")
    private WebElement btnDashboardTableNominalCashbackNextUnactive;

//    @FindBy(xpath = "//a[normalize-space()='Next']")
//    private WebElement btnRegisterDataTableNextActive;

    public DashboardPage(WebDriver driver){
        this.driver= DriverSingleton.getDriver();
        PageFactory.initElements(this.driver,this);
    }

}
