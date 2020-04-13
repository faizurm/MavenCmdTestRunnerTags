package com.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.LibGlobal;

public class HomePagePOJO extends LibGlobal {

	public HomePagePOJO() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h2[contains(text(),'This is demo site for')]")
	private WebElement demoSiteText;

	@FindBy(xpath = "//a[@class='level0 ']")
	private List<WebElement> mobileTv;

	public WebElement getDemoSiteText() {
		return demoSiteText;
	}

	public List<WebElement> getMobileTv() {
		return mobileTv;
	}

}
