package co.com.certification.proyectoprueba.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Avanzar implements Interaction {
    private String Fechaaux;
    private Target FechaPath;
    private Target Flecha;

    public Avanzar(String fechaaux, Target fechaPath, Target flecha) {
        this.Fechaaux = fechaaux;
        this.FechaPath = fechaPath;
        this.Flecha = flecha;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        while (!(FechaPath.of(Fechaaux)).resolveFor(actor).isPresent()){
            actor.attemptsTo(
                    Click.on(Flecha)
            );
        }

    }
    public static Avanzar tablaMes(String fechaaux, Target fechaPath, Target flecha) {
        return instrumented(Avanzar.class, fechaaux, fechaPath, flecha);
    }

}
