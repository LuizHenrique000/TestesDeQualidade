package magazineLuizaTests;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.MagazineLuiza;

public class CapturaMensagemDeErroTest {

	static WebDriver driver;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver.exe");
		driver = new ChromeDriver();
		MagazineLuiza magazineLuiza = new MagazineLuiza(driver);
		driver.manage().window().maximize();
	}
	
	@Test
	public void devePegarMensagemDeErroEComparar () {
		MagazineLuiza.acessarPagina();
		MagazineLuiza.clicarNaCaixaDePesquisaEDigitar();
		MagazineLuiza.enviar();
		MagazineLuiza.capturaMensagemDeErroECompara();
	}
}
