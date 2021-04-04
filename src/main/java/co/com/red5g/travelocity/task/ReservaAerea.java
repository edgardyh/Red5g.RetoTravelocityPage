package co.com.red5g.travelocity.task;


import co.com.red5g.travelocity.interaction.CambioPaginaHotel;
import co.com.red5g.travelocity.model.builder.DatosViajeBuilder;
import co.com.red5g.travelocity.userinterface.FormPrincipalTravelocityPage;
import net.serenitybdd.screenplay.Action;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.red5g.travelocity.model.builder.DatosViajeBuilder.*;
import static co.com.red5g.travelocity.userinterface.FormPrincipalTravelocityPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class ReservaAerea implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(INP_DESTINO),
                //Enter.theValue(con().unDatoViaje().getDestino()).into(MOD_DESTINO),
                //WaitUntil.the(MOD_DESTINO, isEnabled()).forNoMoreThan(6).seconds(),
                Enter.theValue(con().unDatoViaje().getDestino()).into(MOD_DESTINO),
                Click.on(LBL_DESTINO_POS_1),
                Click.on(INP_CHECK_IN),
                Click.on(CLD_FECHA_INI),
                Click.on(CLD_FECHA_FIN),
                Click.on(BTN_DONE_FECHA),
                Click.on(INP_CHECK_OUT),
                Click.on(CLD_OUT_FECHA_INI),
                Click.on(CLD_OUT_FECHA_FIN),
                Click.on(BTN_DONE_FECHA),
                Click.on(INP_NRO_VIAJERO),
                MoveMouse.to(BTN_INCRE_VIAJERO));
                for (int i=0; i<3; i++){  actor.attemptsTo(Click.on(BTN_INCRE_VIAJERO)); }
                actor.attemptsTo(
                        Click.on(BTN_DONE_VIAJERO),
                        Click.on(CHECK_VUELO),
                        Click.on(INP_UBICACION_HOTEL),
                        Enter.theValue("Barranquilla").into(LIST_UBICACION),
                        Click.on(SEL_LBL_BQUILLA),
                        Click.on(BTN_BUSCAR),
                        WaitUntil.the(LBL_HOTEL_TURQUESA, isEnabled()).forNoMoreThan(5).seconds(),
                        Scroll.to(LBL_HOTEL_TURQUESA),
                        Click.on(IMG_HOTEL_TURQUESA),
                        CambioPaginaHotel.in("Casa Turquesa (Cancun (and vicinity), Quintana Roo, Mexico)"),
                        WaitUntil.the(BTN_RESERVA_HABITACION, isEnabled()).forNoMoreThan(5).seconds(),
                        Scroll.to(BTN_RESERVA_HABITACION),
                        Click.on(BTN_RESERVA_HABITACION),
                        Click.on(BTN_HORA_IDA_VUELO),
                        Click.on(BTN_HORA_IDA_VUELO),
                        //WaitUntil.the(BTN_HORA_REGRESO_VUELO, isEnabled()).forNoMoreThan(5).seconds(),
                        //JavaScriptClick.on(BTN_HORA_REGRESO_VUELO),
                        Scroll.to(LBL_PRICE),
                        Click.on(LBL_PRICE)
                );
    }

}
