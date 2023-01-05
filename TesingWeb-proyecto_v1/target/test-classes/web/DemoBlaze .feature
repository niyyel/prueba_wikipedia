#language: es

@DEMOBLAZE_FEATURE
Característica: Validar el funcionamiento de la creacion de una cuenta en la pagina demoblaze
  Como usuario nuevo de la pagina demoblaze
  Quiero crear una cuenta
  para validad el funcionamiento de la creacion de una cuenta

  @DEMO_SCENARIO_CASO1_VALIDAR_MENSAJE-PARAMETRO
  Esquema del escenario: Validar el funcionamiento de la creacion de una cuenta por mensaje
    Dado que el usuario ingresa a la pagina demoblaze en el navegador de "<Navegador>"
    Cuando el usuario hace click en el boton Singn up
    Y ingresa el nombre del usuario "<$Username>" y la clave "<$Password>"
    Y hace click en el boton Singn up
    Entonces Valida la creacion de la cuenta mostrando un mensaje "<Mensaje>" Y hace click en Aceptar
    Ejemplos:
      | Navegador | $Username   | $Password | Mensaje                 |
      | chrome    | MayailaZJ33 | ror15     | Sign up successful      |
      | chrome    | dasa15      | ror15     | This user already exist |

  @DEMO_SCENARIO_CASO2_VALIDAR-MENSAJE
  Esquema del escenario: Validar el funcionamiento de la creacion de una cuenta
    Dado que el usuario ingresa a la pagina demoblaze en el navegador de "<Navegador>"
    Cuando el usuario hace click en el boton Singn up
    Y ingresa el nombre del usuario "<$Username>" y la clave "<$Password>"
    Y hace click en el boton Singn up
    Entonces Valida la creacion de la cuenta mostrando un mensaje y hace click en Aceptar
    Ejemplos:
      | Navegador | $Username  | $Password |
      | chrome    | Eitanzdf14 | eitanqi15 |

