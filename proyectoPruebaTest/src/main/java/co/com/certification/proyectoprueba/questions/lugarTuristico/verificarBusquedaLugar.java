package co.com.certification.proyectoprueba.questions.lugarTuristico;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.certification.proyectoprueba.models.cargardatos.DatosPrueba.getMap;
import static co.com.certification.proyectoprueba.userinterfaces.LugarTuristicoPage.LABEL_BUSQUEDA_LUGAR_COMPLETA;

public class verificarBusquedaLugar implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        String resultadoEsperado = getMap().get("lugar").toString().trim();
        String resultadoObtenido = LABEL_BUSQUEDA_LUGAR_COMPLETA.resolveFor(actor).getText();
        return resultadoObtenido.contains(resultadoEsperado);
    }
    public static verificarBusquedaLugar turistico() {
        return new verificarBusquedaLugar();
    }
}
