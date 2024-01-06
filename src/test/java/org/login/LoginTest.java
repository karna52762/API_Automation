package org.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	@Test
	public void f() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		WebElement txtUsername = driver.findElement(By.id("email"));
		txtUsername.sendKeys("karna52762");

		WebElement txtPassword = driver.findElement(By.id("pass"));
		txtPassword.sendKeys("Hello@1234");
		
		Thread.sleep(3000);
		
		driver.quit();

		


	}
}
