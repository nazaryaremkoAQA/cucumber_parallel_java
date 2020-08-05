package cucumberskeleton;

import cucumberskeleton.pages.HomePage;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class MyStepdefs {

    private HomePage home;

    @Given("I have {int} cukes in my belly")
    public void iHaveCukesInMyBelly(int arg0) throws InterruptedException {
        home = new HomePage();
        home.open();
        assertEquals(arg0, 42);
    }

    @When("I wait {int} hour")
    public void i_wait_hour(Integer arg0) throws InterruptedException {
         assertEquals((int) arg0, 1);
    }

    @Then("my belly should growl")
    public void my_belly_should_growl() throws InterruptedException {
         assertTrue(true);
    }

    @Then("my belly should growl twice")
    public void my_belly_should_growl_twice() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
