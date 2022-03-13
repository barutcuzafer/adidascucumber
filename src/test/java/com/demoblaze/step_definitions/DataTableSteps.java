package com.demoblaze.step_definitions;

import com.demoblaze.pages.ProductPage;
import com.demoblaze.utilities.BrowserUtils;
import com.demoblaze.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;




public class DataTableSteps {

    ProductPage page=new ProductPage();
    @Then("Under {string} category User should be able to see the list of the following products")
    public void under_category_user_should_be_able_to_see_the_list_of_the_following_products(String category, List<String> expectedProducts) {

        Driver.get().findElement(By.linkText(category)).click();
        BrowserUtils.waitFor(2);
        List<String>actualProducts= BrowserUtils.getElementsTextByOscar(page.products);
        System.out.println("expectedProducts = " + expectedProducts);
        System.out.println("actualProducts = " + actualProducts);
        Assert.assertEquals("List of Products are NOT as expected",expectedProducts,actualProducts);
    }


}
