package org.example.calculator;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class Calculator {

    //IntCalculator calculator=null;
    SingletonCalculator cal;
    int result;


    @Given("that the Calculator app is running and in focus")
    public void that_the_calculator_app_is_running_and_in_focus() {
        // Write code here that turns the phrase above into concrete actions
        cal= SingletonCalculator.getInstance();
       System.out.println("@Given : that the Calculator app is running and in focus");

    }

    @And("there is no current value in the calculator")
    public void there_is_no_current_value_in_the_calculator() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("@And : there is no current value in the calculator");
    }

    @When("you add {int} and {int}")
    public void you_add_and(Integer int1, Integer int2) {
        // Write code here that turns the phrase above into concrete actions
        result = cal.calculator.add(int1,int2);
        System.out.println("@When add "+int1+" + "+int2);

    }

    @Then("the value displayed should be {int}")
    public void the_value_displayed_should_be(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        validateResult(int1,result);

    }

    @When("I multiply {int} by {int} in the calculator app")
    public void i_multiply_by_in_the_calculator_app(Integer int1, Integer int2) {
        // Write code here that turns the phrase above into concrete actions
        result = cal.calculator.mul(int1,int2);
        System.out.println("@When multiply "+int1+" * "+int2);
    }

    @Then("the app displays the correct {int}")
    public void the_app_displays_the_correct(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        validateResult(int1,result);


    }

    private void validateResult(Integer int1, int result) {
        System.out.println("@Then Answer =  "+result);
        Assertions.assertEquals(int1,result);
    }


}
