// Find area of circle

import java.util.Scanner;

public class Q6{
  public static void main(String args[]){
    System.out.println("\n *****Area of a Circle*****\n");

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the radius of Circle: ");
    int radius = sc.nextInt();

    System.out.print("Enter the dimension (m/cm): ");
    String dmsn = sc.next();

    // Calculation
    double pi = 3.14;
    double area = (pi * radius * radius);

    if(dmsn.equals("m")){
      dmsn = "m^2";
    }
    else if(dmsn.equals("cm")){
      dmsn = "cm^2";
    }
    else{
      System.out.println("\nInvalid Choice!! ");
      sc.close();
      return;
    }

    System.out.print("\nArea of Circle: " + area + " " + dmsn );
    sc.close();

  }
}