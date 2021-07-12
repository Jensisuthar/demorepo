package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Protractor1 {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    driver = new ChromeDriver();
    baseUrl = "https://www.blazedemo.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testProtractor1() throws Exception {
    // Label: Test
    // ERROR: Caught exception [ERROR: Unsupported command [resizeWindow | 1366,600 | ]]
    driver.get("https://fairdogs-web.herokuapp.com/auth/login");
    // ERROR: Caught exception [Error: unknown strategy [shadow] for locator [shadow=body:nth-of-type(1) > app-root:nth-of-type(1), app-root, app-auth, app-login, button]]
    // ERROR: Caught exception [Error: unknown strategy [shadow] for locator [shadow=body:nth-of-type(1) > app-root:nth-of-type(1), app-root, app-page, app-profile, app-profile-user, app-profile-user-dog-filter-and-options, app-profile-user-dog-filter-and-options:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(2) > button:nth-of-type(1)]]
    // ERROR: Caught exception [Error: unknown strategy [shadow] for locator [shadow=mat-dialog-container, app-add-edit-dog-dialog, div:nth-of-type(1) > div:nth-of-type(1) > input[type="text"]]]
    // ERROR: Caught exception [Error: unknown strategy [shadow] for locator [shadow=mat-dialog-container, app-add-edit-dog-dialog, div:nth-of-type(1) > div:nth-of-type(1) > input[type="text"]]]
    // ERROR: Caught exception [Error: unknown strategy [shadow] for locator [shadow=mat-dialog-container, app-add-edit-dog-dialog, div:nth-of-type(4) > div:nth-of-type(1) > div:nth-of-type(2) > input:nth-of-type(1)]]
    // ERROR: Caught exception [Error: unknown strategy [shadow] for locator [shadow=mat-datepicker-content, mat-calendar, mat-multi-year-view, tr:nth-of-type(5) > td:nth-of-type(2) > div:nth-of-type(1)]]
    // ERROR: Caught exception [Error: unknown strategy [shadow] for locator [shadow=mat-datepicker-content, mat-calendar, mat-year-view, tr:nth-of-type(4) > td:nth-of-type(2) > div:nth-of-type(1)]]
    // ERROR: Caught exception [Error: unknown strategy [shadow] for locator [shadow=mat-datepicker-content, mat-calendar, mat-month-view, tr:nth-of-type(4) > td:nth-of-type(4)]]
    // ERROR: Caught exception [Error: unknown strategy [shadow] for locator [shadow=mat-dialog-container, app-add-edit-dog-dialog, div:nth-of-type(1) > ng-select:nth-of-type(1), input]]
    // ERROR: Caught exception [Error: unknown strategy [shadow] for locator [shadow=mat-dialog-container, app-add-edit-dog-dialog, div:nth-of-type(1) > ng-select:nth-of-type(1), ng-dropdown-panel, div:nth-of-type(4)]]
    // ERROR: Caught exception [Error: unknown strategy [shadow] for locator [shadow=mat-dialog-container, app-add-edit-dog-dialog, div:nth-of-type(2) > ng-select:nth-of-type(1), input]]
    // ERROR: Caught exception [Error: unknown strategy [shadow] for locator [shadow=mat-dialog-container, app-add-edit-dog-dialog, div:nth-of-type(2) > ng-select:nth-of-type(1), ng-dropdown-panel, div:nth-of-type(2) > div:nth-of-type(2)]]
    // ERROR: Caught exception [Error: unknown strategy [shadow] for locator [shadow=mat-dialog-container, app-add-edit-dog-dialog, mat-button-toggle-group, mat-button-toggle[value="lbs"], button[name="mat-button-toggle-group-0"] > span:nth-of-type(1)]]
    // ERROR: Caught exception [Error: unknown strategy [shadow] for locator [shadow=mat-dialog-container, app-add-edit-dog-dialog, div:nth-of-type(1) > div:nth-of-type(2) > input[type="text"]]]
    // ERROR: Caught exception [Error: unknown strategy [shadow] for locator [shadow=mat-dialog-container, app-add-edit-dog-dialog, div:nth-of-type(1) > div:nth-of-type(2) > input[type="text"]]]
    // ERROR: Caught exception [Error: unknown strategy [shadow] for locator [shadow=mat-dialog-container, app-add-edit-dog-dialog, div:nth-of-type(2) > div:nth-of-type(2) > input[type="text"]]]
    // ERROR: Caught exception [Error: unknown strategy [shadow] for locator [shadow=mat-dialog-container, app-add-edit-dog-dialog, div:nth-of-type(2) > div:nth-of-type(2) > input[type="text"]]]
    // ERROR: Caught exception [Error: unknown strategy [shadow] for locator [shadow=mat-dialog-container, app-add-edit-dog-dialog, div:nth-of-type(3) > mat-radio-group:nth-of-type(1), mat-radio-button:nth-of-type(3), label:nth-of-type(1) > span:nth-of-type(2)]]
    // ERROR: Caught exception [Error: unknown strategy [shadow] for locator [shadow=mat-dialog-container, app-add-edit-dog-dialog, div:nth-of-type(4) > div:nth-of-type(3)]]
    // ERROR: Caught exception [Error: unknown strategy [shadow] for locator [shadow=mat-dialog-container, app-add-edit-dog-dialog, div:nth-of-type(1) > mat-radio-group:nth-of-type(1), mat-radio-button:nth-of-type(2), span:nth-of-type(1) > span:nth-of-type(1)]]
    // ERROR: Caught exception [Error: unknown strategy [shadow] for locator [shadow=mat-dialog-container, app-add-edit-dog-dialog, div:nth-of-type(5) > div:nth-of-type(1) > div:nth-of-type(1) > mat-checkbox:nth-of-type(3), label:nth-of-type(1) > span:nth-of-type(1)]]
    // ERROR: Caught exception [Error: unknown strategy [shadow] for locator [shadow=mat-dialog-container, app-add-edit-dog-dialog, div:nth-of-type(6) > div:nth-of-type(1) > input[type="text"]]]
    // ERROR: Caught exception [Error: unknown strategy [shadow] for locator [shadow=mat-dialog-container, app-add-edit-dog-dialog, div:nth-of-type(6) > div:nth-of-type(1) > input[type="text"]]]
    // ERROR: Caught exception [Error: unknown strategy [shadow] for locator [shadow=mat-dialog-container, app-add-edit-dog-dialog, div:nth-of-type(7) > div:nth-of-type(1) > div:nth-of-type(1) > mat-checkbox:nth-of-type(4), label:nth-of-type(1) > span:nth-of-type(2)]]
    // ERROR: Caught exception [Error: unknown strategy [shadow] for locator [shadow=mat-dialog-container, app-add-edit-dog-dialog, div:nth-of-type(9) > button:nth-of-type(1)]]
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
