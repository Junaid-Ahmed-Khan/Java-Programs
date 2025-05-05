public class Q24_Pattern2{
	public static void main(String ar[]){
		System.out.println("Pattern 2: ");
System.out.println("Pattern 2: ");
		int num=1;
		char ch='A';
		for(int i=1;i<=8;i++){
			if(i%2==0){
				for(int j=1;j<=i;j++){
					System.out.print(ch);
				}
				ch++;
			}
			else{
				for(int j=1;j<=i;j++){
					System.out.print(num);
				}
				num++;
			}
			System.out.println("");
		}
	}
}