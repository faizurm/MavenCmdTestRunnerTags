package com.stepdefinition;

import com.base.LibGlobal;
import com.pages.ComparePopUpPagePOJO;
import com.pages.MobilePagePOJO;

import cucumber.api.java.en.When;

public class CompareMobileStep extends LibGlobal {
	MobilePagePOJO mobile;
	ComparePopUpPagePOJO comparePopUp;

	@When("user select {string} button and {string} of two mobiles and selects compare button")
	public void user_select_button_and_of_two_mobiles_and_selects_compare_button(String s, String s2) {
		mobile = new MobilePagePOJO();
		click(mobile.getAddToCompareBtn().get(Integer.parseInt(s)));
		click(mobile.getAddToCompareBtn().get(Integer.parseInt(s2)));
		click(mobile.getCompareBtn());

	}

	@When("user switches the window")
	public void user_switches_the_window() {

		switch2ndWindow();
	}

	@When("i verify that user witched his control to pop up")
	public void i_verify_that_user_witched_his_control_to_pop_up() {

		comparePopUp = new ComparePopUpPagePOJO();

		assertTrue("i verify compare products txt is displayed ", comparePopUp.getComparePrdtText().isDisplayed());

	}

	@When("i verify compare products and the selected compare products are displayed in it")
	public void i_verify_compare_products_and_the_selected_compare_products_are_displayed_in_it() {

		assertTrue("i verify  xperia mobile is displayed on compare page ", comparePopUp.getXperiaText().isDisplayed());
		assertTrue("i verify  iphone mobile is displayed on compare page ", comparePopUp.getIphoneText().isDisplayed());
	}

}
