package com.company;

import java.awt.geom.Area;

public class Rectangle {
    double x;
    double y;

//1й: конструктор
    Rectangle (double sx, double sy) {
        x = sx;
        y = sy;
    }

//2й: конструктор вадрата
    Rectangle (double syx) {
        x = syx;
        y = syx;
    }

//1й: метод
     String CalculateArea() {
        String Area = String.valueOf((x*y));

        return Area;
    }

//2й: метод
    void PrintArea() {
        String StringArea = CalculateArea();

        System.out.println("S = " + StringArea);
    }

//3й: метод
    void PrintRectangleKind() {
        if (x < 0 || y < 0) {
            System.out.println("Ошибка данных, введено отрицательно число");
        } else if (x == y) {
            System.out.println("Это квадрат");
        } else if (x != y) {
            System.out.println("Это прямоугольник");
        }
    }

//4й: метод
    boolean IsTheSameRectangle(Rectangle rectangle) {
        return x == rectangle.x &&
                y == rectangle.y ||
               x == rectangle.y &&
                y == rectangle.x;
    }
}
