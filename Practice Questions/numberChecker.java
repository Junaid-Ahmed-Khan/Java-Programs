import java.util.Scanner;
public class numberChecker {
  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   System.out.println("ENTER NUMBER ");
   int number = sc.nextInt();
   if (number == 0)
   {
	   System.out.println("THE ENTERED NUMBER IS ZERO ");
   }
   else if (number >= 0)
   {
	  System.out.println("THE ENTERED NUMBER IS POSITIVE "); 
   }
   else
	   System.out.println("THE ENTERED NUMBER IS NEGETAIVE ");
   
  }
}

