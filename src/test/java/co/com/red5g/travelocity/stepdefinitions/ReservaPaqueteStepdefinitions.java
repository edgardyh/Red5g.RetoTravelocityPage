package co.com.red5g.travelocity.stepdefinitions;

import co.com.red5g.travelocity.question.factories.Es;
import co.com.red5g.travelocity.task.factories.Diligencia;
import co.com.red5g.travelocity.userinterface.FormPrincipalTerrestrePage;
import co.com.red5g.travelocity.userinterface.PaquetesFormMalPage;
import co.com.red5g.travelocity.userinterface.PaquetesFormTravelocityPage;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

public class ReservaPaqueteStepdefinitions {

    @Dado("que un usuario esta en la pagina de travelocity por un paquete")
    public void queUnUsuarioEstaEnLaPaginaDeTravelocityPorPaquete() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://www.travelocity.com/"));
    }

    @Cuando("el usuario escoge un hotel - lo reserva y escoge el horario de vuelo")
    public void elUsuarioEscogeUnHotelLoReservaYEscogeElHorarioDeVuelo() {
        OnStage.theActorInTheSpotlight().attemptsTo(Diligencia.unaReservaPaquete());
    }

    @Entonces("el deberia visualizar el total a pagar y el descuento")
    public void elDeberiaVisualizarElTotalAPagarYElDescuento() {
        OnStage.theActorInTheSpotlight().should(
                seeThat(Es.elnombreDelElemento(PaquetesFormTravelocityPage.LBL_DESCUENTO), equalTo("Trip savings")));
    }

    @Cuando("llena formulario de manera incorrecta")
    public void llenaFormularioDeManeraIncorrecta() {
        OnStage.theActorInTheSpotlight().attemptsTo(Diligencia.unaMalReservaPaquete());
    }


    @Entonces("el deberia visualizar el mensaje de validacion de llenado incorrecto")
    public void elDeberiaVisualizarElMensajeDeValidacionDeLlenadoIncorrecto() {
        OnStage.theActorInTheSpotlight().should(
                seeThat(Es.elnombreDelElemento(PaquetesFormMalPage.LBL_ERROR), equalTo("Go to the error")));
    }
}
