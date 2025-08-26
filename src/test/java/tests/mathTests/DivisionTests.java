package tests.mathTests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static tests.interfaces.INameTags.*;

@Tag(REGRESS)
@Tag(DIVISION)
public class DivisionTests {

    @Test
    @Tag(SMOKE)
    @DisplayName("Результат деления 1")
    public void division1() {
        int a = 1;
        int b = 1;
        int subtraction = a / b;
        Assertions.assertEquals(1, subtraction, "Ошибка");
    }

    @Test
    @DisplayName("Результат деления 2")
    public void division2() {
        int a = 4;
        int b = 2;
        int subtraction = a / b;
        Assertions.assertEquals(2, subtraction, "Ошибка");
    }

    @Test
    @DisplayName("Результат деления 3")
    public void division3() {
        int a = 9;
        int b = 3;
        int subtraction = a / b;
        Assertions.assertEquals(3, subtraction, "Ошибка");
    }

    @Test
    @DisplayName("Результат деления 4")
    public void division4() {
        int a = 12;
        int b = 3;
        int subtraction = a / b;
        Assertions.assertEquals(4, subtraction, "Ошибка");
    }

    @Test
    @DisplayName("Результат деления 5")
    public void division5() {
        int a = 15;
        int b = 3;
        int subtraction = a / b;
        Assertions.assertEquals(5, subtraction, "Ошибка");
    }
}
