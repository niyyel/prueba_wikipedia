package com.bdd.step;

import com.bdd.page.SearchGooglePage;
import net.thucydides.core.steps.ScenarioSteps;

public class SearchGoogleStep extends ScenarioSteps {
    SearchGooglePage  searchGooglePage;

    public void ingresaLaPalabraEnElBuscador(String palabrax) throws InterruptedException {
        searchGooglePage.ingresaLaPalabraEnElBuscador(palabrax);

    }

    public void ingresamosALaPaginaDeGoogleEnElNavegadorDeChrome(String navegador) {
        searchGooglePage.ingresamosALaPaginaDeGoogleEnElNavegadorDeChrome(navegador);
    }

    public void clickEnElBotonBuscar() throws InterruptedException {
        searchGooglePage.clickEnElBotonBuscar();
    }

    public void clickEnLaWebDeWikipedia() throws InterruptedException{
        searchGooglePage.clickEnLaWebDeWikipedia();
    }


    public void localizarElAñoQueSeHizoElPrimerProcesoAutomático() throws InterruptedException{
        searchGooglePage.localizarElAñoQueSeHizoElPrimerProcesoAutomático();
    }
}
