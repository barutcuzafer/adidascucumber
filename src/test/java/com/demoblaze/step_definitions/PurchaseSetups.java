package com.demoblaze.step_definitions;

import com.demoblaze.utilities.ConfigurationReader;
import com.demoblaze.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class PurchaseSetups {

    @Given("User is on the homepage")
    public void user_is_on_the_homepage() {
        Driver.get().get(ConfigurationReader.get("demoblaze.url"));

    }
    @When("User adds some {string} from {string}")
    public void user_adds_some_from(String product, String category) {

    }
}
