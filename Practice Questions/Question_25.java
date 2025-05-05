import java.util.Scanner;
public class Question_25{
	public static void main(String ar[]){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Amount to withdraw: ");
		int amount = in.nextInt();
		if(amount>50000){
			System.out.println("Amount too high.");
		}
		else{
			int fivethousand=0;
			int onethousand=0;
			int fivehundred=0;
			int onehundred=0;
			int fifty=0;
			int twenty=0;
			int ten=0;
			int five=0;
			int one=0;
			while(amount>0){
				if(amount>=5000){
					fivethousand+=amount/5000;
					amount%=5000;
				}
				else if(amount>=1000){
					onethousand+=amount/1000;
					amount%=1000;
				}
				else if(amount>=500){
					fivehundred+=amount/500;
					amount%=500;
				}
				else if(amount>=100){
					onehundred+=amount/100;
					amount%=100;
				}
				else if(amount>=50){
					fifty+=amount/50;
					amount%=50;
				}
				else if(amount>=20){
					twenty+=amount/20;
					amount%=20;
				}
				else if(amount>=10){
					ten+=amount/10;
					amount%=10;
				}
				else if(amount>=5){
					five+=amount/5;
					amount%=5;
				}
				else{
					one+=amount/1;
					amount%=1;
				}
			}
		System.out.println("Rs 5000: "+fivethousand);
		System.out.println("Rs 1000: "+onethousand);
		System.out.println("Rs 500: "+fivehundred);
		System.out.println("Rs 100: "+onehundred);
		System.out.println("Rs 50: "+fifty);
		System.out.println("Rs 20: "+twenty);
		System.out.println("Rs 10: "+ten);
		System.out.println("Rs 5: "+five);
		System.out.println("Rs 1: "+one);
		}
	}	
}

