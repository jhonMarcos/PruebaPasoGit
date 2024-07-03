package com.nttdata.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class UpcPage {

    private WebDriver driver;

    private By barraUsername = By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[2]/input[1]");

    private By barraPassword = By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[2]/input[1]");

    private By clicBotonInicioSesion = By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[3]/button[1]");

    private By primerEtiquetaValidar = By.xpath("//header/div[1]/div[1]/span[1]/h6[1]");

    private By botonAdmin = By.xpath("//body/div[@id='app']/div[1]/div[1]/aside[1]/nav[1]/div[2]/ul[1]/li[1]/a[1]/span[1]");

    private By barraBusquedaUsername = By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]");

    private By seleccionComboBoxBuscar = By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/i[1]");
    private WebDriverWait wait;

    public UpcPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void ingresarUsername(String texto) throws InterruptedException{
        wait.until(ExpectedConditions.visibilityOfElementLocated(barraUsername));
        WebElement bUsername = driver.findElement(barraUsername);
        bUsername.sendKeys(texto);
    }

    public void ingresarPassword(String texto)throws InterruptedException{
        wait.until(ExpectedConditions.visibilityOfElementLocated(barraPassword));
        WebElement bPassword = driver.findElement(barraPassword);
        bPassword.sendKeys(texto);
        //Thread.sleep(5000);
    }

    public void clicIniciarSesion() throws InterruptedException{
        wait.until(ExpectedConditions.elementToBeClickable(clicBotonInicioSesion));
        WebElement botonInicioSesion = driver.findElement(clicBotonInicioSesion);
        botonInicioSesion.click();

    }

    public String validarIngresoConEtiqueta(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(primerEtiquetaValidar));
        WebElement primerEtiqueta = driver.findElement(primerEtiquetaValidar);

        return primerEtiqueta.getText();

    }

    public void clicBotonAdmin()throws InterruptedException{
        wait.until(ExpectedConditions.elementToBeClickable(botonAdmin));
        WebElement bAdmin= driver.findElement(botonAdmin);
        bAdmin.click();

    }

    public void ingresarUsuarioBarraBusqueda(String texto)throws InterruptedException{
        wait.until(ExpectedConditions.visibilityOfElementLocated(barraBusquedaUsername));
        WebElement busquedaUsuarioBarra = driver.findElement(barraBusquedaUsername);
        busquedaUsuarioBarra.sendKeys(texto);
        Thread.sleep(5000);
    }

    /*public void seleccionarOpcionComboBoxBuscar (String role)throws InterruptedException{
        wait.until(ExpectedConditions.elementToBeClickable(seleccionComboBoxBuscar));
        WebElement dropdownElement = driver.findElement(seleccionComboBoxBuscar);
        Select drpCountry = new Select(driver.findElement(By.name("User Role")));
        drpCountry.selectByVisibleText(role);
        Thread.sleep(5000);
    }*/
}
