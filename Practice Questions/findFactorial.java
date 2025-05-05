import java.util.Scanner;
public class findFactorial {
    public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  System.out.println("ENTER ANY NUMBER : ");
  int number = sc.nextInt();
  int factorial = 1;
  for(int i = 1; i<=number; i++)
  {
   factorial *= i;

  }
  System.out.println("THE FACTORIAL OF " +number+ " IS = " +factorial);
  
    }
}




