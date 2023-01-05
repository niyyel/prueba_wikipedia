package com.bdd.stepdefinition;

import com.bdd.step.NxtgenaiacademyStep;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;
import net.thucydides.core.annotations.Steps;

public class NxtgenaiacademyStepDefinition {
    @Steps
    NxtgenaiacademyStep nxtgenaiacademyStep;

    @Dado("^que el usuario ingresa a la pagina nxtgenaiacademy en el navegador de \"([^\"]*)\"$")
    public void queElUsuarioIngresaALaPaginaNxtgenaiacademyEnElNavegadorDe(String navegador) throws Throwable {
        nxtgenaiacademyStep.queElUsuarioIngresaALaPaginaNxtgenaiacademyEnElNavegadorDe(navegador);
    }

    @Cuando("^ingresa el nombre \"([^\"]*)\" en el campo nombres$")
    public void ingresaElNombreEnElCampoNombres(String nombre) throws Throwable {
        nxtgenaiacademyStep.ingresaElNombreEnElCampoNombres(nombre);
    }

    @Y("^ingresa el apellido \"([^\"]*)\" en el campo apellido$")
    public void ingresaElApellidoEnElCampoApellido(String apellido) throws Throwable {
        nxtgenaiacademyStep.ingresaElApellidoEnElCampoApellido(apellido);
    }

    @Y("^seleciona el genero \"([^\"]*)\" en el genero$")
    public void selecionaElGeneroEnElGenero(String genero) throws Throwable {
        nxtgenaiacademyStep.selecionaElGeneroEnElGenero(genero);
    }

    @Y("^ingresa la direccion \"([^\"]*)\" en el campo direccion$")
    public void ingresaLaDireccionEnElCampoDireccion(String direccion) throws Throwable {
        nxtgenaiacademyStep.ingresaLaDireccionEnElCampoDireccion(direccion);
    }

    @Y("^ingresa el nombre de la calle \"([^\"]*)\" en el campo nombre calle$")
    public void ingresaElNombreDeLaCalleEnElCampoNombreCalle(String calle) throws Throwable {
        nxtgenaiacademyStep.ingresaElNombreDeLaCalleEnElCampoNombreCalle(calle);
    }

    @Y("^ingresa direccion opcional \"([^\"]*)\" y \"([^\"]*)\" en el campo direccion opcional$")
    public void ingresaDireccionOpcionalYEnElCampoDireccionOpcional(String direccionOpc1, String direccionOpc2) throws Throwable {
        nxtgenaiacademyStep.ingresaDireccionOpcionalYEnElCampoDireccionOpcional(direccionOpc1, direccionOpc2);
    }

    @Y("^ingresa la cuidad \"([^\"]*)\" en el campo cuidad$")
    public void ingresaLaCuidadEnElCampoCuidad(String ciudad) throws Throwable {
        nxtgenaiacademyStep.ingresaLaCuidadEnElCampoCuidad(ciudad);
    }

    @Y("^seleciona el Estado \"([^\"]*)\" en el campo estado$")
    public void selecionaElEstadoEnElCampoEstado(String estado) throws Throwable {
        nxtgenaiacademyStep.selecionaElEstadoEnElCampoEstado(estado);
    }

    @Y("^ingresa el correo \"([^\"]*)\" en el campo correo$")
    public void ingresaElCorreoEnElCampoCorreo(String correo) throws Throwable {
        nxtgenaiacademyStep.ingresaElCorreoEnElCampoCorreo(correo);
    }

    @Y("^ingresa la fecha \"([^\"]*)\" en el campo fecha$")
    public void ingresaLaFechaEnElCampoFecha(String fecha) throws Throwable {
        nxtgenaiacademyStep.ingresaLaFechaEnElCampoFecha(fecha);
    }

    @Y("^selecciona la hora \"([^\"]*)\" en el campo Tiempo$")
    public void seleccionaLaHoraEnElCampoTiempo(String hora) throws Throwable {
        nxtgenaiacademyStep.seleccionaLaHoraEnElCampoTiempo(hora);
    }

    @Y("^ingresa el numero de telefono \"([^\"]*)\" en el campo telefono$")
    public void ingresaElNumeroDeTelefonoEnElCampoTelefono(String telefono) throws Throwable {
        nxtgenaiacademyStep.ingresaElNumeroDeTelefonoEnElCampoTelefono(telefono);
    }

    @Y("^seleciona el curso de interes \"([^\"]*)\" en el campo curso$")
    public void selecionaElCursoDeInteresEnElCampoCurso(String curso) throws Throwable {
        nxtgenaiacademyStep.selecionaElCursoDeInteresEnElCampoCurso(curso);
    }

    @Y("^ingresa una consulta \"([^\"]*)\" en el campo query$")
    public void ingresaUnaConsultaEnElCampoQuery(String consulta) throws Throwable {
        nxtgenaiacademyStep.ingresaUnaConsultaEnElCampoQuery(consulta);
    }

    @Y("^ingresa el codigo de verificacion \"([^\"]*)\" en el campo codigo de verificacion$")
    public void ingresaElCodigoDeVerificacionEnElCampoCodigoDeVerificacion(String codigo) throws Throwable {
        nxtgenaiacademyStep.ingresaElCodigoDeVerificacionEnElCampoCodigoDeVerificacion(codigo);
    }

    @Y("^hace click en el boton Submit$")
    public void haceClickEnElBotonSubmit() {
        nxtgenaiacademyStep.haceClickEnElBotonSubmit();
    }

    @Entonces("^la aplicacion redirecciona y muestra un mensaje \"([^\"]*)\" de exito$")
    public void laAplicacionRedireccionaYMuestraUnMensajeDeExito(String mensaje) throws Throwable {
        nxtgenaiacademyStep.laAplicacionRedireccionaYMuestraUnMensajeDeExito(mensaje);
    }

}
