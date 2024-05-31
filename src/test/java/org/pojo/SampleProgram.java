package org.pojo;

import java.util.Date;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleProgram extends BaseClass{
	@BeforeClass
	private void launchTheBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}
	@BeforeMethod
	private void startDate() {
		Date d = new Date();
		System.out.println(d);
	}
	@Test(retryAnalyzer = Failed.class)
	private void tc2() {
		driver.get("https://en-gb.facebook.com/");
		String title = driver.getTitle();
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("deepikanagarajan1995@gmail.com");
		Assert.assertEquals(title.contains("facebook"), "check your page title");
		WebElement pwd = driver.findElement(By.name("pass"));
		pwd.sendKeys("Deepika@123");
		
	}
	@Test
	private void tc1() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();

	}
	@Test
	private void tc4() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();

	}

}
