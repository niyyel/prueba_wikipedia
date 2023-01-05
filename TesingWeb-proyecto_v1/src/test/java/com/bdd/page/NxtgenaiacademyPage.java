package com.bdd.page;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.Locale;

@DefaultUrl("https://nxtgenaiacademy.com/demo-site/")
public class NxtgenaiacademyPage extends PageObject {

    @FindBy(id = "vfb-5")
    WebElement txtFirtsname;
    @FindBy(id = "vfb-7")
    WebElement txtLastname;
    @FindBy(id = "vfb-8-1")
    WebElement rb_Masculino;
    @FindBy(id = "vfb-8-2")
    WebElement rb_Femenino;
    @FindBy(id = "vfb-13-address")
    WebElement txtAddress;//vfb-13-address-2
    @FindBy(id = "vfb-13-address-2")
    WebElement txtStreetAddress;
    @FindBy(id = "vfb-13-city")
    WebElement txtAddress2;
    @FindBy(id = "vfb-13-zip")
    WebElement txCity;
    @FindBy(id = "vfb-13-country")
    WebElement cbCountry;
    @FindBy(id = "vfb-14")
    WebElement txtEmail;
    @FindBy(id = "vfb-18")
    WebElement txtFecha;
    @FindBy(id = "vfb-16-hour")
    WebElement cbHora;
    @FindBy(id = "vfb-16-min")
    WebElement cbMinutu;
    @FindBy(id = "vfb-19")
    WebElement txtTelefono;

    @FindBy(id = "vfb-20-0")
    WebElement chSelen;
    @FindBy(id = "vfb-20-1")
    WebElement chUFT;
    @FindBy(id = "vfb-20-2")
    WebElement chTex;
    @FindBy(id = "vfb-20-3")
    WebElement chCore;
    @FindBy(id = "vfb-20-4")
    WebElement chFunc;
    @FindBy(id = "vfb-20-5")
    WebElement chOtro;

    @FindBy(id = "vfb-23")
    WebElement txtConsulta;
    @FindBy(id = "vfb-3")
    WebElement txtCodigoV;
    @FindBy(id = "vfb-4")
    WebElement btnSubmit;
    @FindBy(xpath = "//*[contains(text(),'Successfully')]")
    WebElement txtMensajeExitosa;

    public void Abrir_la_pagina_web_en_un_navegador(String navegador) {
        Browser.Start(this, navegador);
    }

    public void ingresarNombre(String nombre) {
        if (txtFirtsname.isEnabled()) {
            txtFirtsname.sendKeys(nombre);
        } else {
            System.out.println("No se encontro el elemento :");
        }
    }

    public void ingresarApellido(String apellido) {
        if (txtLastname.isEnabled()) {
            txtLastname.sendKeys(apellido);
        } else {
            System.out.println("No se encontro el elemento :");
        }
    }

    public void seleccionarGenero(String genero) throws Throwable {
        switch (genero.toLowerCase()) {
            case "femenino":
                rb_Femenino.click();
                break;
            case "masculino":
                rb_Masculino.click();
                break;
            default:
                Assert.fail("Se ingreso Genero incorrecto");
                break;
        }
    }

    public void seleccionarCurso(String cursos) throws Throwable {
        String[] listCurso = cursos.split(",");

        for (String curso : listCurso) {
            switch (curso.toUpperCase()) {
                case "SELENIUM WEBDRIVER":
                    chSelen.click();
                    break;
                case "UFT":
                    chUFT.click();
                    break;
                case "TESTNG":
                    chTex.click();
                    break;
                case "CORE JAVA":
                    chCore.click();
                    break;
                case "FUNCTIONAL TESTING":
                    chFunc.click();
                    break;
                case "OTHERS":
                    chOtro.click();
                    break;
                default:
                    Assert.fail("Se ingreso un curso incorrecto");
                    break;
            }
        }

    }


    public void ingresarDireccion(String direccion) {
        if (txtAddress.isEnabled()) {
            txtAddress.sendKeys(direccion);
        } else {
            System.out.println("No se encontro el elemento :");
        }
    }

    public void ingresarCalleDeLaDireccion(String street) {
        if (txtStreetAddress.isEnabled()) {
            txtStreetAddress.sendKeys(street);
        } else {
            System.out.println("No se encontro el elemento :");
        }
    }

    public void ingresarDirecionAdicional(String direccional1, String direccional2) throws Throwable {
        Actions actions = new Actions(getDriver());
        if (txtAddress2.isEnabled()) {
            txtAddress2.clear();
            actions.moveToElement(txtAddress2).sendKeys(Keys.TAB);
            actions.moveToElement(txtAddress2).sendKeys(direccional1).sendKeys(Keys.TAB).sendKeys(direccional2).perform();
        } else {
            System.out.println("No se encontro el elemento :");
        }
    }


    public void ingresarCuidad(String cuidad) {
        if (txCity.isEnabled()) {
            txCity.clear();
            txCity.sendKeys(cuidad);
        } else {
            System.out.println("No se encontro el elemento :");
        }
    }

    public void selecionarPais(String pais) {
        if (cbCountry.isEnabled()) {
            new Select(cbCountry).selectByVisibleText(pais);
        } else {
            System.out.println("No se encontro el elemento");
        }
    }


    public void ingresarCorreo(String correo) {
        if (txtEmail.isEnabled()) {
            txtEmail.clear();
            txtEmail.sendKeys(correo);
        } else {
            System.out.println("No se encontro el elemento :");
        }
    }

    public void ingresarFecha(String fecha) {
        if (txtFecha.isEnabled()) {
            txtFecha.clear();
            txtFecha.sendKeys(fecha);
            txtFecha.sendKeys(Keys.TAB);
        } else {
            System.out.println("No se encontro el elemento :");
        }
    }

    public void seleccionarHora(String horaCompleta) {
        String[] _hora = horaCompleta.split(":");
        String hora = _hora[0];
        String minuto = _hora[1];
        if (hora.length() == 1) {
            hora = "0" + hora;
        }
        if (minuto.length() == 1) {
            minuto = "0" + hora;
        }
        if (cbHora.isEnabled()) {
            new Select(cbHora).selectByVisibleText(hora);
            new Select(cbMinutu).selectByVisibleText(minuto);
        }
    }

    public void ingresarTelefono(String telefono) {
        if (txtTelefono.isEnabled()) {
            txtTelefono.sendKeys(telefono);
        } else {
            System.out.println("No se encontro el elemento :");
        }
    }

    public void ingresarConsulta(String consulta) {
        if (txtConsulta.isEnabled()) {
            txtConsulta.sendKeys(consulta);
        } else {
            System.out.println("No se encontro el elemento :");
        }
    }

    public void ingresarCodigo(String codigo) {
        if (txtCodigoV.isEnabled()) {
            txtCodigoV.sendKeys(codigo);
        } else {
            System.out.println("No se encontro el elemento :");
        }
    }

    public void clicBotonSubmit() {
        if (btnSubmit.isEnabled()) {
            btnSubmit.click();
        } else {
            System.out.println("No se encontro el elemento :");
        }
    }

    public boolean validacionMensaje(String sMensaje) throws Throwable {
        boolean value = false;
        Thread.sleep(1000);
        if (txtMensajeExitosa.isDisplayed()) {
            value = txtMensajeExitosa.getText().toLowerCase().contains(sMensaje.toLowerCase());
            System.out.println(value);
        }
        getDriver().close();
        return value;

    }

}
