package co.com.red5g.travelocity.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaquetesFormMalPage {

    // PAQUETE FECHAS MAL CHECK IN - OUT
    public static final Target CLD_IN_DIA = Target.the("dia calendario").located(By.xpath("//button[@aria-label='Apr 5, 2021.']"));
    public static final Target CLD_IN_DIA_DOS = Target.the("dia calendario").located(By.xpath("//button[@aria-label='Apr 12, 2021.']"));

    public static final Target CHK_ALOJAMIENTO = Target.the("Chk del alojamiento paquete").located(By.id("package-partial-stay"));
    public static final Target INP_CLD_CHECK_OUT = Target.the("Chk del alojamiento paquete").located(By.id("d1-partial-btn"));
    public static final Target CLD_OUT_DIA = Target.the("dia calendario").located(By.xpath("//button[@aria-label='Apr 9, 2021.']"));
    public static final Target CLD_OUT_DIA_DOS = Target.the("dia calendario").located(By.xpath("//button[@aria-label='Apr 18, 2021.']"));
    public static final Target BTN_HECHO = Target.the("dia calendario").located(By.xpath("//button[@data-stid='apply-date-picker']"));
    public static final Target LBL_ERROR = Target.the("Lbl error").located(By.xpath("//a[text()='Go to the error']"));


}
