package com.automation.poms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.NewSessionPayload;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tester {

   private WebDriver driver;

   @FindBy(id = "tableDefect")
   public WebElement tableDefect;

   @FindBy(css = "#tableDefect tr:last-child select")
   public WebElement selectPending;


   //@FindBy(css = "[value=Accepted]")
   //public WebElement acceptValue;

   // @FindBy(css = "#tableDefect tr:last-child button")
   // public WebElement submitButton;

   public Tester(WebDriver driver) {
      this.driver = driver;

      PageFactory.initElements(driver, this);
   }
   /*
    * public String getFirstRow(){
    * List<WebElement> tableRows = (List<WebElement>)
    * this.driver.findElement(By.xpath("//*[@id=\"tableDefect\"]/tbody/tr"));
    * WebElement newRow = tableRows.get(tableRows.size()-1);
    * 
    * List<WebElement> tds = (List<WebElement>)
    * newRow.findElement(By.tagName("td"));
    * 
    * return tds.get(2).getText();
    */

   public void selectPending() {
     this.selectPending.click();
     // this.acceptValue.click();

   }

   // public void clickSubmitButton() {

   // // to click on an element you just use the click() method
   // this.submitButton.click();

   // }
}
