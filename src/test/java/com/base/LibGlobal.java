package com.base;

import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class LibGlobal {
	public static WebDriver driver;

	public static void getDriver() {
		WebDriverManager.chromedriver().version("79.0").setup();
		driver = new ChromeDriver();
	}

	public static void loadUrl(String s) {
		driver.get(s);
	}

	public static String getTitlee() {
		return driver.getTitle();
	}

	public static void type(WebElement ele, String s) {
		ele.sendKeys(s);
	}

	public static void typeEnter(WebElement ele, String s) {
		ele.sendKeys(s, Keys.ENTER);
	}

	public static String geturll() {
		return driver.getCurrentUrl();
	}

	public static void clear(WebElement ele) {
		ele.clear();
	}

	public static String getTextt(WebElement ele) {
		return ele.getText();

	}

	public static void click(WebElement ele) {
		ele.click();
	}

	public static void selectIndex(WebElement ele, int i) {
		Select s = new Select(ele);
		s.selectByIndex(i);
	}

	public static void switch2ndWindow() {
		String parWinId = driver.getWindowHandle();
		Set<String> allWinId1 = driver.getWindowHandles();

		for (String eachId : allWinId1) {
			if (!(parWinId.equals(eachId))) {
				driver.switchTo().window(eachId);
			}
		}
	}

	public static void assertTrue(String s, boolean b) {
		Assert.assertTrue(s, b);
	}
}
