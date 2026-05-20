//Swap two numbers
import java.util.Scanner;

public class Q4 {
  public static void main(String args[]){
    System.out.println("*****Swapping Two Numbers*****");

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter num1: ");
    int num1 = sc.nextInt();

    System.out.print("Enter num2: ");
    int num2 = sc.nextInt();

    //Logic to Swap
    int temp = num1;
    num1 = num2;
    num2 = temp;

    System.out.println("After Swapping: ");
    System.out.println("Num1 = " + num1 + " Num2 = " + num2 );
    
    sc.close();
  }
}
