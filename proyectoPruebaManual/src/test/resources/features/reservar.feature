#language: es

Característica: Reservar un alojamiento con 1 niño incluido
  Como usuario de booking
  Quiero reservar un alojamiento en un destino elegido
  Para disfrutar vacaciones con los niños

  @manual1
  Esquema del escenario: reservar alojamiento
    Dado que <usuario> esta logueado en la pagina bookin
    Cuando ingreso <destino>, <fechaInicial>, <fechaFinal>, <cantidadAdultos>, <cantidadNinos>, <edadNino>, <cantidadHabitaciones>
    Y de las opciones reservo la primera
    Entonces deberia mirar el mensaje de reserva en pantalla
    Ejemplos:
      | usuario | destino   | fechaInicial | fechaFinal | cantidadAdultos | cantidadNinos | edadNino | cantidadHabitaciones |
      | john    | Pasto     | 2022-12-31   | 2023-01-12 | 2               | 1             | 8        | 1                    |
      | john    | Cartagena | 2022-10-07   | 2022-10-10 | 4               | 1             | 10       | 2                    |
      | john    | Pereira   | 2022-12-31   | 2023-01-12 | 5               | 1             | 8        | 1                    |