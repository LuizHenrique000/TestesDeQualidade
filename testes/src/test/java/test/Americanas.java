package test;

import org.openqa.selenium.WebDriver;

public class Americanas {
	
	public static void acessarPagina(WebDriver driver) {
		String url = "https://nossaslojas.americanas.com.br/?chave=o2o_hm_00_0_0_nossaslojas";
		driver.get(url);
		
	}

}
