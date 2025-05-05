import java.util.Scanner;
public class divison {
  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   System.out.println("ENTER NUMBER  ");
   int number = sc.nextInt();
   if(number%5 == 0 || number%11 == 0)
   {
	   System.out.println("THE NUMBER IS DIVISIBLE OF " +number);
   }
   else
	  System.out.println("THE NUMBER IS NOT DIVISIBLE OF " +number); 
   
   }
}

