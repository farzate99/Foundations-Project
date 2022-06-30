package com.automation.poms;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Manager {

   private WebDriver driver; // this driver will only be used internally (in the class) so it is private

   // these web elements need to be referenced in our steps so they are public
   // this tells the PageFactory to find the element with the id username and
   // assign it to this field
   @FindBy(id = "Create_defect")
   public WebElement createDefectInput;

   // this tells the PageFactory to find the element with the id password and
   // assign it to this field
   @FindBy(id = "testerSelect")
   public WebElement testerSelector;

   // this tells the PageFactory to find the element with the id password and
   // assign it to this field
   @FindBy(css = "[value=squid1]")
   public WebElement squid1Tester;

   // this tells the PageFactory to find the first element created via button tags
   // and assign it to this field
   @FindBy(tagName = "button")
   public WebElement assignButton;

   public Manager(WebDriver driver) {
      this.driver = driver; // this initializes the private driver field

      /*
       * The PageFactory class is provided by Selenium and it abstracts away from us
       * the code that handles
       * initializing our WebElement fields. We simpply provide the initElements()
       * method with the privite driver
       * we initialize above, and the PageFactory class handles the rest!
       */
      PageFactory.initElements(driver, this);
   }

   /*
    * these methods are public so we can access them in the steps, and their return
    * type is void because
    * the functions do not return any values: they just interact with the web page
    */

   public void enterDefect(String defectName) {

      this.createDefectInput.sendKeys(defectName);

   }

   public void selectTester() {
      this.testerSelector.click();
      this.squid1Tester.click();
   }

   // this method will make selenium click on our login button
   public void clickAssignButton() {

      // to click on an element you just use the click() method
      this.assignButton.click();
   }

   public String getPopupText() {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.alertIsPresent());
      Alert alert = driver.switchTo().alert();

      return alert.getText();
   }
}
