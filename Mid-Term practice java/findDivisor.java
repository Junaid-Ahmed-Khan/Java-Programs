import java.util.Scanner;
public class findDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quotient , dividend , remainder , divisor;

        System.out.println("ENTER QUOTIENT VALUE : ");
        quotient = sc.nextInt();
        System.out.println("ENTER DIVIDEND VALUE : ");
        dividend = sc.nextInt();
        System.out.println("ENTER REMAINDER VALUE :");
        remainder = sc.nextInt();
        divisor = (dividend-remainder)/quotient;
        System.out.println("THE DIVISOR OF "+dividend+" is :"+divisor);


    }
}
