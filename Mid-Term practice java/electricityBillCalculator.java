import java.util.Scanner;
public class electricityBillCalculator {
    public static void main(String[] args) {
        double totalBill = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER ELECTRICITY UNIT CHARGES : ");
        int unitCharges = sc.nextInt();
        if(unitCharges <= 100)
        {
             totalBill = unitCharges*5;

        }
        else if(unitCharges >= 100 && unitCharges <= 200 )
        {
             totalBill = unitCharges*10; 
        }
        else if (unitCharges >= 200 && unitCharges <= 300) {
             totalBill = unitCharges*15;
        }
        else if (unitCharges > 300)
        {
             totalBill = unitCharges*20;
        } 
        double ptvSports = 0.02;
        double meterInstallation = 2000;
         totalBill += totalBill*ptvSports;
         totalBill += meterInstallation;
         System.out.print("THE TOTAL BILL OF METER NUMBER 111 OWNER JUNAID IS :"+totalBill);


    }
}
