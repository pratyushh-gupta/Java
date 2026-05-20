// Find area of rectamgle

import java.util.Scanner;

public class Q5 {
  public static void main(String args[]){
  
  System.out.println("\n***** Area of a Rectangle ***** \n");

  Scanner sc = new Scanner(System.in);

  System.out.print("Enter the length: ");
  int length = sc.nextInt();

  System.out.print("Enter the breadth: ");
  int breadth = sc.nextInt();

  System.out.print("Enter dimension (cm/m): ");
  String dmtn = sc.next();

  //Calculation
  int area = length * breadth;

  if(dmtn.equals("cm")){
    dmtn = "cm^2";
  }
  else if(dmtn.equals("m")){
    dmtn = "m^2";
  }
  else{
    System.out.println("\nInvalid Choice!!");
    sc.close();
    return;
  }

  System.out.println("\nArea of Rectangle: " + area + " " + dmtn );

  sc.close();
  }
}
