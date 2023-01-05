package com.bdd.stepdefinition;

import com.bdd.step.SearchGoogleStep;
import cucumber.api.PendingException;
import net.thucydides.core.annotations.Steps;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;
import net.thucydides.core.annotations.Steps;

public class SearchGoogleStepDefinition {
    @Steps
    SearchGoogleStep searchGoogleStep;

    @Cuando("^Ingresa la palabra \"([^\"]*)\" en el buscador$")
    public void ingresaLaPalabraEnElBuscador(String palabrax) throws Throwable {
        searchGoogleStep.ingresaLaPalabraEnElBuscador(palabrax);
    }

    @Y("^click en el boton Buscar$")
    public void clickEnElBotonBuscar() throws InterruptedException{
        searchGoogleStep.clickEnElBotonBuscar();

    }


    @Dado("^Ingresamos a la pagina de google en el navegador \"([^\"]*)\" de chrome$")
    public void ingresamosALaPaginaDeGoogleEnElNavegadorDeChrome(String navegador) throws Throwable {
        searchGoogleStep.ingresamosALaPaginaDeGoogleEnElNavegadorDeChrome(navegador);
    }

    @Entonces("^Me muestra los resultados relacionados de dicha busqueda$")
    public void meMuestraLosResultadosRelacionadosDeDichaBusqueda() {
    }

    @Y("^click en la web de wikipedia$")
    public void clickEnLaWebDeWikipedia() throws InterruptedException{
        searchGoogleStep.clickEnLaWebDeWikipedia();
    }

    @Y("^capturo la pagina de wikipedia$")
    public void capturoLaPaginaDeWikipedia() {
    }


    @Y("^localizar el año que se hizo el primer proceso automático$")
    public void localizarElAñoQueSeHizoElPrimerProcesoAutomático() throws InterruptedException{
        searchGoogleStep.localizarElAñoQueSeHizoElPrimerProcesoAutomático();
    }
}
