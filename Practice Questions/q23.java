import java.util.Scanner;
public class q23{
	public static void main(String ar[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER ANY NUMBER ");
		int number = sc.nextInt();  //12321
		int origNumber = number;
		int reverseNumber = 0;
		while (number!=0){
			int remainder = number % 10;
			 reverseNumber = (reverseNumber*10)+remainder;
			 number = number/10;
		}
		System.out.println("REVERSE NUMBER IS : "+reverseNumber);
		if (origNumber == reverseNumber){
			System.out.println(origNumber+ " IS A PALINDROME.");
		}
		else
		System.out.println(origNumber+ " IS NOT A PALINDROME.");
		}
	}	




