#language: es

Característica: Desde las opciones sugeridads buscar una ciudad rapidamente
  Como usuario de booking
  Quiero buscar sitios de interes
  Para disfrutar vacaciones

  @manual1
  Esquema del escenario: buscar información de hospedajes con opciones sugeridas de booking
    Dado que <usuario> esta logueado en la pagina bookin
    Cuando ingreso al destino: <destino>
    Y selecciono las fechas entre <fechaInicial> y <fechaFinal>
    Entonces deberia mirar el mensaje de reserva en pantalla
    Ejemplos:
      | usuario | destino     | fechaInicial | fechaFinal |
      | john    | Pasto       | 2022-12-31   | 2023-01-12 |
      | john    | Cartagena   | 2022-10-07   | 2022-10-10 |
      | john    | Santa Marta | 2022-12-31   | 2023-01-12 |


  @manual2
  Esquema del escenario: buscar información de hospedajes con opciones sugeridas de booking y filtrar por tipo de alojamiento
    Dado que <usuario> esta logueado en la pagina bookin
    Cuando ingreso al destino: <destino>
    Y selecciono las fechas entre <fechaInicial> y <fechaFinal>, y filtrar por: <tipoAlojamiento>
    Entonces deberia mirar el mensaje de reserva en pantalla
    Ejemplos:
      | usuario | destino     | fechaInicial | fechaFinal | tipoAlojamiento |
      | john    | Pasto       | 2022-12-31   | 2023-01-12 | Apartamentos    |
      | john    | Cartagena   | 2022-10-07   | 2022-10-10 | Hoteles         |
      | john    | Santa Marta | 2022-12-31   | 2023-01-12 | Hostales        |

  @manual3
  Esquema del escenario: buscar información de hospedajes con opciones sugeridas de booking y filtrar por estrellas
    Dado que <usuario> esta logueado en la pagina bookin
    Cuando ingreso al destino: <destino>
    Y selecciono las fechas entre <fechaInicial> y <fechaFinal>, y filtrar por: <estrellas>
    Entonces deberia mirar el mensaje de reserva en pantalla
    Ejemplos:
      | usuario | destino     | fechaInicial | fechaFinal | estrellas |
      | john    | Pasto       | 2022-12-31   | 2023-01-12 | 5         |
      | john    | Cartagena   | 2022-10-07   | 2022-10-10 | 4         |
      | john    | Santa Marta | 2022-12-31   | 2023-01-12 | 2         |

  @manual4
  Esquema del escenario: buscar información de hospedajes con opciones sugeridas de booking, filtrar por estrellas y reservar en la primer opcion
    Dado que <usuario> esta logueado en la pagina bookin
    Cuando ingreso al destino: <destino>
    Y selecciono las fechas entre <fechaInicial> y <fechaFinal>, filtrar por: <estrellas>
    Y reservar en la primer opcion <trabajo>, <apellido>, <correo>, <reservaPropia>, <habitacionDoble>, <trasladoAeropuerto>, <reservaTaxi>, <alquilarCoche>, <horaLlegada>
    Entonces deberia mirar el mensaje de reserva en pantalla
    Ejemplos:
      | usuario | destino     | fechaInicial | fechaFinal | estrellas | trabajo| apellido | correo | reservaPropia |  habitacionDoble | trasladoAeropuerto | reservaTaxi | alquilarCoche | horaLlegada |
      | john    | Pasto       | 2022-12-31   | 2023-01-12 | 5         | sí     |Perez     |Jperez@yopmail.ocm | sí  | no              | no                  | no          | sí            | 12:00       |
      | john    | Cartagena   | 2022-10-07   | 2022-10-10 | 4         | no     |Perez     |Jperez@yopmail.ocm | no  | si              | si                  | no          | no            | 14:00       |
      | john    | Santa Marta | 2022-12-31   | 2023-01-12 | 2         | sí     |Perez     |Jperez@yopmail.ocm | no  | no              | no                  | si          | no            | 08:00       |
