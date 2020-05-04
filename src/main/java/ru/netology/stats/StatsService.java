package ru.netology.stats;

public class StatsService {


    public long calculateSum(long[] sales) {
        long sumOfSales = 0;
        for (long sale : sales) {
            sumOfSales += sale;
        }
        return sumOfSales;
    }

    public long averageSalesSumPerMonth(long[] sales) {
        long SumToFindAverage = 0;
        for (long sale : sales) {
            SumToFindAverage += sale;
        }
        return SumToFindAverage / 12;
    }

    public long SalesPeakMonth(long[] sales) {
        long peak = 20;
        long peakCounter = 0;
        for (long sale : sales) {
            if (sale < peak) {
                peakCounter = peakCounter + 1;
            } else {
                return peakCounter;
            }
        }
        return peakCounter;
    }

    public long MinSalesMonth(long[] sales) {
        long minSales = 7;
        long minSalesCounter = 0;
        for (long sale : sales) {
            if (sale > minSales) {
                minSalesCounter = minSalesCounter + 1;
            } else {
                return minSalesCounter;
            }
        }
        return minSalesCounter;
    }

    public long SalesAboveTheAverage(long[] sales) {
        long average = 15;
        long AboveTheAverageCounter = 0;
        for (long sale : sales) {
            if (sale > average) {
                AboveTheAverageCounter = AboveTheAverageCounter + 1;
            }
        }
        return AboveTheAverageCounter;
    }

    public long SalesBelowTheAverage(long[] sales) {
        long average = 15;
        long BelowTheAverageCounter = 0;
        for (long sale : sales) {
            if (sale < average) {
                BelowTheAverageCounter = BelowTheAverageCounter + 1;
            }
        }
        return BelowTheAverageCounter;
    }
}

