#language: es

@DEMOBLAZE_FEATURE
Característica: Validar el funcionamiento del formulario de registro For Demo de la pagina nxtgenaiacademy
  Como usuario de la pagina nxtgenaiacademy
  Quiero registrar datos
  para validad el funcionamiento del formulario de registro

  @DEMO_SCENARIO_VALIDAR-FORMULARIO
  Esquema del escenario: Validar el registro del formulario
    Dado que el usuario ingresa a la pagina nxtgenaiacademy en el navegador de "<Navegador>"
    Cuando ingresa el nombre "<sFirtsName>" en el campo nombres
    Y ingresa el apellido "<sLastName>" en el campo apellido
    Y seleciona el genero "<sGender>" en el genero
    Y ingresa la direccion "<sAddress>" en el campo direccion
    Y ingresa el nombre de la calle "<sStreetAddress>" en el campo nombre calle
    Y ingresa direccion opcional "<sOpcAddress>" y "<sOpc2Address>" en el campo direccion opcional
    Y ingresa la cuidad "<sCity>" en el campo cuidad
    Y seleciona el Estado "<sState>" en el campo estado
    Y ingresa el correo "<sEmail>" en el campo correo
    Y ingresa la fecha "<sDate>" en el campo fecha
    Y selecciona la hora "<sTime>" en el campo Tiempo
    Y ingresa el numero de telefono "<sTelefono>" en el campo telefono
    Y seleciona el curso de interes "<sCurso>" en el campo curso
    Y ingresa una consulta "<sConsulta>" en el campo query
    Y ingresa el codigo de verificacion "<sCodigo>" en el campo codigo de verificacion
    Y hace click en el boton Submit
    Entonces la aplicacion redirecciona y muestra un mensaje "<Mensaje>" de exito

    Ejemplos:
      | Navegador | sFirtsName | sLastName | sGender   | sAddress  | sStreetAddress | sOpcAddress | sOpc2Address | sCity | sState  | sEmail             | sDate      | sTime | sTelefono | sCurso                    | sConsulta          | sCodigo | Mensaje      |
      | chrome    | zally      | Leon      | femenino  | Jr. Cusco | cusco          | casa123     | casa234      | Cuzco | Benin   | zallly.1@gmail.com | 12/12/2022 | 14:30 | 987384938 | TestNG,Core Java          | Mas informacion    | 23      | Successfully |
      | edge      | Juan       | Rodriguez | Masculino | Jr. Cusco | cusco          | casa123     | casa234      | Cuzco | Austria | juan15@gmail.com   | 12/12/2022 | 2:30  | 987384938 | Functional Testing,Others | Detalles del curso | 35      | Successfully |
