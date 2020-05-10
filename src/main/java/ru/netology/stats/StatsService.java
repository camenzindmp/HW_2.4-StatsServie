
package ru.netology.stats;

public class StatsService {

    public long calculateSum(long[] sales) {
        long salesSum = 0;
        for (long sale : sales) {
            salesSum += sale;
        }
        return salesSum;
    }

    public long findAverageSalesSum(long[] sales) {
        long salesSum = calculateSum(sales);
        return salesSum / sales.length;
    }

    public long findSalesPeakMonth(long[] sales) {
        long peak = sales[0];
        long peakCounter = 0;
        long peakIndex = 0;
        for (long sale : sales) {
            peakCounter++;
            if (peak <= sale) {
                peak = sale;
                peakIndex = peakCounter;
            }
        }
        return peakIndex;
    }

    public long findMinSalesMonth(long[] sales) {
        long minSales = sales[0];
        long minCounter = 0;
        long minIndex = 0;
        for (long sale : sales) {
            minCounter++;
            if (minSales > sale) {
                minSales = sale;
                minIndex = minCounter;
            }
        }
        return minIndex;
    }

    public long findSalesAboveTheAverage(long[] sales) {
        long average = findAverageSalesSum(sales);
        long aboveTheAverageCounter = 0;
        for (long sale : sales) {
            if (sale > average) {
                aboveTheAverageCounter++;
            }
        }
        return aboveTheAverageCounter;
    }

    public long findSalesBelowTheAverage(long[] sales) {
        long average = findAverageSalesSum(sales);
        long belowTheAverageCounter = 0;
        for (long sale : sales) {
            if (sale < average) {
                belowTheAverageCounter++;
            }
        }
        return belowTheAverageCounter;
    }
}
