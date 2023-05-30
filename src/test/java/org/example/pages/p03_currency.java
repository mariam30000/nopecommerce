package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.example.stepDefenitions.hooks;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class p03_currency {
    public WebElement box(){
        WebElement erruo= hooks.driver.findElement(By.id("customerCurrency"));
        return erruo;
    }
    public Select erruo(){
        Select ss = new Select(hooks.driver.findElement(By.name("customerCurrency")));
        return ss;
    }
    public List products (){
        List<WebElement> list =hooks.driver.findElements(By.className("actual-price"));
        return list;
    }

}
