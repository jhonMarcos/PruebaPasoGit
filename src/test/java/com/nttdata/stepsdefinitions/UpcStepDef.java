package com.nttdata.stepsdefinitions;

import com.nttdata.steps.UpcStep;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpcStepDef {

    private UpcStep upc;
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

    @Given("ingreso a la pagina web")
    public void ingresoALaPaginaWeb() throws InterruptedException {
        upc = new UpcStep(driver);
        upc.navegarA("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }


    @And("ingreso el username {string}")
    public void ingresoElUsername(String usuario) throws InterruptedException{
        upc.ingresarBarraUsername(usuario);
    }

    @And("ingreso la contraseña {string}")
    public void ingresoLaContraseña(String password) throws InterruptedException{
        upc.ingresarBarraPassword(password);
    }

    @When("hago clic en el boton iniciar sesion")
    public void hagoClicEnElBotonIniciarSesion() throws InterruptedException{
        upc.clicBotonInicar();
    }

    @Then("se deberia ingresar correctamente")
    public void seDeberiaIngresarCorrectamente() {

    }

    @And("valido que se muestre la etiqueta {string}")
    public void validoQueSeMuestreLaEtiqueta(String etiqueta) {
        upc.validarInicioSesionEtiqueta(etiqueta);
    }

    @And("hago clic en el boton admin")
    public void hagoClicEnElBotonAdmin() throws InterruptedException{
        upc.clicBotonAdmin();
    }

    @And("ingreso en la barra de busqueda el usuario {string}")
    public void ingresoEnLaBarraDeBusquedaElUsuario(String usuario)throws InterruptedException {
        upc.ingresarBarraBusquedaUsuario(usuario);
    }

   /* @And("hago clic en el combobox la opcion {string}")
    public void hagoClicEnElComboboxLaOpcion(String role) throws InterruptedException{
        upc.seleccionarOpcionComboBox(role);
    }*/
}
