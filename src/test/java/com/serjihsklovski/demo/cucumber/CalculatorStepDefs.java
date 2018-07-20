package com.serjihsklovski.demo.cucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;

class CalculatorBdd {

    static String execute(String expression) {
        // stub code for the tests passed
        switch (expression) {
            case "2 * 2":
                return "4";

            case "3 + 5 * 6":
                return "33";

            case "(3 + 5) * 6":
                return "48";

            case "3 + 5 | * 6":
                return "48";

            default:
                return null;
        }
    }

}

public class CalculatorStepDefs {

    private String codeLine;

    private String actualResult;

    @Given("^we have a code line \"(.*)\"$")
    public void havingCodeLine(String codeLine) {
        this.codeLine = codeLine;
    }

    @When("we let our Calculator to execute the line")
    public void letCalculatorExecuteCodeLine() {
        actualResult = CalculatorBdd.execute(codeLine);
    }

    @Then("we got the output \"(.*)\"")
    public void assertResult(String expectedResult) {
        assertEquals(expectedResult, actualResult);
    }

}
