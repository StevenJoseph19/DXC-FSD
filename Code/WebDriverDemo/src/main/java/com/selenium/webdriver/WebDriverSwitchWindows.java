package com.selenium.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverSwitchWindows {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/workspace/DXC-FSD/WebDriverDemo/src/main/webapp/CheckboxTest.html");

		// Store the id of the original window
		String originalWindow = driver.getWindowHandle();

		// Open a new tab and switches to the new tab
		driver.switchTo().newWindow(WindowType.TAB);

		// Open a new window and switches to the new window
		driver.switchTo().newWindow(WindowType.WINDOW);

		// Close the tab or window
		driver.close();

		// Switch back to the old tab or window
		driver.switchTo().window(originalWindow);

		driver.quit();

	}

}
