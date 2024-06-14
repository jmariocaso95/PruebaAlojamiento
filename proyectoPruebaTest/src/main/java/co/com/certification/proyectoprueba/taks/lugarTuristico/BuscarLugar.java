package co.com.certification.proyectoprueba.taks.lugarTuristico;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.DoubleClick;
import net.serenitybdd.screenplay.actions.type.Type;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.certification.proyectoprueba.interactions.PasarPestana.pasarPestana;
import static co.com.certification.proyectoprueba.models.cargardatos.DatosPrueba.obtener;
import static co.com.certification.proyectoprueba.userinterfaces.InicioPage.BTN_ATRACCIONES;
import static co.com.certification.proyectoprueba.userinterfaces.LugarTuristicoPage.*;
import static co.com.certification.proyectoprueba.utils.constantes.Constantes.DESTINO;
import static co.com.certification.proyectoprueba.utils.constantes.Constantes.LUGAR;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class BuscarLugar implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_ATRACCIONES),
                Type.theValue(obtener(DESTINO)).into(LABEL_CIUDAD_DESTINO),
                WaitUntil.the(BTN_BUSCAR_LUGAR, isVisible()).forNoMoreThan(3).seconds(),
                DoubleClick.on(BTN_BUSCAR_LUGAR),
                WaitUntil.the(ELEGIR_LUGAR.of(obtener(LUGAR)), isVisible()).forNoMoreThan(5).seconds(),
                Click.on(ELEGIR_LUGAR.of(obtener(LUGAR))),
                pasarPestana()
        );
    }
    public static BuscarLugar turistico() {
        return instrumented(BuscarLugar.class);
    }
}
