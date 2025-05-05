import java.util.Scanner;
public class triangleType {
  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   System.out.println("ENTER ANGLE 1 ");
   int angle1 = sc.nextInt();
   System.out.println("ENTER ANGLE 2 ");
   int angle2 = sc.nextInt();
   System.out.println("ENTER ANGLE 3 ");
   int angle3 = sc.nextInt();
   if((angle1+angle2+angle3 == 180) && (angle1>0 && angle2>0 && angle3>0))
   {
	   System.out.println("ANGLE IS VALID ");
   }
   else if (angle1==90 && angle2==90 && angle3==90)
   {
	    System.out.println("THE TRIANGLE IS A RIGHT ANGLE TRIANGLE ");
   }
   else if (angle1<90 && angle2<90 && angle3<90)
   {
	    System.out.println("THE TRIANGLE IS ACUTE ANGLE TRIANGLE ");
   }
   else
	    System.out.println("THE TRIANGLE IS OBTUSE ANGLE TRIANGLE ");
  }
}

