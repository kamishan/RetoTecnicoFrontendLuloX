package co.lulox.userinterfaces;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("https://lulox.co/")
public class HomePage extends PageObject {

    public static final By BASE_IFRAME = By.xpath("//div//iframe[@seamless]");
    public static final By BUTTON_IFRAME = By.xpath("//div[@class='widget-visible']//iframe[1]");
    public static final By CHATBOT_BUTTON = By.cssSelector("button.tawk-button-circle");
}
