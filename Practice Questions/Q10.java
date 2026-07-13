// Write a program to swap two numbers using a third variable
import java.util.Scanner;
public class Q10 {
  public static void main(String[] args) {
    int a;
    int b;
    int temp;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter value for a: ");
    a = sc.nextInt();
    System.out.println("Enter value for b: ");
    b = sc.nextInt();
    sc.close();

    //Swapping logic
    temp = a;
    a = b;
    b = temp;

    System.out.println("=== After swapping ===");
    System.out.println("Value of a: " + a);
    System.out.println("Value of b: " + b);
  }
}
