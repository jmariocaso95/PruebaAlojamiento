package co.com.certification.proyectoprueba.questions.creacion;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.certification.proyectoprueba.models.cargardatos.DatosPrueba.getMap;
import static co.com.certification.proyectoprueba.userinterfaces.CrearCuentaPage.LABEL_CUENTA_CREADA;

public class verificarFlujoExitoso implements Question <Boolean>{

    @Override
    public Boolean answeredBy(Actor actor) {
        String resultadoEsperado = getMap().get("resultadoEsperdo").toString().trim();
        String resultadoObtenido = LABEL_CUENTA_CREADA.resolveFor(actor).getText();
        return resultadoObtenido.contains(resultadoEsperado);
    }
    public static verificarFlujoExitoso creacionCuenta() {
        return new verificarFlujoExitoso();
    }

}
