package com.company;

import java.awt.geom.Area;

public class Rectangle {
    static private int createdRectangles = 0;
    double x;
    double y;



    Rectangle (double sx, double sy) {
        x = sx;
        y = sy;
        createdRectangles++;
    }


    Rectangle (double syx) {
        x = syx;
        y = syx;
        createdRectangles++;
    }


   /*  String CalculateArea() {
        String Area = String.valueOf((x*y));

        return Area;
    } */
    Double CalculateArea() {
        return x * y;
    }

    void PrintArea() {
        String StringArea = Double.toString(CalculateArea());

        System.out.println("S = " + StringArea);
    }


    void PrintRectangleKind() {
        if (x < 0 || y < 0) {
            System.out.println("Ошибка данных, введено отрицательно число");
        } else if (x == y) {
            System.out.println("Это квадрат");
        } else if (x != y) {
            System.out.println("Это прямоугольник");
        }
    }


    boolean IsTheSameRectangle(Rectangle rectangle) {
        return x == rectangle.x &&
                y == rectangle.y ||
               x == rectangle.y &&
                y == rectangle.x;
    }


    static void printRectanglesCount() {
        System.out.println("Всего было создано " + createdRectangles + " прямоугольников");
    }


    private final static  String RUSSIAN_CLASS_NAME = "Прямоугольник";
    private final static String ENGLISH_CLASS_NAME = "Rectangle";

    static void printClassName(boolean printInRussian) {
        if (printInRussian) {
            System.out.println(RUSSIAN_CLASS_NAME);
        } else {
            System.out.println(ENGLISH_CLASS_NAME);
        }
    }

}
