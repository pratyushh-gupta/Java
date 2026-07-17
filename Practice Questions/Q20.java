// Create a basic calculator using a switch-case statement that performs addition, subtraction, multiplication,
// and division based on user input.

import java.util.Scanner;
public class Q20 {
  public static void main(String[] args) { 
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your num1:  ");
    double num1 = sc.nextDouble();
    System.out.println("Enter your num2:  ");
    double num2 = sc.nextDouble();

    System.out.println("=== Basic Calculator ===");
    System.out.println("[ + ] Addition");
    System.out.println("[ - ] Substraction");
    System.out.println("[ * ] Multiplication");
    System.out.println("[ / ] Division");
    System.out.println("========================");

    System.out.println("Enter your choice: (+, -, *, /):  ");
    char op = sc.next().charAt(0);
    sc.close();
    switch(op){
      case '+':
        System.out.println("Addition: " + (num1+num2));
        break;
      case '-':
        System.out.println("Subtraction: " + (num1-num2));
        break;
      case '*':
        System.out.println("Multiplication: " + (num1*num2));
        break;
      case '/':
        System.out.println("Division: " + (num1/num2));
        break;
      default:
        System.out.println("Error: Invalid operator!");
        break;
    }
  }
}
