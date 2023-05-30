package org.example.stepDefenitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.example.pages.p03_currency;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class tc03_currency {
    p03_currency curr= new p03_currency();
    SoftAssert assertnew = new SoftAssert();
    @Given("user click on box of currencies")
    public void clickbox(){
        curr.box().click();

    }
   @When("user select euro")
    public void selecterruo(){
       curr.erruo().selectByValue("https://demo.nopcommerce.com/changecurrency/6?returnUrl=%2F");
   }
   @Then("website elements changed to euro")
    public void assertprices(){
         List<WebElement> currency=curr.products();
       for(int i=0; i<currency.size();i++){
           currency=curr.products();
           String ee=currency.get(i).getText();
           assertnew.assertTrue(ee.contains("€"));


       }

   }
}
