#language:es
Característica:Validar la creación de una cuenta de usuario en la pagina Booking.com
  Como usuario nuevo de Booking
  Quiero crear mi cuenta en el dominio
  Para obtener los beneficios que me ofrece

  @CuentaConCorreoElectronico
  Esquema del escenario: Crear una cuenta de usuario con correo electronico
    Dado que el usuario ingresa a la pagina de inicio
    | ID | correo | contrasena | resultadoEsperdo|
    |<ID>|<Correo>|<Contrasena>| <resultadoEsperdo>|
    Cuando el usuario ingresa su correo y contrasena
    Entonces deberia ver el mensaje de confirmacion en el inicio de la pagina
    Ejemplos:
    |ID|Correo|Contrasena|resultadoEsperdo|
    | 1|alambrito22@yopmail.com | 1234JNShgs25 |Tu cuenta|
