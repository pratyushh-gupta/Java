// Take a user's name as input using the Scanner class and print a personalized greeting

import java.util.Scanner;
public class Q13 {
  public static void main(String[] args) {
    String name;
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter your name: ");
    name = sc.nextLine();
    sc.close();
    
    //Personalized Greeting
    System.out.println("Nice to meet you " + name + ", have a nice day!");
  }
}
