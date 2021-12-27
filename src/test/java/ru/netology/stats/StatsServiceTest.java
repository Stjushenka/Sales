package ru.netology.stats;

import jdk.jfr.StackTrace;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void shouldCalculSumm() {
        StatsService service = new StatsService();
        float[] managerSales = {8, 15, 13, 25, 17, 20, 19, 20, 7, 14, 14, 18};
        float expected = 190;
        float actual = service.calcSumm(managerSales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculAverage() {
        StatsService service = new StatsService();
        float[] managerSales = {8, 15, 13, 25, 17, 20, 19, 20, 7, 14, 14, 18};
        float expected = 15.833333f;
        float actual = service.calcAverage(managerSales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldFindMax() {
        StatsService service = new StatsService();
        long[] managerSales = {8, 15, 13, 25, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 4;
        long actual = service.maxSales(managerSales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldFindMin() {
        StatsService service = new StatsService();
        long[] managerSales = {8, 15, 13, 25, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;
        long actual = service.minSales(managerSales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldFindMonthLower() {
        StatsService service = new StatsService();
        float[] managerSales = {8, 15, 13, 25, 17, 20, 19, 20, 7, 14, 14, 18};
        float expected = 6;
        float actual = service.calcMonthLowerAverage(managerSales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldFindMonthHight() {
        StatsService service = new StatsService();
        float[] managerSales = {8, 15, 13, 25, 17, 20, 19, 20, 7, 14, 14, 18};
        float expected = 6;
        float actual = service.calcMonthHightAverage(managerSales);
        assertEquals(expected, actual);
    }

}