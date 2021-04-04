package co.com.red5g.travelocity.interaction;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import java.util.ArrayList;

public class CambioPestanaDerechaPackage implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        ArrayList<String> lstVentanas = new ArrayList<>(BrowseTheWeb.as(actor).getDriver().getWindowHandles());
        BrowseTheWeb.as(actor).getDriver().switchTo().window(lstVentanas.get(1));
    }

    //Permite llamarla desde cualquier clase. lo ideal es desde el factorie.
    public static Performable cambioPestanaDerechaPackage() {
        return Tasks.instrumented(CambioPestanaDerechaPackage.class);
    }

}
