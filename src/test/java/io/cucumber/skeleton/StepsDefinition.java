package io.cucumber.skeleton;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StepsDefinition {

    private Person sean;
    private Person lucy;
    private String messageFromSean;

    @Given("Lucy is located {int} meters from Sean")

    public void lucy_is_located_meters_from_Sean(Integer distance){
        lucy=new Person();
        sean=new Person();
        lucy.moveTo(distance);
            System.out.println(distance);
    }

    @When("Sean shouts {string}")
        public void sean_shouts(String message){
            sean.shout(message);
            messageFromSean=message;
    }

    @Then("Lucy hears Sean's message")
    public void lucy_hears_Sean_s_message(){
        assertEquals(asList(messageFromSean),lucy.getMessageHeardRight());
    }

    @Then("Lucy should hear Sean's message")
    public void lucy_should_hear_sean_s_message() {
        assertEquals(asList(messageFromSean),lucy.getMessageHeardBad());
    }
}
