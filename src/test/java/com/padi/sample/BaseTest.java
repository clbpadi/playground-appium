package com.padi.sample;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

import java.io.IOException;
import java.net.URL;

public abstract class BaseTest {

    private static AppiumDriverLocalService service;

    @BeforeAll
    public static void globalSetup () throws IOException {
        service = AppiumDriverLocalService.buildDefaultService();
        service.start();
        System.out.println("beforeAll!");
    }

    @AfterAll
    public static void globalTearDown () {
        System.out.println("afterAll!");
        service.stop();
    }

    public URL getServiceUrl () {
        return service.getUrl();
    }

}

