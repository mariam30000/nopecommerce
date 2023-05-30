package org.example.stepDefenitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.p04_search;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class tc04_search {
    p04_search search = new p04_search();
    SoftAssert assertnew = new SoftAssert();
    @Given("user click enter name of product on search bar")
    public void searchbook(){

    search.searchbar().sendKeys("apple");
    }
    @Then("search done successfully")
    public void searchdone(){

        List <WebElement> list= search.searchname();
        System.out.println(list.size());
        assertnew.assertEquals(list.size(),2);
         for(int i =0;i<search.searchname().size();i++){
             list= search.searchname();
           String name =list.get(i).getText().toLowerCase();
          assertnew.assertTrue(name.contains("apple"));
             assertnew.assertAll();
        }

        assertnew.assertAll();
    }
    @Given("user click enter sku of product on search bar")

    public void invalidsearch(){
        search.searchbar().sendKeys("SCI_FAITH",Keys.ENTER);
        search.pageobeject().click();
    }
    @Then("search done by sku")
    public void failsearchbysku()
    {
     String sku = search.skuname().getText();
     assertnew.assertTrue(sku.contains("SCI_FAITH"));
     assertnew.assertAll();
    }
}
