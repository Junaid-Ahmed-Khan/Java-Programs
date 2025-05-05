import java.util.Scanner;
public class perfectNumber {
    public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  System.out.println("ENTER ANY NUMBER : ");
  int number = sc.nextInt();
  int sum = 0;
  for(i=1;i<=number;i++)
  {
	  if (number%i==0)
		  sum += i;
  }
  if(sum==number)
  {
	 System.out.println(number+ "IS A PERFECT NUMBER ");	 
  }
  else
	  System.out.println(number+ "IS NOT A PERFECT NUMBER");
  
    }
}
 




