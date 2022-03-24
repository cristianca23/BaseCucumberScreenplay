package starter.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.ParameterType;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.thucydides.core.annotations.Steps;
import starter.steps.ValidationSteps;



public class SearchStepDefinitions {

    @Steps
    ValidationSteps validationSteps;


    @Given("Autentico en saucedemo con usuario {string} y contrasena {string}")
    public void autentico_en_saucedemo_con_usuario_y_contrasena(String Usuario, String Clave) {
        // Write code here that turns the phrase above into concrete actions
        validationSteps.login_saucedemo(Usuario, Clave);
        throw new io.cucumber.java.PendingException();
    }

}
