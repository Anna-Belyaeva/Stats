package ru.netology.stats;

public class StatsService {

    ///сумма всех продаж
    public int getSumSales(int[] sales) {
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        return sum;
    }


    ///средняя сумма продаж
    public int getMedSum(int[] sales) {
        int medMonth = 0;
        for (int i = 0; i <= sales.length; i++) {
            if (i < sales.length)  // считаем общую сумму
                medMonth = medMonth + sales[i];
            else {                 // делим на кол-во месяцев (получаем среднее значение)
                medMonth = medMonth / sales.length;
            }
        }
        return (int)medMonth;
    }


    ///максимальные продажи
    public int getMaxSalesMonth(int[] sales) {
        int maxMonth = 0;  // номер месяца с макс. продажами
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {  // продажи в рассматриваемом месяце больше
                maxMonth = i;
            }
        }

        return maxMonth + 1; // +1 т.к. отсчёт в массиве начинается с 0
    }


    ///минимальные продажи
    public int getMinSalesMonth(int[] sales) {
        int maxMonth = 0;  // номер месяца с мин. продажами
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[maxMonth]) {  // продажи в рассматриваемом месяце меньше
                maxMonth = i;
            }
        }

        return maxMonth + 1; // +1 т.к. отсчёт в массиве начинается с 0
    }


    ///продажи ниже среднего
    public int getUnderMedSales(int[] sales, int med) {
        int underMed = 0;                           //счётчик месяцев
        for (int i = 0; i < sales.length; i++) {   //пробегаемся по массиву
            if (sales[i] < med) {                 //если продажи ниже среднего, то увеличиваем счётчик на 1
                underMed++;
            }

        }
        return underMed;
    }


    ///продажи выше среднего
    public int getAboveMedSales(int[] sales, int med) {
        int aboveMed = 0;                           //счётчик месяцев
        for (int i = 0; i < sales.length; i++) {   //пробегаемся по массиву
            if (sales[i] > med) {                 //если продажи выше среднего, то увеличиваем счётчик на 1
                aboveMed++;
            }

        }
        return aboveMed;
    }


}














