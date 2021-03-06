package com.automation.runner;

import com.automation.poms.Login;
import com.automation.poms.Manager;
import com.automation.poms.Tester;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

@RunWith(Cucumber.class)
@CucumberOptions(features="classpath:features", glue="com/automation/steps")
public class TestRunner {

    public static WebDriver driver;
    public static Login login;
    public static Manager manager;
    public static WebDriverWait wait;
    public static Tester tester;

    @BeforeClass 
    public static void setup(){
        
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        ChromeOptions optionsChrome= new ChromeOptions();
        //optionsChrome.setUnhandledPromptBehaviour(UnexpectedAlertBehaviour.IGNORE);
        driver = new ChromeDriver(optionsChrome);

        login = new Login(driver);
        manager = new Manager(driver);
        tester = new Tester(driver);
     
        // the WebDriverWait is used to tell Selenium to wait up to a set amount of time for a given condition
        wait = new WebDriverWait(driver, 7);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @AfterClass // this makes the method execute after all the steps
    public static void teardown(){
        driver.quit();
    }
}
