package com.juaracoding.ta_kelompok2.page;
/*
IntelliJ IDEA 2023.3.6 (Community Edition)
Build #IC-233.15026.9, built on March 21, 2024
@Author kiyandark a.k.a. Muhammad Irfan Syaifur Rizal Wiratama
Java Developer
Created on 23/05/2024 12:49
@Last Modified 23/05/2024 12:49
Version 1.0
*/

import com.juaracoding.ta_kelompok2.connection.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    WebDriver driver;

    @FindBy(xpath = "//i[@class='fa fa-bell fa-fw']")
    private WebElement iconHomeWelcomeIcon;
    @FindBy(xpath = "//center[normalize-space()='Selamat datang, admintiara2']")
    private WebElement textHomeWelcomeMessage;

    public HomePage(WebDriver driver){
        this.driver= DriverSingleton.getDriver();
        PageFactory.initElements(this.driver,this);
    }
}
