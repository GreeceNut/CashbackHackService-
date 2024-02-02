package ru.netology.service;

//import org.junit.jupiter.api.Assertions;

@org.testng.annotations.Test



public class CashbackHackServiceTest {

    public void testRemain() {
    CashbackHackService service = new CashbackHackService();

    int amount = 900;

    int actual = service.remain(amount);
    int expected = 100;

        org.testng.Assert.assertEquals(expected, actual);
    }


    public void testRemainBoundaryEqualAmount() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 1000;

        org.testng.Assert.assertEquals(expected, actual);
    }

    //@Test
    public void testRemainAmountWithMinus() {
        CashbackHackService service = new CashbackHackService();

        int amount = -500;

        int actual = service.remain(amount);
        int expected = 1000;

        org.testng.Assert.assertEquals(expected, actual);
    }
}