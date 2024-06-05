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

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {
                "src/main/resources/features/irfan/002LoginPositifVerifikatorFinance.feature",
                "src/main/resources/features/irfan/003LoginNegatifTest.feature",
                "src/main/resources/features/irfan/021PositifTestTableVerifikasi.feature",
                "src/main/resources/features/irfan/022NegatifTestTableVerifikasi.feature",
                "src/main/resources/features/irfan/023PositifTestFormVerifikasi.feature",
                "src/main/resources/features/irfan/025PositifTestTablePreTransfer.feature",
                "src/main/resources/features/irfan/027PositifTestTableFinance.feature",
                "src/main/resources/features/irfan/031PositifTestTableUploadBuktiTransfer.feature",
                "src/main/resources/features/irfan/033TestFungsiRotasiDenganOpenCV.feature",
        },
        glue = "com.juaracoding.ta_kelompok2.impl.irfan",
        monochrome = true,
        plugin = {"pretty","html:target/PTA/htmlreport/LoginRunnerOutline.html",
                "json:target/PTA/jsonreport/LoginRunnerOutline.json",
                "junit:target/PTA/junitreport/LoginRunnerOutline.xml"}
)
public class VerifikatorFinanceOutlineRunner extends AbstractTestNGCucumberTests {}
