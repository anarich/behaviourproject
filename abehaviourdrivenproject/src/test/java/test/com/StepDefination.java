/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.com;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author Anant
 */
public class StepDefination {
    private static WebDriver driver;
    private String baseUrl="https://www.jcpenney.com";

    
    @Given("^I am in JCPenney Page$")
public void i_am_in_JCPenney_Page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
    
        System.setProperty("webdriver.chrome.driver", "c:\\data\\chromedriver.exe");
         driver = new ChromeDriver();
         driver.get(baseUrl);

}

@When("^I type cookware$")
public void i_type_cookware() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
        driver.findElement(By.xpath ("//*[@id=\"searchInputId\"]")).click();
    driver.findElement(By.xpath("//*[@id=\"searchInputId\"]")).clear();
    driver.findElement(By.xpath("//*[@id=\"searchInputId\"]")).sendKeys("cookware");

}

@When("^submit the page$")
public void submit_the_page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
    driver.findElement(By.xpath("//*[@id=\"searchInputId\"]")).submit();
}

@Then("^I see the search Result$")
public void i_see_the_search_Result() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
}

}
