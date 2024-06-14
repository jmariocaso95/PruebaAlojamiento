package co.com.certification.proyectoprueba.utils.fecha;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FechaActual {
    public FechaActual() {
    }
    public static String obtenerFecha(String strFormat){
        SimpleDateFormat fechaFlujo = new SimpleDateFormat(strFormat);
        return fechaFlujo.format(new Date());
    }
}
