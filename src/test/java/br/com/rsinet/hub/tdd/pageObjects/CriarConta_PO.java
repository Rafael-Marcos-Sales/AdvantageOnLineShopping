package br.com.rsinet.hub.tdd.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CriarConta_PO {
	
	private WebDriver driver;

	public CriarConta_PO(WebDriver driver) {
		this.driver = driver;
	}
	
	public void criarConta() {
		
		//clicar em btnusuario
		WebElement btnusuario = driver.findElement(By.id("menuUser"));
				
		btnusuario.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Clicar em criar btncriarConta
		
		WebElement btncriarConta = driver.findElement(By.xpath("//a[text()='CREATE NEW ACCOUNT']"));
		btncriarConta.click();
		
		//Preencher detalhes da conta
		WebElement txtusernameRegisterPage = driver.findElement(By.name("usernameRegisterPage"));
		WebElement txtemailRegisterPage = driver.findElement(By.name("emailRegisterPage"));
		WebElement txtpasswordRegisterPage = driver.findElement(By.name("passwordRegisterPage"));
	}
	
}
