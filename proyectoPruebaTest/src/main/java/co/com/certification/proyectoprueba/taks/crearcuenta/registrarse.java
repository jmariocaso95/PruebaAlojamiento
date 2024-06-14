package co.com.certification.proyectoprueba.taks.crearcuenta;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.type.Type;

import static co.com.certification.proyectoprueba.userinterfaces.CrearCuentaPage.*;
import static co.com.certification.proyectoprueba.userinterfaces.InicioPage.BTN_REGISTRAR;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class registrarse implements Task {
    private String correo;
    private String contrasena;

    public registrarse(String correo, String contrasena) {
        this.correo = correo;
        this.contrasena = contrasena;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_REGISTRAR),
                Type.theValue(correo).into(INPUT_EMAIL),
                Click.on(BTN_CONTINUAR),
                Type.theValue(contrasena).into(INPUT_PASSWORD),
                Type.theValue(contrasena).into(CONFIRMED_PASSWORD),
                Click.on(BTN_CONTINUAR)
        );


    }

    public static registrarse CrearCuenta(String correo, String contrasena) {
        return instrumented(registrarse.class, correo, contrasena);

    }
}
