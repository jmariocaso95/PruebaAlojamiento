package co.com.certification.proyectoprueba.stepdefinitions;

import co.com.certification.proyectoprueba.exceptions.busquedaFallida;
import co.com.certification.proyectoprueba.questions.alojamiento.verificarBusqueda;
import co.com.certification.proyectoprueba.taks.alojamiento.BuscarAlojamiento;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;

import static co.com.certification.proyectoprueba.exceptions.busquedaFallida.BUSQUEDA_FALLIDA;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AlojamientoStepDefinition {

    @Cuando("^el usuario ingresa el destino, fecha y personas a viajar$")
    public void elUsuarioIngresaElDestinoFechaYPersonasAViajar() {
        theActorInTheSpotlight().attemptsTo(BuscarAlojamiento.sinNinos());

    }

    @Entonces("^deberia mirar el resultado de la busqueda$")
    public void DeberiaMirarElResultadoDeLaBusqueda() {
        theActorInTheSpotlight().should(seeThat(verificarBusqueda.alojamiento()).orComplainWith(busquedaFallida.class, BUSQUEDA_FALLIDA));
    }
}
