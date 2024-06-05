package com.juaracoding.ta_kelompok2.page;
/*
IntelliJ IDEA 2023.3.6 (Community Edition)
Build #IC-233.15026.9, built on March 21, 2024
@Author kiyandark a.k.a. Muhammad Irfan Syaifur Rizal Wiratama
Java Developer
Created on 23/05/2024 10:43
@Last Modified 23/05/2024 10:43
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

public class LoginPage {

    WebDriver driver;

    @FindBy(xpath = "//span[@class='login100-form-title p-b-41']")
    private WebElement textLoginHeader;

    @FindBy(xpath = "//input[@placeholder='Username']")
    private WebElement textFieldInputUsername;

    @FindBy(xpath = "//input[@placeholder='Password']")
    private WebElement textFieldInputPassword;

    @FindBy(css = "div.wrap-input100.validate-input.alert-validate[data-validate='Enter username']")
    private WebElement alertLoginEmptyUsername;

    @FindBy(css = "div.wrap-input100.validate-input.alert-validate[data-validate='Enter password']")
    private WebElement alertLoginEmptyPassword;



    @FindBy(xpath = "//button[@class='login100-form-btn']")
    private WebElement btnLoginSubmit;

    @FindBy(xpath = "//b[normalize-space()='Username atau Password Salah!']")
    private WebElement alertLoginWrongCredential;

    @FindBy(xpath = "//button[@type='button']")
    private  WebElement btnLoginCloseWrongCredential;

    public LoginPage(WebDriver driver){
        this.driver= DriverSingleton.getDriver();
        PageFactory.initElements(this.driver,this);
    }

    public void clearLoginForm()
    {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        try
        {
            /** Set Field Password Empty String */
            new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                    .until(ExpectedConditions.visibilityOf(textFieldInputUsername)).clear();
            /** Set Field Username Empty String */
            new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                    .until(ExpectedConditions.visibilityOf(textFieldInputPassword)).clear();
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

    public void inputTextFieldInputUsername(String username)
    {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        try{
            new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                    .until(ExpectedConditions.visibilityOf(textFieldInputUsername)).sendKeys(username);
        }catch (Exception e){
            System.out.println("Komponen Text Field Input Username Tidak Ditemukan !!");
        }
    }

    public void inputTextFieldInputPassword(String password)
    {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        try
        {
            new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                    .until(ExpectedConditions.visibilityOf(textFieldInputPassword)).sendKeys(password);
        }
        catch (Exception e)
        {
            System.out.println("Komponen Text Field Input Password Tidak Ditemukan !!");
        }
    }

    public void clickBtnLoginSubmit()
    {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        try
        {
            new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                    .until(ExpectedConditions.visibilityOf(btnLoginSubmit)).click();
        }
        catch (Exception e)
        {
            System.out.println("Komponen Tombol Login Submit Tidak Ditemukan !!");
        }
    }

    public String getAlertLoginWrongCredential()
    {
        return (this.alertLoginWrongCredential == null) ? "" : new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(alertLoginWrongCredential)).getText();
    }


    public boolean getAlertLoginEmptyUsername()
    {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        try
        {
            new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                    .until(ExpectedConditions.visibilityOf(alertLoginEmptyUsername));
            return true;
        }
        catch (Exception e)
        {
            System.out.println("Komponen Alert Login Empty Username Tidak Ditemukan !!");
            return false;
        }

    }

    public boolean getAlertLoginEmptyPassword()
    {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        try
        {
            new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                    .until(ExpectedConditions.visibilityOf(alertLoginEmptyPassword));
            return true;
        }
        catch (Exception e)
        {
            System.out.println("Komponen Alert Login Empty Password Tidak Ditemukan !!");
            return false;
        }

    }

    public String yGetTextLoginValidation()
    {
        return textLoginHeader==null?"":new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(textLoginHeader)).getText();
    }



}
