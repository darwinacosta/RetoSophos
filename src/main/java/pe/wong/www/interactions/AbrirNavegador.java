package pe.wong.www.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import pe.wong.www.userinterfaces.PaginaBusquedaWong;

public class AbrirNavegador implements Interaction {

    private PaginaBusquedaWong paginaBusquedaWong;

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Open.browserOn(paginaBusquedaWong));
    }

    public static AbrirNavegador procesoCompras(){
        return Tasks.instrumented(AbrirNavegador.class);
    }
}
