package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P02_login {

    WebDriver driver;
    public P02_login(WebDriver driver)
    {
        this.driver = driver;
    }
    public By email()
    {
        return By.id("Email");
    }

    public By password()
    {
        return By.id("Password");
    }

    public By login_button(){
        return By.className("login-button");
    }
}
