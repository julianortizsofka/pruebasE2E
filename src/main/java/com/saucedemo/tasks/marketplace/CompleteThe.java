package com.saucedemo.tasks.marketplace;

import com.saucedemo.tasks.navigate.Authenticate;
import com.saucedemo.ui.login.CartUI;
import com.saucedemo.ui.login.LoginInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class CompleteThe implements Task {

    private final String firstname;
    private final String lastname;
    private final String zipcode;


    public CompleteThe(String firstname,String lastname,  String zipcode){
        this.firstname = firstname;
        this.lastname = lastname;
        this.zipcode = zipcode;
    }

    public static CompleteThe buyWith(String firstname,String lastname,  String zipcode ){
        return Tasks.instrumented(CompleteThe.class, firstname, lastname, zipcode);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CartUI.BTNCHECKOUT),
                Enter.theValue(firstname).into(CartUI.INPFIRSTNAME),
                Enter.theValue(lastname).into(CartUI.INPLASTNAME),
                Enter.theValue(zipcode).into(CartUI.INPZIPCODE),
                Click.on(CartUI.BTNCONTINUE),
                WaitUntil.the(CartUI.LBCONFIRMATIONPAGE, isVisible()),
                Click.on(CartUI.BTNFINISH)



        );


    }
}
