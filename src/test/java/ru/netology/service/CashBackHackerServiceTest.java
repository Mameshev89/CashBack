package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashBackHackerServiceTest {

    CashBackHackerService run = new CashBackHackerService();

    @Test
    void shouldCalculate() {
        int actual = run.remain(800);
        int expected = 200;
        Assert.assertEquals(actual, expected);
    }

    @Test
    void shouldCalculate2() {
        int actual = run.remain(1000);
        int expected = 0;
        Assert.assertEquals(actual, expected);
    }

    @Test
    void shouldCalculate3() {
        int actual = run.remain(700);
        int expected = 300;
        Assert.assertEquals(actual,expected);
    }

    @Test
    void shouldCalculate4() {
        int actual = run.remain(100);
        int expected = 900;
        Assert.assertEquals(actual, expected);
    }

}