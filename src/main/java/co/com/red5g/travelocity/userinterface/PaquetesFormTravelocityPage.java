package co.com.red5g.travelocity.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaquetesFormTravelocityPage {

    //---------------------------- Paquetes ----------------------------//

    public static final Target INP_ORIGEN = Target.the("origen de donde toma avion").located(By.xpath("//button[@data-stid='location-field-origin-menu-trigger']"));
    public static final Target INP_ORIGEN_BUSCAR = Target.the("origen de donde toma avion").located(By.xpath("//input[@data-stid='location-field-origin-menu-input']"));
    public static final Target LIST_ORIGEN = Target.the("desplegable").located(By.xpath("//li[@data-index='0']"));

    public static final Target LIST_DESTINO= Target.the("desplegable").
            located(By.xpath("//li[@data-stid='location-field-destination-result-item' and @data-index='0']"));

    public static final Target LBL_NRO_VIAJERO_HABITACION = Target.the("nro de viajero y habitaciones").located(By.xpath("a[@data-testid='travelers-field']"));
    public static final Target LBL_CLASE_DE_VIAJE = Target.the("Economico, empresarial etc").located(By.xpath("//a[text()='Economy']"));
    public static final Target LBL_CLASE_EJECUTIVA = Target.the("Economico, empresarial etc").located(By.xpath("//span[text()='Business class']"));
    public static final Target IMG_HOTEL_ROSEN = Target.the("Rosen shingle Creek").located(By.xpath("//h3[text()='Rosen Shingle Creek' and @data-stid]"));
    public static final Target CRD_HOTEL_ROSEN = Target.the("Toda la tarjeta del shingle Creek").located(By.xpath("(//a[@data-stid='open-hotel-information'])[17]"));


    public static final Target BTN_SALIDA_VUELO_ORLANDO = Target.the("salida orlando").located(By.xpath("//button[@data-leg-indexes='22,17']"));
    public static final Target BTN_RETORNO_VUELO_BAQ = Target.the("retorno baq")
            .located(By.xpath("//button[@data-trip-id='2021-04-12t13:25:00-05:00-business-baq-mia-aa-1124-first-mia-mco-aa-463;2021-04-19t08:00:00-04:00-first-mco-mia-aa-2537-business-mia-baq-aa-1125;']"));

    public static final Target LBL_DESCUENTO = Target.the("Descuento").located(By.xpath("//a[text()='Trip savings']"));
    public static final Target CLD_CHECK_IN_DIA_INICIAL = Target.the("Selecion fecha").located(By.xpath("//button[@aria-label='Apr 13, 2021.']"));
    public static final Target CLD_CHECK_IN_DIA_FINAL = Target.the("Selecion fecha").located(By.xpath("//button[@aria-label='Apr 20, 2021.']"));
    public static final Target CLD_CHECK_OUT_DIA_INICIAL = Target.the("Selecion fecha").located(By.xpath("//button[@aria-label='Apr 12, 2021.']"));
    public static final Target CLD_CHECK_OUT_DIA_FINAL = Target.the("Selecion fecha").located(By.xpath("//button[@aria-label='Apr 19, 2021.']"));

    //Reserva hotel
    public static final Target BTN_RESERVA_CUARTO_HOTEL = Target.the("reserva cuarto").located(By.xpath("(//button[@data-stid='submit-hotel-reserve'])[1]"));
    public static final Target BTN_SALIDA_VUELO_ORLD = Target.the("reserva cuarto")
            .located(By.xpath("//button[@data-trip-id='2021-04-12t13:25:00-05:00-business-baq-mia-aa-1124-first-mia-mco-aa-463;2021-04-19t08:00:00-04:00-first-mco-mia-aa-2537-business-mia-baq-aa-1125;']"));
    public static final Target BTN_BUS = Target.the("boton de arriba agregar carro").located(By.xpath("//span[text()='Add a car']"));





    public static final Target INP_CLD_CHECK_OUT = Target.the("Chk del alojamiento paquete").located(By.id("d2-partial-btn"));






}
