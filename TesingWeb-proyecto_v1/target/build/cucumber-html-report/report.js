$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/web/SearchGoogle.feature");
formatter.feature({
  "name": "Validar formularios de la pagina DemoQA",
  "description": "Como usuario del sistema demoQA\nQuiero validar el funcionamiento de los usuarios\nPara realizar pruebas de regresión",
  "keyword": "Característica",
  "tags": [
    {
      "name": "@DEMOQA_FEATURE"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Buscar la palabra automatizacion en google",
  "description": "",
  "keyword": "Esquema del escenario",
  "tags": [
    {
      "name": "@demo_search_google"
    }
  ]
});
formatter.step({
  "name": "Ingresamos a la pagina de google en el navegador \"\u003cNavegador\u003e\" de chrome",
  "keyword": "Dado "
});
formatter.step({
  "name": "Ingresa la palabra \"\u003c$Palabra\u003e\" en el buscador",
  "keyword": "Cuando "
});
formatter.step({
  "name": "click en el boton Buscar",
  "keyword": "Y "
});
formatter.step({
  "name": "Me muestra los resultados relacionados de dicha busqueda",
  "keyword": "Entonces "
});
formatter.step({
  "name": "click en la web de wikipedia",
  "keyword": "Y "
});
formatter.step({
  "name": "localizar el año que se hizo el primer proceso automático",
  "keyword": "Y "
});
formatter.step({
  "name": "capturo la pagina de wikipedia",
  "keyword": "Y "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Ejemplos",
  "rows": [
    {
      "cells": [
        "Navegador",
        "$Palabra"
      ]
    },
    {
      "cells": [
        "chrome",
        "automatización"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Buscar la palabra automatizacion en google",
  "description": "",
  "keyword": "Esquema del escenario",
  "tags": [
    {
      "name": "@DEMOQA_FEATURE"
    },
    {
      "name": "@demo_search_google"
    }
  ]
});
formatter.step({
  "name": "Ingresamos a la pagina de google en el navegador \"chrome\" de chrome",
  "keyword": "Dado "
});
formatter.match({
  "location": "SearchGoogleStepDefinition.ingresamosALaPaginaDeGoogleEnElNavegadorDeChrome(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Ingresa la palabra \"automatización\" en el buscador",
  "keyword": "Cuando "
});
formatter.match({
  "location": "SearchGoogleStepDefinition.ingresaLaPalabraEnElBuscador(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click en el boton Buscar",
  "keyword": "Y "
});
formatter.match({
  "location": "SearchGoogleStepDefinition.clickEnElBotonBuscar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Me muestra los resultados relacionados de dicha busqueda",
  "keyword": "Entonces "
});
formatter.match({
  "location": "SearchGoogleStepDefinition.meMuestraLosResultadosRelacionadosDeDichaBusqueda()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click en la web de wikipedia",
  "keyword": "Y "
});
formatter.match({
  "location": "SearchGoogleStepDefinition.clickEnLaWebDeWikipedia()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "localizar el año que se hizo el primer proceso automático",
  "keyword": "Y "
});
formatter.match({
  "location": "SearchGoogleStepDefinition.localizarElAñoQueSeHizoElPrimerProcesoAutomático()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "capturo la pagina de wikipedia",
  "keyword": "Y "
});
formatter.match({
  "location": "SearchGoogleStepDefinition.capturoLaPaginaDeWikipedia()"
});
formatter.result({
  "status": "passed"
});
});