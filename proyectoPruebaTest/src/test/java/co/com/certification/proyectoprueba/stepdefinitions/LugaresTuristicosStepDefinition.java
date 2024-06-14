package co.com.certification.proyectoprueba.stepdefinitions;

import co.com.certification.proyectoprueba.exceptions.busquedaFallida;
import co.com.certification.proyectoprueba.questions.lugarTuristico.verificarBusquedaLugar;
import co.com.certification.proyectoprueba.taks.lugarTuristico.BuscarLugar;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;

import static co.com.certification.proyectoprueba.exceptions.busquedaFallida.BUSQUEDA_FALLIDA;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LugaresTuristicosStepDefinition {
    @Cuando("^el usuario ingresa el destino y lugar turistico$")
    public void elUsuarioIngresaElDestinoYLugarTuristico() {
        theActorInTheSpotlight().attemptsTo(BuscarLugar.turistico());
    }

    @Entonces("^deberia mirar el resultado de la busqueda para lugar en especifico$")
    public void DeberiaMirarElResultadoDeLaBusquedaParaLugarEnEspecifico() {
        theActorInTheSpotlight().should(seeThat(verificarBusquedaLugar.turistico()).orComplainWith(busquedaFallida.class, BUSQUEDA_FALLIDA));
    }
}
