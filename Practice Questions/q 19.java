public class Q19{
	public static void main(String ar[]){
		System.out.println("Pattern 1: ");
		int num=0;
		for(int i=1;i<=4;i++){
			for(int j=1;j<=2;j++){
				if(i%2==0){
					System.out.print(((++num)+1)+"   "+((++num)-1));
					break;
				}
				else{
					System.out.print((++num)+"   ");
				}
			}
			System.out.println("");
		}
	




