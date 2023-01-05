package com.bdd.page;

import io.vavr.control.Try;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://www.demoblaze.com/index.html")
public class DemoBlazePage extends PageObject {

    @FindBy(xpath = "//a[text()='Sign up']")
    WebElement btonSignup;

    @FindBy(xpath = "//input[@id='sign-username']")
    WebElement txtusername;

    @FindBy(xpath = "//input[@id='sign-password']")
    WebElement txtpassword;

    @FindBy(xpath = "//button[text()='Sign up']")
    WebElement btncrear;

    public void queElUsuarioIngresaALaPaginaDemoblazeEnElNavegadorDe(String navegador) {
        Browser.Start(this, navegador);
    }

    public void elUsuarioHaceClickEnElBotonSingnUp() throws Throwable {
        Thread.sleep(1000);
        if (btonSignup.isEnabled()) {
            btonSignup.click();
        } else {
            System.out.println("No se encontro el elemento");
        }

    }

    public void ingresaElNombreDelUsuarioYLaClave(String name, String password) throws Throwable {
        Thread.sleep(2000);
        txtusername.sendKeys(name);
        txtpassword.sendKeys(password);
    }

    public void haceClickEnElBotonSingnUp() throws InterruptedException {
        btncrear.click();
        Thread.sleep(2000);
    }

    public void validaLaCreacionDeLaCuentaMostrandoUnMensajeYHaceClickEnAceptar(String mensaje) {
        boolean value = false;
        Alert alert = this.getDriver().switchTo().alert();
        String alertMensaje = alert.getText().toLowerCase();
        try {
            if (alertMensaje.contains(mensaje.toLowerCase())) {
                alert.accept();
                Assert.assertTrue(true);
            } else {
                alert.accept();
                Assert.fail("El mensaje no es el esperado");
            }
        } catch (Exception e) {
            System.out.println("");
        }
        getDriver().close();
    }

    public void validaLaCreacionDeLaCuentaMostrandoUnMensajeYHaceClickEnAceptar() {
        Alert alert = this.getDriver().switchTo().alert();
        String alertMensaje = alert.getText().toLowerCase();
        if (alertMensaje.contains("successful")) {
            alert.accept();
            Assert.assertTrue("validacion realizada", true);
        } else {
            alert.accept();
            Assert.fail("El usuario esta registrado y/o no se ingresaron los datos correctos");
        }
        getDriver().close();
    }

}
