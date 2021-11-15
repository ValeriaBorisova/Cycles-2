package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    @Test
    void shouldCalculateSum() {
        StatsService statsService = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;
        long actual = statsService.calculateSum(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shoudAveragesSales() {
        StatsService statsService = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;
        long actual = statsService.calculateSum(sales)/sales.length;
        assertEquals(expected, actual);

    }

    @Test
    void maxSales(){
        StatsService statsService = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;
        long actual = statsService.maxSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    void minSales(){
        StatsService statsService = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;
        long actual = statsService.minSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    void monthsWithSalesLowerAverage() {
        StatsService statsService = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = statsService.minAveragesSales(sales);

        assertEquals(expected, actual);
    }

    @Test
    void monthsWithSalesHigherAverage() {
        StatsService statsService = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = statsService.maxAverageSales(sales);

        assertEquals(expected, actual);
    }

}