package com.juaracoding.ta_kelompok2.page;
/*
IntelliJ IDEA 2023.3.6 (Community Edition)
Build #IC-233.15026.9, built on March 21, 2024
@Author kiyandark a.k.a. Muhammad Irfan Syaifur Rizal Wiratama
Java Developer
Created on 23/05/2024 14:59
@Last Modified 23/05/2024 14:59
Version 1.0
*/

import com.juaracoding.ta_kelompok2.connection.Constants;
import com.juaracoding.ta_kelompok2.connection.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class RegisterPage {
    WebDriver driver;

    /** start
     * Webelement List Data Register By User
     * */

    @FindBy(xpath = "//h1[normalize-space()='Form Input Data Cashback 2']")
    private WebElement textRegisterPageTitle;

    @FindBy(xpath = "//a[contains(text(),'Dashboard')]")
    private WebElement linkRegisterToHome;

    @FindBy(xpath = "//li[@class='breadcrumb-item active']")
    private WebElement textRegisterCrumbs;

    @FindBy(xpath = "//h3[@class='card-title']")
    private WebElement textRegisterTableHeaderListData;

    @FindBy(xpath = "//a[@class='btn btn-primary btn-block']")
    private WebElement btnRegisterAddNewData;

    @FindBy(xpath = "//label[contains(text(),'Show')]")
    private WebElement textRegisterLabelShowEntries;

    @FindBy(xpath = "//select[@name='table_length']")
    private WebElement selectRegisterEntriesPerPage;

    @FindBy(xpath = "//label[normalize-space()='Search:']")
    private WebElement textRegisterSearchTextField;

    @FindBy(xpath = "//input[@class='form-control form-control-sm']")
    private WebElement texFieldRegisterSearchBar;

    @FindBy(xpath = "//th[normalize-space()='No']")
    private WebElement textRegisterKolomTableNo;

    @FindBy(xpath = "//th[normalize-space()='Nama Customer']")
    private WebElement textRegisterKolomTableNamaCustomer;

    @FindBy(xpath = "//th[normalize-space()='Nomor Handphone']")
    private WebElement textRegisterKolomTableNomorHandphone;

    @FindBy(xpath = "//th[normalize-space()='Nama Merchant']")
    private WebElement textRegisterKolomTableNamaMerchant;

    @FindBy(xpath = "//th[normalize-space()='RRN']")
    private WebElement textRegisterKolomTableRRN;

    @FindBy(xpath = "//th[normalize-space()='Reference ID']")
    private WebElement textRegisterKolomTableReferenceID;

    @FindBy(xpath = "//th[normalize-space()='Nominal Transaksi']")
    private WebElement textRegisterKolomTableNominalTransaksi;

    @FindBy(xpath = "//th[normalize-space()='Nominal Cashback']")
    private WebElement textRegisterKolomTableNominalCashback;

    @FindBy(xpath = "//th[normalize-space()='Nama Sales']")
    private WebElement textRegisterKolomTableNamaSales;

    @FindBy(xpath = "//th[normalize-space()='Aksi']")
    private WebElement textRegisterKolomTableAksi;

    @FindBy(xpath = "//td[@class='dataTables_empty']")
    private WebElement textRegisterDataTableEmpty;

    @FindBy(xpath = "//div[@id='table_info']")
    private WebElement textRegisterDataTableEntriesInfo;

    @FindBy(xpath = "//li[@id='table_previous']")
    private WebElement btnRegisterDataTablePrevious;

    @FindBy(xpath = "//li[@id='table_next']")
    private WebElement btnRegisterDataTableNext;

    /** End
     * Webelement List Data Register By User
     * */


    /** start
     * Webelement Form Input Data Cashback 2
     * */
    @FindBy(xpath = "//h1[normalize-space()='Form Input Data Cashback 2']")
    private WebElement textRegisterFormPageTitle;

    @FindBy(xpath = "//a[contains(text(),'Dashboard')]")
    private WebElement linkRegisterFormToHome;

    @FindBy(xpath = "//li[@class='breadcrumb-item active']")
    private WebElement textRegisterFormCrumbs;

    @FindBy(xpath = "///h3[normalize-space()='Form Input Data Cashback']")
    private WebElement textRegisterFormTableHeaderInputDataCashback;

    @FindBy(xpath = "//span[@id='clinfo']")
    private WebElement textRegisterFormAlertMessage;


    @FindBy(xpath = "//label[@for='SOCO']")
    private WebElement textRegisterFormSOCOID;

    @FindBy(xpath = "//label[@for='SOCO']//code[contains(text(),'*')]")
    private WebElement iconRegisterFormSOCOID;

    @FindBy(xpath = "//input[@id='SOCO']")
    private WebElement textFieldRegisterFormSOCOID;

    @FindBy(xpath = "//label[@for='Customer_Name']")
    private WebElement textRegisterFormNamaNasabah;

    @FindBy(xpath = "//label[@for='Customer_Name']//code[contains(text(),'*')]")
    private WebElement iconRegisterFormNamaNasabah;

    @FindBy(xpath = "//input[@id='Customer_Name']")
    private WebElement textFieldRegisterFormNamaNasabah;

    @FindBy(xpath = "//div[4]//label[1]")
    private WebElement textRegisterFormNomorHandphone;

    @FindBy(xpath = "//div[4]//label[1]//code[1]")
    private WebElement iconRegisterFormNomorHandphone;

    @FindBy(xpath = "//input[@id='Phone_Number']")
    private WebElement textFieldRegisterFormNomorHandphone;

    @FindBy(xpath = "//div[5]//label[1]")
    private WebElement textRegisterFormNomorRekening;

    @FindBy(xpath = "//div[5]//label[1]//code[1]")
    private WebElement iconRegisterFormNomorRekening;

    @FindBy(xpath = "//input[@id='No_Rek_bca']")
    private WebElement textFieldRegisterFormNomorRekening;

    @FindBy(xpath = "//label[@for='Qris_Pay']")
    private WebElement textRegisterFormQrisPay;

    @FindBy(xpath = "//label[@for='Qris_Pay']//code[contains(text(),'*')]")
    private WebElement iconRegisterFormQrisPay;

    @FindBy(xpath = "//select[@id='Qris_Pay']")
    private WebElement selectRegisterFormQrisPay;

    private WebElement optionRegisterFormQrisPayEmpty;

    private WebElement optionRegisterFormQrisPayMyBca;

    @FindBy(xpath = "//label[@for='Amount']")
    private WebElement textRegisterFormNominalTransaksi;

    @FindBy(xpath = "//label[@for='Amount']//code[contains(text(),'*')]")
    private WebElement iconRegisterFormNominalTransaksi;

    @FindBy(xpath = "//input[@id='Amount']")
    private WebElement textFieldRegisterFormNominalTransaksi;

    @FindBy(xpath = "//label[@for='Amount_cashback']")
    private WebElement textRegisterFormNominalCashback;

    @FindBy(xpath = "//label[@for='Amount_cashback']//code[contains(text(),'*')]")
    private WebElement iconRegisterFormNominalCashback;

    @FindBy(xpath = "//input[@id='Amount_cashback']")
    private WebElement textFieldRegisterFormNominalCashback;

    @FindBy(xpath = "//label[@for='Transaction_Date']")
    private WebElement textRegisterFormTanggalTransaksi;

    @FindBy(xpath = "//label[@for='Transaction_Date']//code[contains(text(),'*')]")
    private WebElement iconRegisterFormTanggalTransaksi;

    @FindBy(xpath = "//input[@id='Transaction_Date']")
    private WebElement dateRegisterFormTanggalTransaksi;

    @FindBy(xpath = "//label[@for='Merchant_Name']")
    private WebElement textRegisterFormNamaMerchant;

    @FindBy(xpath = "//label[@for='Merchant_Name']//code[contains(text(),'*')]")
    private WebElement iconRegisterFormNamaMerchant;

    @FindBy(xpath = "//select[@id='Merchant_Name']")
    private WebElement selectRegisterFormNamaMerchant;

//    private WebElement selectRegisterFormNamaMerchant;
//
//    private WebElement optionRegisterFormNamaMerchantSOCIOLLA;


    @FindBy(xpath = "//label[@for='RRN']")
    private WebElement textRegisterFormRRN;

    @FindBy(xpath = "//label[@for='RRN']//code[contains(text(),'*')]")
    private WebElement iconRegisterFormRRN;

    @FindBy(xpath = "//input[@id='RRN']]")
    private WebElement textFieldRegisterFormRRN;

    /** End
     * Webelement Form Input Data Cashback 2
     * */

    /** start
     * Webelement Form Foto
     * */
    @FindBy(xpath = "//h3[normalize-space()='Foto']")
    private WebElement textRegisterFormFotoTableHeaderFoto;

    @FindBy(xpath = "//label[@for='Foto_Struk_EDC']")
    private WebElement textRegisterFormFotoBuktiTransaksiSatu;

    @FindBy(xpath = "//label[@for='Foto_Struk_EDC']//code[contains(text(),'*')]")
    private WebElement iconRegisterFormFotoBuktiTransaksiSatu;

    @FindBy(id = "Foto_Struk_EDC")
    private WebElement fileRegisterFormFotoBuktiTransaksiSatu;

    @FindBy(xpath = "//div[@id='Foto_Struk_EDC_error']")
    private WebElement alertRegisterFormFotoBuktiTransaksiSatu;

    @FindBy(xpath = "//label[@for='Foto_Struk']")
    private WebElement textRegisterFormFotoBuktiTransaksiDua;

    @FindBy(id = "Foto_Struk")
    private WebElement fileRegisterFormFotoBuktiTransaksiDua;

    @FindBy(xpath = "//div[@id='Foto_Struk_error']")
    private WebElement alertRegisterFormFotoBuktiTransaksiDua;

    @FindBy(xpath = "//label[@for='Foto_Transaksi_3']")
    private WebElement textRegisterFormFotoBuktiTransaksiTiga;

    @FindBy(id = "Foto_Transaksi_3")
    private WebElement fileRegisterFormFotoBuktiTransaksiTiga;

    @FindBy(xpath = "//div[@id='Foto_Transaksi_3_error']")
    private WebElement alertRegisterFormFotoBuktiTransaksiTiga;

    @FindBy(xpath = "//input[@id='btnsubmit']")
    private WebElement btnRegisterFormFotoSubmit;

    /** End
     * Webelement Form Foto
     * */

    public RegisterPage(WebDriver driver){
        this.driver= DriverSingleton.getDriver();
        PageFactory.initElements(this.driver,this);
    }

}
