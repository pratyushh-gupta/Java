// Find the ASCII value of a character (e.g., 'A', 'a')

import java.util.Scanner;
public class Q14 {
  public static void main(String[] args) {
    char ch;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your character: ");
    ch = sc.next().charAt(0);
    sc.close();

    //ASCII
    int a = ch;

    System.out.println("=== Character to ASCII Value ===");
    System.out.println("ASCII Value:  " + a);
  }
}
