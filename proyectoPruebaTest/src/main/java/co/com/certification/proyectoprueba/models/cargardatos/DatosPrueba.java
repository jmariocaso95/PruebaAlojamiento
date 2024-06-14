package co.com.certification.proyectoprueba.models.cargardatos;

import java.util.Map;

public class DatosPrueba {

    private static Map<String,Object> map;

    public DatosPrueba() {
    }

    public static Map<String, Object> getMap(){
        return map;
    }
    public static void setMap(Map<String, Object> informacion){
        map = informacion;
    }

    public static String obtener(String datoObtener){
        return (String) getMap().get(datoObtener);

    }
}
