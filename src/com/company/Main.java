package com.company;

public class Main {

    public static void main(String[] args) {
	Rectangle rectangle_1 = new Rectangle(3);

	Rectangle rectangle_2 = new Rectangle(3, 4);

	Rectangle rectangle_3 = new Rectangle(4, 3);

	System.out.println(rectangle_1.x + " " + rectangle_1.y);
	System.out.println(rectangle_1.CalculateArea());
	rectangle_1.PrintArea();
	rectangle_1.PrintRectangleKind();
	System.out.println(rectangle_1.IsTheSameRectangle(rectangle_2));

		System.out.println();
	System.out.println(rectangle_2.x + " " + rectangle_2.y);
	System.out.println(rectangle_2.CalculateArea());
	rectangle_2.PrintArea();
	rectangle_2.PrintRectangleKind();
	System.out.println(rectangle_2.IsTheSameRectangle(rectangle_3));

		System.out.println();
	System.out.println(rectangle_3.x + " " + rectangle_3.y);
	System.out.println(rectangle_3.CalculateArea());
	rectangle_3.PrintArea();
	rectangle_3.PrintRectangleKind();
	System.out.println(rectangle_3.IsTheSameRectangle(rectangle_3));

	Rectangle.printRectanglesCount();

	Rectangle.printClassName(false);
    }
}
