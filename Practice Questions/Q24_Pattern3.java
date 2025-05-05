public class Q24_Pattern3{
	public static void main(String ar[]){
		
System.out.println("Pattern 3: ");
		for(int i=7;i>=1;i--){
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			for(int space=1;space<=((7-i)*2);space++){
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println("");
		}
	}	
}
