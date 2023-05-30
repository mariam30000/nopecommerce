package org.example.pages;
import org.example.stepDefenitions.hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class p05_hover {
    public WebElement category(){

        WebElement comp = hooks.driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[1]/a"));
        return comp;
    }
  public WebElement subcategory(){
        WebElement note=hooks.driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[1]/ul/li[2]/a"));
        return note;
    }
 public WebElement title() {
     WebElement titlee=hooks.driver.findElement(By.className("page-title"));
     return titlee;
 }
}
