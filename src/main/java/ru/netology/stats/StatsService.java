package ru.netology.stats;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StatsService {

    // 1. Рассчитаем сумму всех продаж
    public int salesAmount(long[] sales) {
        int sum = 0;

        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];
        }
        return sum;
    }

    // 2. Рассчитаем среднюю сумму продаж в месяц
    public int averageAmount(long[] sales) {

        int averageSum = salesAmount(sales) / sales.length;
        return averageSum;
    }

    // 3. Рассчитаем номер последнего месяца, в котором был пик продаж (осуществлены продажи на максимальную сумму)
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

    // 4. Рассчитаем  номер последнего месяца, в котором был минимум продаж (осуществлены продажи на минимальную сумму)
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

    // 5. Рассчитаем количество месяцев, в которых продажи были ниже среднего
    public int numberBelowAverageSales(long[] sales) {
        int belowAvgCount = 0;
        int averageSum = averageAmount(sales);

        for (long num : sales) {
            if (num < averageSum) {
                belowAvgCount++;
            }
        }
        return belowAvgCount;
    }

    // 6. Рассчитаем количество месяцев, в которых продажи были выше среднего
    public int numberAboveAverageSales(long[] sales) {
        int aboveAvgCount = 0;
        int averageSum = averageAmount(sales);

        for (long num : sales) {
            if (num > averageSum) {
                aboveAvgCount++;
            }
        }
        return aboveAvgCount;
    }
}
