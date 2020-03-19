package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CadastroPage {
	
	static WebDriver driver;
	
	public void CadastroPages() {
		this.driver = driver;
	}
	
	public void preencherCampos() {
		
		WebDriver driver = new ChromeDriver();
		driver.findElement(By.id("menuUser")).click();
		driver.findElement(By.xpath("/html/body/login-modal/div/div/div[3]/sec-form/sec-view[1]/div/input")).sendKeys("Rafael Sales");
		driver.findElement(By.xpath("/html/body/login-modal/div/div/div[3]/sec-form/sec-view[2]/div/input")).sendKeys("Abc@123");
		driver.findElement(By.id("sign_in_btnundefined")).click();
	}

}
