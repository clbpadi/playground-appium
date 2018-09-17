package com.padi.sample;

import io.appium.java_client.android.AndroidDriver;
import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URI;
import java.net.URISyntaxException;

public class AndroidCreateWebSessionTest extends BaseTest {
    private AndroidDriver<WebElement> driver;

    @BeforeEach
    public void setUp() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "Nexus 6 API 28");
//        capabilities.setCapability("deviceName", "Nexus 5X API 28");
//        capabilities.setCapability("deviceName", "Android Emulator");
        capabilities.setCapability("browserName", "Chrome");
        driver = new AndroidDriver<WebElement>(getServiceUrl(), capabilities);
        System.out.println("driver created!");
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void testCreateWebSession() throws URISyntaxException {
        driver.get(new URI("http://www.google.com").toString());
        String title = driver.getTitle();
        Assert.assertEquals(title, "Google");
    }
}

