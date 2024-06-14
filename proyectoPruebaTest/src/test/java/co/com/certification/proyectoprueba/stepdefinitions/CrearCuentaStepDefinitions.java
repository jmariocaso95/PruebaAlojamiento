package co.com.certification.proyectoprueba.stepdefinitions;

import co.com.certification.proyectoprueba.exceptions.creacionFallida;
import co.com.certification.proyectoprueba.questions.creacion.verificarFlujoExitoso;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

import java.util.List;
import java.util.Map;

import static co.com.certification.proyectoprueba.exceptions.creacionFallida.CREACION_FALLIDA;
import static co.com.certification.proyectoprueba.models.cargardatos.DatosPrueba.obtener;
import static co.com.certification.proyectoprueba.taks.comunes.abrirPaginaPrincipal.cargarPaginaParaCrearCuenta;
import static co.com.certification.proyectoprueba.taks.comunes.cargarDatos.cargarDataParaFlujo;
import static co.com.certification.proyectoprueba.taks.crearcuenta.registrarse.CrearCuenta;
import static co.com.certification.proyectoprueba.utils.constantes.Constantes.CONTRASENA;
import static co.com.certification.proyectoprueba.utils.constantes.Constantes.CORREO;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CrearCuentaStepDefinitions {
    @Dado("^que el (.*) ingresa a la pagina de inicio$")
    public void queElUsuarioIngresaALaPaginaDeInicio(String actor, List<Map<String, Object>> datos) {
        theActorCalled(actor).wasAbleTo(
                cargarPaginaParaCrearCuenta(),
                cargarDataParaFlujo(datos)
        );
    }

    @Cuando("^el usuario ingresa su correo y contrasena$")
    public void elUsuarioIngresaSuCorreoYContrasena() {
        theActorInTheSpotlight().attemptsTo(CrearCuenta(obtener(CORREO),obtener(CONTRASENA)));

    }

    @Entonces("^deberia ver el mensaje de confirmacion en el inicio de la pagina$")
    public void deberiaVerElMensajeDeConfirmacionEnElInicioDeLaPagina() {
        theActorInTheSpotlight().should(seeThat(verificarFlujoExitoso.creacionCuenta()).orComplainWith(creacionFallida.class, CREACION_FALLIDA));
    }
}
