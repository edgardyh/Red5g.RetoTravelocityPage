package co.com.red5g.travelocity.question;

import co.com.red5g.travelocity.userinterface.FormPrincipalTravelocityPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;

public class MensajeTotal implements Question<Boolean> {

    @Override
    public Boolean answeredBy (Actor actor) {
        return Visibility.of(FormPrincipalTravelocityPage.LBL_PRICE).viewedBy(actor).asBoolean();
    }
}
