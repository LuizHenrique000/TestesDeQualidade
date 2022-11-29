package magazineLuizaTests;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.MagazineLuiza;

public class DigitarTest {

	static WebDriver driver;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver.exe");
		driver = new ChromeDriver();
		MagazineLuiza magazineLuiza = new MagazineLuiza(driver);
		driver.manage().window().maximize();
	}

	@Test
	public void deveAcessarPaginaEDigitarONomeDoProduto() {
		MagazineLuiza.acessarPagina();
		MagazineLuiza.clicarNaCaixaDePesquisaEDigitar();
	}

}
