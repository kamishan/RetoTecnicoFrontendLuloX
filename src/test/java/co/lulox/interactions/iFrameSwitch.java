package co.lulox.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static net.serenitybdd.core.Serenity.getDriver;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class iFrameSwitch implements Interaction {
   public By iframe;
   public iFrameSwitch(By iframe){
       this.iframe=iframe;
   }


    @Override
    public <T extends Actor> void performAs(T t) {
        WebElement iframeWebElement=getDriver().findElement(iframe);
        getDriver().switchTo().frame(iframeWebElement);
    }

    public static Performable ToFrame(By iframe){
        return instrumented(iFrameSwitch.class,iframe);
    }
}
