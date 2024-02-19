package com.crm.qa.base;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleWeb {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver = WebDriverManager.chromedriver().create();//code to set the sytem property by using webdriver manager
//		System.setProperty("webdriver.chrome.driver", "/Users/jayantakumarpanda/Downloads/chromedriver-mac-x64/chromedriver");
//		WebDriver driver = new ChromeDriver();//lunch chrome
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://app-qa.sortly.co/login");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("jaypandatech@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Jayanta$14");
		driver.findElement(By.xpath("//button[normalize-space()='Continue']")).click();
//		driver.findElement(By.xpath("//span[@class='icon icon-xs mdi-chart-bar']"));
//		driver.findElement(By.xpath("//a[contains(text(),'Sign Up')]"));
//		driver.findElement(By.xpath("//div[@class='rd-navbar-panel']//span[2]"));
//		driver.quit();

	}
}