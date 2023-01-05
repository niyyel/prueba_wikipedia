#language: es
@FEATURE_JUNTOZ
Característica: Validación del filtro de la página Juntoz
  Como usuario de juntoz abro la pagina
  Quiero hacer la busqueda de un producto
  Para validar el funcionamiento del filtros

  Antecedentes: descripcion antecedente
    Como usuario xxxxxxx

  @ESCENARIO1_JUNTOZ
  Escenario: Validar Filtro de busqueda
    Dado Abrir la pagina Juntoz en un navegador
    Y Escribir LAPTOP en el cuadro de busqueda
    Y Hacer click en el botón buscar
    Entonces Validar que se encuentren resultados


  @ESCENARIO02_JUNTOZ_PARAMETROS
  Esquema del escenario: Validar Filtro parametros
    Dado Abrir la pagina Juntoz en el navegador "<Navegador>"
    Y Escribir "<Producto>" en el cuadro de busqueda
    Y Hacer click en el botón buscar
    Entonces Validar que se encuentren resultados

    Ejemplos:
      | Navegador | Producto |
      | chrome    | laptop   |
      | chrome    | asdasda  |

  @ESCENARIO03_JUNTOZ
  Esquema del escenario: Navegación por categoria
    Dado Abrir la pagina Juntoz en el navegador "<Navegador>"
    Y Desplegar el panel de categorías
    Y Seleccionar la categoría "<Categoria>"
    Y Seleccionar la subcategoría "<SubCategoria>"
    Entonces Validar que se encuentren resultados

    Ejemplos:
      | Navegador | Categoria | SubCategoria |
      | chrome    | Mascotas  | Artículos para Perros |
      | chrome    | Cómputo   | Zona Gamer   |
