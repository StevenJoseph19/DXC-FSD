package com.selenium.webdriver;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutoITUpload {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://softwaretestingplace.blogspot.com/2015/10/sample-web-page-to-test.html");

		driver.manage().window().maximize();

		// Store the web element
//		WebElement browse = driver.findElement(By.id("uploadfile"));

//		browse.click();

//		driver.findElement(By.id("uploadfile")).click();
//		driver.findElement(By.xpath("//*[@type='file']")).click();

		Actions builder = new Actions(driver);

		builder.moveToElement(driver.findElement(By.xpath("//*[@type='file']"))).click().build().perform();

		System.out.println("Found upload button");

		Thread.sleep(3000);

		// To call the AutoIt script
		Runtime.getRuntime().exec("C:\\HandsOnDemos\\Selenium\\UploadFile.exe");

		Thread.sleep(5000);

		// 'close' method is used to close the brower window
//		driver.close();

//		driver.quit();

	}

}
