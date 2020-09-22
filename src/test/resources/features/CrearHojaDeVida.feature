# language: es
# encoding: iso-8859-1
Característica: Crear Hoja de Vida
  yo como usuario de elempleo - ferias
  deseo crear una hoja de vida
  para validar su correcto funcionamiento

  @despegar
  Esquema del escenario: busqueda de paquetes
    Dado que ingreso en el aplicativo despegar<fila>
      | Ruta Excel                       | Pestaña          |
      | src/test/java/data/despegar.xlsx | busquedaPaquetes |
    Cuando ingreso por la opcion paquetes
    Y realizo el respectivo uso de los filtros
    Entonces puedo ver la informacion de los paquetes disponibles
    Y entonces puedo imprimir las diferentes ofertas

    Ejemplos: 
      | fila |
      |    1 |
