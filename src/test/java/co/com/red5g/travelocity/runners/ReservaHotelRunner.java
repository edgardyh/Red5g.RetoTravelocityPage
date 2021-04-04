package co.com.red5g.travelocity.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/agregar_una_reserva_hotel.feature",
                glue = "co.com.red5g.travelocity.stepdefinitions",
                snippets = CucumberOptions.SnippetType.CAMELCASE,
                tags = "@Terrestre")

public class ReservaHotelRunner {

}
