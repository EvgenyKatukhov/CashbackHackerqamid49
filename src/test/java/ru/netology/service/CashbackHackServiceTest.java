package ru.netology.service;

import static org.testng.Assert.*;
import org.testng.annotations.Test;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldBelowLimit() {

        int actual = service.remain(999);
        int expected = 1;

        assertEquals(actual, expected);
    }
    @Test
    public void shouldAboveLimit() {
        int actual = service.remain(1001);
        int expected = 999;

        assertEquals(actual, expected);
    }
    @Test
    public void Limit() {
        int actual = service.remain(1000);
        int expected = 0;

        assertEquals(actual, expected);
    }
    @Test
    public void shouldIfIncorrect() {
        int actual = service.remain(0);
        int expected = 1000;

        assertEquals(actual, expected);

        assertEquals(actual, expected);

    }



}