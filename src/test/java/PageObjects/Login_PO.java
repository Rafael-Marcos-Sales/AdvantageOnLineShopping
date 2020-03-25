package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login_PO {
	
	private WebDriver driver;
	
	public Login_PO(WebDriver driver) {
		this.driver = driver;
	}

	public void entrarLogin(String usuario, String senha) throws InterruptedException {
		
	WebElement btnusuario = driver.findElement(By.id("menuUser"));
	WebElement txtUsuario = driver.findElement(By.name("username"));
	WebElement txtSenha = driver.findElement(By.name("password"));
	WebElement btnSignIn = driver.findElement(By.id("sign_in_btnundefined"));
	
		
	
	btnusuario.click();
	txtUsuario.sendKeys(usuario);
	txtSenha.sendKeys(senha);
	Thread.sleep(2000);
	btnSignIn.click();
			
	}
	
}
