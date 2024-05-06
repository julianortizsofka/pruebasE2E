package com.saucedemo.tasks.marketplace;

import com.saucedemo.tasks.navigate.Authenticate;
import com.saucedemo.ui.login.LoginInterface;
import com.saucedemo.ui.login.MarketplaceUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class AddToCart implements Task {

    public static AddToCart twoProducts(){
        return Tasks.instrumented(AddToCart.class);
    }



    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(MarketplaceUI.BTNADDTOCART1),
                Click.on(MarketplaceUI.BTNADDTOCART2),
                Click.on(MarketplaceUI.BTNCART)


        );


    }
}
