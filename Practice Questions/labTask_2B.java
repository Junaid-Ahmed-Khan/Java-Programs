import java.util.Scanner;
public class labTask_2B{
	public static void main(String ar[]){
		Scanner in = new Scanner(System.in);
		int menuOption;
		char yesNoOption;
		do{
		System.out.println("********Welcome to selection menu********");
		System.out.println("1. Check valid triangle and identify type of triangle.");
		System.out.println("2. Check number is positive,negative or zero withoud logical operators.");
		System.out.println("3. Calculator Program.");
		System.out.println("4. Fibonacci Series.");
		System.out.println("5. KEC Billing System.");
		System.out.println("6. Exit.");
		System.out.println("SELECT ANY ONE OPTION");
		menuOption = in.nextInt();
		switch(menuOption){
			case 1:
			do{
				float a1,a2,a3;
				System.out.println("Enter the three angles of triangle: ");
				a1=in.nextInt();
				a2=in.nextInt();
				a3=in.nextInt();
				
					if(a1==90 || a2==90 || a3==90){
						System.out.println("It is a right angled triangle.");
					}
					else if(a1>90 || a2>90 || a3>90){
						System.out.println("It is a obtuse angled triangle.");
					}
					else if(a1<90 || a2<90 || a3<90){
						System.out.println("It is a acute angled triangle.");
					}
					
					else{
						System.out.println("Invalid triangle angles.");
					}
					System.out.print("Do you want to continue? Y/N  ");
					yesNoOption=in.next().charAt(0);
					
				}while(yesNoOption!='N');
				break;
			case 2:
				
				do{
					System.out.print("Enter a number: ");
					int num=in.nextInt();
					if(num>0){
						System.out.println("It is positive.");
					}
					else if(num<0){
						System.out.println("It is negative.");
					}
					else{
						System.out.println("It is zero.");
					}
					System.out.print("Do you want to continue? Y/N  ");
					yesNoOption=in.next().charAt(0);
				}while(yesNoOption!='N');
				break;
			case 3:
				
				do{
					System.out.println("Enter two numbers:");
					int n1=in.nextInt();
					int n2=in.nextInt();
					in.nextLine(); 
					System.out.println("Enter an operation(+,-,*,/): ");
					char op=in.nextLine().charAt(0);
					if(op=='+'){
						System.out.println("Sum: "+(n1+n2));
					}
					else if(op=='-'){
						System.out.println("Difference: "+(n1-n2));
					}
					else if(op=='*'){
						System.out.println("Product: "+(n1*n2));
					}
					else if(op=='/'){
						System.out.println("Quotient: "+(n1*n2));
					}
					else{
						System.out.println("Invalid Operator.");
					}
					System.out.print("Do you want to continue? Y/N  ");
					yesNoOption=in.next().charAt(0);
				}while(yesNoOption!='N');
				break;
			case 4:
				
				do{
					int n1=0,n2=1,n3=0;
					System.out.println("Enter Last number: ");
					int last = in.nextInt();
					System.out.print(n1+" "+n2+" ");
					while(n3<last){
						n3=n1+n2;
						if(n3<last){
							System.out.print(n3+" ");
						}
						n1=n2;
						n2=n3;
					}
					System.out.print("Do you want to continue? Y/N  ");
					yesNoOption=in.next().charAt(0);
				}while(yesNoOption!='N');
				break;
			case 5:
				
				do{
					System.out.print("Enter the owner's name: ");
					String name=in.nextLine();
					System.out.print("Enter the meter number: ");
					String meterNumber=in.nextLine();
					System.out.print("Enter units: ");
					int units=in.nextInt();
					double bill=0;
					if(units<=100){
						bill = units*5;
					}
					else if(units<=200){
						bill = (100 * 5) + ((units -100)*10); 
					}
					else if(units<=300){
						bill = (100 * 5) + (100 * 10) + ((units - 200) * 15);
					}
					else{
						bill = (100 * 5) + (100 * 10) + (100 * 15) + ((units - 300) * 20);
					}
					bill+=0.02*bill;
					bill+=2000;
					System.out.println("KEC Billing System");
					System.out.println("Meter Number: " + meterNumber);
					System.out.println("Owner Name: " + name);
					System.out.println("Bill: Rs. " + bill);
					System.out.print("Do you want to continue? Y/N  ");
					yesNoOption=in.next().charAt(0);
				}while(yesNoOption!='N');
				break;
			case 6:
				System.exit(0);
				break;
		}
		}while(menuOption!=6);
		
	}	
}


