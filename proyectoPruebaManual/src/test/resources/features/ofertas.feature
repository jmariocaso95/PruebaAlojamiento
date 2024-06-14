#language: es

Característica: Buscar una oferta para viajes
  Como usuario de booking
  Quiero reservar un cbúsqueda de ofertas para viajar a otra ciudad
  Para ahorrar dinero en el viaje

  @manual1
  Esquema del escenario: buscar disponibilidad de reservas
    Dado que <usuario> esta logueado en la pagina bookin
    Cuando ingreso <destino>, <fechaInicial>, <fechaFinal>, <cantidadAdultos>, <cantidadNinos>, <cantidadHabitaciones>, <edadNino>
    Entonces deberia mirar el mensaje de disponibilidad de ofertas
    Ejemplos:
      | usuario | destino | fechaInicial | fechaFinal | cantidadAdultos | cantidadNinos | cantidadHabitaciones | edadNino |
      | juan    | México  | 2022-12-31   | 2023-01-12 | 3               | 1             | 1                    | 1        |
      | pedro   | Cancún  | 2022-10-07   | 2022-10-10 | 2               | 1             | 1                    | 10       |
      | Raul    | Madrid  | 2022-12-31   | 2023-01-12 | 5               | 1             | 2                    | 5        |