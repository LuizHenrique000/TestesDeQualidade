package test;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocalizarLojaTest {

	static WebDriver driver;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Test
	public void PesquisaNaPagina() throws InterruptedException {
		Americanas.acessarPagina(driver);
		WebElement input = driver.findElement(
				By.xpath("//body/div[@id='root']/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]"));
		input.click();
		input.sendKeys("94465500");
		input.sendKeys(Keys.ENTER);
		capturaMensagemDeErro();
	}

	private void capturaMensagemDeErro() throws InterruptedException {
		Thread.sleep(9000);
		String lojasDisponiveis = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[4]/div[2]/div[1]/div[1]/span[1]")).getText();
		System.out.println(lojasDisponiveis);
	}

}
