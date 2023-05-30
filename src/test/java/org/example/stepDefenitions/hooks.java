package org.example.stepDefenitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public   class hooks {
   public static WebDriver driver;
    @Before
    public void openbrowser(){
        driver= new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.navigate().to("https://demo.nopcommerce.com/");}
    @After
    public void close(){
        driver.quit();
    }
}
