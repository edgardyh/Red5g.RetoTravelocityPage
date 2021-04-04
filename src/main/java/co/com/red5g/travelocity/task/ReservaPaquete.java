package co.com.red5g.travelocity.task;

import co.com.devco.automation.mobile.actions.WaitFor;
import co.com.red5g.travelocity.interaction.CambioPestanaDerechaPackage;
import co.com.red5g.travelocity.userinterface.MenuPrincipalTravelPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.red5g.travelocity.userinterface.FormPrincipalTravelocityPage.*;
import static co.com.red5g.travelocity.userinterface.PaquetesFormTravelocityPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class ReservaPaquete implements Task {

    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(MenuPrincipalTravelPage.BTN_PAQUETE),
                Click.on(INP_ORIGEN),
                Enter.theValue("Barranquilla").into(INP_ORIGEN_BUSCAR),
                Click.on(LIST_ORIGEN),
                Click.on(INP_DESTINO),
                Enter.theValue("Orlando").into(MOD_DESTINO),
                Click.on(LIST_DESTINO),
                //Enter.theValue(con().unDatoViaje().getDestino()).into(MOD_DESTINO),
                //WaitUntil.the(MOD_DESTINO, isEnabled()).forNoMoreThan(6).seconds(),
                Click.on(INP_CHECK_IN),
                Click.on(CLD_CHECK_IN_DIA_INICIAL),
                Click.on(CLD_CHECK_IN_DIA_FINAL),
                Click.on(BTN_DONE_FECHA),
                Click.on(INP_CHECK_OUT),
                Click.on(CLD_CHECK_OUT_DIA_INICIAL),
                Click.on(CLD_CHECK_OUT_DIA_FINAL),
                Click.on(LBL_CLASE_DE_VIAJE),
                Click.on(LBL_CLASE_EJECUTIVA),
                Click.on(BTN_BUSCAR),
                //Ingresando
                Scroll.to(IMG_HOTEL_ROSEN),
                JavaScriptClick.on(CRD_HOTEL_ROSEN),
                WaitFor.seconds(10),
                CambioPestanaDerechaPackage.cambioPestanaDerechaPackage(),
                //CambioPaginaHotel.
                  //      in("Rosen Shingle Creek (Orlando (and vicinity), Florida, United States of America Hotel Search Results"),

                WaitUntil.the(BTN_RESERVA_CUARTO_HOTEL, isEnabled()).forNoMoreThan(6).seconds(),
                Scroll.to(BTN_RESERVA_CUARTO_HOTEL),
                JavaScriptClick.on(BTN_RESERVA_CUARTO_HOTEL),
                Scroll.to(BTN_SALIDA_VUELO_ORLD),
                Click.on(BTN_SALIDA_VUELO_ORLD),
                Click.on(BTN_RETORNO_VUELO_BAQ),
                Click.on(LBL_DESCUENTO)
        );
    }
}
