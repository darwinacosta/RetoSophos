package pe.wong.www.stepdefinitions;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import org.hamcrest.Matchers;
import pe.wong.www.interactions.AbrirNavegador;
import pe.wong.www.tasks.ProcesoDeCompras;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static pe.wong.www.questions.MensajeProductoAgregado.correctamente;

public class ProcesoDeComprasStepDefinition {

    @Dado("^Que el (.*) ingresar a WONG$")
    public void queElClienteIngresarAWONG(String nombreActor) {
        theActorCalled(nombreActor).attemptsTo(AbrirNavegador.procesoCompras());
    }

    @Cuando("^Realizar la compra buscando el producto \"([^\"]*)\" y agregar al carrito$")
    public void realizarLaCompraBuscandoElProductoYAgregarAlCarrito(String producto) {
        theActorInTheSpotlight().attemptsTo(
                ProcesoDeCompras.agregarProducto(producto));
    }

    @Entonces("^Validar que se haya agregado \"([^\"]*)\" al carrito exitosamente$")
    public void validarQueSeHayaAgregadoAlCarritoExitosamente(String agregado) {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(correctamente(agregado), Matchers.equalTo(agregado)));
    }
}
