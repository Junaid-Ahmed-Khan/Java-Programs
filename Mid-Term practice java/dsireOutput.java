import java.util.Scanner;
public class dsireOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length;
        System.out.println("ENTER LENGTH :");
        length = sc.nextInt();
        System.out.print("-1 4 ");
        int term = 4;
        for(int i = 1 ; i<= length-2 ; i++)
        {
            if(i%2 == 0)
            {
            term -= 3;
            term *= -1;
            System.out.print(term+" ");
            }
            else  
            {
                term += 3;
                term *= -1; 
                System.out.print(term+" ");
            }
            
        

    }
}
}
