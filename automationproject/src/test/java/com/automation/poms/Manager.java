package com.automation.poms;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Manager {

   private WebDriver driver;

   @FindBy(id = "Create_defect")
   public WebElement createDefectInput;

   @FindBy(id = "testerSelect")
   public WebElement testerSelector;

   @FindBy(css = "[value=squid1]")
   public WebElement squid1Tester;

   @FindBy(tagName = "button")
   public WebElement assignButton;

   public Manager(WebDriver driver) {
      this.driver = driver;

      PageFactory.initElements(driver, this);
   }

   public void enterDefect(String defectName) {

      this.createDefectInput.sendKeys(defectName);

   }

   public void selectTester() {
      this.testerSelector.click();
      this.squid1Tester.click();
   }

   public void clickAssignButton() {

      this.assignButton.click();
   }

   public String getPopupText() {
      WebDriverWait wait = new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.alertIsPresent());
      Alert alert = driver.switchTo().alert();

      return alert.getText();
   }
}
