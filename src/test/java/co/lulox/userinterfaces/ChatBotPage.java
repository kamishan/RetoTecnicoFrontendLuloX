package co.lulox.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.targets.Target.the;

public class ChatBotPage extends PageObject {

    public static final By CHATBOT_IFRAME = By.xpath("//iframe");
    public static final Target TEXT_AREA = the("Chatbot Text area ").located(By.xpath("/html/body/div/div/div/div[3]/div[2]/div[2]/div/div[3]/textarea"));
    public static final String USER_MESSAGE = "hola, necesito ayuda";
    public static final Target CHATBOT_RESPONSE = the("Globo de respuesta chatbot").located(By.xpath("//div[@id='tawk-body']//div[3]//div[@class='tawk-agent']"));

}
