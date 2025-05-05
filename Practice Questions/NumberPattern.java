import java.util.Scanner;

public class NumberPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of terms: ");
        int numTerms = scanner.nextInt();

        System.out.print("Output: ");
        for (int i = 1; i <= numTerms; i++) {
            int term = i * 3;
            if (i % 2 == 0) {
                term *= -1;
            }
            System.out.print(term + (i == numTerms ? "" : ", "));
        }

        scanner.close();
    }
}

 




