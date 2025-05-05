import java.util.Scanner;
public class ATMmoneyCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER AMOUNT TO WITHDRAW :");
        int amount = sc.nextInt();
        if (amount > 50000){
            System.out.println("UNAVAILABLE BALANCE : ");

        }
        else{
            int fiveThousand = 0;
            int oneThousand = 0;
            int fiveHundred = 0;
            int oneHundred = 0;
            int  fifty = 0;
            int twenty = 0;
            int ten = 0;
            int five = 0;
            int one = 0;

            while (amount>0) {
                if(amount>=5000)
                {
                    fiveThousand += amount/5000;
                    amount = amount%5000; 
                }
                else if(amount>=1000)
                {
                    oneThousand += amount/1000;
                    amount = amount%1000;

                }
                else if (amount>=500)
                {
                    fiveHundred += amount/500;
                    amount = amount%500;
                }
                else if(amount>=100)
                {
                    oneHundred += amount/100;
                    amount = amount%100;
                }
                else if(amount>=50)
                {
                    fifty += amount/50;
                    amount = amount%50;
                }
                else if(amount>=20)
                {
                    twenty += amount/20;
                    amount = amount%20;
                }
                else if(amount>=10)
                {
                    ten += amount/10;
                    amount = amount%10;
                }
                else if(amount>=5)
                {
                    five += amount/5;
                    amount = amount%5;
                }
                else if(amount>=1)
                {
                    one += amount/1;
                    amount = amount%1;
                }

            }
            System.out.println("RS 5000 :"+fiveThousand);
                System.out.println("RS 1000 :"+oneThousand);
                System.out.println("RS 500 :"+fiveHundred);
                System.out.println("RS 100 :"+oneHundred);
                System.out.println("RS 50 :"+fifty);
                System.out.println("RS 20 :"+twenty);
                System.out.println("RS 10 :"+ten);
                System.out.println("RS 5 :"+five);
                System.out.println("RS 1 :"+one);
        }


    }
}
