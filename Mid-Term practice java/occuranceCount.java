import java.util.Scanner;

public class occuranceCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Count = 0;
        String str = "junaid khaaan";
        System.out.println("ENTER CHARACTOR");
        char C = sc.next().charAt(0);
        for(int i = 0 ; i<str.length() ; i++)
        {
            if (C == str.charAt(i))
            {
                Count++;

            }
        }
        System.out.println(Count);

    }
}
