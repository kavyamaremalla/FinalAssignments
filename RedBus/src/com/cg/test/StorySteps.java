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

	@Given("^HomePage of rebus$")
	public void the_webpage_of_RedBus_is_loaded() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
	}

	@When("^\"([^\"]*)\" and \"([^\"]*)\" are provided as source and destination points$")
	public void and_are_provided(String arg1, String arg2) throws Throwable {
		HomePage.source(driver).sendKeys(arg1);
		Thread.sleep(2000);
		HomePage.source(driver).sendKeys(Keys.ENTER);
		HomePage.destination(driver).sendKeys(arg2);
		Thread.sleep(2000);
		HomePage.destination(driver).sendKeys(Keys.ENTER);

	}

	@When("^selecting journey date$")
	public void selecting_journey_date_is_provided() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[6]/td[5]")).click();
		driver.findElement(By.id("search_btn")).click();
	}

	@Then("^Book ticket for the corresponding details$")
	public void book_ticket_for_the_corresponding_details() throws Throwable {
		Thread.sleep(2000);
		SearchResult.viewSeats(driver).click();
		Thread.sleep(2000);
		SearchResult.selectSeat(driver);
		Thread.sleep(4000);
		SearchResult.boardPoint(driver).click();
		Thread.sleep(1000);
		SearchResult.proceed(driver).click();
	}

	@Then("^Enter person details$")
	public void enter_person_details() throws Throwable {
		Thread.sleep(2000);
		SearchResult.name(driver).sendKeys("Kavya Sri");
		SearchResult.selectGender(driver);
		SearchResult.age(driver).sendKeys("22");
		SearchResult.mail(driver).sendKeys("kavyasri607@gmail.com");
		SearchResult.mob(driver).sendKeys("9874563212");

	}

}
