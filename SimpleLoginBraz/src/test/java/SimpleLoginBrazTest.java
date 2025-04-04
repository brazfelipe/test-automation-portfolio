import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

public class SimpleLoginBrazTest {

  /*
   * Login em uma página simples:
   * Verificar se os campos de entrada estão presentes.
   * Inserir dados de login corretos e verificar o redirecionamento para a página
   * inicial.
   * Inserir dados de login incorretos e verificar se uma mensagem de erro é
   * exibida.
   */

  WebDriver driver;
  WebDriverWait wait;
  // public static void main(String[] args) {
    
  @BeforeAll
  public void arrange() {
    driver = new ChromeDriver();
    driver.get("https://practicetestautomation.com/logged-in-successfully/");
    wait = new WebDriverWait(driver, Duration.ofSeconds(10));
  }

  @Test
  public void positiveAssert() {
    String name = driver.getTitle();
    assertFalse(name.isEmpty(), "Title name should not be empty");

    WebElement username = driver.findElement(By.id("username"));
    assertEquals("username", username, "");
    assertTrue(username.isDisplayed(), "Username field is displayed");
    username.sendKeys("student");

    WebElement password = driver.findElement(By.id("password"));
    assertEquals("password", password, "");
    assertTrue(password.isDisplayed(), "Password field is displayed");
    password.sendKeys("Password123");

    WebElement loginBtn = driver.findElement(By.id("submit"));
    loginBtn.click();
    wait = new WebDriverWait(driver, Duration.ofSeconds(1));

    driver.getTitle();
    System.out.println(driver.getTitle());
    wait = new WebDriverWait(driver, Duration.ofSeconds(10));
  }

  @Test
  public void negativeAssert() {
    String name = driver.getTitle();
    assertFalse(name.isEmpty(), "","Title name should not be empty");

    WebElement loginBtn = driver.findElement(By.id("submit"));
    loginBtn.click();
    wait = new WebDriverWait(driver, Duration.ofSeconds(1));

    driver.getTitle();
    System.out.println(driver.getTitle());
    wait = new WebDriverWait(driver, Duration.ofSeconds(10));
  }

  @AfterAll
  public void close() {
    driver.quit();
  }
/*
  public static void main(String[] args) throws InterruptedException {
    WebDriver driver = new ChromeDriver();
    driver.get("https://practicetestautomation.com/logged-in-successfully/");
    driver.getTitle();
    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
    driver.quit();
  }
  */
}