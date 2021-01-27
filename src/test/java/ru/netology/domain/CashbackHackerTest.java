package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackerTest {

    @org.junit.Test
    void snouldIfTheAmountIsTheNormal() {
       CashbackHacker cashbackHacker = new CashbackHacker();
       int actual = cashbackHacker.remain(2300);
       int expected = 700;
       assertEquals(expected, actual);
    }

    @org.junit.Test
    void snouldIfTheAmountLessThanTheNorm() {
        CashbackHacker cashbackHacker = new CashbackHacker();
        int actual = cashbackHacker.remain(200);
        int expected = 800;
        assertEquals(expected, actual);
    }

    @org.junit.Test
    void snouldIfTheAmountIsEqualToTheMinimum() {
        CashbackHacker cashbackHacker = new CashbackHacker();
        int actual = cashbackHacker.remain(1000);
        int expected = 0;
        assertEquals(expected, actual);
    }


}