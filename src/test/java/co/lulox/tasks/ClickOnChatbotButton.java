package co.lulox.tasks;

import co.lulox.interactions.ClickChatButton;
import co.lulox.interactions.iFrameSwitch;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Switch;

import static co.lulox.userinterfaces.HomePage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;


public class ClickOnChatbotButton implements Task {

    public ClickOnChatbotButton(){
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                iFrameSwitch.ToFrame(BASE_IFRAME),
                iFrameSwitch.ToFrame(BUTTON_IFRAME),
                ClickChatButton.enelButton(CHATBOT_BUTTON),
                Switch.toParentFrame(), Switch.toParentFrame(), Switch.toNewWindow()
        );
    }


    public static Performable chatBotSection(){

        return instrumented(ClickOnChatbotButton.class);
    }
}
