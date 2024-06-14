package co.com.certification.proyectoprueba.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CrearCuentaPage {
    public static final Target INPUT_EMAIL = Target.the("campo para ingresar correo").
            located(By.id("username"));
    public static final Target BTN_CONTINUAR = Target.the("Botón para continar").
            located(By.xpath("//button[contains(@type,'submit')]"));
    public static final Target INPUT_PASSWORD = Target.the("campo para ingresar contraseña").
            located(By.id("password"));
    public static final Target CONFIRMED_PASSWORD = Target.the("campo para confirmar contraseña ingresada").
            located(By.id("confirmed_password"));
    public static final Target LABEL_CUENTA_CREADA = Target.the("campo para verficar que la cuenta se creó").
            located(By.id("profile-menu-trigger--title"));







}
