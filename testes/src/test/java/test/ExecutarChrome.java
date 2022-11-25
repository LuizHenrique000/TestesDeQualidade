package test;

import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExecutarChrome {
	
	static WebDriver driver;
	
//	@BeforeClass
//	public static void setUpBeforeClass() throws Exception {
//		
//	}
	
	public static void main(String[] args) throws InterruptedException {
		executarChromeDriver();
		Pagina.acessarPagina(driver);
		WebElement input = driver.findElement(By.id("input-search"));
		input.click();
		input.sendKeys("abcdefghi");
		input.sendKeys(Keys.ENTER);
		Thread.sleep(9000);
		String a = driver.findElement(By.xpath("//h1[contains(text(),'Sua busca por \"abcdefghi\" não encontrou resultado algum :(')]")).getText();
		System.out.println(a);
	}
	
	public static void executarChromeDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
