package io.cucumber.fernanda;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.openqa.selenium.By;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Dado;

public class ConsultarSiteSteps {
   public ConsultarSiteSteps(){
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
	    browser = new ChromeDriver();    
    }

public WebDriver browser;

    


@Dado("que estou no site do torne se um programador")
public void que_estou_no_site_do_torne_se_um_programador() {
    browser.get("https://www.torneseumprogramador.com.br/");
    }

@Dado("digito no campo de busca a palavra {string}")
public void digito_no_campo_de_busca_a_palavra(String string) {
    WebElement input = browser.findElement( By.cssSelector("input[name='q']"));
    input.sendKeys(string);
    }

@Dado("cliclo em pesquisar")
public void cliclo_em_pesquisar() {
    WebElement input = browser.findElement( By.cssSelector("button[class='btn btn-outline-dark btn-pesquisa']"));
    input.click();
    }

@Entao("devo ver o resultado na busca")
public void devo_ver_o_resultado_na_busca(String string) {
    WebElement input = browser.findElement( By.cssSelector("h3.h3-card-title"));
    assertEquals(string, input.getText());
    browser.quit();
    }


}