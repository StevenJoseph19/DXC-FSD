package com.selenium.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverIFrame {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/workspace/DXC-FSD/WebDriverDemo/src/main/webapp/IFrameTest.html");

		// Store the web element
		WebElement iframe = driver.findElement(By.cssSelector("#modal>iframe"));

		// Switch to the frame
		driver.switchTo().frame(iframe);

		// Retrieve text in H1 heading
		String text = driver.findElement(By.tagName("h1")).getText();

		System.out.println(text);

	}

}
