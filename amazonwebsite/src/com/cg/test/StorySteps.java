package com.cg.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StorySteps {
	WebDriver driver;

	@Given("^The webpage of Amazon is loaded$")
	public void the_webpage_of_Amazon_is_loaded() throws Throwable {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
	}

	@When("^five products are selected$")
	public void five_products_are_selected() throws Throwable {
	    HomePage.searchBox(driver).sendKeys("oneplus 6");
	    HomePage.searchBox(driver).sendKeys(Keys.ENTER);
	    SearchResult.selectOnePlus(driver).click();
	    
	    driver.navigate().to("https://www.amazon.in/OnePlus-Red-8GB-128GB-Memory/dp/B077PW9ZRG/ref=sr_1_1?s=electronics&ie=UTF8&qid=1533542807&sr=1-1&keywords=oneplus+6");
	    String main=driver.getWindowHandle();
	    for(String handle:driver.getWindowHandles())
	    {
	    	driver.switchTo().window(handle);
	    }
	    driver.close();
	    driver.switchTo().window(main);
	    SearchResult.addToCart(driver).click();
	    driver.navigate().to("https://www.amazon.in/");
	    HomePage.searchBox(driver).sendKeys("iphone x");
	    HomePage.searchBox(driver).sendKeys(Keys.ENTER);
	    SearchResult.selectIPhone(driver).click();
	    driver.navigate().to("https://www.amazon.in/Apple-iPhone-Space-Grey-64GB/dp/B072LPF91D/ref=sr_1_1?s=electronics&ie=UTF8&qid=1533548860&sr=1-1&keywords=iphone+x");
	    main=driver.getWindowHandle();
	    for(String handle:driver.getWindowHandles())
	    {
	    	driver.switchTo().window(handle);
	    }
	    driver.close();
	    driver.switchTo().window(main);
	    SearchResult.addToCart(driver).click();
	    
	    driver.navigate().to("https://www.amazon.in/");
	    HomePage.searchBox(driver).sendKeys("hp spectre x360");
	    HomePage.searchBox(driver).sendKeys(Keys.ENTER);
	    SearchResult.selectHp(driver).click();
	    driver.navigate().to("https://www.amazon.in/HP-x360-Convertible-13-ae502TU-13-3-inch/dp/B079Y8CGQH/ref=sr_1_1?s=computers&ie=UTF8&qid=1533549587&sr=1-1&keywords=hp+spectre+x360");
	    main=driver.getWindowHandle();
	    for(String handle:driver.getWindowHandles())
	    {
	    	driver.switchTo().window(handle);
	    }
	    driver.close();
	    driver.switchTo().window(main);
	    SearchResult.addToCart(driver).click();
	    
	    driver.navigate().to("https://www.amazon.in/");
	    HomePage.searchBox(driver).sendKeys("playstation 4");
	    HomePage.searchBox(driver).sendKeys(Keys.ENTER);
	    SearchResult.selectps4(driver).click();
	    driver.navigate().to("https://www.amazon.in/Sony-Slim-Console-Free-Games/dp/B07D7PH5GP/ref=sr_1_2?s=videogames&ie=UTF8&qid=1533549629&sr=1-2&keywords=playstation+4");
	    main=driver.getWindowHandle();
	    for(String handle:driver.getWindowHandles())
	    {
	    	driver.switchTo().window(handle);
	    }
	    driver.close();
	    driver.switchTo().window(main);
	    SearchResult.addToCart(driver).click();
	}
	@Then("^Buy them$")
	public void buy_them() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"hlb-ptc-btn-native\"]")).click();
	    driver.close();
	}



}
