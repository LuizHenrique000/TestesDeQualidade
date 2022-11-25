package test;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProcurarProdutoInexistenteTest {
	
	static WebDriver driver;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test
	public void pesquisaNaPagina() throws InterruptedException {
		MagazineLuiza.acessarPagina(driver);
		WebElement input = driver.findElement(By.id("input-search"));
		input.click();
		input.sendKeys("abcdefghi");
		input.sendKeys(Keys.ENTER);
		capturaMensagemDeErro();
	}
	
	private void capturaMensagemDeErro() throws InterruptedException { 
		Thread.sleep(9000);
		String mensagemDeErro = driver.findElement(By.xpath("//h1[contains(text(),'Sua busca por \"abcdefghi\" não encontrou resultado algum :(')]")).getText();
		System.out.println("Mensagem de erro do site: " + mensagemDeErro); 
	}

}
