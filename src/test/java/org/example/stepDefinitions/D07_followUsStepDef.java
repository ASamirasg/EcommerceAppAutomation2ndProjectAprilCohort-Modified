package org.example.stepDefinitions;
import java.util.ArrayList;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;


public class D07_followUsStepDef {
    ArrayList<String> Tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
    WebDriver driver;

    @When("guest user open facebook link")
    public void open_facebook() throws InterruptedException {
        Thread.sleep(2000);
        driver.switchTo().window(Tabs.get(1));
        Assert.assertEquals(Hooks.driver.getCurrentUrl(), "https://www.facebook.com/nopCommerce");
    }

    @Then("Facebook is opened in new tab")
    public void facebook_new_tab(String linkType) throws InterruptedException {
        Thread.sleep(2000);
        ArrayList<String> Tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        driver.switchTo().window(Tabs.get(1));
        System.out.println(Hooks.driver.getCurrentUrl());
        switch (linkType) {
            case "facebook":
                Assert.assertEquals(Hooks.driver.getCurrentUrl(), "https://www.facebook.com/nopCommerce");
                break;
        }
    }

    @When("guest user open twitter link")
    public void open_twitter(String linkType) throws InterruptedException {
        Thread.sleep(2000);
        ArrayList<String> Tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        driver.switchTo().window(Tabs.get(1));
        System.out.println(Hooks.driver.getCurrentUrl());
        switch (linkType) {

        }
    }

    @Then("Twitter is opened in new tab")
    public void twitter_new_tab(String linkType) throws InterruptedException
    {

//        case "twitter":
//        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://twitter.com/nopCommerce");
//        break;

    }

    @When("guest user open rss link")
    public void open_rss()
    {

    }

    @Then("RSS is opened in new tab")
    public void rss_new_tab(String linkType) throws InterruptedException
    {

//        case "rss":
//        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/new-online-store-is-open");
//        break;

    }

    @When("guest user open youtube link")
    public void open_youtube()
    {

    }

    @Then("Youtube is opened in new tab")
    public void youtube_new_tab(String linkType) throws InterruptedException
    {

//        case "youtube":
//        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://www.youtube.com/user/nopCommerce");
//        break;


    }

}

