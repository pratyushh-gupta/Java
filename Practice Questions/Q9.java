// Create variables of different data types (int, double, char, boolean, String) and print their values.

import java.util.Scanner;

class Q9{
  public static void main(String args[]){
    int a;
    double b;
    char c;
    boolean d;
    String e;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter int value: ");
    a = sc.nextInt();
    System.out.println("Enter double value: ");
    b = sc.nextDouble();
    System.out.println("Enter char value: ");
    c = sc.next().charAt(0);
    System.out.println("Enter boolean value: ");
    d = sc.nextBoolean();
    sc.nextLine();
    System.out.println("Enter String value: ");
    e = sc.nextLine();

    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    System.out.println(d);
    System.out.println(e);
  }
}