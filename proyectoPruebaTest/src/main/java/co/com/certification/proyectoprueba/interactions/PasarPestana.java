package co.com.certification.proyectoprueba.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Set;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class PasarPestana implements Interaction {
    private static final Logger logger = LoggerFactory.getLogger(PasarPestana.class);
    @Override
    public <T extends Actor> void performAs(T actor) {
        WebDriver driver = BrowseTheWeb.as(actor).getDriver();
        String currHandle = driver.getWindowHandle();
        Set<String> allHandles = driver.getWindowHandles();
        logger.debug("open windows: " + allHandles.size());
        logger.debug("current window: " + currHandle);
        for (String handle : allHandles) {
            if (!handle.contentEquals(currHandle)) {
                driver.switchTo().window(handle);
                break;
            }
        }
        logger.debug("new window: " + driver.getWindowHandle());
    }
    public static PasarPestana pasarPestana(){
        return instrumented(PasarPestana.class);
    }


}
