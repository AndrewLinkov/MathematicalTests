package org.example;

public class Shape {
    private String name;        // название фигуры
    private int sidesCount;     // количество сторон
    private double area;        // площадь
    private double perimeter;   // периметр

    // Конструктор по умолчанию
    public Shape() {
    }

    // Параметризованный конструктор
    public Shape(String name, int sidesCount, double area, double perimeter) {
        this.name = name;
        this.sidesCount = sidesCount;
        this.area = area;
        this.perimeter = perimeter;
    }

    // Геттеры и сеттеры
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSidesCount() {
        return sidesCount;
    }

    public void setSidesCount(int sidesCount) {
        this.sidesCount = sidesCount;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    @Override
    public String toString() {
        return String.format("Фигура: %s, Сторон: %d, Площадь: %.2f, Периметр: %.2f",
                name, sidesCount, area, perimeter);
    }
}
