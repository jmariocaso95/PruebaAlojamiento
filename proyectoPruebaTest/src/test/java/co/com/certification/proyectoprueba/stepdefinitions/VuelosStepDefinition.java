package co.com.certification.proyectoprueba.stepdefinitions;

import co.com.certification.proyectoprueba.exceptions.busquedaFallida;
import co.com.certification.proyectoprueba.questions.vuelo.verificarBusquedaVuelo;
import co.com.certification.proyectoprueba.taks.vuelo.BuscarVuelo;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;

import static co.com.certification.proyectoprueba.exceptions.busquedaFallida.BUSQUEDA_FALLIDA;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class VuelosStepDefinition {
    @Cuando("^el usuario ingresa el origen, destino y fecha de vuelo$")
    public void elUsuarioIngresaElOrigenDestinoYFechaDeVuelo() {
        theActorInTheSpotlight().attemptsTo(BuscarVuelo.sinNinos());
    }

    @Entonces("^deberia mirar el resultado de la busqueda para vuelo$")
    public void DeberiaMirarElResultadoDeLaBusquedaParaVuelos() {
        theActorInTheSpotlight().should(seeThat(verificarBusquedaVuelo.vuelo()).orComplainWith(busquedaFallida.class, BUSQUEDA_FALLIDA));
    }
}
