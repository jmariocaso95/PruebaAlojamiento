package co.com.certification.proyectoprueba.stepdefinitions;

import co.com.certification.proyectoprueba.exceptions.creacionFallida;
import co.com.certification.proyectoprueba.questions.creacion.verificarFlujoExitoso;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;

import static co.com.certification.proyectoprueba.exceptions.creacionFallida.CREACION_FALLIDA;
import static co.com.certification.proyectoprueba.taks.autenticacion.autenticarse.opcionLoguearse;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AutenticacionStepDefinition {

    @Cuando("^el usuario ingresa su correo y contrasena para autenticar$")
    public void elUsuarioIngresaSuCorreoYContrasenaParaAutenticar() {
        theActorInTheSpotlight().attemptsTo(opcionLoguearse());

    }

    @Entonces("^la autenticacion deberia ser exitosa$")
    public void LaAutenticacionDeberiaSerExitosa() {
        theActorInTheSpotlight().should(seeThat(verificarFlujoExitoso.creacionCuenta()).orComplainWith(creacionFallida.class, CREACION_FALLIDA));
    }
}
