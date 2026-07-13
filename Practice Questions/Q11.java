// Write a program to swap two numbers without using a third variable.

import java.util.Scanner;
public class Q11 {
  public static void main(String[] args) {
    int a, b; // a=10 , b=20
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter value for a: ");
    a = sc.nextInt();
    System.out.println("Enter value for b: ");
    b = sc.nextInt();
    sc.close();

    //Swapping logic Method 1: 
    a = a + b; // a = 10 + 20 = 30
    b = a - b; // b = 30 - 20 = 10
    a = a - b; // a = 30 - 10 = 20

    System.out.println("=== After Swapping ===");
    System.out.println("Value of a: " + a);
    System.out.println("Value of b: " + b);

    // Swapping logic Method 2: 
    // a = a * b; // a = 10*20 = 200
    // b = a / b; // b = 200/20 = 10
    // a = a / b; // a = 200/10 = 20

    // Swapping logic Method 3:
    //a = a ^ b; 
    //b = a ^ b;
    //a = a ^ b; 
  }
  
}
