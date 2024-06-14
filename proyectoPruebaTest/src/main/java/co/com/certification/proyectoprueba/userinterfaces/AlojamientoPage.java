package co.com.certification.proyectoprueba.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AlojamientoPage {
    public static final Target LABEL_DESTINO = Target.the("campo para ingresar el destino del viaje").
            located(By.xpath("//label/input[contains(@aria-label,'destino')]"));
    public static final Target LABEL_FECHA_INICIO = Target.the("campo para que abra las opciones de fecha").
            located(By.xpath("//div[contains(@class,'xp__dates-inner')]"));
    public static final Target FECHA = Target.the("campo para seleccionar fecha de la tabla").
                        locatedBy("//ancestor::td[@data-date='{0}']");
    public static final Target FLECHA_MES = Target.the("flecha para avanzar en meses de calendario").
            located(By.xpath("//div[contains(@data-bui-ref,'calendar-next')]"));

    public static final Target LABEL_PERSONAS = Target.the("campo para apertura de menú para opciones de persoas").
            located(By.xpath("//label[contains(@id,'xp__guests__toggle')]"));

    public static final Target LABEL_ADULTOS = Target.the("label para conocer el número de adultos a reservar").
            located(By.xpath("(//span[@data-bui-ref=\"input-stepper-value\"])[1]"));
    public static final Target FLECHA_ADULTOS = Target.the("flecha para avanzar en número de adultos a reservar").
            located(By.xpath("(//button[contains(@aria-label,\"Adultos\")])[2]"));

    public static final Target LABEL_NINOS = Target.the("label para conocer el número de niños a reservar").
            located(By.xpath("(//span[@data-bui-ref=\"input-stepper-value\"])[2]"));
    public static final Target FLECHA_NINOS = Target.the("flecha para avanzar en número de niños a reservar").
            located(By.xpath("(//button[contains(@aria-label,\"Niños\")])[2]"));
    public static final Target LABEL_HABITACIONES = Target.the("label para conocer el número de habitaciones a reservar").
            located(By.xpath("(//span[@data-bui-ref=\"input-stepper-value\"])[3]"));

    public static final Target FLECHA_HABITACIONES = Target.the("flecha para avanzar en número de habitaciones a reservar").
            located(By.xpath("(//button[contains(@aria-label,\"Habitaciones\")])[2]"));

    public static final Target BOTON_BUSCAR = Target.the("botón para buscar la reserva con el filtro").
            located(By.xpath("//button/span[@class = \"js-sb-submit-text \"]"));

    public static final Target LABEL_BUSQUEDA_COMPLETA = Target.the("campo para validar que la consulta se realizó").
            located(By.xpath("//div/h1"));



}


