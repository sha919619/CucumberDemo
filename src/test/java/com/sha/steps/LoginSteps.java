package com.sha.steps;


import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LoginSteps {
    public WebDriver driver;
    @Given("^user already on homepage$")
    public void user_already_on_homepage() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\shari\\IdeaProjects\\CucumberDemo3\\driver\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.keyfood.com/");
        System.out.println("homepage");
    }
    @When("^user clicked on login link$")
    public void user_clicked_on_login_link() {
        WebElement loginlink =driver.findElement(By.linkText("Sign in / Register"));
        loginlink.click();
        System.out.println("clicked on login link");
    }
    @Then("^user put right username$")
    public void user_put_right_username() {
        WebElement email= driver.findElement(By.id("j_username"));
        email.sendKeys("shariarsharif1@gmail.com");
        System.out.println("put right username");
    }
    @And("^put wrong password$")
    public void put_wrong_password() {
        WebElement pass= driver.findElement(By.id("j_password"));
        pass.sendKeys("A12345");
        System.out.println("put wrong password");
    }
    @Then("^user try to login$")
    public void user_try_to_login() {
        WebElement submit= driver.findElement(By.xpath("//div[@class='login-register__action']"));
        submit.click();
        System.out.println("try to login");
    }
    @But("^user failed to login$")
    public void user_failed_to_login() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
        System.out.println("failed to login");
    }
    @Then("^user enters credentials using dataTable$")
    public void user_enters_credentials_using_dataTable(DataTable dataTable)  {
        List<List<String>> data=dataTable.cells();

        driver.findElement(By.id("j_username")).sendKeys(data.get(0).get(0));
        driver.findElement(By.id("j_password")).sendKeys(data.get(0).get(1));
        System.out.println("enters wrong username and password");
    }
    @Then("^user attempts to login$")
    public void user_attempts_to_login() {
        WebElement submit= driver.findElement(By.xpath("//div[@class='login-register__action']"));
        submit.click();
        System.out.println("attempts to login");
    }
    @But("^user cannot login$")
    public void user_cannot_login() {
        driver.quit();
        System.out.println("cannot login");
    }
    @Then("^user provides \"(.*)\"$")
    public void user_provides(String username) {
        driver.findElement(By.id("j_username")).sendKeys(username);
        System.out.println("provides wrong username");
    }
    @And("^provides \"(.*)\"$")
    public void provides(String password) {
        driver.findElement(By.id("j_password")).sendKeys(password);
        System.out.println("provides right password");
    }
    @Then("^user want to login$")
    public void user_want_to_login() {
        WebElement submit= driver.findElement(By.xpath("//div[@class='login-register__action']"));
        submit.click();
        System.out.println("want to login");
    }
    @But("^user is fail to login$")
    public void user_is_fail_to_login() {
        driver.quit();
        System.out.println("fail to login");
    }

    @Then("^user gives right username$")
    public void user_gives_right_username() {
        WebElement email= driver.findElement(By.id("j_username"));
        email.sendKeys("shariarsharif1@gmail.com");
        System.out.println("gives right username");
    }
    @And("^gives right password$")
    public void gives_right_password() {
        WebElement pass= driver.findElement(By.id("j_password"));
        pass.sendKeys("Admin12345");
        System.out.println("gives right password");
    }
    @Then("^user press on login button$")
    public void user_press_on_login_button() {
        WebElement submit= driver.findElement(By.xpath("//div[@class='login-register__action']"));
        submit.click();
        System.out.println("press login button");
    }
    @And("^user logged in successfully$")
    public void user_logged_in_successfully() {
        System.out.println("logged in successfully");
    }

}
