package co.lulox.stepdefinitions;

import co.lulox.questions.ChatbotResponse;
import co.lulox.tasks.ChattingWithChatbot;
import co.lulox.tasks.ClickOnChatbotButton;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static co.lulox.userinterfaces.ChatBotPage.CHATBOT_RESPONSE;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.actors.OnStage.withCurrentActor;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class LuloxUItestStepDefinition {
    @When("He clicks on the chat icon")
    public void heClicksOnTheChatIcon() {
        withCurrentActor();
        theActorInTheSpotlight().attemptsTo(
                ClickOnChatbotButton.chatBotSection());
    }

    @When("He interacts with the chat by sending a message")
    public void heInteractsWithTheChatBySendingMessage() {
        withCurrentActor();
        theActorInTheSpotlight().attemptsTo(
                ChattingWithChatbot.Bot());
    }
    @Then("He should see a response from the chatbot")
    public void heShouldSeeResponseFromTheChatbot() {
        theActorInTheSpotlight().attemptsTo(
                WaitUntil.the(CHATBOT_RESPONSE, isPresent()).forNoMoreThan(60).seconds()
        );
        theActorInTheSpotlight().should(seeThat(ChatbotResponse.successResponse()));
    }

}
