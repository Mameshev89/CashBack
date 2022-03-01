package ru.netology.service;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Assert;

public class CashBackHackerServiceTest {
    CashBackHackerService run = new CashBackHackerService();

    @Test
    public void shouldCalculate() {
        int actual = run.remain(800);
        int expected = 200;
        Assert.assertEquals(expected, actual);
    }
    @Test
   public void shouldCalculate2() {
        int actual = run.remain(1000);
        int expected = 0;
        Assert.assertEquals(expected, actual);
    }

    @Test
   public void shouldCalculate3() {
        int actual = run.remain(700);
        int expected = 300;
        Assert.assertEquals(expected, actual);
    }

    @Test
   public void shouldCalculate4() {
        int actual = run.remain(100);
        int expected = 900;
        Assert.assertEquals(expected, actual);
    }

}