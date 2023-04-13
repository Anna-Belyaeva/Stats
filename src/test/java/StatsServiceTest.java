import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

public class StatsServiceTest {
    @Test
    public void shouldShowSum(){
        int[] sales = {8, 5, 7, 23, 3, 9};
        StatsService service = new StatsService();
        int expectedSum = 55;
        int actualSum = service.getSumSales(sales);

        Assertions.assertEquals(expectedSum, actualSum);

    }

    @Test
    public void shouldShowMedSum(){
        int[] sales = {8, 5, 7, 23, 3, 9};
        StatsService service = new StatsService();
        int expectedMedSum = 9;
        int actualMedSum = service.getMedSum(sales);

        Assertions.assertEquals(expectedMedSum, actualMedSum);
    }

    @Test
    public void shouldShowMaxSum(){
        int[] sales = {8, 5, 7, 23, 3, 9};
        StatsService service = new StatsService();
        int expectedMaxSum = 4;
        int actualMaxSum = service.getMaxSalesMonth(sales);

        Assertions.assertEquals(expectedMaxSum, actualMaxSum);
    }

    @Test
    public void ShouldShowMinSum(){
        int[] sales = {8, 5, 7, 23, 3, 9};
        StatsService service = new StatsService();
        int expectedMinSum = 5;
        int actualMinSum = service.getMinSalesMonth(sales);

        Assertions.assertEquals(expectedMinSum, actualMinSum);
    }

    @Test
    public void ShouldShowUnderMedSales(){
        int[] sales = {8, 5, 7, 23, 3, 9};
        StatsService service = new StatsService();
        int medium = service.getMedSum(sales);
        int expectedUnderMedSum = 4;
        int actualUnderMedSum = service.getUnderMedSales(sales, medium);

        Assertions.assertEquals(expectedUnderMedSum, actualUnderMedSum);
    }

    @Test
    public void ShouldShowAboveMedSales(){
        int[] sales = {8, 5, 7, 23, 3, 9};
        StatsService service = new StatsService();
        int medium = service.getMedSum(sales);
        int expectedAboveMedSum = 1;
        int actualAboveMedSum = service.getAboveMedSales(sales, medium);

        Assertions.assertEquals(expectedAboveMedSum, actualAboveMedSum);
    }

}
