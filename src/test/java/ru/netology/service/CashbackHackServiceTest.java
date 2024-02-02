package ru.netology.service;

public class CashbackHackServiceTest {
    @org.junit.Test
        public void testRemain() {
            CashbackHackService service = new CashbackHackService();

            int amount = 900;

            int actual = service.remain(amount);
            int expected = 100;

            org.junit.Assert.assertEquals(expected, actual);
        }

    @org.junit.Test
        public void testRemainBoundaryEqualAmount() {
            CashbackHackService service = new CashbackHackService();

            int amount = 1000;

            int actual = service.remain(amount);
            int expected = 1000;

            org.junit.Assert.assertEquals(expected, actual);
        }

    @org.junit.Test
        public void testRemainAmountWithMinus() {
            CashbackHackService service = new CashbackHackService();

            int amount = -500;

            int actual = service.remain(amount);
            int expected = 1000;

            org.junit.Assert.assertEquals(expected, actual);
        }

}