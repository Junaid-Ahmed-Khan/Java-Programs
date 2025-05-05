import java.util.Scanner;
public class largestOrSmallest {
  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   System.out.println("ENTER NUMBER 1  ");
   int num1 = sc.nextInt();
   System.out.println("ENTER NUMBER 2  ");
   int num2 = sc.nextInt();
   System.out.println("ENTER NUMBER 3  ");
   int num3 = sc.nextInt();
   System.out.println("ENTER NUMBER 4  ");
   int num4 = sc.nextInt();
   int max = num1;
   int min = num1;
   if(num2>max)
   {
	   max = num2;
   }
   if(num3>max)
   {
	   max = num3;
   }
   if(num4>max)
   {
	   max = num4;
   }	   
   if (num2<min)
   {
	   min = num2;
   }
   if(num3<min)
   {
	   min = num3;
   }
   if(num4<min)
   {
	   min = num4;
   }
   System.out.println("THE MAXIMUM NUMBER IS " +max);
   System.out.println("THE MINIMUM NUMBER IS " +min);
   
 
   
   }
}

