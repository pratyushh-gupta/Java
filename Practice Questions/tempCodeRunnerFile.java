// Write a program that takes three numbers as input and calculates their average.

import java.util.Scanner;
class Q15{
  public static void main(String[] args) {
    double sum=0;
    Scanner sc = new Scanner(System.in);
    for(int n=1 ; n<=3; n++){
      System.out.printf("Enter value of num%d: ", n);
      sum+=sc.nextDouble();
    }
    sc.close();
    double avg = sum/3;

    System.out.println("=== Average of %d numbers ===");
    System.out.println("Average = " + avg);

  }
}