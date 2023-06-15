package com.selenium.webdriver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverAlertsandKeyPresses {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/workspace/DXC-FSD/WebDriverDemo/src/main/webapp/AlertsandKeyPressesTest.html");

		driver.manage().window().maximize();

		driver.findElement(By.id("uname")).sendKeys("username");
		driver.findElement(By.id("password")).sendKeys("Your_Password");
		driver.findElement(By.id("submit")).click();

		Thread.sleep(5000);

		Alert alert = driver.switchTo().alert(); // switch to alert

		String alertMessage = alert.getText();

		System.out.println(alertMessage);

		Thread.sleep(5000);

		alert.accept();
		
		driver.quit();

	}

}
