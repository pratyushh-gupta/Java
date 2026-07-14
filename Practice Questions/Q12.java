// Write a program to calculate the area and perimeter of a rectangle given its length and width.

import java.util.Scanner;
public class Q12 {
  public static void main(String[] args) {
    double width;
    double height;

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the width:  ");
    width = sc.nextDouble();
    System.out.println("Enter the height:   ");
    height = sc.nextDouble();
    sc.close();

    //Area
    double area;
    area = width*height;
    //Perimeter
    double perimeter;
    perimeter = 2*(width+height);

    System.out.println("=== Area & Perimeter of a Rectangle ===");
    System.out.printf("Area: %.2f\n",  area);
    System.out.printf("Perimeter: %.2f\n", perimeter);
  }
}
