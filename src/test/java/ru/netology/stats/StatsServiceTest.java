package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.CsvFileSource;

public class StatsServiceTest {
    @Test
    public void testSalesAmount() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSalesAmount = 180;
        int actualSalesAmount = service.salesAmount(sales);

        Assertions.assertEquals(expectedSalesAmount, actualSalesAmount);
    }

    @Test
    public void testAverageAmount() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAverageAmount = 15;
        int actualAverageAmount = service.averageAmount(sales);

        Assertions.assertEquals(expectedAverageAmount, actualAverageAmount);
    }

    @Test
    public void testMaxSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMaxSales = 8;
        int actualMaxSales = service.maxSales(sales);

        Assertions.assertEquals(expectedMaxSales, actualMaxSales);
    }

    @Test
    public void testMinSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMinSales = 9;
        int actualMinSales = service.minSales(sales);

        Assertions.assertEquals(expectedMinSales, actualMinSales);
    }

    @Test
    public void testNumberBelowAverageSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedNumberBelowAverageSales = 5;
        int actualNumberBelowAverageSales = service.numberBelowAverageSales(sales);

        Assertions.assertEquals(expectedNumberBelowAverageSales, actualNumberBelowAverageSales);
    }

    @Test
    public void testNumberAboveAverageSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedNumberAboveAverageSales = 5;
        int actualNumberAboveAverageSales = service.numberAboveAverageSales(sales);

        Assertions.assertEquals(expectedNumberAboveAverageSales, actualNumberAboveAverageSales);
    }
}
