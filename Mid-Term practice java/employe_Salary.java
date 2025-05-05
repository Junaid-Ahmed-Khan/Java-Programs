import java.util.Scanner;
public class employe_Salary {

    public static void main(String[] args) {
        Scanner sc =command:workbench.action.debug.configure new Scanner(System.in);
        //ENTER BASIC SALARY 
        System.out.print("ENTER BASIC SALARY OF EMPLOYE :");
        double basic_Salary = sc.nextDouble();
        double medicalAllowance = (basic_Salary/100)*20;
        double teachingAllowance = 5000;
        double conveAllowance = (basic_Salary/100)*15;
        double adhoc = (basic_Salary/100)*35;
        double sumOfAllowance = medicalAllowance+teachingAllowance+conveAllowance+adhoc;
        double grossSalary = basic_Salary+sumOfAllowance;
        double gpFund = (grossSalary/100)*10;
        double gst = (grossSalary/100)*5;
        double groupInsurance = 1000;
        double taxes = gpFund+gst+groupInsurance;
        double netSalary = grossSalary-taxes;
        System.out.print("THE NET SALARY OF EMPLOYE IS : "+netSalary);
    }
}