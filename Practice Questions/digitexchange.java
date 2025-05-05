import java.util.Scanner;
public class digitexchange {
  public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
    System.out.println("Enter 2 DIGITS NUMBER");
	int number = sc.nextInt();
	//73 to 37
  int remainder = number%10; // 3
  int quotient = number/10; // 7
  System.out.println("MODIFIED VALUE IS");
  System.out.println(((remainder*10)+quotient));
  }
}

