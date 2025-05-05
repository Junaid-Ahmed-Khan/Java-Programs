import java.util.Scanner; 
public class operatorSelection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;
        char op;
        System.out.println("ENTER NUMBER ONE : ");
        num1 = sc.nextInt();
        System.out.println("ENTER NUMBER TWO : ");
        num2 = sc.nextInt();
        System.out.println("ENTER OPEREATOR : ");
        op = sc.next().charAt(0);
        switch (op) {
            case '+':
               System.out.println("SUM = "+(num1+num2));
                break;
        
            default:
            System.out.println("WRONG OPERATOR");
                break;
                
        } 
    }
}
