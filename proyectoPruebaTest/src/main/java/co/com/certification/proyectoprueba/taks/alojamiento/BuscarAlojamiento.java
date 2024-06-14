package co.com.certification.proyectoprueba.taks.alojamiento;

import co.com.certification.proyectoprueba.interactions.Aumentar;
import co.com.certification.proyectoprueba.interactions.Avanzar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.type.Type;

import static co.com.certification.proyectoprueba.models.cargardatos.DatosPrueba.obtener;
import static co.com.certification.proyectoprueba.userinterfaces.AlojamientoPage.*;
import static co.com.certification.proyectoprueba.utils.constantes.Constantes.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class BuscarAlojamiento implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LABEL_DESTINO),
                Type.theValue(obtener(DESTINO)).into(LABEL_DESTINO),
                Click.on(LABEL_FECHA_INICIO),
                Avanzar.tablaMes(obtener(FECHA_FINAL),FECHA,FLECHA_MES),
                Click.on(FECHA.of(obtener(FECHA_INICIAL))),
                Click.on(FECHA.of(obtener(FECHA_FINAL))),
                Click.on(LABEL_PERSONAS),
                Aumentar.indice(LABEL_ADULTOS,FLECHA_ADULTOS,obtener(NUMERO_ADULTOS)),
                Aumentar.indice(LABEL_NINOS,FLECHA_NINOS,obtener(NUMERO_NINOS)),
                Aumentar.indice(LABEL_HABITACIONES,FLECHA_HABITACIONES,obtener(NUMERO_HABITACIONES)),
                Click.on(BOTON_BUSCAR));
    }

    public static BuscarAlojamiento sinNinos(){
        return instrumented(BuscarAlojamiento.class);
    }
}
