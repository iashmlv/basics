package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldAdviceToBuyTillBoundary() {
        int actual = service.remain(650);
        int expected = 350;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldAdviceToBuyMultiple1000() {
        int actual = service.remain(2888);
        int expected = 112;

        assertEquals(expected, actual);
    }

    @Test
    public void checkingZeroBoundary() {
        int actual = service.remain(0);
        int expected = 1000;

        assertEquals(expected, actual);
    }

    @Test
    public void checkingBoundary() {
        int actual = service.remain(1000);
        int expected = 0;

        assertEquals(expected, actual);
    }

}
