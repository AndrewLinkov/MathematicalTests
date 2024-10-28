package tests.mathTests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static tests.interfaces.INameTags.*;

@Tag(REGRESS)
@Tag(MULTIPLICATION)
public class MultiplicationTests {

    @Test
    @Tag(SMOKE)
    @DisplayName("Результат умножения 1")
    public void multiplication1() {
        int a = 1;
        int b = 1;
        int multiplication;
        multiplication = a * b;
        Assertions.assertEquals(1, multiplication);
        System.out.println("Результат = 1");
    }

    @Test
    @DisplayName("Результат умножения 2")
    public void multiplication2() {
        int a = 1;
        int b = 2;
        int multiplication;
        multiplication = a * b;
        Assertions.assertEquals(2, multiplication);
        System.out.println("Результат = 2");
    }

    @Test
    @DisplayName("Результат умножения 3")
    public void multiplication3() {
        int a = 1;
        int b = 3;
        int multiplication;
        multiplication = a * b;
        Assertions.assertEquals(3, multiplication);
        System.out.println("Результат = 3");
    }

    @Test
    @DisplayName("Результат умножения 4")
    public void multiplication4() {
        int a = 1;
        int b = 4;
        int multiplication;
        multiplication = a * b;
        Assertions.assertEquals(4, multiplication);
        System.out.println("Результат = 4");
    }

    @Test
    @DisplayName("Результат умножения 5")
    public void multiplication5() {
        int a = 1;
        int b = 5;
        int multiplication;
        multiplication = a * b;
        Assertions.assertEquals(5, multiplication);
        System.out.println("Результат = 5");
    }
}
