package co.com.red5g.travelocity.stepdefinitions;
import co.com.red5g.travelocity.exception.ExceptionLabel;
import co.com.red5g.travelocity.question.factories.Es;
import co.com.red5g.travelocity.task.factories.Diligencia;
import co.com.red5g.travelocity.userinterface.ActividadesFormTravelocityPage;
import co.com.red5g.travelocity.userinterface.FormPrincipalTerrestrePage;
import co.com.red5g.travelocity.util.constant.MensajeExcepcion;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;

import java.beans.ExceptionListener;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

public class ReservaActividadStepdefinitions {

    @Dado("que un usuario esta en la pagina de travelocity por una actividad")
    public void queUnUsuarioEstaEnLaPaginaDeTravelocityPorUnaActividad() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://www.travelocity.com/"));
    }

    @Cuando("el usuario escoge la actividad - reserva hotel y escoge el horario de vuelo")
    public void elUsuarioEscogeLaActividadReservaHotelYEscogeElHorarioDeVuelo() {
        OnStage.theActorInTheSpotlight().attemptsTo(Diligencia.unaReservaActvidad());
    }

    @Entonces("el deberia visualizar el total a pagar y el descuento si aplica")
    public void elDeberiaVisualizarElTotalAPagarYElDescuentoSiAplica() {
        OnStage.theActorInTheSpotlight().should(
                seeThat(Es.elnombreDelElemento(ActividadesFormTravelocityPage.LBL_CANCELACION_GRATUITA), equalTo("Cancelación gratuita antes del jue., abr 8"))
                        .orComplainWith(ExceptionLabel.class, MensajeExcepcion.ACTIVIDIAD_MENSAJE));
    }


}
