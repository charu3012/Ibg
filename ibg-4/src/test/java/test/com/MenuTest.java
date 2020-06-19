/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.com;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
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
import static org.openqa.selenium.lift.find.PageTitleFinder.title;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.List;
import org.openqa.selenium.support.ui.Select;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;

/**
 *
 * @author Uma
 */
public class MenuTest {

    private WebDriver driver;
    private String baseUrl;

    public MenuTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "c:\\data\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        //  options.addArguments("--incognito");
        driver = new ChromeDriver();
        baseUrl = "https://bamboo-gardens.com/";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void Bamboologin() throws Exception {
        driver.manage().window().maximize();
        driver.get(baseUrl);
        driver.findElement(By.cssSelector("[title=\"Menu\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"menu-content\"]/a[1]")).click();
        Thread.sleep(2000);
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.urlToBe("https://bamboo-gardens.com/wp-content/uploads/2019/03/SampleMenu-Mar2019.pdf"));
        Thread.sleep(2000);
        driver.close();
        driver.switchTo().window(tabs.get(0));
        driver.switchTo().activeElement().sendKeys(Keys.TAB);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"menu-content\"]/a[2]")).click();
        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        wait.until(ExpectedConditions.urlToBe("https://bamboo-gardens.com/wp-content/uploads/2019/03/CraftCocktail_SampleMenu.pdf"));
        Thread.sleep(2000);
        driver.close();
        driver.switchTo().window(tabs.get(0));
        driver.switchTo().activeElement().sendKeys(Keys.TAB);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"menu-content\"]/a[3]")).click();
        ArrayList<String> tabs3 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs3.get(1));
        wait.until(ExpectedConditions.urlToBe("https://www.inchinsonline.com/products"));
        Thread.sleep(2000);
        driver.findElement(By.linkText("Select This Location")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id='price-list-0']/ul/li/h5")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Noodles")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"Noodles\"]/div[1]/ul/li[3]/hs-product-item/div/div/div/div[1]/img")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("update-btn")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul[2]/li[5]/a/span[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Checkout")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("email")).click();
        Thread.sleep(1000);
        driver.findElement(By.name("email")).sendKeys("ackuselenium@gmail.com");
        Thread.sleep(1000);
        driver.findElement(By.name("password")).click();
        Thread.sleep(1000);
        driver.findElement(By.name("password")).sendKeys("itexperts");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(1000);
        driver.findElement(By.name("ccNumber")).click();
        driver.findElement(By.name("ccNumber")).clear();
        Thread.sleep(1000);
        driver.findElement(By.name("ccNumber")).sendKeys("234567891234");
        Thread.sleep(1000);
        driver.findElement(By.name("ccExpiry")).click();
        driver.findElement(By.name("ccExpiry")).clear();
        driver.findElement(By.name("ccExpiry")).sendKeys("10/23");
        Thread.sleep(1000);
        driver.findElement(By.name("ccCvc")).click();
        driver.findElement(By.name("ccCvc")).clear();
        driver.findElement(By.name("ccCvc")).sendKeys("203");
        Thread.sleep(1000);
        driver.findElement(By.name("phoneUS")).click();
        driver.findElement(By.name("phoneUS")).clear();
        driver.findElement(By.name("phoneUS")).sendKeys("4029067731");
        Thread.sleep(1000);
//        driver.switchTo().window(tabs.get(0));
//        driver.findElement(By.xpath("//*[@id=\"primary_nav_mod\"]/ul/li[3]/a")).click();
//        Thread.sleep(1000);
//        driver.quit();

    }
}
