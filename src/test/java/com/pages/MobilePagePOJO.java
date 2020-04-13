package com.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.LibGlobal;

public class MobilePagePOJO extends LibGlobal {
	public MobilePagePOJO() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//select[@title='Sort By']")
	private List<WebElement> sortBy;

	@FindBy(xpath = "//h2//child::a")
	private List<WebElement> productTite;

	@FindBy(xpath = "//a[text()='Sony Xperia']//parent::h2//following-sibling::div//child::span//child::span")
	private WebElement xperiaPrice;

	@FindBy(xpath = "//a[text()='Sony Xperia']")
	private WebElement xperiaMobile;

	@FindBy(xpath = "//button[@title='Add to Cart']")
	private List<WebElement> addToCartBtn;

	@FindBy(xpath = "//a[@class='link-compare']")
	private List<WebElement> addToCompareBtn;

	@FindBy(xpath = "//button[@title='Compare']")
	private WebElement compareBtn;

	public List<WebElement> getSortBy() {
		return sortBy;
	}

	public List<WebElement> getProductTite() {
		return productTite;
	}

	public WebElement getXperiaPrice() {
		return xperiaPrice;
	}

	public WebElement getXperiaMobile() {
		return xperiaMobile;
	}

	public List<WebElement> getAddToCartBtn() {
		return addToCartBtn;
	}

	public List<WebElement> getAddToCompareBtn() {
		return addToCompareBtn;
	}

	public WebElement getCompareBtn() {
		return compareBtn;
	}

}
