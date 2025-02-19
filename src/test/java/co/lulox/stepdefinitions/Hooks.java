package co.lulox.stepdefinitions;

import co.lulox.interactions.OpenBrowser;
import co.lulox.interactions.MaximizeChatWindow;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;


public class Hooks {

    @Given("The (.*) opens the LuloX page$")
    public void theUserOpensTheLuloXPage(String name) {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled(name).wasAbleTo(
                OpenBrowser.theBrowser(),
                MaximizeChatWindow.theBrowser()
        );
    }

    @After
    public void endTest(){
        System.out.println("Ejecución terminada");
    }


}
