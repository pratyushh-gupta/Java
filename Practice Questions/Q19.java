// Find the largest of three numbers using if-else statements.
import java.util.Scanner;
public class Q19 {
  public static void main(String[] args) {
    int max=Integer.MIN_VALUE;
    Scanner sc = new Scanner(System.in);
    for(int i=0; i<3; i++){
      System.out.printf("Enter the num %d: ", i+1);
      int current = sc.nextInt();
      if(current>max){
        max=current;
      }
    }
    sc.close();

    System.out.println("=== LARGEST NUMBER ===");
    System.out.println("The largest number is: " + max);
  }
}
