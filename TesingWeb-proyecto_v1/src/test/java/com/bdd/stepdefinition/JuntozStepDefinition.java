package com.bdd.stepdefinition;

import com.bdd.step.JuntozStep;
import cucumber.api.PendingException;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class JuntozStepDefinition {

    @Steps
    JuntozStep juntozStep;

    @Dado("^Abrir la pagina Juntoz en un navegador$")
    public void Abrir_la_pagina_Juntoz_en_un_navegador(){
        juntozStep.Abrir_la_pagina_Juntoz_en_un_navegador();
    }


    @Y("^Escribir LAPTOP en el cuadro de busqueda$")
    public void escribirLAPTOPEnElCuadroDeBusqueda() {
        juntozStep.escribirLAPTOPEnElCuadroDeBusqueda();
    }

    @Y("^Hacer click en el botón buscar$")
    public void hacerClickEnElBotónBuscar() {
        juntozStep.hacerClickEnElBotónBuscar();
    }

    @Entonces("^Validar que se encuentren resultados$")
    public void validarQueSeEncuentrenResultados() {
        juntozStep.validarQueSeEncuentrenResultados();
    }

    @Dado("^Abrir la pagina Juntoz en el navegador \"([^\"]*)\"$")
    public void abrirLaPaginaJuntozEnElNavegador(String navegador) throws Throwable {
        juntozStep.abrirLaPaginaJuntozEnElNavegador(navegador);

    }

    @Y("^Escribir \"([^\"]*)\" en el cuadro de busqueda$")
    public void escribirEnElCuadroDeBusqueda(String producto) throws Throwable {
        juntozStep.escribirEnElCuadroDeBusqueda(producto);
    }

    @Y("^Desplegar el panel de categorías$")
    public void desplegarElPanelDeCategorías() {
        juntozStep.desplegarElPanelDeCategorías();

    }

    @Y("^Seleccionar la categoría \"([^\"]*)\"$")
    public void seleccionarLaCategoría(String categoria) throws Throwable {
        juntozStep.seleccionarLaCategoría(categoria);

    }

    @Y("^Seleccionar la subcategoría \"([^\"]*)\"$")
    public void seleccionarLaSubcategoría(String subcategoria) throws Throwable {
        juntozStep.seleccionarLaSubcategoría(subcategoria);

    }


}
