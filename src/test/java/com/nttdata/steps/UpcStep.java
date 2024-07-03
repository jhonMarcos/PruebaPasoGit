package com.nttdata.steps;

import com.nttdata.page.MercadoPage;
import com.nttdata.page.UpcPage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class UpcStep {

    WebDriver driver;

    UpcPage page;

    public UpcStep(WebDriver driver) {
        this.driver = driver;
        page = new UpcPage(driver);
    }

    public void navegarA(String url){
        driver.get(url);
    }

    public void ingresarBarraUsername(String username)throws InterruptedException{
        page.ingresarUsername(username);
    }

    public void ingresarBarraPassword(String password)throws InterruptedException{
        page.ingresarPassword(password);
    }

    public void clicBotonInicar()throws InterruptedException{
        page.clicIniciarSesion();
    }

    public void validarInicioSesionEtiqueta(String etiqueta){
        Assertions.assertEquals(etiqueta, page.validarIngresoConEtiqueta());
        System.out.println("Inicio de sesión exitoso!");
    }

    public void clicBotonAdmin() throws InterruptedException{
        page.clicBotonAdmin();
    }

    public void ingresarBarraBusquedaUsuario(String usuario) throws InterruptedException{
        page.ingresarUsuarioBarraBusqueda(usuario);
    }

   /* public void seleccionarOpcionComboBox(String role)throws InterruptedException{
        page.seleccionarOpcionComboBoxBuscar(role);
    }*/


}
