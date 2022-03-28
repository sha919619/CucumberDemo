/*package com.sha.dummy;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DummyTest {
    @Test
    public void dummyMeth(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\shari\\IdeaProjects\\CucumberDemo3\\driver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.keyfood.com/");
        WebElement loginlink =driver.findElement(By.linkText("Sign in / Register"));
        loginlink.click();
        WebElement email= driver.findElement(By.id("j_username"));
        email.sendKeys("shariarsharif1@gmail.com");
        WebElement pass= driver.findElement(By.id("j_password"));
        pass.sendKeys("Admin12345");
        WebElement submit= driver.findElement(By.xpath("//div[@class='login-register__action']"));
        submit.click();
        driver.quit();

    }
}*/
