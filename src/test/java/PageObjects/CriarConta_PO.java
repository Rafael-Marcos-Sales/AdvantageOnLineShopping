package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CriarConta_PO {
	
	private WebDriver driver;

	public CriarConta_PO(WebDriver driver) {
		this.driver = driver;
	}
	
	public void criarConta() {
				
		WebElement btnusuario = driver.findElement(By.id("menuUser"));
		WebElement btncriarConta = driver.findElement(By.xpath("//a[text()='CREATE NEW ACCOUNT']"));
		
		
		btnusuario.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		btncriarConta.click();
		

	}
	
}
