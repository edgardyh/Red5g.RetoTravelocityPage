package co.com.red5g.travelocity.question.factories;
import co.com.red5g.travelocity.question.MensajeFinal;
import co.com.red5g.travelocity.question.MensajeTotal;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class Es {

    public Es (){}

    public static Question <Boolean> visible() { return new MensajeTotal(); }

    public static Question <String> elnombreDelElemento (Target obj) {
        return new MensajeFinal(obj);
    }

}
