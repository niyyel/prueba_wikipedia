package com.bdd.page;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.junit.Assume;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.FindBy;

import java.io.File;

@DefaultUrl("https://juntoz.com/")
public class JuntozPage extends PageObject {

    // CUADRO BUSQUEDA PEQUEÑO
    @FindBy(xpath = "//input[@id='inputSearchV2' and @placeholder='Busca en Juntoz.com']")
    private WebElement txt_busqueda_pequeno;

    // CUADRO BUSQUEDA GRANDE
    @FindBy(xpath = "//input[@id='inputSearchV2'and @placeholder='Buscar por producto, tienda o marca...']")
    private WebElement txt_busqueda_grande;

    //BOTON DE BUSCAR
    @FindBy(xpath = "(//button[@class='btn search-btn'])[2]")
    private WebElement txt_buscar;

    //TEXTO CONTADOR DE PRODUCTOS FINTRADOS
    @FindBy(xpath = "(//strong[contains(text(),'productos')])")
    private WebElement lbl_cantidadproductos;

    //BOTON PARA DESPLEGAR CATEGORIAS
    @FindBy(xpath = "//div[@class='hamburger-menu']")
    private WebElement btn_categorias;


    public void Abrir_la_pagina_Juntoz_en_un_navegador() {

        String navegador = "chrome";

        Browser.Start(this,navegador);

    }

    public void escribirLAPTOPEnElCuadroDeBusqueda() {

        String producto = "Laptop";

/*
       if( txt_busqueda_grande.isEnabled()){
           txt_busqueda_grande.sendKeys(producto);
       }else{
           txt_busqueda_pequeno.sendKeys(producto);
       }
*/

        try {
            txt_busqueda_grande.sendKeys(producto);
        } catch (Exception e) {
            txt_busqueda_pequeno.sendKeys(producto);
        }


    }

    public void hacerClickEnElBotónBuscar() {

        txt_buscar.click();

        try {
            Thread.sleep(3000);
        } catch (Exception e) {
        }

    }

    public void validarQueSeEncuentrenResultados() {

        String cantidad_productos = lbl_cantidadproductos.getText();  //169 productos     0 productos

        //VALIDACIÓN
        if (cantidad_productos.equals("0 productos")) {
            Assert.fail("No se encontraron productos");
        } else {
            Assert.assertTrue(true);
        }

        //CIERRA EL NAVEGADOR
        getDriver().close();

    }


    public void abrirLaPaginaJuntozEnElNavegador(String navegador) {

        Browser.Start(this,navegador);


    }

    public void escribirEnElCuadroDeBusqueda(String producto) {
        try {
            txt_busqueda_grande.sendKeys(producto);
        } catch (Exception e) {
            txt_busqueda_pequeno.sendKeys(producto);
        }
    }

    public void desplegarElPanelDeCategorías() {
        btn_categorias.click();
    }

    public void seleccionarLaCategoría(String categoria) {

        WebElement btn_categoria = getDriver().findElement(By.xpath("//div[@id='first-container']//div[@class='sidenavRow']/div[text()='" + categoria + "']"));
        btn_categoria.click();

    }

    public void seleccionarLaSubcategoría(String subcategoria) {
        WebElement btn_subcategoria = getDriver().findElement(By.xpath("//div[@id='sub-container-content']//div[text()='" + subcategoria + "']"));
        btn_subcategoria.click();

        try {
            Thread.sleep(3000);
        } catch (Exception e) {
        }

    }


}
