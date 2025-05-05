import java.util.Scanner;
public class q22{
	public static void main(String ar[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER ANY NUMBER ");
		int number = sc.nextInt();
		int num5 = number%10;
		number = number/10;
		int num4 = number%10;
		number = number/10;
		int num3 = number%10;
		number = number/10;
		int num2 = number%10;
		int num1 = number/10;
		System.out.println(num5+""+num4+""+num3+""+num2+""+num1);
		}
	}	




