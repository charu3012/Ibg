/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.com;

import java.util.concurrent.TimeUnit;
import static javafx.scene.paint.Color.web;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

/**
 *
 * @author ashut
 */
public class HomeTest {

    private WebDriver driver;
    private String baseUrl;

    public HomeTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "c:\\data\\chromedriver.exe");
        driver = new ChromeDriver();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        driver = new ChromeDriver(options);
        baseUrl = "https://bamboo-gardens.com/";
        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
    }

    @After
    public void tearDown() {
        // driver.quit();
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testBamboogarden() throws Exception {
        driver.manage().window().maximize();
        driver.get(baseUrl);
        //ic void testBambood() throws Exception {
        driver.get("https://bamboo-gardens.com/");
        driver.findElement(By.id("newsletter")).click();
        driver.findElement(By.id("newsletter")).clear();
        driver.findElement(By.id("newsletter")).sendKeys("ackuselenium@gmail.com");
        driver.findElement(By.id("Location")).click();
        new Select(driver.findElement(By.id("Location"))).selectByVisibleText("Chicago, IL - Schaumburg");
        driver.findElement(By.id("Location")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Order Online")).click();
        driver.findElement(By.linkText("Select This Location")).click();
        driver.findElement(By.xpath("//div[@id='price-list-0']/ul/li/h5")).click();
        driver.findElement(By.linkText("Login")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("email")).click();
        driver.findElement(By.name("email")).clear();
        driver.findElement(By.name("email")).sendKeys("ackuselenium@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.name("password")).click();
        driver.findElement(By.name("password")).clear();
        driver.findElement(By.name("password")).sendKeys("itexperts");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        // driver.findElement(By.cssSelector("[title=\"Menu\"]")).click();
        Thread.sleep(2000);
//        driver.get(baseUrl);
//        driver.findElement(By.cssSelector("[title=\"Menu\"]")).click();
//        Thread.sleep(2000);
    }

}
