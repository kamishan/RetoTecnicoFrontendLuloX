package co.lulox.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.lulox.userinterfaces.ChatBotPage.CHATBOT_RESPONSE;

public class ChatbotResponse implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return CHATBOT_RESPONSE.resolveFor(actor).isDisplayed();
    }

    public static ChatbotResponse successResponse(){
        return new ChatbotResponse();
    }
}
