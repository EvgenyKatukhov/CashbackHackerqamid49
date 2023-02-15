package ru.netology.service;

import static org.junit.Assert.*;
import org.junit.Test;


public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldBelowLimit() {

        int actual = service.remain(999);
        int expected = 1;

        assertEquals(expected, actual);
    }
    @Test
    public void shouldAboveLimit() {
        int actual = service.remain(1001);
        int expected = 999;

        assertEquals(expected, actual);
    }
    @Test
    public void Limit() {
        int actual = service.remain(1000);
        int expected = 0;

        assertEquals(expected, actual);
    }
    @Test
    public void shouldIfIncorrect() {
        int actual = service.remain(0);
        int expected = 1000;

        assertEquals(expected, actual);



    }



}