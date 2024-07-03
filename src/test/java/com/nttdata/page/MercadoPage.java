package com.nttdata.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MercadoPage {

    private WebDriver driver;


    private By botonIngresar = By.xpath("//nav[@id='nav-header-menu']/a[2]");
    private By barraUsername = By.xpath("//input[@id='user_id']");

    private By botonContinuarUsuario = By.xpath("//span[contains(text(),'Continuar')]");

    private WebDriverWait wait;

    public MercadoPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    public void clickEnBotonIngresar() throws InterruptedException{
        wait.until(ExpectedConditions.elementToBeClickable(botonIngresar));
        WebElement botonBusqueda = driver.findElement(botonIngresar);
        botonBusqueda.click();
    }

    public void ingresarUsername(String texto)throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(barraUsername));
        WebElement username = driver.findElement(barraUsername);
        username.sendKeys(texto);

    }

    public void clickEnbotonContinuarUsername() throws InterruptedException{
        wait.until(ExpectedConditions.elementToBeClickable(botonContinuarUsuario));
        WebElement botonContinuar = driver.findElement(botonContinuarUsuario);
        botonContinuar.click();
    }



}
