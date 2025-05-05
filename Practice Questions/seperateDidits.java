import java.util.Scanner;
public class seperateDidits {
  public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
    System.out.println("Enter 4 DIGITS NUMBER");
	int number = sc.nextInt();
	//12345
  int number4 = number%10;
  number = number/10;
  int number3 = number%10;
  number = number/10;
  int number2 = number%10;
  number = number/10;
  int number1 = number%10;
  number = number/10;
  System.out.println(number4);
  System.out.println(number3);
  System.out.println(number2);
  System.out.println(number1);
  System.out.println(number);
  }
}

