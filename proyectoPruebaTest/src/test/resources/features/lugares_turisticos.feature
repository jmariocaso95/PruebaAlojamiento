#language:es
Característica:Realizar una busqueda de lugares turisticos sin atutenticarse en Booking.com
  Como usuario externo
  Quiero realizar una busqueda de lugares turisticos
  Para mirar opciones de viajes en vacaciones

  @ReservaVuelos1
  Esquema del escenario: Realizar busqueda de lugares turisticos desde pagina de inicio
    Dado que el usuario ingresa a la pagina de inicio
      | ID   | destino   | lugar   |
      | <ID> | <Destino> | <Lugar> |
    Cuando el usuario ingresa el destino y lugar turistico
    Entonces deberia mirar el resultado de la busqueda para lugar en especifico
    Ejemplos:
      | ID | Destino | Lugar                 |
      | 2  | Madrid  | Museo del Real Madrid |