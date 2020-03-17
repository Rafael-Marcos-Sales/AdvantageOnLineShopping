package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {
	
	public static WebDriver driver;
	
	public BasePage (WebDriver driver) {
		BasePage.driver = driver;
		
	}
	
	public void inicio() {
		System.setProperty("webdriver.chrome.driver" , "C:/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.advantageonlineshopping.com/#/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
	}
	
	public void finaliza() {
		driver.quit();
		
	}
	
	public WebDriver getDriver() {
		return driver;
	}

}

