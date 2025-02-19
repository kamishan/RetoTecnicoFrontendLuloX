package co.lulox.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;

import static net.serenitybdd.core.Serenity.getDriver;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class MaximizeChatWindow implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        getDriver().manage().window().maximize();
    }

    public static Performable theBrowser(){
        return instrumented(MaximizeChatWindow.class);
    }

}
