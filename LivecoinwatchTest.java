import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class LivecoinwatchTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void livecoinwatch() {
    driver.get("https://www.livecoinwatch.com/");
    driver.manage().window().setSize(new Dimension(1382, 744));
    js.executeScript("window.scrollTo(0,156)");
    driver.findElement(By.cssSelector(".table-row:nth-child(1) canvas")).click();
    driver.findElement(By.cssSelector(".table-row:nth-child(1) .item-logo-wrap")).click();
    js.executeScript("window.scrollTo(0,0)");
    js.executeScript("window.scrollTo(0,139)");
    js.executeScript("window.scrollTo(0,500)");
    js.executeScript("window.scrollTo(0,1100)");
    driver.findElement(By.cssSelector(".next span")).click();
    js.executeScript("window.scrollTo(0,1187)");
    js.executeScript("window.scrollTo(0,1906)");
    js.executeScript("window.scrollTo(0,3500)");
    js.executeScript("window.scrollTo(0,4700)");
    driver.close();
  }
}
