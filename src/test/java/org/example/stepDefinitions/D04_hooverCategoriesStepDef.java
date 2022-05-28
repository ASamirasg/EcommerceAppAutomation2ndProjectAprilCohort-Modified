package org.example.stepDefinitions;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class D04_hooverCategoriesStepDef {
    String subCategoryName;
    WebDriver driver = Hooks.driver;

    @When("user hover category and select subcategory")
    public void user_hover_category() throws InterruptedException {

        Actions action = new Actions(Hooks.driver);

        WebElement computers = Hooks.driver.findElement(By.cssSelector("ul[class=\"top-menu notmobile\"] a[href=\"/computers\"]"));
        action.moveToElement(computers).perform();
        Thread.sleep(1000);

        WebElement desktops = Hooks.driver.findElement(By.cssSelector("ul[class=\"top-menu notmobile\"] a[href=\"/desktops\"]"));
        subCategoryName = desktops.getText().toLowerCase().trim();        // this will change "Desktops " to "desktops"
        System.out.println(subCategoryName);

        desktops.click();
    }
}
