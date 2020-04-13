package com.stepdefinition;

import com.base.LibGlobal;
import com.pages.CartPagePOJO;
import com.pages.MobilePagePOJO;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class XperiaPriceCheckStep extends LibGlobal {

	MobilePagePOJO mobile;
	CartPagePOJO cart;
	static String xperiaPriceMobilePage;
	String xperiaPriceCartPage;

	@When("i get the  price of the xperia mobile")
	public void i_get_the_price_of_the_xperia_mobile() {

		mobile = new MobilePagePOJO();
		xperiaPriceMobilePage = getTextt(mobile.getXperiaPrice());
		System.out.println(xperiaPriceMobilePage);
	}

	@When("i click the sony xperia mobile")
	public void i_click_the_sony_xperia_mobile() {

		click(mobile.getXperiaMobile());
	}

	@When("i verify user land on sony Xperia cart page")
	public void i_verify_user_land_on_sony_Xperia_cart_page() {

		Assert.assertTrue("verify user lands on xperia cart page ", geturll().contains("sony-xperia.html"));
	}

	@Then("i verify the price in the detail page and the previous page are same")
	public void i_verify_the_price_in_the_detail_page_and_the_previous_page_are_same() {

		cart = new CartPagePOJO();
		xperiaPriceCartPage = getTextt(cart.getPrice());
		System.out.println(xperiaPriceCartPage);

		Assert.assertTrue("i verify both the prices in the mobile and cart page r same ",
				xperiaPriceMobilePage.equals(xperiaPriceCartPage));

	}

}
