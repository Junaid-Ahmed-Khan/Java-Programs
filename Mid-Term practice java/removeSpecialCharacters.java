import java.util.Scanner;
public class removeSpecialCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER STRING :");
        String str = sc.nextLine(); 
        str = str.replaceAll("[^0-9,a-z,A-Z]", "");
        System.out.println(str);

    }
}
