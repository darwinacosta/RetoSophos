package pe.wong.www.stepdefinitions;

import cucumber.api.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class Hook {

    @Before
    public void LevantarWebDriver(){

        OnStage.setTheStage(new OnlineCast());
    }
}
