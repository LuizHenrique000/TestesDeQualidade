package test;

import org.openqa.selenium.WebDriver;

public class Pagina {
	
	public static void acessarPagina(WebDriver driver) {
		String url = "https://www.magazineluiza.com.br/";
		driver.get(url);
		
	}

}
