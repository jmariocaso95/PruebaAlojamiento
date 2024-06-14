package co.com.certification.proyectoprueba.taks.comunes;

import co.com.certification.proyectoprueba.userinterfaces.BookingPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class abrirPaginaPrincipal implements Task{
    private BookingPage bookingPage;
    public static abrirPaginaPrincipal cargarPaginaParaCrearCuenta(){
        return instrumented(abrirPaginaPrincipal.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(bookingPage));
    }
}
