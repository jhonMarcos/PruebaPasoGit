package com.nttdata.steps;

import com.nttdata.page.MercadoLibrePage;
import com.nttdata.page.MercadoPage;
import org.openqa.selenium.WebDriver;

public class MercadoStep {
   WebDriver driver;
   MercadoPage page;

    public MercadoStep(WebDriver driver) {
        this.driver = driver;
        page = new MercadoPage(driver);
    }

    public void navegarA(String url){
        driver.get(url);
    }

    public void ingresarAInicioCuenta() throws InterruptedException{
        page.clickEnBotonIngresar();
    }

    public void ingresarUsernameBarra (String username) throws InterruptedException{
        page.ingresarUsername(username);
        page.clickEnbotonContinuarUsername();
    }



}
