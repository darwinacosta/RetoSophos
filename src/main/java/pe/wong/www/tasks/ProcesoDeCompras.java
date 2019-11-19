package pe.wong.www.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static pe.wong.www.userinterfaces.PaginaBusquedaWong.*;

public class ProcesoDeCompras implements Task {

    private String producto;

    public ProcesoDeCompras(String producto) {
        this.producto = producto;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_NO_GRACIAS),
                Enter.theValue(producto).into(TXT_BUSQUEDA),
                Click.on(BTN_AGREGAR)
        );
    }

    public static ProcesoDeCompras agregarProducto(String producto){
        return Tasks.instrumented(ProcesoDeCompras.class, producto);
    }
}
