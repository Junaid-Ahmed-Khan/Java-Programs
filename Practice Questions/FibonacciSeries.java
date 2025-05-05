import java.util.Scanner;
public class fabonannciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	  int maxLimit = 200;
	  int firstTerm = 1;
	  int secondTerm = 1; 
	  
        System.out.print("FABO0NANNCI SERIES UPTO " +maxLimit+ ":");
		System.out.println(firstTerm+ ", " +secondTerm);
		int nextTerm = firstTerm+secondTerm;
		while(nextTerm<maxLimit)
		{
			System.out.println(", " +nextTerm);
			firstTerm = secondTerm;
			secondTerm = nextTerm;
			nextTerm = firstTerm+secondTerm;
		}
		
		System.out.println();
    }
}



