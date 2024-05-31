package com.juaracoding.ta_kelompok2.page;
/*
IntelliJ IDEA 2023.3.6 (Community Edition)
Build #IC-233.15026.9, built on March 21, 2024
@Author kiyandark a.k.a. Muhammad Irfan Syaifur Rizal Wiratama
Java Developer
Created on 23/05/2024 12:59
@Last Modified 23/05/2024 12:59
Version 1.0
*/

import com.juaracoding.ta_kelompok2.connection.Constants;
import com.juaracoding.ta_kelompok2.connection.DriverSingleton;
import com.juaracoding.ta_kelompok2.util.GlobalFunction;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Navbar {

    WebDriver driver;

    @FindBy(xpath = "//i[@class='fas fa-search']")
    private WebElement btnNavBarSearch;

    @FindBy(xpath = "//input[@id='cri_customer']")
    private WebElement textFieldNavBarSearch;

    @FindBy(xpath = "//i[@class='fas fa-bars']")
    protected WebElement btnNavBarCollapse;

    @FindBy(xpath = "//b[normalize-space()='SOCIOLLA 2023']")
    private WebElement textNavBarBranding;

    @FindBy(xpath = "//a[@class='d-block']")
    private  WebElement textNavBarUsername;

    @FindBy(xpath = "//p[normalize-space()='Home']")
    private WebElement navigationHome;

    @FindBy(xpath = "//p[normalize-space()='Dashboard']")
    private WebElement navigationDashboard;

    @FindBy(xpath = "//p[normalize-space()='Register']")
    private WebElement navigationRegister;

    @FindBy(xpath = "//p[normalize-space()='Verifikasi']")
    private WebElement navigationVerifikasi;

    @FindBy(xpath = "//p[normalize-space()='Upload Bukti Transfer']")
    private WebElement navigationUploadBuktiTransfer;

    @FindBy(xpath = "//p[normalize-space()='Pre-Transfer']")
    private WebElement navigationPreTransfer;

    @FindBy(xpath = "//p[normalize-space()='Finance']")
    private WebElement navigationFinance;

    @FindBy(xpath = "//p[normalize-space()='Cek RRN']")
    private WebElement navigationCekRRN;

    @FindBy(xpath = "//p[normalize-space()='Input User']")
    private WebElement navigationInputUser;

    @FindBy(xpath = "//p[normalize-space()='Input Merchant']")
    private WebElement navigationInputMerchant;

    @FindBy(xpath = "//p[normalize-space()='Report Data']")
    private WebElement navigationReportData;

    @FindBy(xpath = "//p[normalize-space()='Session']")
    private WebElement navigationSession;

    @FindBy(xpath = "//p[normalize-space()='Logout']")
    private WebElement navigationLogout;

    public Navbar(WebDriver driver){
        this.driver= DriverSingleton.getDriver();
        PageFactory.initElements(this.driver,this);
    }

    public void yClickBtnVerifikasi()
    {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        try
        {
            new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                    .until(ExpectedConditions.visibilityOf(navigationVerifikasi)).click();
        }
        catch (Exception e)
        {
            System.out.println("Komponen Tombol Login Submit Tidak Ditemukan !!");
        }
    }

    public void yClickBtnLogout()
    {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        try
        {
            new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                    .until(ExpectedConditions.visibilityOf(navigationLogout)).click();
        }
        catch (Exception e)
        {
            System.out.println("Komponen Tombol Logout Tidak Ditemukan !!");
        }
    }

    public String yNavbarBrandingValidation() {
        return textNavBarBranding == null ? "" : new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(textNavBarBranding)).getText();
    }


}
