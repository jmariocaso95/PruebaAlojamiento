package co.com.certification.proyectoprueba.exceptions;

public class creacionFallida extends AssertionError{
    public static final String CREACION_FALLIDA = "no se ha logrado crear o loguearse a la pagina";
    public creacionFallida(String mensaje, Throwable causa) {
        super(mensaje, causa);
    }
}
