import java.util.Scanner;
public class findingLastNum {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER NUMBERS :");
        int num = sc.nextInt();
        int lastDigit  =  num%10;
        switch (lastDigit) {
            case 1:
                System.out.println("ONE");
                break;
                case 2:
                System.out.println("TWO");
                break;
                case 8:
                System.out.println("EIGTH");
                break;
        
            default:
                break;
        }

    }
}
