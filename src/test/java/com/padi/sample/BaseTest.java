package com.padi.sample;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public abstract class BaseTest {

//    private static AppiumDriverLocalService service;

    AppiumDriver<WebElement> driver;
//    AndroidDriver<WebElement> driver;

    @BeforeSuite
    public void setUp() throws MalformedURLException {
        final String URL_STRING = "http://127.0.0.1:4723/wd/hub";

        URL url = new URL(URL_STRING);

        DesiredCapabilities capabilities = new DesiredCapabilities();

        // DO NOT specify any capabilities if uploading to AWS device farm
        capabilities.setCapability("platformName", "android");
        capabilities.setCapability("deviceName", "Nexus 6 API 28");
//        capabilities.setCapability("deviceName", "Nexus 5X API 28");
//        capabilities.setCapability("deviceName", "Android Emulator");
        capabilities.setCapability("browserName", "Chrome");
//        driver = new AndroidDriver<WebElement>(url, capabilities);
        driver = new AppiumDriver<WebElement>(url, capabilities);

        driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);

        System.out.println("driver created!");
    }

    @AfterSuite
    public void tearDown() {
        driver.quit();
    }

    @BeforeClass
    public static void globalSetup () throws IOException {
//        service = AppiumDriverLocalService.buildDefaultService();
//        service.start();
        System.out.println("beforeAll!");
    }

    @AfterClass
    public static void globalTearDown () {
        System.out.println("afterAll!");
//        service.stop();
    }

//    public URL getServiceUrl () {
//        return service.getUrl();
//    }

}

