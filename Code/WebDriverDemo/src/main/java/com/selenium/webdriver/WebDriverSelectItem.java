package com.selenium.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebDriverSelectItem {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/workspace/DXC-FSD/WebDriverDemo/src/main/webapp/SelectItemTest.html");

		WebElement selectElement = driver.findElement(By.id("select1"));
		Select select = new Select(selectElement);
		select.selectByVisibleText("Maybe");
		
//		For a multi-select list
		select.selectByVisibleText("Yes");

	}

}
