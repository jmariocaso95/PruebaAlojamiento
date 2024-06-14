package co.com.certification.proyectoprueba.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class InicioPage {
    public static final Target BTN_REGISTRAR = Target.the("boton registrar").
            located(By.xpath("(//div/a[contains(@class,'login-link')])[1]"));

    public static final Target BTN_INICIAR_SESION = Target.the("boton iniciar sesión").
            located(By.xpath("(//div/a[contains(@class,'login-link')])[2]"));

    public static final Target BTN_VUELOS = Target.the("boton ingresar a vuelos").
            located(By.xpath("//li/a[@data-decider-header=\"flights\"]"));

    public static final Target BTN_ATRACCIONES = Target.the("boton ingresar a vuelos").
            located(By.xpath("//li/a[@data-decider-header=\"attractions\"]"));





}
