package co.com.certification.proyectoprueba.taks.autenticacion;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.type.Type;

import static co.com.certification.proyectoprueba.models.cargardatos.DatosPrueba.obtener;
import static co.com.certification.proyectoprueba.userinterfaces.CrearCuentaPage.*;
import static co.com.certification.proyectoprueba.userinterfaces.InicioPage.BTN_INICIAR_SESION;
import static co.com.certification.proyectoprueba.utils.constantes.Constantes.CONTRASENA;
import static co.com.certification.proyectoprueba.utils.constantes.Constantes.CORREO;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class autenticarse implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_INICIAR_SESION),
                Type.theValue(obtener(CORREO)).into(INPUT_EMAIL),
                Click.on(BTN_CONTINUAR),
                Type.theValue(obtener(CONTRASENA)).into(INPUT_PASSWORD),
                Click.on(BTN_CONTINUAR)
        );
    }

    public static autenticarse opcionLoguearse() {
        return instrumented(autenticarse.class);
    }

}
