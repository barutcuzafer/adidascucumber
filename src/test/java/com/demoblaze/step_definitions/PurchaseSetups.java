package com.demoblaze.step_definitions;

import com.demoblaze.pages.PlaceOrderPage;
import com.demoblaze.pages.ProductPage;
import com.demoblaze.utilities.ConfigurationReader;
import com.demoblaze.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class PurchaseSetups {
    ProductPage productPage=new ProductPage();
    PlaceOrderPage placeOrder=new PlaceOrderPage();
    int expectedPurchaseAmount;
    @Given("User is on the homepage")
    public void user_is_on_the_homepage() {


    }
    @When("User adds some {string} from {string}")
    public void user_adds_some_from(String product, String category) throws InterruptedException {
         productPage.navigateTo(product,category);
         productPage.addToCart();
         productPage.home.click();
    }


    @And("User Navigates to cart and removes {string}")
    public void userNavigatesToCartAndRemoves(String product) {
        productPage.cart.click();



        productPage.deleteProduct(product);



    }

    @And("User clicks on place order")
    public void userClicksOnPlaceOrder() {
        productPage.cart.click();

        expectedPurchaseAmount = Integer.parseInt(productPage.totalPrice.getText());

        productPage.placeOrder.click();
    }

    @And("User fills the form for order and clicks on purchase button")
    public void userFillsTheFormForOrderAndClicksOnPurchaseButton() {
        placeOrder.fillForm();
        placeOrder.clickOnToPurchase();

    }

    @Then("Order ID and Order amount should be as expected")
    public void orderIDAndOrderAmountShouldBeAsExpected() {

        String orderDetailstext=placeOrder.orderDetails.getText();
        System.out.println(orderDetailstext);

        String orderId=orderDetailstext.split("\n")[0];
        System.out.println("orderId = " + orderId);

        int actualPurchaseAmount=Integer.parseInt(orderDetailstext.split("\n")[1].split(" ")[1]);
        System.out.println("actualPurchaseAmount = " + actualPurchaseAmount);

        Assert.assertEquals(expectedPurchaseAmount,actualPurchaseAmount);

        placeOrder.okey.click();


    }


}
