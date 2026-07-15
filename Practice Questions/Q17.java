// Write a program to check if a given number is even or odd.

import java.util.Scanner;
public class Q17 {
  public static void main(String[] args) {
    int num;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your number: ");
    num = sc.nextInt();
    sc.close();
    
    //condition
    if(num%2==0)
      System.out.printf("%d is even", num);
    else
     System.out.printf("%d is odd", num);
  }
}
