import java.util.Scanner;
public class digitInWords {
  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   System.out.println("ENTER NUMBER ");
   int number = sc.nextInt();
   int lastDigit = number%10;
	switch(lastDigit)
	{
		case 0:
		System.out.println("THE LAST DIGIT IS ZERO  ");
		break;
		case 1:
		System.out.println("THE LAST DIGIT IS ONE ");
		break;
		case 2:
		System.out.println("THE LAST DIGIT IS TWO  ");
		break;
		case 3:
		System.out.println("THE LAST DIGIT IS THREE ");
		break;
		case 4:
		System.out.println("THE LAST DIGIT IS FOUR  ");
		break;
		case 5:
		System.out.println("THE LAST DIGIT IS FIVE ");
		break;
		case 6:
		System.out.println("THE LAST DIGIT IS SIX  ");
		break;
		case 7:
		System.out.println("THE LAST DIGIT IS SEVEN ");
		break;
		case 8:
		System.out.println("THE LAST DIGIT IS EIGHT  ");
		break;
		case 9:
		System.out.println("THE LAST DIGIT IS NINE ");
		break;
		
	}
  }
}

