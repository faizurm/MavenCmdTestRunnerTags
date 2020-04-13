package com.stepdefinition;

import java.util.List;

import com.base.LibGlobal;
import com.pages.CartPagePOJO;
import com.pages.MobilePagePOJO;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class QuantityVerifyStep extends LibGlobal {

	MobilePagePOJO mobile;
	CartPagePOJO cart;

	@When("i click the cart button of the sony xperia mobile")
	public void i_click_the_cart_button_of_the_sony_xperia_mobile() {

		mobile = new MobilePagePOJO();
		click(mobile.getAddToCartBtn().get(0));

	}

	@When("user clicks the qty button")
	public void user_clicks_the_qty_button() {

		cart = new CartPagePOJO();
		clear(cart.getQty());
	}

	@When("user enters the quantity")
	public void user_enters_the_quantity(io.cucumber.datatable.DataTable dataTable) {

		String s = dataTable.asList().get(0);
		typeEnter(cart.getQty(), s);

	}

	@When("i verify the error message")
	public void i_verify_the_error_message() {

		Assert.assertTrue("verify max qty error msg ", cart.getMaxQtyErrorMsg().isDisplayed());
	}

	@When("user clicks the empty cart button")
	public void user_clicks_the_empty_cart_button() {

		click(cart.getEmptyCartBtn());

	}

	@Then("i verify the shopping cart is empty")
	public void i_verify_the_shopping_cart_is_empty() {

		Assert.assertTrue("verify emprt cart msg ", cart.getCartEmptyTxt().isDisplayed());
	}

}
