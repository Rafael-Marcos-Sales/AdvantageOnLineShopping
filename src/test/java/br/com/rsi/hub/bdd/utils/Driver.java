package br.com.rsi.hub.bdd.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

	public class Driver {
		
		private static WebDriver driver;

	public static WebDriver AbriNavegadores() {
		
		System.setProperty("webdriver.chrome.driver", "src/test/resources/ChromeDriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.advantageonlineshopping.com/#/");
		driver.manage().timeouts().implicitlyWait(55, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("special_offer_items")));
		
		return driver;
	}
	
	public WebDriver fecharNavegador() {
		driver.quit();
		return driver;
	}		
}
