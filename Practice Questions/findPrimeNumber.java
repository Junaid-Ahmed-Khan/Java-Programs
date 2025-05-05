import java.util.Scanner;
public class findPrimeNumber {
    public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  System.out.println("ENTER ANY NUMBER : ");
  int number = sc.nextInt();
  boolean found = true;
  if(number<=1)
	  found = false;
  for(int i = 2; i<=number/2; i++)
  {
	  if(number%i==0)
	  {
		  found=false;
		  break;
	  }
	
  }
   if(found)
	  {
		  System.out.println(number+ "IS A PRIME NUMBER");
	  }
	  else
		  System.out.println(number+ "IS NOT A PRIME NUMBER");
  
    }
}
 




