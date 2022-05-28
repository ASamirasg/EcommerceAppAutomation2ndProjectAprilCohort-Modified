package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P01_register {

    WebDriver driver;

    public P01_register(WebDriver driver){
        this.driver = driver;
    }

    public By firstname(){
        return By.id("FirstName");
    }

    public By lastname(){
        return By.id("LastName");
    }

    public By email(){
        return By.id("Email");
    }

    public By password(){
        return By.id("Password");
    }

    public By confirm_password(){
        return By.id("ConfirmPassword");
    }

    public By register_button(){
        return By.id("register-button");
    }

}
