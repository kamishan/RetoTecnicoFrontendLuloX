package co.lulox.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.actions.type.Type;
import org.openqa.selenium.Keys;

import static co.lulox.userinterfaces.ChatBotPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;


public class ChattingWithChatbot implements Task {



    public ChattingWithChatbot(){
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Switch.toFrame( getDriver().findElement(CHATBOT_IFRAME)),
                Type.theValue(USER_MESSAGE).into(TEXT_AREA),
                Type.theValue(Keys.ENTER).into(TEXT_AREA)
        );
    }



    public static Performable Bot(){

        return instrumented(ChattingWithChatbot.class);
    }
}
