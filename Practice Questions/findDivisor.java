import java.util.Scanner;

public class findDivisor{

	public static void main(String ar[]){
		Scanner sc = new Scanner(System.in);
	System.out.println("ENTER DIVIDEND VALUE ");
	int dividend = sc.nextInt();
	System.out.println("ENTER QUOTIENT VALUE ");
	int quotient = sc.nextInt();
	System.out.println("ENTER REMAINDER VALUE ");
	int remainder = sc.nextInt();
	int divisor = ((dividend-remainder)/quotient);
	System.out.println("THE DIVISOR IS  "+divisor);
	}
	
}