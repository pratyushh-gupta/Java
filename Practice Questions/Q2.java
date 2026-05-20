// Print your name, college, and branch

 import java.util.Scanner;
//Type 1:
/*
class Q2{
  public static void main (String args[]){
    System.out.println("Name: Pratyush Gupta");
    System.out.println("College: Dr. B. C. Roy Engineering College");
    System.out.println("Branch: CSE");
  }
}
*/

//Type 2:

class Q2{
  public static void main(String args[]){

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter you Name: ");
    String name = sc.nextLine();

    System.out.print("Enter you College name: ");
    String clg_name = sc.nextLine();

    System.out.print("Enter you Branch: ");
    String branch = sc.nextLine();

    System.out.println("");
    System.out.println("*****Your Database*****");
    System.out.println("Name: " + name );
    System.out.println("College: " + clg_name );
    System.out.println("Branch: " + branch );
    
    sc.close();
  }
}