package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.LibGlobal;

public class ComparePopUpPagePOJO extends LibGlobal {

	public ComparePopUpPagePOJO() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h1[text()='Compare Products']")
	private WebElement comparePrdtText;

	@FindBy(xpath = "//a[text()='Sony Xperia']")
	private WebElement xperiaText;

	@FindBy(xpath = "//a[text()='IPhone']")
	private WebElement iphoneText;

	public WebElement getComparePrdtText() {
		return comparePrdtText;
	}

	public WebElement getXperiaText() {
		return xperiaText;
	}

	public WebElement getIphoneText() {
		return iphoneText;
	}

}
