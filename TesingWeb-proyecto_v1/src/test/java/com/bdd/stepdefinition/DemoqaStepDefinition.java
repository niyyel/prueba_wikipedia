package com.bdd.stepdefinition;

import com.bdd.step.DemoqaStep;
import cucumber.api.PendingException;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;
import net.thucydides.core.annotations.Steps;

public class DemoqaStepDefinition {

    @Steps
    DemoqaStep demoqaStep;

    @Dado("que aperturamos la pagina web DemoQA en el navegador de chrome")
    public void que_aperturamos_pagina_web_DemoQA_navegador_de_chrome(){

        demoqaStep.que_aperturamos_pagina_web_DemoQA_navegador_de_chrome();
    }


    @Cuando("^realizamos click en el boton Elements$")
    public void realizamosClickEnElBotonElements() {
        demoqaStep.realizamosClickEnElBotonElements();
    }


    @Entonces("^damos click en el el menu TextBox$")
    public void damosClickEnElElMenuTextBox() {
        demoqaStep.damosClickEnElElMenuTextBox();
    }

    @Y("^Escribimos Heber David en el cuadro de texto FullName$")
    public void escribimosHeberDavidEnElCuadroDeTextoFullName() {
        demoqaStep.escribimosHeberDavidEnElCuadroDeTextoFullName();
    }

    @Y("^Escribimos halvarpa@nttdata\\.com en el cuadro de texto Email$")
    public void escribimosHalvarpaNttdataComEnElCuadroDeTextoEmail() {
        demoqaStep.escribimosHalvarpaNttdataComEnElCuadroDeTextoEmail();
    }

    @Y("^Escribimos TRUJILLO en el cuadro de texto Current Address$")
    public void escribimosTRUJILLOEnElCuadroDeTextoCurrentAddress() {
        demoqaStep.escribimosTRUJILLOEnElCuadroDeTextoCurrentAddress();
    }

    @Y("^escribimos TRUJILLO TRUJILLO TRUJILLO en el cuadro de texto Permanent Address$")
    public void escribimosTRUJILLOTRUJILLOTRUJILLOEnElCuadroDeTextoPermanentAddress() {
        demoqaStep.escribimosTRUJILLOTRUJILLOTRUJILLOEnElCuadroDeTextoPermanentAddress();
    }

    @Cuando("^realizamos click en el botón Submit$")
    public void realizamosClickEnElBotónSubmit() {
        demoqaStep.realizamosClickEnElBotónSubmit();
    }

    @Entonces("^Validamos que muestre la información en la parte inferior del formulario$")
    public void validamosQueMuestreLaInformaciónEnLaParteInferiorDelFormulario() {
        demoqaStep.validamosQueMuestreLaInformaciónEnLaParteInferiorDelFormulario();
    }

    @Dado("^que aperturamos la pagina web DemoQA en el navegador de \"([^\"]*)\"$")
    public void queAperturamosLaPaginaWebDemoQAEnElNavegadorDe(String navegador) throws Throwable {
     demoqaStep.queAperturamosLaPaginaWebDemoQAEnElNavegadorDe(navegador);
    }

    @Y("^Escribimos \"([^\"]*)\" David en el cuadro de texto FullName$")
    public void escribimosDavidEnElCuadroDeTextoFullName(String nombre) throws Throwable {
     demoqaStep.escribimosDavidEnElCuadroDeTextoFullName(nombre);
    }

    @Y("^Escribimos \"([^\"]*)\" en el cuadro de texto Email$")
    public void escribimosEnElCuadroDeTextoEmail(String email) throws Throwable {
        demoqaStep.escribimosEnElCuadroDeTextoEmail(email);
    }

    @Y("^Escribimos \"([^\"]*)\" en Current Address y \"([^\"]*)\" en Permanent Address$")
    public void escribimosEnCurrentAddressYEnPermanentAddress(String current_address, String permanent_address) throws Throwable {
        demoqaStep.escribimosEnCurrentAddressYEnPermanentAddress(current_address,permanent_address);
    }

    @Entonces("^Validamos que los resultados esperados de Nombre \"([^\"]*)\", email \"([^\"]*)\", current address \"([^\"]*)\", permanent address \"([^\"]*)\" sean igual al resultado obtenido$")
    public void validamosQueLosResultadosEsperadosDeNombreEmailCurrentAddressPermanentAddressSeanIgualAlResultadoObtenido(String nombre, String email, String current_address, String permanent_address) throws Throwable {
        demoqaStep.validamosQueLosResultadosEsperadosDeNombreEmailCurrentAddressPermanentAddressSeanIgualAlResultadoObtenido(nombre,email,current_address,permanent_address);
    }
}
