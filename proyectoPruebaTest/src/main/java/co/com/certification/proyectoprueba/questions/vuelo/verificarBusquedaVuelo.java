package co.com.certification.proyectoprueba.questions.vuelo;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.certification.proyectoprueba.models.cargardatos.DatosPrueba.getMap;
import static co.com.certification.proyectoprueba.userinterfaces.VueloPage.LABEL_BUSQUEDA_COMPLETA_DESTINO;
import static co.com.certification.proyectoprueba.userinterfaces.VueloPage.LABEL_BUSQUEDA_COMPLETA_ORIGEN;
import static co.com.certification.proyectoprueba.utils.constantes.Constantes.DESTINO;
import static co.com.certification.proyectoprueba.utils.constantes.Constantes.ORIGEN;
import static co.com.certification.proyectoprueba.utils.formatos.CambioFormatos.formatoAbreviaturaCiudad;

public class verificarBusquedaVuelo implements Question<Boolean> {


    @Override
    public Boolean answeredBy(Actor actor) {
        String resultadoEsperadoDestino =formatoAbreviaturaCiudad( getMap().get(DESTINO).toString().trim());
        String resultadoEsperadoOrigen = formatoAbreviaturaCiudad(getMap().get(ORIGEN).toString().trim());
        String resultadoObtenidoDestino = LABEL_BUSQUEDA_COMPLETA_DESTINO.resolveFor(actor).getText();
        String resultadoObtenidoOrigen = LABEL_BUSQUEDA_COMPLETA_ORIGEN.resolveFor(actor).getText();
        return ((resultadoObtenidoDestino.contains(resultadoEsperadoDestino) && resultadoObtenidoOrigen.contains(resultadoEsperadoOrigen)));


    }

    public static verificarBusquedaVuelo vuelo()  {
        return new verificarBusquedaVuelo();
    }

}
