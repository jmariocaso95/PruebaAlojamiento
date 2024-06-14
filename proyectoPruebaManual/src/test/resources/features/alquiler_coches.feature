#language: es

Característica: Alquilar un carro para viaje
  Como usuario de booking
  Quiero reservar un carro en un destino elegido
  Para no tener problemas con el transporte

  @manual1
  Esquema del escenario: buscar disponibilidad de carros
    Dado que <usuario> esta logueado en la pagina bookin
    Cuando ingreso <lugarDevolucion>, <destino>, <fechaInicial>, <fechaFinal>, <edadConductor>
    Y busco la marca: <marca> en especifico
    Entonces deberia mirar el mensaje de disponibilidad del auto
    Ejemplos:
      | usuario | destino   | fechaInicial | fechaFinal | edadConductor | marca   | lugarDevolucion |
      | juan    | Pasto     | 2022-12-31   | 2023-01-12 | 18            | Logan   | mismo lugar     |
      | pedro   | Cartagena | 2022-10-07   | 2022-10-10 | 40            | Kia     | otro lugar      |
      | Raul    | Pereira   | 2022-12-31   | 2023-01-12 | 29            | Renault | otro lugar      |