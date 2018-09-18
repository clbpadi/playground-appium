package com.padi.sample;


import org.testng.Assert;
import org.testng.annotations.Test;

public class ExampleTest extends BaseTest {

    @Test
    public void doit() {
        System.out.println("hello");
        Assert.assertEquals("hello", "hello");
    }
}
