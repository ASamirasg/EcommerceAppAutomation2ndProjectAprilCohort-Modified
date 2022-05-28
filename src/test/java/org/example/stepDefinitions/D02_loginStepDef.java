package org.example.stepDefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;
import org.example.pages.P02_login;
import org.example.pages.P03_homePage;

public class D02_loginStepDef {

    public P02_login login = new P02_login(Hooks.driver);

@When("guest user click on login tab")
public void login_tab()
{
          P03_homePage homePage = new P03_homePage(Hooks.driver);
          Hooks.driver.findElement(homePage.login_icon()).click();
}
@Given("user set valid email and password")
    public void set_email_password()
{
    Hooks.driver.findElement(login.email()).sendKeys("test@example.com");
    Hooks.driver.findElement(login.password()).sendKeys("P@ssw0rd");

}
@Then("user click on login button")
    public void login_button() throws InterruptedException
{
    Hooks.driver.findElement(login.login_button()).click();
    Thread.sleep(2);
    SoftAssert soft = new SoftAssert();
    soft.assertEquals(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/"), "true");
//    soft.assertTrue(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/"));
    soft.assertAll();

}
}
