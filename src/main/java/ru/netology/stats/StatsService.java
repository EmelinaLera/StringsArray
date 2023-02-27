package ru.netology.stats;

import java.util.Arrays;

public class StatsService {

    public int sumOfAllSales(int[] sales) {

        return Arrays.stream(sales).sum();
    }

    public int getAverageAmount(int[] sales) {
        int totalAmount = sumOfAllSales(sales);
        int averageAmount = totalAmount / 12;
        return averageAmount;
    }

    public int maxSales(int[] sales) {
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

    public int minSales(int[] sales) {
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

    public int numberOfMonthsBelowAverage(int[] sales) {
        int numberOfMonth = 0;
        int averageSale = getAverageAmount(sales);
        for (int i = 0; i < sales.length; i++) {

            if (sales[i] < averageSale) {
                numberOfMonth++;
            }


        }

        return numberOfMonth;
    }

    public int numberOfMonthsHigherAverage(int[] sales) {
        int numberOfMonth = 0;
        int averageSale = getAverageAmount(sales);
        for (int i = 0; i < sales.length; i++) {

            if (sales[i] > averageSale) {
                numberOfMonth++;
            }


        }

        return numberOfMonth;
    }

}

