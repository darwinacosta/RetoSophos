package pe.wong.www.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import pe.wong.www.userinterfaces.PaginaBusquedaWong;

import static pe.wong.www.userinterfaces.PaginaBusquedaWong.LBL_MENSAJE_EXITOSO;

public class MensajeProductoAgregado implements Question<String> {

    private String validarmensaje;

    public MensajeProductoAgregado(String validarmensaje) {
        this.validarmensaje = validarmensaje;
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(LBL_MENSAJE_EXITOSO.of(validarmensaje)).viewedBy(actor).asString();
    }

    public static MensajeProductoAgregado correctamente(String validarmensaje){
        return new MensajeProductoAgregado(validarmensaje);
    }
}
