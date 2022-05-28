package org.example.stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

public class D06_homeSlidersStepDef {
//    P03_homePage home = new P03_homePage();

    @When("guest user click on first slider")
    public void first_slider() throws InterruptedException {
//        home.slider("1").click();
        Hooks.driver.findElement(By.xpath("(//a[@href=\"http://demo.nopcommerce.com/\"])[1]")).isDisplayed();

    }
    @Then("relative product for first slider is displayed")
    public void first_slider_displayed() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertEquals(Hooks.driver.getCurrentUrl(), "https://demo.nopcommerce.com/iphone_s6");


    }
    @When("guest user click on second slider")
    public void second_slider() throws InterruptedException {
        Hooks.driver.findElement(By.xpath("(//a[@href=\"http://demo.nopcommerce.com/\"])[2]")).isDisplayed();

    }
    @Then("relative product for second slider is displayed")
    public void second_slider_displayed() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertEquals(Hooks.driver.getCurrentUrl(), "https://demo.nopcommerce.com/search?q=nokia");


    }
}
