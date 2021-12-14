package ru.netology.stats;

public class StatsService {

    public float calcSumm(float[] sales) {
        int summ = 0;
        for (float sale : sales) {
            summ += sale;
        }
        return summ;
    }

    public float calcAverage(float[] sales) {
        return calcSumm(sales) / sales.length;
    }

    public long maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for(long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }
    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int calcMonthLowerAverage(float[] sales) {
        int count = 0;
        for(float sale : sales) {
            if (sale < calcAverage(sales)) {
                count++;
            }
        }
        return count;
    }

    public int calcMonthHightAverage(float[] sales) {
        int count = 0;
        for(float sale : sales) {
            if (sale > calcAverage(sales)) {
                count++;
            }
        }
        return count;
    }

}
