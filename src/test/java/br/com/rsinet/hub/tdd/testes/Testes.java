package br.com.rsinet.hub.tdd.testes;

import org.openqa.selenium.WebDriver;

import br.com.rsi.hub.bdd.utils.Driver;
import br.com.rsinet.hub.tdd.pageObjects.CriarConta_PO;
import br.com.rsinet.hub.tdd.pageObjects.Login_PO;

public class Testes {
	
	public static void main(String[] args){
		
		//new Driver().AbriNavegadores();
		
		WebDriver driver;
		
		driver = new Driver().AbriNavegadores();
		
		new CriarConta_PO(driver).criarConta();
		
		
//		try {
//			new Login_PO(driver).entrarLogin("usuarioteste", "passw0rdTest");
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
	}

}
