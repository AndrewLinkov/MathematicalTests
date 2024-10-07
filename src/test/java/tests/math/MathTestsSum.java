package tests.math;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MathTestsSum {

    @Test
    @Owner("Андрей")
    @Description("Число 1")
    public void sum1() {
        int a = 1;
        int b = 0;
        int sum;
        sum = a + b;
        Assertions.assertEquals(1, sum);
    }

    @Test
    @Owner("Андрей")
    @Description("Число 2")
    public void sum2() {
        int a = 1;
        int b = 1;
        int sum;
        sum = a + b;
        Assertions.assertEquals(2, sum);
    }

    @Test
    @Owner("Андрей")
    @Description("Число 3")
    public void sum3() {
        int a = 2;
        int b = 1;
        int sum;
        sum = a + b;
        Assertions.assertEquals(3, sum);
    }

    @Test
    @Owner("Андрей")
    @Description("Число 4")
    public void sum4() {
        int a = 2;
        int b = 2;
        int sum;
        sum = a + b;
        Assertions.assertEquals(4, sum);
    }

    @Test
    @Owner("Андрей")
    @Description("Число 5")
    public void sum5() {
        int a = 2;
        int b = 3;
        int sum;
        sum = a + b;
        Assertions.assertEquals(5, sum);
    }

    @Test
    @Owner("Андрей")
    @Description("Число 6")
    public void sum6() {
        int a = 3;
        int b = 3;
        int sum;
        sum = a + b;
        Assertions.assertEquals(6, sum);
    }

    @Test
    @Owner("Андрей")
    @Description("Число 7")
    public void sum7() {
        int a = 3;
        int b = 4;
        int sum;
        sum = a + b;
        Assertions.assertEquals(7, sum);
    }
}
