package co.com.red5g.travelocity.task;


import co.com.red5g.travelocity.userinterface.MenuPrincipalTravelPage;
import co.com.red5g.travelocity.userinterface.PaquetesFormMalPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.red5g.travelocity.userinterface.FormPrincipalTravelocityPage.*;
import static co.com.red5g.travelocity.userinterface.FormPrincipalTravelocityPage.BTN_BUSCAR;
import static co.com.red5g.travelocity.userinterface.PaquetesFormTravelocityPage.*;

public class ReservaMalPaquete implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(MenuPrincipalTravelPage.BTN_PAQUETE),
                Click.on(INP_ORIGEN),
                Enter.theValue("Barranquilla").into(INP_ORIGEN_BUSCAR),
                Click.on(LIST_ORIGEN),
                Click.on(INP_DESTINO),
                Enter.theValue("Orlando").into(MOD_DESTINO),
                Click.on(LIST_DESTINO),
                Click.on(INP_CHECK_IN),
                Click.on(PaquetesFormMalPage.CLD_IN_DIA),
                Click.on(PaquetesFormMalPage.CLD_IN_DIA_DOS),
                Click.on(PaquetesFormMalPage.CHK_ALOJAMIENTO),
                Click.on(PaquetesFormMalPage.INP_CLD_CHECK_OUT),
                Click.on(PaquetesFormMalPage.CLD_OUT_DIA),
                Click.on(PaquetesFormMalPage.CLD_OUT_DIA_DOS),
                Click.on(PaquetesFormMalPage.BTN_HECHO),
                Click.on(BTN_BUSCAR),
                Click.on(PaquetesFormMalPage.LBL_ERROR)
        );
    }
}
