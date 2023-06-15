package com.selenium.webdriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverDemo {

	public static void main(String[] args) {
//		System.setProperty("webdriver.chrome.driver","C:\\workspace\\DXC-FSD\\WebDriverDemo\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");

		WebElement searchField = driver.findElement(By.name("q"));
		searchField.click();
		searchField.sendKeys("DXC");
		searchField.sendKeys(Keys.ENTER);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Images")));

		WebElement imagesLink = driver.findElements(By.linkText("Images")).get(0);
//		WebElement imagesLink = driver.findElements(By.partialLinkText("Image")).get(0);
		imagesLink.click();

		WebElement imageElement = driver.findElements(By.cssSelector("img[class='rg_i Q4LuWd']")).get(0);
		imageElement.click();
	}

}
