package co.com.red5g.travelocity.interaction;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.WebDriver;
import java.util.Set;


public class CambioPaginaHotel implements Interaction {

    private String var;

    public CambioPaginaHotel(String var){ this.var = var; }

    public <T extends Actor> void performAs (T actor){
        WebDriver driver = BrowseTheWeb.as(actor).getDriver();
        Set<String> ListPage = BrowseTheWeb.as(actor).getDriver().getWindowHandles();
        for (String page:ListPage){
            driver.switchTo().window(page);
            if(driver.getTitle().contains(var))
                break;
        }
        if (!driver.getTitle().contains(var)){
            throw new NoSuchWindowException("No se encuentra la pagina " + var);
        }
    }

    public static CambioPaginaHotel in(String var)
    { return Tasks.instrumented(CambioPaginaHotel.class, var); }

}
