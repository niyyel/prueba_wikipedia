#language: es
@DEMOQA_FEATURE
Característica: Validar formularios de la pagina DemoQA
Como usuario del sistema demoQA
Quiero validar el funcionamiento de los usuarios
Para realizar pruebas de regresión

  @demo_search_google
  Esquema del escenario: Buscar la palabra automatizacion en google
    Dado Ingresamos a la pagina de google en el navegador "<Navegador>" de chrome
    Cuando Ingresa la palabra "<$Palabra>" en el buscador
    Y click en el boton Buscar
    Entonces Me muestra los resultados relacionados de dicha busqueda
    Y click en la web de wikipedia
    Y localizar el año que se hizo el primer proceso automático
    Y capturo la pagina de wikipedia
    Ejemplos:
      | Navegador | $Palabra  |
      | chrome    | automatización |