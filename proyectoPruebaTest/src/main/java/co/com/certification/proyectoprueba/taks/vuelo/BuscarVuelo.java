package co.com.certification.proyectoprueba.taks.vuelo;

import co.com.certification.proyectoprueba.interactions.Aumentar;
import co.com.certification.proyectoprueba.interactions.Avanzar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.type.Type;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static co.com.certification.proyectoprueba.models.cargardatos.DatosPrueba.obtener;
import static co.com.certification.proyectoprueba.userinterfaces.InicioPage.BTN_VUELOS;
import static co.com.certification.proyectoprueba.userinterfaces.VueloPage.*;
import static co.com.certification.proyectoprueba.utils.constantes.Constantes.*;
import static co.com.certification.proyectoprueba.utils.formatos.CambioFormatos.formatoTipoVuelo;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class BuscarVuelo implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_VUELOS),
                Click.on(SELECT_TIPO.of(formatoTipoVuelo(obtener(TIPO_VUELO)))),
                Click.on(LBL_PERSONAS),
                WaitUntil.the(FLECHA_ADULTOS, isVisible()).forNoMoreThan(3).seconds(),
                Aumentar.indice(LABEL_ADULTOS,FLECHA_ADULTOS,obtener(NUMERO_ADULTOS)),
                Click.on(BTN_LISTO),
                Click.on(BTN_ORIGEN),
                Click.on(CBOX_ORIGEN),
                WaitUntil.the(LABEL_ORIGEN, isVisible()).forNoMoreThan(3).seconds(),
                Type.theValue(obtener(ORIGEN)).into(LABEL_ORIGEN),
                WaitUntil.the(CBOX_ORIGEN, isVisible()).forNoMoreThan(5).seconds(),
                Hit.the(Keys.ARROW_DOWN,Keys.ENTER).into(LABEL_ORIGEN),
                Click.on(LABEL_DESTINO),
                WaitUntil.the(LABEL_DESTINO_2, isClickable()).forNoMoreThan(3).seconds(),
                Enter.theValue(obtener(DESTINO)).into(LABEL_DESTINO_2),
                WaitUntil.the(CBOX_ORIGEN, isVisible()).forNoMoreThan(5).seconds(),
                Hit.the(Keys.ARROW_DOWN,Keys.ENTER).into(LABEL_DESTINO_2),
                Click.on(LABEL_FECHA_INICIO_VUELO),
                Avanzar.tablaMes(obtener(FECHA_FINAL),FECHA_VUELO,FLECHA_MES_VUELO),
                Click.on(FECHA_VUELO.of(obtener(FECHA_INICIAL))),
                Click.on(FECHA_VUELO.of(obtener(FECHA_FINAL))),
                Click.on(BOTON_BUSCAR_VUELO),
                WaitUntil.the(IMAGEN_TEMP, isNotVisible()).forNoMoreThan(10).seconds()
                );
    }
    public static BuscarVuelo sinNinos() {
        return instrumented(BuscarVuelo.class);
    }
}
