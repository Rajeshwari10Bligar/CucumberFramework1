package steps;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestStepDef {
    @Given("^I am in test feature$")
    public void i_am_in_test_feature() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
         //throw new PendingException();
        System.out.println(" I AM IN THE TEST GIVEN");
    }

    @When("^I do test when$")
    public void i_do_test_when() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        System.out.println(" I DO TEST WHEN");
    }

    @Then("^I get test then$")
    public void i_get_test_then() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();

        System.out.println(" I GET TEST THEN");
    }
}
