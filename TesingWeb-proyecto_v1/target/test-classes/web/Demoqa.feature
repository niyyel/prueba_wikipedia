#language: es
@DEMOQA_FEATURE
Característica: Validar formularios de la pagina DemoQA
  Como usuario del sistema demoQA
  Quiero validar el funcionamiento de los usuarios
  Para realizar pruebas de regresión

  @DEMOQA_ESCENARIO_01
  Escenario: Validar formulario de Elements TextBox de la pagina DemoQA
    Dado que aperturamos la pagina web DemoQA en el navegador de chrome
    Cuando realizamos click en el boton Elements
    Entonces damos click en el el menu TextBox
    Y Escribimos Heber David en el cuadro de texto FullName
    Y Escribimos halvarpa@nttdata.com en el cuadro de texto Email
    Y Escribimos TRUJILLO en el cuadro de texto Current Address
    Y escribimos TRUJILLO TRUJILLO TRUJILLO en el cuadro de texto Permanent Address
    Cuando realizamos click en el botón Submit
    Entonces Validamos que muestre la información en la parte inferior del formulario

  @DEMO_ESCENARIO_02_PARAMETROS
  Esquema del escenario: : : Validar formulario de Elements TexBox de la pagina DemoQA
    Dado que aperturamos la pagina web DemoQA en el navegador de "<Navegador>"
    Cuando realizamos click en el boton Elements
    Entonces damos click en el el menu TextBox
    Y Escribimos "<NOMBRE>" David en el cuadro de texto FullName
    Y Escribimos "<EMAIL>" en el cuadro de texto Email
    Y Escribimos "<CURRENT ADDRESS>" en Current Address y "<PERMANENT ADDRESS>" en Permanent Address
    Cuando realizamos click en el botón Submit
    Entonces Validamos que los resultados esperados de Nombre "<NOMBRE>", email "<EMAIL>", current address "<CURRENT ADDRESS>", permanent address "<PERMANENT ADDRESS>" sean igual al resultado obtenido
    Ejemplos:
      | Navegador | NOMBRE | EMAIL            | CURRENT ADDRESS | PERMANENT ADDRESS |
      | chrome    | Zally  | zally@gmail.com  | Tingo Maria     | Tingo Tingo       |
      | edge      | Jazmin | jazmin@gmail.com | Trujillo        | Trujillo Trujillo |