#language: es

Característica: cambiar tipo de divisa a tranzar en la plataforma
  Como usuario de booking
  Quiero cambiar el tipo de moneda dentro de la plataforma
  Para no tener problemas de entendimiento con el pago

  @manual1
  Esquema del escenario: cambiar tipo de moneda
    Dado que <usuario> ingresa al inicio de la pagina booking
    Cuando cambio moneda a: <moneda>
    Entonces deberia mirar el mensaje inicial: <mensaje>
    Ejemplos:
      | usuario | moneda            | mensaje |
      | juan    | Euro              | EUR     |
      | juan    | Peso argentino    | ARS     |
      | Manuel  | Nuevo sol peruano | PEN     |