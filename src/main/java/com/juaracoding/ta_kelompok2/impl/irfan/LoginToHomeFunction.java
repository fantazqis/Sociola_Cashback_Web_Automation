package com.juaracoding.ta_kelompok2.impl.irfan;
/*
IntelliJ IDEA 2023.3.6 (Community Edition)
Build #IC-233.15026.9, built on March 21, 2024
@Author kiyandark a.k.a. Muhammad Irfan Syaifur Rizal Wiratama
Java Developer
Created on 03/06/2024 21:31
@Last Modified 03/06/2024 21:31
Version 1.0
*/

import com.juaracoding.ta_kelompok2.connection.Constants;
import com.juaracoding.ta_kelompok2.page.LoginPage;
import com.juaracoding.ta_kelompok2.page.Navbar;
import com.juaracoding.ta_kelompok2.util.GlobalFunction;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;

public class LoginToHomeFunction {
    private LoginPage loginPage;

    public LoginToHomeFunction(WebDriver driver, String username, String password)
    {
        driver.get(Constants.URL_LOGIN);
        loginPage = new LoginPage(driver);
        loginPage.clearLoginForm();
        GlobalFunction.delay(1);
        loginPage.inputTextFieldInputUsername(username);
        GlobalFunction.delay(1);
        loginPage.inputTextFieldInputPassword(password);
        GlobalFunction.delay(1);
        loginPage.clickBtnLoginSubmit();
        GlobalFunction.delay(2);

    }

}
