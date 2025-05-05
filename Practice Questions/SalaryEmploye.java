import java.util.Scanner;
public class SalaryEmploye {
  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
     
    System.out.println("Enter basic salary");
    float basicsalary=input.nextFloat();
  
    float medicalallowance=(basicsalary/100)*20;
    
    float teacingallowance=5000;
      
    float conveyanceallowance=(basicsalary/100)*15;
    
    float adhochocallowance=(basicsalary/100)*35;
    
    float sumofallallowance=medicalallowance+teacingallowance+conveyanceallowance+adhochocallowance;
   
    float grosssalary=basicsalary+sumofallallowance;
    
   
    float gpfund=(grosssalary/100)*10;
    
    float gst=(grosssalary/100)*5;
    
    float groupinsurance=1000;
    
    float taxes=gpfund+gst+groupinsurance;
    
    float netsallary=grosssalary-taxes;
     
    System.out.println("your net salary is : " + netsallary);
  }
    
}


