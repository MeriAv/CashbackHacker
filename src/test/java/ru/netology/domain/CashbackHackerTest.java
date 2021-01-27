package ru.netology.domain;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackerTest {

    @Test
    public void snouldIfTheAmountIsTheNormal() {
       CashbackHacker cashbackHacker = new CashbackHacker();
       int actual = cashbackHacker.remain(2300);
       int expected = 700;
       assertEquals(expected, actual);
    }

    @Test
    public void snouldIfTheAmountLessThanTheNorm() {
        CashbackHacker cashbackHacker = new CashbackHacker();
        int actual = cashbackHacker.remain(200);
        int expected = 800;
        assertEquals(expected, actual);
    }

    @Test
    public void snouldIfTheAmountIsEqualToTheMinimum() {
        CashbackHacker cashbackHacker = new CashbackHacker();
        int actual = cashbackHacker.remain(1000);
        int expected = 0;
        assertEquals(expected, actual);
    }


}