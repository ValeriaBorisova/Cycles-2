package ru.netology;

public class StatsService {
    public long calculateSum(long[] sales) {
        long sum = 0;
        for (long sale : sales) {

            sum += sale;
        }
        return sum;
    }


    public long averageSales(int[] sales){
        long sum = 0;
        for (long sale : sales) {

            sum += sale;
        }
        return sum / sales.length;

    }


    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }


    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }


    public int minAveragesSales(int[] sales) {
        int monthsAmount = 0;
        int sum =0;
        for (int monthSale : sales) {
            sum += monthSale;
        }
        for (int monthSale : sales) {
            if (monthSale < averageSales (sales)) {
                monthsAmount += 1;
            }
        }
        return monthsAmount;
    }

    public int maxAverageSales(int[] sales) {
        int monthsAmount = 0;
        int sum = 0;
        for (int monthSale : sales) {
            sum += monthSale;
        }

        for (int monthSale : sales) {
            if (monthSale > averageSales(sales)) {
                monthsAmount += 1;
            }
        }
        return monthsAmount;

    }

}
