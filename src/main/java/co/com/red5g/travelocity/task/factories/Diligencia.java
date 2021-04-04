package co.com.red5g.travelocity.task.factories;

import co.com.red5g.travelocity.task.*;
import net.serenitybdd.screenplay.Tasks;

public class Diligencia {
    public static ReservaAerea unaReservaAerea(){ return Tasks.instrumented(ReservaAerea.class); }
    public static ReservaTerrestre unaReservaTerrestre(){ return Tasks.instrumented(ReservaTerrestre.class); }
    public static ReservaPaquete unaReservaPaquete(){ return Tasks.instrumented(ReservaPaquete.class); }
    public static ReservaMalPaquete unaMalReservaPaquete(){ return Tasks.instrumented(ReservaMalPaquete.class); }
    public static ReservaActividad unaReservaActvidad(){ return Tasks.instrumented(ReservaActividad.class); }

}
