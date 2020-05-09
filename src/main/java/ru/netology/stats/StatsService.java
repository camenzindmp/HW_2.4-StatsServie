
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
        long sumToFindAverage = 0;
        for (long sale : sales) {
            sumToFindAverage += sale;
        }
        return sumToFindAverage / 12;
    }

    public long salesPeakMonth(long[] sales) {
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

    public long minSalesMonth(long[] sales) {
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

    public long salesAboveTheAverage(long[] sales) {
        long average = 15;
        long aboveTheAverageCounter = 0;
        for (long sale : sales) {
            if (sale > average) {
                aboveTheAverageCounter = aboveTheAverageCounter + 1;
            }
        }
        return aboveTheAverageCounter;
    }

    public long salesBelowTheAverage(long[] sales) {
        long average = 15;
        long belowTheAverageCounter = 0;
        for (long sale : sales) {
            if (sale < average) {
                belowTheAverageCounter = belowTheAverageCounter + 1;
            }
        }
        return belowTheAverageCounter;
    }
}
