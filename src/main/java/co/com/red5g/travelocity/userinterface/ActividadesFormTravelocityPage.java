package co.com.red5g.travelocity.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ActividadesFormTravelocityPage {

    //Actividades
    public static final Target INP_DESTINO_ACT = Target.the("A donde ir").located(By.xpath("//div[@data-stid='location-field-location']"));
    public static final Target INP_MODAL_DESTINO = Target.the("modal a donde ir").located(By.id("location-field-location"));
    public static final Target LBL_SELECT_MODAL = Target.the("modal a donde ir").located(By.xpath("//li[@data-index='0']"));

    public static final Target INP_CLD_IDA = Target.the("input de ida cld").located(By.id("d1-btn"));
    public static final Target CLD_FECHA_IDA = Target.the("Seleccion dia").located(By.xpath("//button[@aria-label='9 de abril de 2021.']"));
    public static final Target CLD_FECHA_VUELTA = Target.the("Selecion dia dos").located(By.xpath("//button[@aria-label='16 de abril de 2021.']"));
    public static final Target BTN_HECHO_ACT = Target.the("hecho del cld").located(By.xpath("//span[text()='Listo']"));
    public static final Target BTN_BUSCAR_ACT = Target.the("buscar act").located(By.xpath("//button[text()='Buscar']"));

    public static final Target JPNL_TOUR_BASILICA = Target.the("Tarjeta Basilica").located(By.xpath("//span[text()='#3 Tour de la Basílica de Guadalupe y las pirámides de Teotihuacán']//ancestor::a"));
    public static final Target BTN_VER_DISPONIBILIDAD = Target.the("btn ver disponabilidad").located(By.xpath("//span[text()='Ver disponibilidad']"));
    public static final Target INP_NRO_PERSONA = Target.the("btn ver disponabilidad").located(By.xpath("//button[@data-testid='offer-card--traveller-button']"));
    public static final Target BTN_AUMENTO_NRO_PASAJERO = Target.the("incremento").located(By.xpath("(//button[@class='uitk-button uitk-button-small uitk-flex-item uitk-step-input-button'])[2]"));
    public static final Target BTN_LISTO_NRO_PASAJERO = Target.the("btn listo").located(By.xpath("//button[text()='Listo']"));
    public static final Target LBL_CANCELACION_GRATUITA = Target.the("lbl final cancelacion").located(By.xpath("//span[text()='Cancelación gratuita antes del ']"));
    public static final Target LBL_COVID = Target.the("lbl msj covid").located(By.xpath("//a[text()='Verifica las restricciones para tu viaje.']"));



    public static final Target BTN_RESERVA_TOUR = Target.the("btn reserva").located(By.xpath("//button[text()='Reservar']"));






}
