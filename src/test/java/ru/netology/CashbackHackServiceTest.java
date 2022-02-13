package ru.netology;


import org.testng.Assert;
import org.testng.annotations.Test;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldAmountLess1000() {
        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void shouldAmountMore1000() {
        int amount = 1001;
        int actual = service.remain(amount);
        int expected = 999;
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void shouldAmount1000() {
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        Assert.assertEquals(actual,expected);
    }
}