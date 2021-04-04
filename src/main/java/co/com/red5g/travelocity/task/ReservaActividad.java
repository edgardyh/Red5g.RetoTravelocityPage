package co.com.red5g.travelocity.task;

import co.com.red5g.travelocity.interaction.CambioPaginaHotel;
import co.com.red5g.travelocity.interaction.CambioPestanaDerechaPackage;
import co.com.red5g.travelocity.userinterface.ActividadesFormTravelocityPage;
import co.com.red5g.travelocity.userinterface.FormPrincipalTravelocityPage;
import co.com.red5g.travelocity.userinterface.MenuPrincipalTravelPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.EnterValue;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.red5g.travelocity.userinterface.ActividadesFormTravelocityPage.*;
import static co.com.red5g.travelocity.userinterface.FormPrincipalTravelocityPage.BTN_RESERVA_HABITACION;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class ReservaActividad implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(MenuPrincipalTravelPage.BTN_TRADUCCION_ESPANIOL),
                WaitUntil.the(MenuPrincipalTravelPage.BTN_ACTIVIDAD, isEnabled()).forNoMoreThan(5).seconds(),
                Click.on(MenuPrincipalTravelPage.BTN_ACTIVIDAD),
                Click.on(INP_DESTINO_ACT),
                Click.on(INP_MODAL_DESTINO),
                Enter.theValue("Mexico").into(INP_MODAL_DESTINO),
                Click.on(LBL_SELECT_MODAL),
                Click.on(INP_CLD_IDA),
                Click.on(CLD_FECHA_IDA),
                Click.on(CLD_FECHA_VUELTA),
                Click.on(BTN_HECHO_ACT),
                Click.on(BTN_BUSCAR_ACT),
                Click.on(JPNL_TOUR_BASILICA),
                //CambioPaginaHotel.in("Pestaña: Tour de la Vasílica de Guadalupe y las pirámides de Teotuhuacán"),
                CambioPestanaDerechaPackage.cambioPestanaDerechaPackage(),
                Scroll.to(BTN_VER_DISPONIBILIDAD),
                Click.on(BTN_VER_DISPONIBILIDAD),
                Click.on(INP_NRO_PERSONA),
                Click.on(BTN_AUMENTO_NRO_PASAJERO),
                Click.on(BTN_LISTO_NRO_PASAJERO),
                Click.on(BTN_RESERVA_TOUR),
                Click.on(LBL_CANCELACION_GRATUITA)
        );

    }


}
