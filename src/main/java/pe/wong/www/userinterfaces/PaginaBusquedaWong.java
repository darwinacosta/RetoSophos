package pe.wong.www.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaBusquedaWong extends PageObject {

    public static final Target BTN_NO_GRACIAS = Target.the("Clic en no recibir notificaciones(No gracias)").located(By.id("onesignal-popover-cancel-button"));
    public static final Target TXT_BUSQUEDA = Target.the("Realizar la búsqueda del producto").located(By.id("search-autocomplete-input"));
    public static final Target BTN_AGREGAR = Target.the("Agregar producto").locatedBy("//button[@class= 'product-item__add-to-cart product-add-to-cart btn red add-to-cart ']");
    public static final Target LBL_MENSAJE_EXITOSO = Target.the("Validar mensaje que el producto fue agregado").locatedBy("//div[@class = 'delivery__login']//*[contains(text(), '{0}')]");

}
