package com.cg.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	private static WebElement element;
	public static WebElement searchBox(WebDriver driver) {
		element=driver.findElement(By.id("twotabsearchtextbox"));
		return element;
	}
}
