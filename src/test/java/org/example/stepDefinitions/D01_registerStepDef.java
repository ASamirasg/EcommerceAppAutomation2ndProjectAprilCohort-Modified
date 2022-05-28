package org.example.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;
import org.example.pages.P01_register;
import org.example.pages.P03_homePage;


public class D01_registerStepDef {

    P01_register register = new P01_register(Hooks.driver);



    @Given("guest user click on register")
    public void click_register()
    {
        P03_homePage homePage = new P03_homePage(Hooks.driver);
        Hooks.driver.findElement(homePage.register_icon()).click();
    }
    @When("guest user fill personal valid data")
    public void personal_data()
    {
        Hooks.driver.findElement(register.firstname()).sendKeys("Ahmed");
        Hooks.driver.findElement(register.lastname()).sendKeys("Samir");
        Hooks.driver.findElement(register.email()).sendKeys("test@example.com");

        String ExpectedResult = "Your registration completed";


    }
    @And("guest user fill password")
    public void fill_password()
    {
        Hooks.driver.findElement(register.password()).sendKeys("P@ssw0rd");
        Hooks.driver.findElement(register.confirm_password()).sendKeys("P@ssw0rd");
    }
    @And("guest user click on register button")
    public void register_button()
    {
        Hooks.driver.findElement(register.register_button()).click();
    }

    @Then("guest user get success message")
    public void success_msg()
    {

         SoftAssert soft = new SoftAssert();
         soft.assertEquals(Hooks.driver.findElement(By.className("result")).isDisplayed(), true);
         soft.assertTrue(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/registerresult/1?returnUrl=/"));
         soft.assertTrue(Hooks.driver.findElement(By.cssSelector("a[href= \"/customer/info\"][class=\"ico-account\"]")).isDisplayed());
         soft.assertAll();
    }


}
