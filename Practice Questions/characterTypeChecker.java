import java.util.Scanner;
public class characterTypeChecker {
  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   System.out.println("ENTER CHARACTER TO CHECK ");
   char ch = sc.next().charAt(0);
   if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
   {
	   System.out.println(ch+ " IS A SMALL VOWEL ");
   }
   else if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
   {
	   System.out.println(ch+ " IS A CAPITAL VOWEL ");
   }
   else if (ch >= 'a' && ch <= 'z')
   {
	  System.out.println(ch+ " IS A SMALL CONSONENT "); 
   }
   else if (ch >= 'A' && ch <= 'z')
   {
	   System.out.println(ch+ " IS A LARGE CONSONENT ");
   }
   else if (ch >= '0' && ch <= '9')
   {
	   System.out.println(ch+ " IS A NUMBER ");
   }
   else
   {
	   System.out.println(ch+ " IS A SPECIAL CHARACTER ");
   }
  }
}

