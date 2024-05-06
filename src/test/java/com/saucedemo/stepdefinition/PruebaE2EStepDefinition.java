package com.saucedemo.stepdefinition;

import com.saucedemo.tasks.marketplace.AddToCart;
import com.saucedemo.tasks.navigate.Authenticate;
import com.saucedemo.tasks.navigate.NavigateTo;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class PruebaE2EStepDefinition {
    String name;

    @Before
    public void setTheStage() {

        OnStage.setTheStage(new OnlineCast());
    }


    @Given("the {string} enters in the marketplace with their valid credentials {string} y {string}")
    public void theEntersInTheMarketplaceWithTheirValidCredentialsY(String name, String user, String password) {
        this.name = name;
        theActorCalled(name).attemptsTo(
                NavigateTo.Saucedemo(),
                Authenticate.withCredentials(user, password)
        );
    }
    @When("add two products to the shopping cart and complete the purchase")
    public void addTwoProductsToTheShoppingCartAndCompleteThePurchase() {
        theActorInTheSpotlight().attemptsTo(
                AddToCart.twoProducts()

        );

    }
    @Then("the customer will see the confirmation of their purchase {string}")
    public void theCustomerWillSeeTheConfirmationOfTheirPurchase(String string) {

    }
}
