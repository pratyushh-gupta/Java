// Calculate the simple interest given the principal, rate of interest, and time.

import java.util.Scanner;
public class Q16 {
  public static void main(String[] args) {
    double principal, interest;
    int year;

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your Principal: ");
    principal = sc.nextDouble();

    System.out.print("Enter your Interest(%): ");
    interest = sc.nextDouble();

    System.out.print("Enter how many Years: ");
    year = sc.nextInt();
    
    sc.close();

    //SI
    double SI = (principal*interest*year)/100;

    System.out.println("=== Simple Interest ===");
    System.out.printf("SI= %.2f", SI);
  }
}
