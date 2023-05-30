package org.example.pages;

import io.cucumber.java.en.Then;
import org.example.stepDefenitions.hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class p04_search {
    public WebElement searchbar(){
        WebElement search= hooks.driver.findElement(By.id("small-searchterms"));
        return search;
    }

    public List searchname(){
        List<WebElement> search= hooks.driver.findElements(By.className("ui-menu-item"));
        return search;
    }
    public WebElement sku(){
        WebElement search= hooks.driver.findElement(By.id("search-text"));
        return search;
    }
    public WebElement pageobeject(){
        WebElement search= hooks.driver.findElement(By.className("item-box"));
        return search;
    }public WebElement skuname(){
        WebElement search= hooks.driver.findElement(By.className("value"));
        return search;
    }

}
