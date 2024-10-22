package tests.mathTests;

import io.qameta.allure.Description;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static tests.interfaces.INameTags.*;


@Tag(REGRESS)
@Tag(SUM)
public class SumTests {

    @Test
    @Tag(SMOKE)
    @Description("Результат суммы 1")
    public void sum1() {
        int a = 1;
        int b = 0;
        int sum;
        sum = a + b;
        Assertions.assertEquals(1, sum);
        System.out.println("Результат = 1");
    }

    @Test
    @Description("Результат суммы 2")
    public void sum2() {
        int a = 1;
        int b = 1;
        int sum;
        sum = a + b;
        Assertions.assertEquals(2, sum);
        System.out.println("Результат = 2");
    }

    @Test
    @Description("Результат суммы 3")
    public void sum3() {
        int a = 2;
        int b = 1;
        int sum;
        sum = a + b;
        Assertions.assertEquals(3, sum);
        System.out.println("Результат = 3");
    }

    @Test
    @Description("Результат суммы 4")
    public void sum4() {
        int a = 2;
        int b = 2;
        int sum;
        sum = a + b;
        Assertions.assertEquals(4, sum);
        System.out.println("Результат = 4");
    }

    @Test
    @Description("Результат суммы 5")
    public void sum5() {
        int a = 2;
        int b = 3;
        int sum;
        sum = a + b;
        Assertions.assertEquals(5, sum);
        System.out.println("Результат = 5");
    }
}
