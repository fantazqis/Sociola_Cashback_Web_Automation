package com.juaracoding.ta_kelompok2;

import com.juaracoding.ta_kelompok2.connection.Constants;
import com.juaracoding.ta_kelompok2.util.DataGenerator;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Coretan {

    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        String baseUrl = "https://dev.ptdika.com/xcashback_sociolla/login";
        driver.get(baseUrl);
        driver.manage().window().maximize();
        WebElement validateEnterUsername = driver.findElement(By.xpath("//div[@data-validate='Enter username']"));
        WebElement validateEnterPassword = driver.findElement(By.cssSelector("div[data-validate='Enter password']"));
        WebElement btnLogin = driver.findElement(By.xpath("//button[@class='login100-form-btn']"));
        WebElement textFieldPassword = driver.findElement(By.xpath("//input[@placeholder='Password']"));

        /** kalau ini di uncomment nanti nilai dari textField akan menjadi false, karena hanya bernilai true jika tidak diisi saja */
//        textFieldPassword.sendKeys("a");
        btnLogin.click();
        /** ketika tanda seru nya muncul di field username ini akan bernilai true
         sedangkan kalau tidak, ini akan bernilai false */
        boolean beforePseudoElementUsername = (boolean) ((JavascriptExecutor) driver).executeScript(
                "return window.getComputedStyle(arguments[0], '::before').content !== 'none';", validateEnterUsername);
        System.out.println("Validasi yang muncul saat empty di field username " + beforePseudoElementUsername);

        delay(2);
        boolean beforePseudoElementPassword = (boolean) ((JavascriptExecutor) driver).executeScript(
                "return window.getComputedStyle(arguments[0], '::before').content !== 'none';", validateEnterPassword);
        System.out.println("Validasi yang muncul saat empty di field password " + beforePseudoElementPassword);
        delay(2);
        driver.close();
    }

    public static void delay(int intDetik) {
        if (Constants.GLOB_PARAM_DELAY.equalsIgnoreCase("y")) {
            try {
                Thread.sleep(intDetik * 1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}