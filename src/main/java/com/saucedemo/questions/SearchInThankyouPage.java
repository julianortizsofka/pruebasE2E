package com.saucedemo.questions;


import com.saucedemo.ui.login.ThankuPageUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class SearchInThankyouPage  implements Question<String> {

    public static Question<String> textTitle(){
        return new SearchInThankyouPage();
    }

    @Override
    public String answeredBy(Actor actor){
        return BrowseTheWeb.as(actor).find(ThankuPageUI.LBLTHANKYOU).getText();
    }
}
