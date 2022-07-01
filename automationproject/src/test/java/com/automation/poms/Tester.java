package com.automation.poms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.NewSessionPayload;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Tester {

   private WebDriver driver;

   @FindBy(id = "tableDefect")
   public WebElement tableDefect;

   @FindBy(css = "#tableDefect tr:last-child select")
   public WebElement selectPending;

   @FindBy(css = "#tableDefect tr:last-child select [value=Declined]")
   public WebElement declineValue;
   

   @FindBy(css = "#tableDefect tr:last-child select [value=Accepted]")
   public WebElement acceptValue;

   @FindBy(css = "#tableDefect tr:last-child button")
   public WebElement submitButton;


   @FindBy(id="acceptedDefects")
   public WebElement acceptedDefectsTable;


   @FindBy(css = "#acceptedDefects tr:last-child select")
   public WebElement selectorValue;
   
   @FindBy(css ="#acceptedDefects tr:last-child button")
   public WebElement acceptSubmitButton;

   @FindBy(css = "#acceptedDefects tr:last-child select [value=Rejected]")
   public WebElement rejectValue;

   @FindBy(css = "#acceptedDefects tr:last-child select [value=Fixed]")
   public WebElement fixValue;

   @FindBy(css = "#acceptedDefects tr:last-child select [value=Shelved]" )
   public WebElement shelveValue;

   public Tester(WebDriver driver) {
      this.driver = driver;

      PageFactory.initElements(driver, this);
   }

   public void selectPendingAccept() {
      this.selectPending.click();
      this.acceptValue.click();

   }

   public void selectPendingDecline() {
      this.selectPending.click();
      this.declineValue.click();
   }

    public void selectReject(){
      this.selectorValue.click();
      this.rejectValue.click();
    }

    public void selectFix(){
      this.selectorValue.click();
      this.fixValue.click();
    }

    public void selectShelve(){
      this.selectorValue.click();
      this.shelveValue.click();
    }
   public void clickSubmitButton () {
      
      this.submitButton.click();

   }
   public void acceptedSubmitButton2(){
      this.acceptSubmitButton.click();
   }
}
