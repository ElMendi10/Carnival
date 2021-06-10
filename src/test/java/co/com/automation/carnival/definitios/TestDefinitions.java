package co.com.automation.carnival.definitios;

import co.com.automation.carnival.steps.TestSteps;
import co.com.automation.carnival.utils.TestUtils;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class TestDefinitions {

	TestUtils testUtils;
	
	@Steps
	TestSteps testSteps;
	
	@Before
	public void before(){
		testUtils.openBrowser();
	}
	
	@Given("^el usuario abre la pagina web$")
	public void elUsuarioAbreLaPaginaWeb() {

	}

	@When("^I check for the (\\d+) in step$")
	public void iCheckForTheInStep(int arg1) {

	}

	@Then("^I verify the success in step$")
	public void iVerifyTheSuccessInStep() {

	}

	@Then("^I verify the Fail in step$")
	public void iVerifyTheFailInStep() {

	}

	
	
}
