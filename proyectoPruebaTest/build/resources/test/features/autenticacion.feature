#language:es
Característica:Validar autenticacion en la pagina Booking.com
  Como usuario de Booking
  Quiero ingresar con mi usuario y contrasena
  Para autenticarme en el dominio

  @escenario1
  Esquema del escenario: Login exitoso desde el menu de la pagina de inicio
    Dado que el usuario ingresa a la pagina de inicio
    | ID | correo | contrasena | resultadoEsperdo|
    |<ID>|<Correo>|<Contrasena>| <resultadoEsperdo>|
    Cuando el usuario ingresa su correo y contrasena para autenticar
    Entonces la autenticacion deberia ser exitosa
    Ejemplos:
    |ID|Correo|Contrasena|resultadoEsperdo|
    | 1|alambrito522@yopmail.com | 1234JNShgs25 |Tu cuenta|
