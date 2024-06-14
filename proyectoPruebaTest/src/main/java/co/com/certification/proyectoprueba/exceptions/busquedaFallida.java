package co.com.certification.proyectoprueba.exceptions;

public class busquedaFallida extends AssertionError{
    public static final String BUSQUEDA_FALLIDA = "no se ha logrado terminar la busqueda con el filtro seleccionado";
    public busquedaFallida(String mensaje, Throwable causa) {
        super(mensaje, causa);
    }

}
