package com.saucedemo.tasks.navigate;

import com.saucedemo.ui.login.LoginInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Authenticate implements Task {

    private final String username;
    private final String password;

    public Authenticate(String username,String password ){
        this.username = username;
        this.password = password;

    }

    public static Authenticate withCredentials(String username,String password ){
        return Tasks.instrumented(Authenticate.class, username, password);
    }



    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(username).into(LoginInterface.INPUSER),
                Enter.theValue(password).into(LoginInterface.INPPASSWORD),
                Click.on(LoginInterface.BTNLOGIN)

        );


    }
}
