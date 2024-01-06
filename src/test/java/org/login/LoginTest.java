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
		txtUsername.sendKeys("Hello00002@gmail.com");

		WebElement txtPassword = driver.findElement(By.id("pass"));
		txtPassword.sendKeys("Hello@1234");

		WebElement BtnLogin = driver.findElement(By.xpath("//*[@type='submit']"));
		BtnLogin.click();
		
		
		Thread.sleep(3000);
		
		driver.quit();

		


	}
}
