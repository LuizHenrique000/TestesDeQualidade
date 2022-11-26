package pages;

import static org.junit.Assert.assertEquals;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Americanas {
	
	static WebDriver driver;
	
	public Americanas(WebDriver driver) {
		this.driver = driver;
	}
	
	public static void acessarPagina(WebDriver driver) {
		String url = "https://nossaslojas.americanas.com.br/?chave=o2o_hm_00_0_0_nossaslojas";
		driver.get(url);
	}
	
	public static void clicarNaCaixaDePesquisaEDigitar() {
		WebElement input = driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]"));
		input.click();
		input.sendKeys("94465500");
		input.sendKeys(Keys.ENTER);
	}
	
	public static void capturaMensagemDeErro() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String lojasDisponiveis = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[4]/div[2]/div[1]/div[1]/span[1]")).getText();
		assertEquals("19 Americanas perto de você", lojasDisponiveis);
		System.out.println(lojasDisponiveis);
	}
	
	public static void trocarEndereco() {
		WebElement trocarEndereco = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div/div[2]/span"));
		trocarEndereco.click();
		WebElement inputTrocaEndereco = driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/div[1]/input[1]"));
		inputTrocaEndereco.click();
		inputTrocaEndereco.sendKeys("Martello Hotel");
		inputTrocaEndereco.sendKeys(Keys.ENTER);
		String lojasPerto = driver.findElement(By.xpath("//body/div[@id='root']/div[4]/div[2]/div[1]/div[1]/span[1]")).getText();
		assertEquals("1 Americanas perto de você", lojasPerto);
		System.out.println(lojasPerto);
	}

}
