package com.bdd.step;

import com.bdd.page.DemoBlazePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;

public class DemoBlazeStep extends ScenarioSteps {
    DemoBlazePage demoBlazePage;

    @Step
    public void queElUsuarioIngresaALaPaginaDemoblazeEnElNavegadorDe(String navegador) {
        demoBlazePage.queElUsuarioIngresaALaPaginaDemoblazeEnElNavegadorDe(navegador);
    }

    @Step
    public void elUsuarioHaceClickEnElBotonSingnUp() throws Throwable {
        demoBlazePage.elUsuarioHaceClickEnElBotonSingnUp();
    }

    @Step
    public void ingresaElNombreDelUsuarioYLaClave(String name, String password) throws Throwable {
        demoBlazePage.ingresaElNombreDelUsuarioYLaClave(name, password);
    }

    @Step
    public void haceClickEnElBotonSingnUp() throws Throwable {
        demoBlazePage.haceClickEnElBotonSingnUp();
    }

    @Step
    public void validaLaCreacionDeLaCuentaMostrandoUnMensajeYHaceClickEnAceptar(String mensaje) {
        demoBlazePage.validaLaCreacionDeLaCuentaMostrandoUnMensajeYHaceClickEnAceptar(mensaje);

    }

    @Step
    public void validaLaCreacionDeLaCuentaMostrandoUnMensajeYHaceClickEnAceptar() {
        demoBlazePage.validaLaCreacionDeLaCuentaMostrandoUnMensajeYHaceClickEnAceptar();
    }
}
