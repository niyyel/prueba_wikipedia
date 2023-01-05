package com.bdd.step;

import com.bdd.page.DemoqaPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class DemoqaStep extends ScenarioSteps {

    DemoqaPage demoqaPage;

    @Step
    public void que_aperturamos_pagina_web_DemoQA_navegador_de_chrome(){
        demoqaPage.que_aperturamos_pagina_web_DemoQA_navegador_de_chrome();
    }

    @Step
    public void realizamosClickEnElBotonElements() {
        demoqaPage.realizamosClickEnElBotonElements();
    }

    public void damosClickEnElElMenuTextBox() {
        demoqaPage.damosClickEnElElMenuTextBox();
    }

    public void escribimosHeberDavidEnElCuadroDeTextoFullName() {
        demoqaPage.escribimosHeberDavidEnElCuadroDeTextoFullName();
    }

    public void escribimosHalvarpaNttdataComEnElCuadroDeTextoEmail() {
        demoqaPage.escribimosHalvarpaNttdataComEnElCuadroDeTextoEmail();
    }

    public void escribimosTRUJILLOEnElCuadroDeTextoCurrentAddress() {
        demoqaPage.escribimosTRUJILLOEnElCuadroDeTextoCurrentAddress();
    }

    public void escribimosTRUJILLOTRUJILLOTRUJILLOEnElCuadroDeTextoPermanentAddress() {
        demoqaPage.escribimosTRUJILLOTRUJILLOTRUJILLOEnElCuadroDeTextoPermanentAddress();
    }

    public void realizamosClickEnElBotónSubmit() {
        demoqaPage.realizamosClickEnElBotónSubmit();
    }

    public void validamosQueMuestreLaInformaciónEnLaParteInferiorDelFormulario() {
        demoqaPage.validamosQueMuestreLaInformaciónEnLaParteInferiorDelFormulario();
    }

    public void queAperturamosLaPaginaWebDemoQAEnElNavegadorDe(String navegador) {
        demoqaPage.queAperturamosLaPaginaWebDemoQAEnElNavegadorDe(navegador);
    }

    public void escribimosDavidEnElCuadroDeTextoFullName(String nombre) {
        demoqaPage.escribimosDavidEnElCuadroDeTextoFullName(nombre);
    }

    public void escribimosEnElCuadroDeTextoEmail(String email) {
        demoqaPage.escribimosEnElCuadroDeTextoEmail(email);
    }

    public void escribimosEnCurrentAddressYEnPermanentAddress(String current_address, String permanent_address) {
        demoqaPage.escribimosEnCurrentAddressYEnPermanentAddress(current_address,permanent_address);
    }

    public void validamosQueLosResultadosEsperadosDeNombreEmailCurrentAddressPermanentAddressSeanIgualAlResultadoObtenido(String nombre, String email, String current_address, String permanent_address) {
        demoqaPage.validamosQueLosResultadosEsperadosDeNombreEmailCurrentAddressPermanentAddressSeanIgualAlResultadoObtenido(nombre,email,current_address,permanent_address);
    }
}
