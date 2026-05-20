//Add two numbers

import java.util.Scanner;

public class Q3 {
  public static void main(String args[]) {
    /* 
    int a = 10;
    int b = 20;
    int c = a + b;
    System.out.println("Sum of " + a + " and " + b + " is " + c);
    */

   System.out.println("***** Add two numbers *****");

   Scanner sc = new Scanner(System.in);

   System.out.print("Enter the value of num1: ");
   int num1 = sc.nextInt();

   System.out.print("Enter the value of num2: ");
   int num2 = sc.nextInt();

   int sum = num1 + num2;

   System.out.println("Sum of " + num1 + " and " + num2 + " is " + sum);

   sc.close();
  }
}
