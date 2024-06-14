package co.com.certification.proyectoprueba.taks.comunes;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.thucydides.core.annotations.Step;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import static co.com.certification.proyectoprueba.models.cargardatos.DatosPrueba.getMap;
import static co.com.certification.proyectoprueba.models.cargardatos.DatosPrueba.setMap;
import static co.com.certification.proyectoprueba.utils.fecha.FechaActual.obtenerFecha;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class cargarDatos implements Task {

    private List<Map<String, Object>> informacion;


    public cargarDatos(List<Map<String, Object>> informacion) {
        this.informacion = informacion;
    }

    @Override
    @Step("{0}")
    public <T extends Actor> void performAs(T actor) {
        if(!informacion.isEmpty()){
            Set<Map.Entry<String,Object>> setMapAux = informacion.get(0).entrySet();
            Map<String, Object> mapAux = setMapAux.stream().collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
            if(getMap()==null){
                setMap(mapAux);
                setMap(mapAux);
                getMap().put("horaFlujo", obtenerFecha("HHmmss"));
                getMap().put("horaFlujo", obtenerFecha("yyyyMMdd"));

            }else{
                getMap().putAll(mapAux);
            }
        }else{
            actor.remember("", new HashMap<>());
        }


    }


    public static cargarDatos cargarDataParaFlujo( List<Map<String, Object>> datos){
        return instrumented(cargarDatos.class, datos);
    }
}
