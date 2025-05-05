import java.util.Scanner;
public class additionOperator {
  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   System.out.println("ENTER NUMBER 1 ");
   int number1 = sc.nextInt();
   System.out.println("ENTER NUMBER 2 ");
   int number2 = sc.nextInt();
   System.out.println("ENTER OPERATOR ");
   char op = sc.next().charAt(0);
   switch(op)
   {
	   case '+':
	   int result = number1+number2;
	   System.out.println("RESULT = " +result);
	   break;
	   case '-':
	   result = number1-number2;
	   System.out.println("RESULT = " +result);
	   break;
   }
	   
   }
}

