package tests.mathTests;

import io.qameta.allure.Description;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static tests.interfaces.INameTags.*;

@Tag(REGRESS)
@Tag(SUBTRACTION)
public class SubtractionTests {

    @Test
    @Tag(SMOKE)
    @Description("Результат вычитания 1")
    public void subtraction1() {
        int a = 2;
        int b = 1;
        int subtraction;
        subtraction = a - b;
        Assertions.assertEquals(1, subtraction);
        System.out.println("Результат = 1");
    }

    @Test
    @Description("Результат вычитания 2")
    public void subtraction2() {
        int a = 3;
        int b = 1;
        int subtraction;
        subtraction = a - b;
        Assertions.assertEquals(2, subtraction);
        System.out.println("Результат = 2");
    }

    @Test
    @Description("Результат вычитания 3")
    public void subtraction3() {
        int a = 4;
        int b = 1;
        int subtraction;
        subtraction = a - b;
        Assertions.assertEquals(3, subtraction);
        System.out.println("Результат = 3");
    }

    @Test
    @Description("Результат вычитания 4")
    public void subtraction4() {
        int a = 5;
        int b = 1;
        int subtraction;
        subtraction = a - b;
        Assertions.assertEquals(4, subtraction);
        System.out.println("Результат = 4");
    }

    @Test
    @Description("Результат вычитания 5")
    public void subtraction5() {
        int a = 6;
        int b = 1;
        int subtraction;
        subtraction = a - b;
        Assertions.assertEquals(5, subtraction);
        System.out.println("Результат = 5");
    }
}