#language: es

Característica: Reservar un taxi desde el aeropuerto
  Como usuario de booking
  Quiero reservar un taxi en una fecha elegida
  Para no tener problemas con el transporte

  @manual1
  Esquema del escenario: buscar disponibilidad de taxis
    Dado que <usuario> esta logueado en la pagina bookin
    Cuando ingreso <tipoViaje>,<origen>, <destino>, <fechaInicial>, <hora>, <pasajeros>
    Entonces deberia mirar el mensaje de disponibilidad del auto
    Ejemplos:
      | usuario | origen             | fechaInicial | hora  | pasajeros | destino          | tipoViaje    |
      | juan    | Antonio Nariño     | 2022-12-31   | 12:00 | 1         | Hotel Agualongo  | solo ida     |
      | pedro   | Jose Maria Cordova | 2022-10-07   | 16:00 | 2         | Hotel Nutibara   | ida y vuelta |
      | Raul    | Jose Maria Yañez   | 2022-12-31   | 09:00 | 3         | Centro Historico | solo ida     |