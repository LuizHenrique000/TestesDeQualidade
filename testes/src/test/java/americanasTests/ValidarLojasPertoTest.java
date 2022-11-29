package americanasTests;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.Americanas;

public class ValidarLojasPertoTest {
	
	static WebDriver driver;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver.exe");
		driver = new ChromeDriver();
		Americanas americanas = new Americanas(driver);
		driver.manage().window().maximize();
	}
	
	@Test
	public void deveValidarTotalDeLojasPerto() {
		Americanas.acessarPagina();
		Americanas.clicarNaCaixaDePesquisaDigitarEenviar();
		Americanas.capturaMensagemDeErroECompara();
	}

}
