package co.com.red5g.travelocity.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FormPrincipalTerrestrePage {

    public static final Target CHECK_CARRO = Target.the("ir por tierra").located(By.id("add-car-switch"));
    public static final Target IMG_HOTEL_LAGUNA = Target.the("ir por tierra").
            located(By.xpath("//img[@src='https://images.trvl-media.com/hotels/32000000/31680000/31679100/31679095/0c2e8f34.jpg?impolicy=fcrop&w=455&h=235&p=1&q=medium']"));
    public static final Target BTN_RENAULT_COMPACT = Target.the("Clase Compact").located(By.xpath("//a[@data-book-button='book-ZD-CC-Car']"));
    public static final Target BTN_COMPLETAR_RESERVA = Target.the("complete booking").located(By.id("complete-booking"));
    public static final Target LBL_CAMPO_INVALIDO = Target.the("campo invalido").located(By.xpath("//a[text()='Jump to the first invalid field.']"));



}
