package org.example.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

public class D08_wishListStepDef {
    int number;

    @When("guest user add product to wishlist")
    public void  wishlist() throws InterruptedException {

        Hooks.driver.findElements(By.cssSelector("button[class=\"button-2 add-to-wishlist-button\"]")).get(2);
        Thread.sleep(2000);
    }
    @Then("wishlist notification success is visible")
    public void notification_success()
    {
       Assert.assertTrue(Hooks.driver.findElement(By.cssSelector("div[class=\"bar-notification success\"]")).isDisplayed());
    }
    @And("guest user get the number of wishlist items after adding product")
    public void wishlist_items()
    {
        String text = Hooks.driver.findElement(By.cssSelector("span[class=\"wishlist-qty\"]")).getText();
        System.out.println(text);
        text = text.replaceAll("[^0-9]", "");

        number = Integer.parseInt(text);

    }
    @Then("number of wishlist items increased")
    public void items_increased()
    {
        Assert.assertTrue(number>0);
    }
    @And("guest user go to wishlist page")
    public void go_to_wishlist()
    {
        Hooks.driver.findElement(By.cssSelector("span[class=\"close\"]")).click();
        Hooks.driver.findElement(By.cssSelector("div[class=\"header-links-wrapper\"] a[href=\"/wishlist\"]")).click();

    }





}
