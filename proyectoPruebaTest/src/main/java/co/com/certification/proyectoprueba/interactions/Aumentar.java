package co.com.certification.proyectoprueba.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Aumentar implements Interaction {
    private Target LavelAux;
    private Target BotonFlecha;
    private String CantidadActual;

    public Aumentar(Target lavelAux, Target botonFlecha, String cantidadActual) {
        this.LavelAux = lavelAux;
        this.BotonFlecha = botonFlecha;
        this.CantidadActual = cantidadActual;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        while (!((LavelAux.resolveFor(actor).getText()).equals(CantidadActual))){
            actor.attemptsTo(
                    Click.on(BotonFlecha));
        }
        
    }

    public static Aumentar indice(Target lavelAux,Target botonFlecha,String cantidadActual) {
        return instrumented(Aumentar.class,lavelAux,botonFlecha,cantidadActual);
    }

}
