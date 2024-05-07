package com.saucedemo.questions;


import com.saucedemo.ui.login.CartUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;


public class SearchInCheckout implements Question<String> {

    public static Question<String> textLabel(){
        return new SearchInCheckout();
    }

    @Override
    public String answeredBy(Actor actor){
        return BrowseTheWeb.as(actor).find(CartUI.LBLCART).getText();
    }

}
