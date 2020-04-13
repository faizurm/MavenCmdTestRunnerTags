package com.stepdefinition;

import org.junit.Assert;

import com.base.LibGlobal;
import com.pages.HomePagePOJO;
import com.pages.MobilePagePOJO;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class PhoneSortStep extends LibGlobal {

	HomePagePOJO home;
	MobilePagePOJO mobile;

	@Given("user lands on home page")
	public void user_lands_on_home_page() {

		loadUrl("http://live.demoguru99.com/index.php/");
	}

	@Given("i verify user is on home page")
	public void i_verify_user_is_on_home_page() {
		home = new HomePagePOJO();

		Assert.assertTrue("verify user is on home page ",
				getTextt(home.getDemoSiteText()).contains("THIS IS DEMO SITE FOR"));

	}

	@When("user clicks mobile button")
	public void user_clicks_mobile_button() {

		click(home.getMobileTv().get(0));
	}

	@When("i verify user lands on mobile page")
	public void i_verify_user_lands_on_mobile_page() {

		Assert.assertTrue("verify mobile page ", getTitlee().contains("Mobile"));
	}

	@When("user selects sort by to {string}")
	public void user_selects_sort_by_to(String s) {

		mobile = new MobilePagePOJO();
		selectIndex(mobile.getSortBy().get(0), Integer.parseInt(s));

	}

	@When("i verify all products are sorted according to names")
	public void i_verify_all_products_are_sorted_according_to_names() {

		for (int i = 0; i < mobile.getProductTite().size(); i++) {
			System.out.println(getTextt(mobile.getProductTite().get(i)));

		}
	}

}
