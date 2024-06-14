#language:es
Característica:Realizar una busqueda de alojamiento sin atutenticarse en Booking.com
  Como usuario externo
  Quiero realizar una busqueda
  Para mirar opciones de viajes

  @ReservaAlojamiento1
  Esquema del escenario: Realizar busqueda de alojamiento desde pagina de inicio sin niños
    Dado que el usuario ingresa a la pagina de inicio
      | ID   | destino   | fechaInicio   | fechaFin   | adultos   | ninos   | habitaciones   |
      | <ID> | <Destino> | <FechaInicio> | <FechaFin> | <Adultos> | <Ninos> | <Habitaciones> |
    Cuando el usuario ingresa el destino, fecha y personas a viajar
    Entonces deberia mirar el resultado de la busqueda
    Ejemplos:
      | ID | Destino   | FechaInicio | FechaFin   | Adultos | Ninos | Habitaciones |
      | 2  | Pasto     | 2022-12-20  | 2023-01-05 | 5       | 0     | 1            |
      | 1  | Cartagena | 2022-08-20  | 2022-08-22 | 2       | 0     | 2            |

