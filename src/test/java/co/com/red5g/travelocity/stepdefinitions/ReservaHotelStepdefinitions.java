package co.com.red5g.travelocity.stepdefinitions;

import co.com.red5g.travelocity.exception.ExceptionLabel;
import co.com.red5g.travelocity.question.factories.Es;
import co.com.red5g.travelocity.task.ReservaAerea;
import co.com.red5g.travelocity.task.factories.Diligencia;
import co.com.red5g.travelocity.userinterface.FormPrincipalTerrestrePage;
import co.com.red5g.travelocity.userinterface.FormPrincipalTravelocityPage;
import co.com.red5g.travelocity.util.constant.MensajeExcepcion;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

public class ReservaHotelStepdefinitions {

    @Managed
    private WebDriver hisBrowser;

    //Si se quiere ejecutar algo antes de realizar esas funciones, etonces nos sirve @Before
    // Se realiza un casting para que lo abra el actor

    @Before
    public void setUp() {
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("YoRobot");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));
    }

    @Dado("que un usuario esta en la pagina de travelocity")
    public void queUnUsuarioEstaEnLaPaginaDeTravelocity() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://www.travelocity.com/"));
    }

    @Cuando("el usuario busca - un destino - un hotel - lo reserva - escoge tipo de habitacion y aerolinea")
    public void elUsuarioBuscaUnHotelLoReservaEscogeTipoDeHabitacionYAerolinea() {
        OnStage.theActorInTheSpotlight().attemptsTo(Diligencia.unaReservaAerea());
    }

    @Entonces("el deberia visualizar el monto a pagar en pantalla")
    public void elDeberiaVisualizarElMontoAPagarEnPantalla() {
        OnStage.theActorInTheSpotlight().should(seeThat(Es.visible(), equalTo(true)),
                seeThat(Es.elnombreDelElemento(FormPrincipalTravelocityPage.LBL_PRICE), equalTo("Total price:"))
                        .orComplainWith(ExceptionLabel.class, MensajeExcepcion.HOTEL_MENSAJE_TOTAL_A_PAGAR));
    }

    //Terrestre
    @Cuando("el usuario busca un hotel - lo reserva - escoge tipo de habitacion y transporte terrestre")
    public void elUsuarioBuscaUnHotelLoReservaEscogeTipoDeHabitacionYTransporteTerrestre() {
        OnStage.theActorInTheSpotlight().attemptsTo(Diligencia.unaReservaTerrestre());
    }

    @Entonces("el deberia visualizar el monto total a pagar y la validacion de campo")
    public void elDeberiaVisualizarElMontoTotalAPagar() {
        OnStage.theActorInTheSpotlight().should(
                seeThat(Es.elnombreDelElemento(FormPrincipalTerrestrePage.BTN_COMPLETAR_RESERVA), equalTo("Complete Booking"))
                        .orComplainWith(ExceptionLabel.class,MensajeExcepcion.HOTEL_BTN_RESERVA_FINAL_FLUJO),
                seeThat(Es.elnombreDelElemento(FormPrincipalTerrestrePage.LBL_CAMPO_INVALIDO), equalTo("Jump to the first invalid field."))
                        .orComplainWith(ExceptionLabel.class,"No hay validacion de campos"));
    }
}
