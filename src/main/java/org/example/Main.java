package org.example;

public class Main {
    public static void main(String[] args) {
        // Создаем три геометрические фигуры
        Shape triangle = new Shape("Треугольник", 3, 6.0, 12.0);
        Shape square = new Shape("Квадрат", 4, 16.0, 16.0);
        Shape circle = new Shape("Круг", 0, 28.27, 18.85);
        
        // Выводим информацию о фигурах
        System.out.println("Геометрические фигуры:");
        System.out.println("1. " + triangle);
        System.out.println("2. " + square);
        System.out.println("3. " + circle);
        
        // Вычисляем общую площадь и периметр
        double totalArea = triangle.getArea() + square.getArea() + circle.getArea();
        double totalPerimeter = triangle.getPerimeter() + square.getPerimeter() + circle.getPerimeter();
        
        System.out.println("\nОбщая площадь всех фигур: " + String.format("%.2f", totalArea));
        System.out.println("Общий периметр всех фигур: " + String.format("%.2f", totalPerimeter));
    }
}
