package org.example.stepDefenitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.p01_register;
import org.example.pages.p02_login;
import org.testng.asserts.SoftAssert;

public class tc02_login {
     p02_login login= new p02_login();
    SoftAssert assertnew = new SoftAssert();
    @Given("user go to login page")
    public void gotologinpage(){
     login.loginicon().click();
    }
    @When("user fill with valid data")
    public void loginwithvaliddata(){
        login.email().sendKeys("mariam8889@gmail.dom");
        login.password().sendKeys("1234567");
    }
    @And("press on login button")
    public void pressbutton(){
        login.loginbutton().click();
    }
    @Then("login done successfully")
    public void validlogin(){

        assertnew.assertEquals(login.newlink(),"https://demo.nopcommerce.com/");
        assertnew.assertTrue(login.myaccount().isDisplayed());
        assertnew.assertAll();
    }
    @When("user fill with invalid data")
    public void loginwithinvaliddata() {
        login.email().sendKeys("maria@gmail.com");
        login.password().sendKeys("12345678");
    }
    //Login was unsuccessful
    @Then("login doesn't done")
    public void invalidlogin(){
        String error = login.errormess().getText();
        assertnew.assertTrue(error.contains("Login was unsuccessful"));
        assertnew.assertEquals(login.color(),"#e4434b");
        assertnew.assertAll();
    }
}
