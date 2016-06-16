package selenium;

import java.util.concurrent.TimeUnit;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium {
  private static WebDriver driver;
  private static String baseUrl;
  private static StringBuffer verificationErrors = new StringBuffer();

  public static void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://ata123456789123456789.appspot.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  public static void testSelenium(String arg1, String arg2, String id) throws Exception {
    driver.get(baseUrl);
    driver.findElement(By.id("ID_nameField1")).clear();
    driver.findElement(By.id("ID_nameField1")).sendKeys(arg1);
    driver.findElement(By.id("ID_nameField2")).clear();
    driver.findElement(By.id("ID_nameField2")).sendKeys(arg2);
    driver.findElement(By.id(id)).click();
    driver.findElement(By.id("ID_calculator")).click();
  }
  
  public static String getResult() throws Exception {
	  return driver.findElement(By.id("ID_nameField3")).getAttribute("value");
  }

  public static void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }
}
