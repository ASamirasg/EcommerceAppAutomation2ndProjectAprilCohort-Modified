package org.example.stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class D03_currenciesStepDef {
    @When("guest user click on dropdown list")
    public void click_dropdown_list()
    {
        Hooks.driver.findElement(By.className("customerCurrency")).click();

    }
    @Then("guest user choose euro")
    public void choose_euro()
    {
        Hooks.driver.findElement(By.className("customerCurrency")).click();

    }
}
