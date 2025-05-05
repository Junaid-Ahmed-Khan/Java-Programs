import java.util.Scanner;
public class desireOutput2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for(int i = 1 ; i<= 100 ; i++)
        {
            System.out.print(i+", ");
            if (i%10 == 0) {
                System.out.println("\nPRESS ENTER TO CONTINUE");
                input.nextLine();
            }
        }
    }
}
