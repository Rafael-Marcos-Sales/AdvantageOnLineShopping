package Pages;

import java.util.concurrent.TimeUnit;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

	public class BasePage {
		
		private static WebDriver driver = new ChromeDriver();
		
		@BeforeClass
		public static void setUpBeforeClass() throws Exception{
			

			System.setProperty("webdriver.chrome.driver" , "C:/chromedriver.exe");
			driver.get("https://www.advantageonlineshopping.com/#/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		}
		
		
	@Test
	public void test() {
		
		WebDriverWait espera = new WebDriverWait(driver, 15);
		
		driver.findElement(By.id("menuUserSVGPath")).click();
		espera.until(ExpectedConditions.visibilityOf(driver.findElement(By.name("username"))));
		driver.findElement(By.name("username")).sendKeys("rms@gmail.com");
		espera.until(ExpectedConditions.visibilityOf(driver.findElement(By.name("password"))));
		driver.findElement(By.name("password")).sendKeys("RSIaulas@14");
		espera.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("/html/body/login-modal/div/div/div[3]/sec-form/sec-sender/button"))));
		driver.findElement(By.xpath("/html/body/login-modal/div/div/div[3]/sec-form/sec-sender/button")).click();
		
	}
	
	public void finaliza() {
		driver.quit();
		
	}

}
