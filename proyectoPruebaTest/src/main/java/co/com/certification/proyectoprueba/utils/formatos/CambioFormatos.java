package co.com.certification.proyectoprueba.utils.formatos;

import static co.com.certification.proyectoprueba.utils.constantes.Constantes.CLASE_UTILS;

public class CambioFormatos {

    private CambioFormatos(){ throw new IllegalStateException(CLASE_UTILS);}
    public static String formatoTipoVuelo(String tipoVuelo){
        String castTipoVuelo = "";
        if (tipoVuelo.contains("Turista")){
            castTipoVuelo="ECONOMY";
        }else if (tipoVuelo.contains("Turista premium")){
            castTipoVuelo="PREMIUM_ECONOMY";
        }else if (tipoVuelo.contains("Business")){
            castTipoVuelo="BUSINESS";
        }else if (tipoVuelo.contains("Primera clase")) {
            castTipoVuelo = "FIRST";
        }
        return castTipoVuelo;
    }

    public static String formatoAbreviaturaCiudad(String ciudad){
        String castCiudad = "";
        if (ciudad.contains("Cali")){
            castCiudad="CLO";
        }else if (ciudad.contains("Pereira")){
            castCiudad="PEI";
        }else if (ciudad.contains("Pasto")){
            castCiudad="PSO";
        }else if (ciudad.contains("Cartagena")) {
            castCiudad = "CTG";
        }
        return castCiudad;
    }
}
