package com.juaracoding.ta_kelompok2.impl.irfan;
/*
IntelliJ IDEA 2023.3.6 (Community Edition)
Build #IC-233.15026.9, built on March 21, 2024
@Author kiyandark a.k.a. Muhammad Irfan Syaifur Rizal Wiratama
Java Developer
Created on 27/05/2024 5:24
@Last Modified 27/05/2024 5:24
Version 1.0
*/

import com.juaracoding.ta_kelompok2.connection.Constants;
import com.juaracoding.ta_kelompok2.connection.DriverSingleton;
import com.juaracoding.ta_kelompok2.scenariomapping.VerifikatorFinanceTesting;
import com.juaracoding.ta_kelompok2.util.GlobalFunction;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.*;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class VerifikatorFinanceOutlineHooks {
    public static WebDriver driver;
    public static ExtentTest extentTest;
    public static ExtentReports reports = new ExtentReports(GlobalFunction.rootProject+"/practiceautomation-report/extentreport/login.html");
    private static VerifikatorFinanceTesting[] tests = VerifikatorFinanceTesting.values();
    private static final int[] DATA_OUTLINE = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 4, 1, 4, 4, 4, 5, 4, 4, 1, 4, 1, 4, 1, 5, 4, 4, 1, 4, 1, 5, 4, 4, 1, 1, 4, 1, 5, 4, 4, 1, 1, 1, };
    private String testReport = "";

    @Before
    public void setUp() {
        DriverSingleton.getInstance(Constants.FIREFOX);
        driver = DriverSingleton.getDriver();
        testReport = tests[GlobalFunction.testCount].getTestName();
        extentTest = reports.startTest(testReport);
        if(GlobalFunction.countOutline==DATA_OUTLINE[GlobalFunction.testCount])
        {
            GlobalFunction.countOutline=0;
            GlobalFunction.testCount++;
        }
        GlobalFunction.countOutline++;
    }

    @AfterStep
    public void getResultStatus(Scenario scenario) throws IOException {
        if(scenario.isFailed()) {
            String screenshotPath = GlobalFunction.getScreenshot(driver, "PTA_LoginOutlineHooks"+scenario.getName().replace(" ", "_"));
            extentTest.log(LogStatus.FAIL, scenario.getName()+"\n"
                    +extentTest.addScreenCapture(screenshotPath));;
        }
    }

    @After
    public void closeObject() {
        reports.endTest(extentTest);
        reports.flush();
    }

    @AfterAll
    public static void closeBrowser() {
        GlobalFunction.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
        DriverSingleton.closeObjectInstance();
    }
}
