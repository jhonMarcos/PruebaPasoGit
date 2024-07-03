package com.nttdata.stepsdefinitions;

import com.nttdata.steps.MercadoStep;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MercadoStepDef {

    private MercadoStep mercado;
    private WebDriver driver;
    private Scenario scenario;

    @Before(order = 0)
    public void setUp(){
        //Se ejecutará Automáticamente
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Before(order = 1)
    public void setScenario(Scenario scenario){
        this.scenario = scenario;
    }

    @After
    public void quitDriver(){
        driver.quit();
    }

    @Given("ingrese a la pagina web Mercado Libre")
    public void ingreseALaPaginaWebMercadoLibre() throws InterruptedException {
        mercado=new MercadoStep(driver);
        mercado.navegarA("https://mercadolibre.com.pe/");
    }

    @And("hago clic en ingresar")
    public void hagoClicEnIngresar() throws InterruptedException {
        mercado.ingresarAInicioCuenta();
    }

    @And("ingreso mi username {string}")
    public void ingresoMiUsername(String arg0) throws InterruptedException{
        mercado.ingresarUsernameBarra(arg0);
    }

    @And("ingreso mi contraseña {string}")
    public void ingresoMiContraseña(String arg0) {
    }

    @When("hago clic en iniciar sesion")
    public void hagoClicEnIniciarSesion() {
    }

    @Then("se mostrara la cuenta iniciada")
    public void seMostraraLaCuentaIniciada() {
    }
}
