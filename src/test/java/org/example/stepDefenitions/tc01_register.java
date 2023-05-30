package org.example.stepDefenitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.p01_register;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;


import java.util.concurrent.TimeUnit;

public class tc01_register {

    p01_register register = new p01_register();



    @Given("user press on register icon")
    public void register() {

        register.icon().click();
    }

    @When("user fill all required data")
    public void filldata() {

        int random_int = (int) Math.floor(Math.random()*(32-1+1)+1) ;

        register.gender().click();
        register.lname().sendKeys("mariam");
        register.name().sendKeys("mariam");
        register.birthday().selectByValue("31");
        register.birtmonth().selectByValue("3");
        register.birtyear().selectByValue("2000");
        register.emaill().sendKeys("mariam8889@gmail.dom");
        register.password().sendKeys("1234567");
        register.repassword().sendKeys("1234567");


    }

    @And("user press on register button")
    public void press(){register.button().click();}
    @Then("registation done successfully")
    public void asserttregis(){
        SoftAssert assertnew = new SoftAssert();
//assertnew.assertTrue(error.contains("Your username is invalid!"));
        String r=register.assertt().getText();
        assertnew.assertTrue(r.contains("Your registration completed"));
        assertnew.assertEquals(register.color(),"rgba(76, 177, 124, 1)");
        assertnew.assertAll();
                //Assert.assertEquals(rgb,"rgba(93, 164, 35, 1)");

    }


}