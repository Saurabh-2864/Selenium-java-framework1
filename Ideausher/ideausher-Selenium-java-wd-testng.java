package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ideausher {
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
  public void testIdeausher() throws Exception {
    // Label: Test
    // ERROR: Caught exception [ERROR: Unsupported command [resizeWindow | 1191,566 | ]]
    driver.get("https://ideausher.com/");
    // Label: login
    // ERROR: Caught exception [ERROR: Unsupported command [openWindow |  | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_1 | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_local | ]]
    driver.findElement(By.linkText("Portfolio")).click();
    // Label: portfolio
    driver.findElement(By.linkText("Services")).click();
    // Label: services
    // ERROR: Caught exception [ERROR: Unsupported command [openWindow | https://mail.google.com/mail/u/0/#inbox | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_2 | ]]
    driver.findElement(By.cssSelector("div.aio.UKr6le")).click();
    driver.findElement(By.xpath("//span[@id=':8q']/span")).click();
    driver.findElement(By.cssSelector("span.m_-1077085152074910796primary-button-text")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_3 | ]]
    driver.get("https://meet.google.com/dxm-qwfx-zxr?hs=224");
    // ERROR: Caught exception [Error: unknown strategy [shadow] for locator [shadow=c-wiz, div:nth-of-type(4) > div:nth-of-type(2) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(1)]]
    // ERROR: Caught exception [Error: unknown strategy [shadow] for locator [shadow=c-wiz, div:nth-of-type(1) > div:nth-of-type(1) > button:nth-of-type(1) > span:nth-of-type(1)]]
    // ERROR: Caught exception [Error: unknown strategy [shadow] for locator [shadow=c-wiz, div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(1)]]
    // ERROR: Caught exception [Error: unknown strategy [shadow] for locator [shadow=c-wiz, div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(2) > span:nth-of-type(1) > button:nth-of-type(1)]]
    // ERROR: Caught exception [ERROR: Unsupported command [openWindow | https://drive.google.com/drive/priority | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_4 | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [openWindow | https://www.guru99.com/postman-tutorial.html#working-with-get-requests | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_5 | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_local | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_3 | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_4 | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_local | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_1 | ]]
    driver.get("https://fast.com/");
    // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_1 | ]]
    driver.close();
    // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_5 | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_local | ]]
    driver.findElement(By.cssSelector("div.elementor-background-overlay")).click();
    driver.findElement(By.cssSelector("img.main_logo_img.entered.lazyloaded")).click();
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
