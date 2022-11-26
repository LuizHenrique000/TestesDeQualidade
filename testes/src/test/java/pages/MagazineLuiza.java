package pages;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MagazineLuiza {
	
	static WebDriver driver;
	
	public MagazineLuiza(WebDriver driver) {
		this.driver = driver;
	}
	
	public static void acessarPagina() {
		String url = "https://www.magazineluiza.com.br/";
		driver.get(url);	
	}
	
	public static void clicarNaCaixaDePesquisaEDigitar() {
		WebElement input = driver.findElement(By.id("input-search"));
		input.click();
		input.sendKeys("abcdefghi");
		input.sendKeys(Keys.ENTER);
	}
	
	public static void capturaMensagemDeErro() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String mensagemDeErro = driver.findElement(By.xpath("//h1[contains(text(),'Sua busca por \"abcdefghi\" não encontrou resultado algum :(')]")).getText();
		System.out.println("Mensagem de erro do site: " + mensagemDeErro); 
	}

	
}
