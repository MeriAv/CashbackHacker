package ru.netology.domain;

import org.junit.jupiter.api.Test;
import static org.testng.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CashbackHackerTest {

    @org.testng.annotations.Test
    void snouldIfTheAmountIsTheNormal() {
       CashbackHacker cashbackHacker = new CashbackHacker();
       int actual = cashbackHacker.remain(2300);
       int expected = 700;
       assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    void snouldIfTheAmountLessThanTheNorm() {
        CashbackHacker cashbackHacker = new CashbackHacker();
        int actual = cashbackHacker.remain(200);
        int expected = 800;
        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    void snouldIfTheAmountIsEqualToTheMinimum() {
        CashbackHacker cashbackHacker = new CashbackHacker();
        int actual = cashbackHacker.remain(1000);
        int expected = 0;
        assertEquals(actual, expected);
    }


}