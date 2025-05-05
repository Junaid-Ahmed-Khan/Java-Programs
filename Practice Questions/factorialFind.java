import java.util.Scanner;
public class factorialFind {
    public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  System.out.println("ENTER ANY NUMBER : ");
  int number = sc.nextInt();
  for(int i = 1; i<=number; i++)
  {
  int factorial = number*(number-i);
  }
  System.out.println("THE FACTORIAL OF " +number+ " IS = "+factorial);
  
    }
}




