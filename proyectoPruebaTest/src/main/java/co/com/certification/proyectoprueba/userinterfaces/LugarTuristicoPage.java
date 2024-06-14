package co.com.certification.proyectoprueba.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LugarTuristicoPage {
    public static final Target LABEL_CIUDAD_DESTINO = Target.the("flecha para avanzar en meses de calendario").
            located(By.xpath("//form/div/input[contains(@name,'query')]"));
    public static final Target BTN_BUSCAR_LUGAR = Target.the("botón para buscar lugares turísticas filtrados por ciudad").
            located(By.xpath("//form/button[@type='submit']"));

    public static final Target ELEGIR_LUGAR = Target.the("cuadro para elegir lugar a visitar").
            locatedBy("//div/a[contains(@title,'{0}')]");


    public static final Target LABEL_BUSQUEDA_LUGAR_COMPLETA = Target.the("label para identificar si se realizó la consutla").
        located(By.xpath("(//div[contains(@class,'intersection-visible-wrapper')]/h2)[1]"));


}
