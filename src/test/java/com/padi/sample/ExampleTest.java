package com.padi.sample;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;

public class ExampleTest extends BaseTest {

    @Test
    public void doit() {
        System.out.println("hello");
        Assert.assertThat("foo", is("bar"));
    }
}
