package com.bdd.step;

import com.bdd.page.NxtgenaiacademyPage;
import cucumber.api.java.After;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;

public class NxtgenaiacademyStep extends ScenarioSteps {
    NxtgenaiacademyPage nxtgenaiacademyPage;

    public void queElUsuarioIngresaALaPaginaNxtgenaiacademyEnElNavegadorDe(String navegador) {
        nxtgenaiacademyPage.Abrir_la_pagina_web_en_un_navegador(navegador);
    }

    public void ingresaElNombreEnElCampoNombres(String nombre) {
        nxtgenaiacademyPage.ingresarNombre(nombre);
    }

    public void ingresaElApellidoEnElCampoApellido(String apellido) {
        nxtgenaiacademyPage.ingresarApellido(apellido);
    }

    public void selecionaElGeneroEnElGenero(String genero) throws Throwable {
        nxtgenaiacademyPage.seleccionarGenero(genero);
    }

    public void ingresaLaDireccionEnElCampoDireccion(String direccion) throws Throwable {
        nxtgenaiacademyPage.ingresarDireccion(direccion);
    }

    public void ingresaElNombreDeLaCalleEnElCampoNombreCalle(String calle) throws Throwable {
        nxtgenaiacademyPage.ingresarCalleDeLaDireccion(calle);
    }

    public void ingresaDireccionOpcionalYEnElCampoDireccionOpcional(String direccionOpc1, String direccionOpc2) throws Throwable {
        nxtgenaiacademyPage.ingresarDirecionAdicional(direccionOpc1, direccionOpc2);
    }

    public void ingresaLaCuidadEnElCampoCuidad(String ciudad) {
        nxtgenaiacademyPage.ingresarCuidad(ciudad);
    }

    public void selecionaElEstadoEnElCampoEstado(String estado) {
        nxtgenaiacademyPage.selecionarPais(estado);
    }

    public void ingresaElCorreoEnElCampoCorreo(String correo) {
        nxtgenaiacademyPage.ingresarCorreo(correo);
    }

    public void ingresaLaFechaEnElCampoFecha(String fecha) {
        nxtgenaiacademyPage.ingresarFecha(fecha);
    }

    public void seleccionaLaHoraEnElCampoTiempo(String hora) {
        nxtgenaiacademyPage.seleccionarHora(hora);
    }

    public void ingresaElNumeroDeTelefonoEnElCampoTelefono(String telefono) throws Throwable {
        nxtgenaiacademyPage.ingresarTelefono(telefono);
    }

    public void selecionaElCursoDeInteresEnElCampoCurso(String curso) throws Throwable {
        nxtgenaiacademyPage.seleccionarCurso(curso);
    }

    public void ingresaUnaConsultaEnElCampoQuery(String consulta) throws Throwable {
        nxtgenaiacademyPage.ingresarConsulta(consulta);
    }

    public void ingresaElCodigoDeVerificacionEnElCampoCodigoDeVerificacion(String codigo) {
        nxtgenaiacademyPage.ingresarCodigo(codigo);
    }

    public void haceClickEnElBotonSubmit() {
        nxtgenaiacademyPage.clicBotonSubmit();
    }

    public void laAplicacionRedireccionaYMuestraUnMensajeDeExito(String mensaje) throws Throwable {
        Assert.assertTrue(nxtgenaiacademyPage.validacionMensaje(mensaje));
    }
}
