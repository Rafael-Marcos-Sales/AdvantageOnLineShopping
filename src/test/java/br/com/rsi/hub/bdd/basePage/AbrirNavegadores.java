package br.com.rsi.hub.bdd.basePage;

import java.util.concurrent.TimeUnit;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AbrirNavegadores {

	// instanciando a classe WebDriver
	static WebDriver driver;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {

		// informar aonde está o executável do Chrome Driver
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.advantageonlineshopping.com/#/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.findElement(By.id("menuUserSVGPath")).click();
	}

	public static void fecharChrome(WebDriver driver) {
		if (driver != null)
			driver.quit();
	}
	
	

	@Test
	public void test() {

	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {

	}

}
