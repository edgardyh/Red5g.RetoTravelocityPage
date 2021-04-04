package co.com.red5g.travelocity.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MenuPrincipalTravelPage {

    public static final Target BTN_HOTEL = Target.the("Boton hoteles").located(By.xpath("//span[text()='Hotels']"));
    public static final Target BTN_PAQUETE = Target.the("Boton paquetes").located(By.xpath("//span[text()='Packages']"));
    public static final Target BTN_ACTIVIDAD = Target.the("Boton actividades").located(By.xpath("//a[@class='uitk-tab-anchor']//span[text()='Actividades']"));
    public static final Target BTN_TRADUCCION_ESPANIOL = Target.the("Boton actividades").located(By.xpath("//div[text()='Español']"));


}
