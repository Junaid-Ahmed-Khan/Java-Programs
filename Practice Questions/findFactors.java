import java.util.Scanner;
public class findFactors {
    public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  System.out.println("ENTER ANY NUMBER : ");
  int number = sc.nextInt();
  for(int i = 1; i<=number; i++)
  {
   if(number%i == 0)
   {
	  System.out.println(i); 
   }

  }
  
    }
}




