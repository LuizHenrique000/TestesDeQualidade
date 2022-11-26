package tests;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.MagazineLuiza;

public class MagazineLuizaTest {
	
	static WebDriver driver;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver.exe");
		driver = new ChromeDriver();
		MagazineLuiza magazineLuiza = new MagazineLuiza(driver);
		driver.manage().window().maximize();
	}
	
	@Test
	public void deveAcessarPagina() {
		MagazineLuiza.acessarPagina();
	}
	
	@Test
	public void devePesquisarNoInput() {
		MagazineLuiza.clicarNaCaixaDePesquisaEDigitar();
	}
	
	@Test
	public void deveCapturarMensagemDeErro() {
		MagazineLuiza.capturaMensagemDeErro();
	}

}
