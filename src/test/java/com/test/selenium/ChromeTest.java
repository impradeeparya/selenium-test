package com.test.selenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

/**
 * Created by pradeep on 7/7/17.
 */

public class ChromeTest {

    private String url;
    private WebDriver driver;

    @Before
    public void prepare() {
        System.setProperty(
                "webdriver.chrome.driver",
                "webdriver/chromedriver");

        url = "https://www.google.com";

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
    }

    @Test
    public void testSearch() throws IOException, InterruptedException {

        driver.findElement(By.xpath("//*[@id='lst-ib']")).sendKeys("Test");
        driver.findElement(By.xpath("//*[@id='_fZl']")).click();
        Thread.sleep(5000);

    }

    @After
    public void teardown() throws IOException {
        driver.quit();
    }
}
