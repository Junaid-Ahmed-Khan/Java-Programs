import java.util.Scanner;
public class ElectricityBillCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter electricity unit charges: ");
        int units = sc.nextInt();
        double totalBill = 0;
        if (units <= 100) {
            totalBill = units * 5;
        } else if (units <= 200) {
            totalBill = 100 * 5 + (units - 100) * 10;
        } else if (units <= 300) {
            totalBill = 100 * 5 + 100 * 10 + (units - 200) * 15;
        } else {
            totalBill = 100 * 5 + 100 * 10 + 100 * 15 + (units - 300) * 20;
        }
        totalBill += totalBill * 0.02; 
        totalBill += 2000; 
        System.out.println("Total Bill: Rs. " + totalBill);
    }
}


