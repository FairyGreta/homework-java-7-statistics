import ru.netology.stats.StatsService;

public class Main {

    public static void main(String[] args) {
       long[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        StatsService service = new StatsService();
        System.out.println("1. Сумма всех продаж: " + service.salesAmount(sales));
        System.out.println("2. Средняя сумма продаж в месяц: " + service.averageAmount(sales));
        System.out.println("3. Пик продаж был в " + service.maxSales(sales)+ " месяце");
        System.out.println("4. Минимальные продажи были в " + service.minSales(sales)  + " месяце");
        System.out.println("5. Продажи были ниже среднего в течение " + service.numberBelowAverageSales(sales) + " месяцев");
        System.out.println("6. Продажи были выше среднего в течение " + service.numberAboveAverageSales(sales) + " месяцев");
    }
}
