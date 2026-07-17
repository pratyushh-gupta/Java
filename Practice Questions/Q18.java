// Check whether a given year is a leap year or not.
import java.util.Scanner;
class Q18{
  public static void main(String[] args) {
    int year;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a year: ");
    year = sc.nextInt();
    sc.close();

    //Logic
    if(((year%4==0) && (year%100!=0))||(year%400==0))
      System.out.println(year + " is a Leap Year.");
    else
      System.out.println(year + " is not a Leap Year.");
  }
}