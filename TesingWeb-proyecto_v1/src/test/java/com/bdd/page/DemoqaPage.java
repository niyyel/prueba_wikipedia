package com.bdd.page;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://demoqa.com/")
public class DemoqaPage extends PageObject {

    @FindBy(xpath = "//h5[text()='Elements']")
    WebElement btn_element;

    @FindBy(xpath = "//li[@id='item-0']//span[text()='Text Box']")
    WebElement btn_textbox;

    @FindBy(xpath = "//input[@id='userName']")
    WebElement text_username;

    @FindBy(xpath = "//input[@id='userEmail']")
    WebElement text_useremail;

    @FindBy(xpath = "//textarea[@id='currentAddress']")
    WebElement text_currentaddress;

    @FindBy(xpath = "//textarea[@id='permanentAddress']")
    WebElement text_permanentaddress;

    @FindBy(xpath = "//button[@id='submit']")
    WebElement btn_submit;

    @FindBy(xpath = "//p[@id='name']")
    WebElement lbl_name;

    @FindBy(xpath = "//p[@id='email']")
    WebElement lbl_email;

    @FindBy(xpath = "//p[@id='currentAddress']")
    WebElement lbl_currentaddress;

    @FindBy(xpath = "//p[@id='permanentAddress']")
    WebElement lbl_permanentaddress;


    public void que_aperturamos_pagina_web_DemoQA_navegador_de_chrome(){
        
        Browser.Start(this,"chrome");

    }
    public void realizamosClickEnElBotonElements() {
        //boton click nativo
       // btn_element.click();
     //baja el scroll del explorador
    // Browser.Scroll(this,200);
     //btn_element.click();
        //click en javascrip
        Browser.ClickJS(this,btn_element);
    }

    public void damosClickEnElElMenuTextBox() {

        btn_textbox.click();
    }

    public void escribimosHeberDavidEnElCuadroDeTextoFullName() {
        text_username.sendKeys("Heber David");
    }

    public void escribimosHalvarpaNttdataComEnElCuadroDeTextoEmail() {
        text_useremail.sendKeys("halvarpa@nttdata.com");
    }

    public void escribimosTRUJILLOEnElCuadroDeTextoCurrentAddress() {
        text_currentaddress.sendKeys("TRUJILLO");
    }

    public void escribimosTRUJILLOTRUJILLOTRUJILLOEnElCuadroDeTextoPermanentAddress() {
        text_permanentaddress.sendKeys("TRUJILLO TRUJILLO TRUJILLO");
    }

    public void realizamosClickEnElBotónSubmit() {
        //Browser.ClickJS(this,btn_submit);
        Browser.Scroll(this,300);
        btn_submit.click();
    }

    public void validamosQueMuestreLaInformaciónEnLaParteInferiorDelFormulario() {
        //datos esperados
        String nombre= "Heber David";
        String email = "halvarpa@nttdata.com";
        String current_address="TRUJILLO";
        String permanent_address= "TRUJILLO TRUJILLO TRUJILLO";

        //RESULTADOS OBTENIDOS
        String nombre_respuesta = lbl_name.getText();
        String email_respuesta = lbl_email.getText();
        String current_address_respuesta = lbl_currentaddress.getText();
        String permanent_address_respuesta = lbl_permanentaddress.getText();

        //validar
        if(email_respuesta.contains(email) && nombre_respuesta.contains(nombre) && current_address_respuesta.contains(current_address) && permanent_address_respuesta.contains(permanent_address)){
            Assert.assertTrue(true);
        }else {
            Assert.fail("Los resultados esperados no es igual a los resultados esperados");
        }

    }

    public void queAperturamosLaPaginaWebDemoQAEnElNavegadorDe(String navegador) {
        Browser.Start(this,navegador);
    }

    public void escribimosDavidEnElCuadroDeTextoFullName(String nombre) {
        text_username.sendKeys(nombre);
    }

    public void escribimosEnElCuadroDeTextoEmail(String email) {
        text_useremail.sendKeys(email);
    }

    public void escribimosEnCurrentAddressYEnPermanentAddress(String current_address, String permanent_address) {
        text_currentaddress.sendKeys(current_address);
        text_permanentaddress.sendKeys(permanent_address);
    }

    public void validamosQueLosResultadosEsperadosDeNombreEmailCurrentAddressPermanentAddressSeanIgualAlResultadoObtenido(String nombre, String email, String current_address, String permanent_address) {

        //RESULTADOS OBTENIDOS
        String nombre_respuesta = lbl_name.getText();
        String email_respuesta = lbl_email.getText();
        String current_address_respuesta = lbl_currentaddress.getText();
        String permanent_address_respuesta = lbl_permanentaddress.getText();

        //validar
        if(email_respuesta.contains(email) && nombre_respuesta.contains(nombre) && current_address_respuesta.contains(current_address) && permanent_address_respuesta.contains(permanent_address)){
            Assert.assertTrue(true);
        }else {
            Assert.fail("Los resultados esperados no es igual a los resultados esperados");
        }

    }
}
