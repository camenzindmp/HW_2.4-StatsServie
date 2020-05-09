
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
        for (long sale : sales) {
            if (peak < sale) {
                peak = sale;
            }
        }
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

    public long findMinSalesMonth(long[] sales) {
        long minSales = sales[0];
        for (long sale : sales) {
            if (minSales > sale) {
                minSales = sale;
            }
        }
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

    public long findSalesAboveTheAverage(long[] sales) {
        long average = findAverageSalesSum(sales);
        long aboveTheAverageCounter = 0;
        for (long sale : sales) {
            if (sale > average) {
                aboveTheAverageCounter = aboveTheAverageCounter + 1;
            }
        }
        return aboveTheAverageCounter;
    }

    public long findSalesBelowTheAverage(long[] sales) {
        long average = findAverageSalesSum(sales);
        long belowTheAverageCounter = 0;
        for (long sale : sales) {
            if (sale < average) {
                belowTheAverageCounter = belowTheAverageCounter + 1;
            }
        }
        return belowTheAverageCounter;
    }
}
