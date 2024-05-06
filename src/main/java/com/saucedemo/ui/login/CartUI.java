package com.saucedemo.ui.login;

import org.openqa.selenium.By;

public class CartUI {
    public static By LBLCART = By.xpath("//*[@id=\"header_container\"]/div[2]/span");
    public static By BTNCHECKOUT = By.xpath("//*[@id=\"checkout\"]\n");

    public static By INPFIRSTNAME = By.xpath("//*[@id=\"first-name\"]");
    public static By INPLASTNAME = By.xpath("//*[@id=\"last-name\"]");

    public static By INPZIPCODE = By.xpath("//*[@id=\"postal-code\"]");

    public static By BTNCONTINUE= By.xpath("//*[@id=\"continue\"]");

    public static By LBCONFIRMATIONPAGE = By.xpath("//*[@id=\"header_container\"]/div[2]/span");

    public static By BTNFINISH= By.xpath("//*[@id=\"finish\"]");

}
