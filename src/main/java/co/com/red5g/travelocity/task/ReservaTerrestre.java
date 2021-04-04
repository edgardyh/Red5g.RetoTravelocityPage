package co.com.red5g.travelocity.task;

import co.com.red5g.travelocity.interaction.CambioPaginaHotel;
import co.com.red5g.travelocity.userinterface.FormPrincipalTerrestrePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.red5g.travelocity.userinterface.FormPrincipalTerrestrePage.*;
import static co.com.red5g.travelocity.userinterface.FormPrincipalTravelocityPage.*;

public class ReservaTerrestre implements Task {
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(INP_DESTINO),
                //Enter.theValue(con().unDatoViaje().getDestino()).into(MOD_DESTINO),
                //WaitUntil.the(MOD_DESTINO, isEnabled()).forNoMoreThan(6).seconds(),
                Enter.theValue("Medellin").into(MOD_DESTINO),
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
        for (int i = 0; i < 1; i++) {
            actor.attemptsTo(Click.on(BTN_INCRE_VIAJERO));
        }
        actor.attemptsTo(
                Click.on(BTN_DONE_VIAJERO),
                Click.on(CHECK_CARRO),
                Click.on(BTN_BUSCAR),
                Scroll.to(IMG_HOTEL_LAGUNA),
                Click.on(IMG_HOTEL_LAGUNA),
                CambioPaginaHotel.in("Hotel Lagoon (Medellin, Colombia (MDE-Jose Maria Cordova Intl.))"),
                Click.on(BTN_RESERVA_HABITACION),
                //WaitUntil.the(BTN_RENAULT_COMPACT, isEnabled()).forNoMoreThan(6).seconds(),
                Scroll.to(BTN_RENAULT_COMPACT),
                Click.on(BTN_RENAULT_COMPACT),
                Click.on(BTN_COMPLETAR_RESERVA),
                Click.on(LBL_CAMPO_INVALIDO)
        );
    }
}