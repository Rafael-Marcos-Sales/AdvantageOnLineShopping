package br.com.rsinet.hub.tdd.pageObjects;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CriarConta_PO {
	
	private WebDriver driver;
	
	//WebDriverWait wait = new WebDriverWait(driver, 70);
   
	public CriarConta_PO(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public void CriarConta() {
		
		//clicar em btnusuario
		WebElement btnusuario = driver.findElement(By.id("menuUser"));
		btnusuario.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		//Clicar em criar btncriarConta
		WebElement btncriarConta = driver.findElement(By.xpath("//a[text()='CREATE NEW ACCOUNT']"));
		btncriarConta.click();
		
		//Preencher detalhes da conta
		WebElement txtusernameRegisterPage = driver.findElement(By.name("usernameRegisterPage"));
		WebElement txtemailRegisterPage = driver.findElement(By.name("emailRegisterPage"));
		WebElement txtpasswordRegisterPage = driver.findElement(By.name("passwordRegisterPage"));
		WebElement txtconfirm_passwordRegisterPage = driver.findElement(By.name("confirm_passwordRegisterPage"));
		txtusernameRegisterPage.sendKeys("Alexandre.Sales");
		txtemailRegisterPage.sendKeys("AS@gmail.com");
		txtpasswordRegisterPage.sendKeys("As123@");
		txtconfirm_passwordRegisterPage.sendKeys("As123@");
		
		
		
		//Preencher detalhes pessoais
		WebElement txtfirstnameRegisterPage = driver.findElement(By.name("first_nameRegisterPage"));
		WebElement txtlast_nameRegisterPage = driver.findElement(By.name("last_nameRegisterPage"));
		WebElement txtphone_numberRegisterPage = driver.findElement(By.name("phone_numberRegisterPage"));
		txtfirstnameRegisterPage.sendKeys("Alexandre");
		txtlast_nameRegisterPage.sendKeys("Sales");
		txtphone_numberRegisterPage.sendKeys("014-982345678");
		
		
		//Preencher Endereço Global
		WebElement CheckBoxcountryListboxRegisterPage = driver.findElement(By.name("countryListboxRegisterPage"));
		Select Pais = new Select(CheckBoxcountryListboxRegisterPage);
		WebElement cityRegisterPage = driver.findElement(By.name("cityRegisterPage"));
		WebElement addressRegisterPage = driver.findElement(By.name("addressRegisterPage"));
		WebElement txtestado = driver.findElement(By.name("state_/_province_/_regionRegisterPage"));
		WebElement postal_codeRegisterPage = driver.findElement(By.name("postal_codeRegisterPage"));
		WebElement boxconfirm = driver.findElement(By.name("i_agree"));
		WebElement btnregister_btnundefined = driver.findElement(By.id("register_btnundefined"));

		
				
		Pais.selectByVisibleText("Brazil");
		cityRegisterPage.sendKeys("São Paulo");
		addressRegisterPage.sendKeys("Rua Pio XII,247");
		txtestado.sendKeys("São Paulo");
		postal_codeRegisterPage.sendKeys("01322-030");
		boxconfirm.click();
		btnregister_btnundefined.click();
		
	}
	
	public WebDriver fecharNavegador() {
		driver.quit();
		return driver;
	
    }
}
