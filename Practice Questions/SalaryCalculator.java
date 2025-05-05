import java.util.Scanner;
public class SalaryCalculator {
  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    //input basic salary 
    System.out.println("Enter basic salary");
    float basicsalary=input.nextFloat();
    //calculating medical allowance 20 percent of basic salary
    float medicalallowance=(basicsalary/100)*20;
    //declaring  teaching allowances 
    float teacingallowance=5000;
      //calculating conveyanceallowance 15 percent of basic salary
    float conveyanceallowance=(basicsalary/100)*15;
     //calculating adhoc allowance  35 percent of basic salary
    float adhochocallowance=(basicsalary/100)*35;
    // summing up all allowances
    float sumofallallowance=medicalallowance+teacingallowance+conveyanceallowance+adhochocallowance;
    // calculating Gross salary 
    float grosssalary=basicsalary+sumofallallowance;
    //calculatng the taxes
    // calculating gp fund as it is 10 percent of your gross salary
    float gpfund=(grosssalary/100)*10;
    // calculating gst as it is 5 percent of your gross salary
    float gst=(grosssalary/100)*5;
     //declaring  groupinsurance  which is 1000 
    float groupinsurance=1000;
    // summing up all taxes 
    float taxes=gpfund+gst+groupinsurance;
    // calculating net salary 
    float netsallary=grosssalary-taxes;
    // printing net sallary 
    System.out.println("your net salary is : " + netsallary);
  }
    
}


