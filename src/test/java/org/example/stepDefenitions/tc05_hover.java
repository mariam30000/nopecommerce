package org.example.stepDefenitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.p05_hover;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;

public class tc05_hover {
    p05_hover hover = new p05_hover();
    SoftAssert assertnew = new SoftAssert();
    @Given("user hover on top menu")
    public void hover(){
        Actions action = new Actions(hooks.driver);

//Performing the mouse hover action on the target element.
        action.moveToElement(hover.category()).perform();

    }
    @When("user choose sub-category")
    public void select_sub_category(){
        hover.subcategory().click();
    }
    @Then("user directed to sub-category page")
    public void check_title(){
        String titlepage=hover.title().getText().toLowerCase().trim();
        assertnew.assertTrue(titlepage.contains("notebooks"));
    }
}
