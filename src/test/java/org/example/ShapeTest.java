package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Тестирование класса Shape")
class ShapeTest {
    
    private Shape shape;
    private final String testName = "Тестовая фигура";
    private final int testSides = 4;
    private final double testArea = 16.0;
    private final double testPerimeter = 16.0;

    @BeforeEach
    void setUp() {
        shape = new Shape(testName, testSides, testArea, testPerimeter);
    }

    @Test
    @DisplayName("Проверка корректности установки свойств при создании")
    void whenCreateShape_thenPropertiesSetCorrectly() {
        assertAll(
            () -> assertEquals(testName, shape.getName(), "Название фигуры не совпадает"),
            () -> assertEquals(testSides, shape.getSidesCount(), "Количество сторон не совпадает"),
            () -> assertEquals(testArea, shape.getArea(), 0.001, "Площадь не совпадает"),
            () -> assertEquals(testPerimeter, shape.getPerimeter(), 0.001, "Периметр не совпадает")
        );
    }

    @Test
    @DisplayName("Проверка сеттеров")
    void whenSetProperties_thenPropertiesUpdated() {
        String newName = "Новое название";
        int newSides = 5;
        double newArea = 25.0;
        double newPerimeter = 20.0;

        shape.setName(newName);
        shape.setSidesCount(newSides);
        shape.setArea(newArea);
        shape.setPerimeter(newPerimeter);

        assertAll(
            () -> assertEquals(newName, shape.getName(), "Название не изменилось"),
            () -> assertEquals(newSides, shape.getSidesCount(), "Количество сторон не изменилось"),
            () -> assertEquals(newArea, shape.getArea(), 0.001, "Площадь не изменилась"),
            () -> assertEquals(newPerimeter, shape.getPerimeter(), 0.001, "Периметр не изменился")
        );
    }

    @Test
    @DisplayName("Проверка метода toString()")
    void whenCallToString_thenCorrectStringReturned() {
        String expectedString = String.format("Фигура: %s, Сторон: %d, Площадь: %.2f, Периметр: %.2f",
                testName, testSides, testArea, testPerimeter);
        
        assertEquals(expectedString, shape.toString(), "Метод toString() вернул неверную строку");
    }

    @Test
    @DisplayName("Проверка создания фигуры с отрицательными значениями")
    void whenCreateWithNegativeValues_thenValuesSet() {
        Shape negativeShape = new Shape("Отрицательная фигура", -1, -10.0, -5.0);
        
        assertAll(
            () -> assertEquals(-1, negativeShape.getSidesCount(), "Отрицательное количество сторон не установилось"),
            () -> assertEquals(-10.0, negativeShape.getArea(), 0.001, "Отрицательная площадь не установилась"),
            () -> assertEquals(-5.0, negativeShape.getPerimeter(), 0.001, "Отрицательный периметр не установился")
        );
    }

    @Test
    @DisplayName("Проверка создания фигуры с нулевыми значениями")
    void whenCreateWithZeroValues_thenValuesSet() {
        Shape zeroShape = new Shape("Нулевая фигура", 0, 0.0, 0.0);
        
        assertAll(
            () -> assertEquals(0, zeroShape.getSidesCount(), "Нулевое количество сторон не установилось"),
            () -> assertEquals(0.0, zeroShape.getArea(), 0.001, "Нулевая площадь не установилась"),
            () -> assertEquals(0.0, zeroShape.getPerimeter(), 0.001, "Нулевой периметр не установился")
        );
    }
}
