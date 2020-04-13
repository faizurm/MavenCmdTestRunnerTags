package com.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.LibGlobal;

public class CartPagePOJO extends LibGlobal {

	public CartPagePOJO() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[@class='price']")
	private WebElement price;

	@FindBy(xpath = "//input[@title='Qty']")
	private WebElement qty;

	@FindBy(xpath = "//p[@class='item-msg error']")
	private WebElement maxQtyErrorMsg;

	@FindBy(xpath = "//span[text()='Empty Cart']")
	private WebElement emptyCartBtn;

	@FindBy(xpath = "//h1[text()='Shopping Cart is Empty']")
	private WebElement cartEmptyTxt;

	public WebElement getPrice() {
		return price;
	}

	public WebElement getQty() {
		return qty;
	}

	public WebElement getMaxQtyErrorMsg() {
		return maxQtyErrorMsg;
	}

	public WebElement getEmptyCartBtn() {
		return emptyCartBtn;
	}

	public WebElement getCartEmptyTxt() {
		return cartEmptyTxt;
	}

}
