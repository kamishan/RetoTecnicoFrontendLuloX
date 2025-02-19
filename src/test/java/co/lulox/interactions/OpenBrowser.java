package co.lulox.interactions;

import co.lulox.userinterfaces.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Open;
import org.fluentlenium.core.annotation.Page;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenBrowser implements Interaction {

    @Page
    HomePage homePage;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn().the(homePage)
        );
    }

    public static Performable theBrowser(){
        return instrumented(OpenBrowser.class);
    }
}
