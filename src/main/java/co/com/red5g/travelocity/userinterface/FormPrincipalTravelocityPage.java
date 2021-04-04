package co.com.red5g.travelocity.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FormPrincipalTravelocityPage {

    // -------------------------- Hoteles ------------------------//

    public static final Target INP_DESTINO = Target.the("Busqueda Destino").located(By.xpath("//button[@data-stid='location-field-destination-menu-trigger']"));
    public static final Target MOD_DESTINO = Target.the("input check in / salida").located(By.xpath("//input[@data-stid='location-field-destination-menu-input']"));
    public static final Target LBL_DESTINO_POS_1 = Target.the("Posicion 1 busqueda").located(By.xpath("//li[@data-index='0']"));
    public static final Target LBL_CANCUN_MODAL = Target.the("destino cancun").located(By.xpath("//font[text()='Cancun']"));

    // Selecion Mes - dia
    public static final Target INP_CHECK_IN = Target.the("input check in / salida").located(By.id("d1-btn"));
    public static final Target CLD_FECHA_INI = Target.the("ingreso fecha").located(By.xpath("//button[@aria-label='Apr 7, 2021.']"));
    public static final Target CLD_FECHA_FIN = Target.the("ingreso fecha").located(By.xpath("//button[@aria-label='Apr 14, 2021.']"));
    public static final Target INP_CHECK_OUT = Target.the("input check out / retorno").located(By.id("d2-btn"));
    public static final Target CLD_OUT_FECHA_INI = Target.the("ingreso fecha").located(By.xpath("//button[@aria-label='Apr 6, 2021.']"));
    public static final Target CLD_OUT_FECHA_FIN = Target.the("ingreso fecha").located(By.xpath("//button[@aria-label='Apr 13, 2021.']"));
    public static final Target BTN_DONE_FECHA = Target.the("done meses hotel").located(By.xpath("//span[text()='Done']"));
    //Viajero
    public static final Target INP_NRO_VIAJERO = Target.the("input nro viajero").located(By.xpath("//button[@data-testid='travelers-field-trigger']"));
    public static final Target BTN_INCRE_VIAJERO = Target.the("incremento nro viajero").located(By.xpath("(//button[@class='uitk-button uitk-button-small uitk-flex-item uitk-step-input-button'])[2]"));
    public static final Target BTN_DECRE_VIAJERO = Target.the("decremento nro viajero").located(By.xpath("(//button[@class='uitk-button uitk-button-small uitk-flex-item uitk-step-input-button'])[1]"));
    public static final Target BTN_DONE_VIAJERO = Target.the("done del viajero").located(By.xpath("//button[text()='Done']"));
    // TRANSPORTE AEREO
    public static final Target CHECK_VUELO = Target.the("ir por aire").located(By.id("add-flight-switch"));
    public static final Target INP_UBICACION_HOTEL = Target.the("input ubicacion del aeropuerto").located(By.xpath("//button[@data-stid='location-field-origin-menu-trigger']"));
    public static final Target LIST_UBICACION = Target.the("desplegable").located(By.id("location-field-origin"));
    public static final Target SEL_LBL_BQUILLA = Target.the("Aeropuerto").located(By.xpath("//strong[text()='Barranquilla (BAQ - Ernesto Cortissoz Intl.)']"));
    // TRANSPORTE TERRESTRE

    // BUSCAR FINAL
    public static final Target BTN_BUSCAR = Target.the("boton buscar").located(By.xpath("//button[text()='Search']"));

    // RESERVANDO EL HOTEL
    public static final Target LBL_HOTEL_TURQUESA = Target.the("Hotel turquesa").located(By.xpath("//span[text()='More information about Casa Turquesa, Opens in a new window']"));
    public static final Target IMG_HOTEL_TURQUESA = Target.the("Img del hotel").
            located(By.xpath("//img[@src='https://images.trvl-media.com/hotels/1000000/990000/980600/980531/0903b989.jpg?impolicy=fcrop&w=455&h=235&p=1&q=medium']"));
    public static final Target BTN_RESERVA_HABITACION = Target.the("Reseva habitacion").
            located(By.xpath("//button[@data-stid='submit-hotel-reserve']"));
    public static final Target BTN_HORA_IDA_VUELO = Target.the("Hora de salida").located(By.xpath("//button[@data-leg-indexes='7,1']"));
    public static final Target BTN_HORA_REGRESO_VUELO = Target.the("Hora regreso").
            located(By.xpath("//button[@data-trip-id='2021-04-06t21:49:00-05:00-coach-baq-bog-av-9513-coach-bog-cun-av-256;2021-04-13t16:15:00-05:00-coach-cun-bog-av-257-coach-bog-baq-av-9530;']"));
    public static final Target LBL_TOTAL_RESUMEN = Target.the("Lbl del total").located(By.xpath("//button[text()='       Total due today: ']"));
    public static final Target LBL_PRICE = Target.the("lbl del precio").located(By.xpath("//span[text()='Total price:']"));


}
