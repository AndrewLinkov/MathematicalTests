package tests.math;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MathTestsSubtraction {

    @Test
    @Owner("Андрей")
    @Description("Число 1")
    public void subtraction1() {
        int a = 1;
        int b = 0;
        int subtraction;
        subtraction = a - b;
        Assertions.assertEquals(1, subtraction);
    }

    @Test
    @Owner("Андрей")
    @Description("Число 2")
    public void subtraction2() {
        int a = 3;
        int b = 1;
        int subtraction;
        subtraction = a - b;
        Assertions.assertEquals(2, subtraction);
    }

    @Test
    @Owner("Андрей")
    @Description("Число 3")
    public void subtraction3() {
        int a = 4;
        int b = 1;
        int subtraction;
        subtraction = a - b;
        Assertions.assertEquals(3, subtraction);
    }

    @Test
    @Owner("Андрей")
    @Description("Число 4")
    public void subtraction4() {
        int a = 5;
        int b = 1;
        int subtraction;
        subtraction = a - b;
        Assertions.assertEquals(4, subtraction);
    }

    @Test
    @Owner("Андрей")
    @Description("Число 5")
    public void subtraction5() {
        int a = 6;
        int b = 1;
        int subtraction;
        subtraction = a - b;
        Assertions.assertEquals(5, subtraction);
    }

    @Test
    @Owner("Андрей")
    @Description("Число 6")
    public void subtraction6() {
        int a = 7;
        int b = 1;
        int subtraction;
        subtraction = a - b;
        Assertions.assertEquals(6, subtraction);
    }
}