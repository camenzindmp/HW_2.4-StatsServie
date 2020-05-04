package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
        //Тест для значения суммы всех продаж;
    void calculateSum() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;
        long actual = service.calculateSum(sales);
        assertEquals(expected, actual);
    }

    @Test
        //Тест для значения средней суммы продаж в месяц;
    void averageSalesSumPerMonth() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;
        long actual = service.averageSalesSumPerMonth(sales);
        assertEquals(expected, actual);
    }

    @Test
        //Тест для значения месяца, в котором был пик продаж
    void SalesPeakMonth() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 7;
        long actual = service.SalesPeakMonth(sales);
        assertEquals(expected, actual);
    }

    @Test
    void MinSalesMonth() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;
        long actual = service.MinSalesMonth(sales);
        assertEquals(expected, actual);
    }

    @Test
    void SalesAboveTheAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5; //выше среднего;
        long actual = service.SalesAboveTheAverage(sales);
        assertEquals(expected, actual);
    }

    @Test
    void SalesBelowTheAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5; //ниже среднего;
        long actual = service.SalesBelowTheAverage(sales);
        assertEquals(expected, actual);
    }
}