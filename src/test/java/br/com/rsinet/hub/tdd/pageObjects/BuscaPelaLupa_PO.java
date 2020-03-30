package br.com.rsinet.hub.tdd.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class BuscaPelaLupa_PO {
	
	
	private WebDriver driver;
	
	
		public BuscaPelaLupa_PO(WebDriver driver) {
		this.driver = driver;
	}

	public void ClicarBotaoDaLupa() throws InterruptedException {
	
		//Clicar em btnmenuSearch
		WebElement btnsearchSection = driver.findElement(By.id("searchSection"));
		btnsearchSection.click();			
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}		
		//Preencher item na busca
		WebElement txtautoComplete = driver.findElement(By.id("autoComplete"));		
		txtautoComplete.sendKeys("Speakers");		
	}
}
