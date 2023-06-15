package com.selenium.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverPopup {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/workspace/DXC-FSD/WebDriverDemo/src/main/webapp/PopupTest.html");
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		driver.findElement(By.id("PopUp")).click();
		
		Thread.sleep(2000);
		
		driver.quit();

	}

}
