package com.bdd.stepdefinition;

import com.bdd.step.DemoBlazeStep;
import cucumber.api.PendingException;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;
import net.thucydides.core.annotations.Steps;

public class DemoBlazeStepDefinition {
    @Steps
    DemoBlazeStep demoBlazeStep;

    @Dado("^que el usuario ingresa a la pagina demoblaze en el navegador de \"([^\"]*)\"$")
    public void queElUsuarioIngresaALaPaginaDemoblazeEnElNavegadorDe(String navegador) throws Throwable {
        demoBlazeStep.queElUsuarioIngresaALaPaginaDemoblazeEnElNavegadorDe(navegador);
    }

    @Cuando("^el usuario hace click en el boton Singn up$")
    public void elUsuarioHaceClickEnElBotonSingnUp() throws Throwable {
        demoBlazeStep.elUsuarioHaceClickEnElBotonSingnUp();
    }

    @Y("^ingresa el nombre del usuario \"([^\"]*)\" y la clave \"([^\"]*)\"$")
    public void ingresaElNombreDelUsuarioYLaClave(String name, String password) throws Throwable {
        demoBlazeStep.ingresaElNombreDelUsuarioYLaClave(name, password);
        System.out.println("Ingreso");
    }

    @Y("^hace click en el boton Singn up$")
    public void haceClickEnElBotonSingnUp() throws Throwable {
        demoBlazeStep.haceClickEnElBotonSingnUp();
    }

    @Entonces("^Valida la creacion de la cuenta mostrando un mensaje \"([^\"]*)\" Y hace click en Aceptar$")
    public void validaLaCreacionDeLaCuentaMostrandoUnMensajeYHaceClickEnAceptar(String mensaje) throws Throwable {
        demoBlazeStep.validaLaCreacionDeLaCuentaMostrandoUnMensajeYHaceClickEnAceptar(mensaje);
    }


    @Entonces("^Valida la creacion de la cuenta mostrando un mensaje y hace click en Aceptar$")
    public void validaLaCreacionDeLaCuentaMostrandoUnMensajeYHaceClickEnAceptar() {
        demoBlazeStep.validaLaCreacionDeLaCuentaMostrandoUnMensajeYHaceClickEnAceptar();
    }
}
