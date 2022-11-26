package tests;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.Americanas;

public class AmericanasTest {

	static WebDriver driver;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver.exe");
		driver = new ChromeDriver();
		Americanas americanas = new Americanas(driver);
		driver.manage().window().maximize();
	}

	@Test
	public void deveAcessarPagina() {
		Americanas.acessarPagina(driver);
		
	}
	
	@Test
	public void deveRealizarPesquisa() {
		Americanas.clicarNaCaixaDePesquisaEDigitar();
	}

	@Test
	public void deveCapturaMensagemDeErro() {
		Americanas.capturaMensagemDeErro();
	}
	
	@Test
	public void deveTrocarEndereco() {
		Americanas.trocarEndereco();
	}
}
