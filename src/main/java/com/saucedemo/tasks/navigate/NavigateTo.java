package com.saucedemo.tasks.navigate;

import com.saucedemo.utils.SaucedemoPage;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateTo {
    public static Performable Saucedemo() {
        return Task.where("enters in the marketplace ",
                Open.browserOn().the(SaucedemoPage.class));
    }
}
