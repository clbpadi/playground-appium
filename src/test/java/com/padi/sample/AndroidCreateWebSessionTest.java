package com.padi.sample;


import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.URI;
import java.net.URISyntaxException;

public class AndroidCreateWebSessionTest extends BaseTest {


    @Test
    public void testCreateWebSession() throws URISyntaxException {
        driver.get(new URI("http://www.google.com").toString());
        String title = driver.getTitle();
        Assert.assertEquals(title, "Google");
    }
}

