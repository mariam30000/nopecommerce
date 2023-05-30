package org.example.pages;

import org.example.stepDefenitions.hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.Select;

public class p01_register {
    public WebElement icon(){
     WebElement registerIcon = hooks.driver.findElement(By.className("ico-register"));
    return registerIcon;}
    public WebElement name (){
        WebElement registername = hooks.driver.findElement(By.id("FirstName"));
        return registername;
    }
    public WebElement lname (){
        WebElement registerlname = hooks.driver.findElement(By.id("LastName"));
        return registerlname;
    }
    public WebElement emaill(){
        WebElement emaill = hooks.driver.findElement(By.id("Email"));
        return emaill;
    }
    public WebElement password (){
        WebElement pasword = hooks.driver.findElement(By.id("Password"));
        return pasword;
    }
    public WebElement repassword (){
        WebElement repasword = hooks.driver.findElement(By.id("ConfirmPassword"));
        return repasword;
    }

    public WebElement button (){
        WebElement registbut = hooks.driver.findElement(By.id("register-button"));
        return registbut;
    }
    public WebElement assertt(){
        WebElement asss=hooks.driver.findElement(By.className("result"));
        return asss;
    }
    public WebElement gender(){
        WebElement genderr= hooks.driver.findElement(By.id("gender-male"));
        return genderr;
    }
    public Select birthday(){
        Select selectBox = new Select(hooks.driver.findElement(By.name("DateOfBirthDay")));
        return selectBox;
    }
    public Select birtmonth(){
        Select selectBoxm = new Select(hooks.driver.findElement(By.name("DateOfBirthMonth")));
        return selectBoxm;
    }
    public Select birtyear(){
        Select selectBoxy = new Select(hooks.driver.findElement(By.name("DateOfBirthYear")));
        return selectBoxy;
    }
    public String color (){
        String rgb =hooks.driver.findElement(By.className("result")).getCssValue("color");
        return rgb;
    }
}
