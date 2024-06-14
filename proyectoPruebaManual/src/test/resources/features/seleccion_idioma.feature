#language: es

Característica: Seleccionar idioma de la plataforma
  Como usuario de booking
  Quiero cambiar el idioma de la plataforma
  Para no tener problemas de entendimiento en el menú

  @manual1
  Esquema del escenario: cambiar idioma
    Dado que <usuario> ingresa al inicio de la pagina booking
    Cuando cambio idioma a: <idioma>
    Entonces deberia mirar el mensaje inicial: <mensaje>
    Ejemplos:
      | usuario | idioma  | mensaje                            |
      | juan    | English | Find your next stay                |
      | juan    | Fracais | Trouvez votre prochain séjour      |
      | Manuel  | Deutsch | Finden Sie Ihre nächste Unterkunft |
