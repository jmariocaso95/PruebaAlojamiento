package co.com.certification.proyectoprueba.stepdefinitions;

import io.cucumber.java.Before;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;

public class ComunesStepDefinitions {

    @Before
    public void setStage() {

        setTheStage(new OnlineCast());
    }

}
