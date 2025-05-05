import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = scanner.nextInt();

        int num = -1;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                System.out.print(num + ", ");
            } else {
                System.out.print(-num + ", ");
            }
            num += 3;
        }

        scanner.close();
    }
}