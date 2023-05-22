package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseDriver {

	public static WebDriver driver;
	
	@BeforeSuite
	public void start() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
	}
	@Test
	public void test() {
		System.out.println("Hello");
	}
	@AfterSuite
	public void close() {
		driver.close();
	}
}
