package org.example.pages;

import org.example.stepDefenitions.hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;

public class p02_login {
    public WebElement loginicon(){
        WebElement loginIcon = hooks.driver.findElement(By.className("ico-login"));
        return loginIcon;}
    public WebElement email(){
        WebElement validemail = hooks.driver.findElement(By.className("email"));
        return validemail;
    }
    public WebElement password(){
        WebElement validpassword = hooks.driver.findElement(By.className("password"));
        return validpassword;
    }
    public WebElement loginbutton(){
        WebElement buttonl = hooks.driver.findElement(By.className("login-button"));
        return buttonl;
    }
    public WebElement myaccount(){
        WebElement account = hooks.driver.findElement(By.className("ico-account"));
        return account;
    }
    public String newlink(){
        String link = hooks.driver.getCurrentUrl();
        return link;
    }
    public WebElement errormess(){
        WebElement error = hooks.driver.findElement(By.className("validation-summary-errors"));
        return error;

    }
    public String color (){
        String rgb =hooks.driver.findElement(By.className("validation-summary-errors")).getCssValue("color");
        String hex= Color.fromString(rgb).asHex();
        return hex;
    }
}
