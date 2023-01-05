package com.bdd.page;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.apache.commons.io.FileUtils;
import org.jruby.ext.psych.PsychYamlTree$INVOKER$s$2$0$private_iv_get;
import org.junit.Rule;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.File;

@DefaultUrl("https://www.google.com")
public class SearchGooglePage extends PageObject {
    @FindBy(xpath = "//input[@name='btnK']")
    WebElement btonSearch;

    @FindBy(xpath = "//*[contains(text(),\"wikipedia\")]")
    WebElement clicwiki;

    @FindBy(xpath = "//div[@id='mw-content-text']/div/p[27]")
    WebElement resaltarwiki;

    @FindBy(xpath = "//input[@name='q']")
    WebElement txtpalabra;

    @FindBy(xpath = "//input[@name='q']")
    WebElement txtanio;

    public void ingresaLaPalabraEnElBuscador(String palabrax) throws InterruptedException {
        Thread.sleep(2000);
        txtpalabra.sendKeys(palabrax);
    }

    public void ingresamosALaPaginaDeGoogleEnElNavegadorDeChrome(String navegador) {
        Browser.Start(this, navegador);
    }

    public void clickEnElBotonBuscar() throws InterruptedException {
        Thread.sleep(1000);
        if (btonSearch.isEnabled()) {
            btonSearch.click();
        } else {
            System.out.println("No se encontro el elemento");
        }
    }

    public void clickEnLaWebDeWikipedia() throws InterruptedException{

        Thread.sleep(1000);
        if (clicwiki.isEnabled()) {
            clicwiki.click();
        } else {
            System.out.println("No se encontro el elemento");
        }

    }
    @Rule
    public TestRule watcher = new TestWatcher() {


        @Override
        protected void failed(Throwable e, Description description) {
            File screenshotFile = ((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.FILE);
            try{
               FileUtils.copyFile(screenshotFile,new File ("error_"+description.getMethodName()+"002.png"));

            }catch (Exception ex){
                ex.printStackTrace();
            }
        }

        @Override
        protected void finished(Description description) {
           getDriver().quit();
            //super.finished(description);
        }
    };



    public void localizarElAñoQueSeHizoElPrimerProcesoAutomático() throws InterruptedException{
        Thread.sleep(1000);
        if (resaltarwiki.isEnabled()) {
            resaltarwiki.click();
        } else {
            System.out.println("No se encontro el elemento");
        }
        //para tomar captura
        File screenshotFile = ((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.FILE);
        try{
            FileUtils.copyFile(screenshotFile,new File ("wiki_005.png"));

        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
