package testes;

import org.openqa.selenium.WebDriver;

import PageObjects.CriarConta_PO;
import PageObjects.Login_PO;
import br.com.rsi.hub.bdd.utils.Driver;

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
