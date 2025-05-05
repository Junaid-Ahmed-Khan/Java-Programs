import java.util.Scanner;             
public class conversion_Terms_In_java{

	public static void main(String ar[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("ENTER GB TO CONVERT INTO BYTES");
  	int gb = sc.nextInt();
	int bytes = gb*1073741824;
	System.out.println( gb+ "IN BYTES IS = " +bytes );
	System.out.println("ENTER DOLLARS TO CONVERT INTO RUPEES");
	int dollars = sc.nextInt();
	int rupees = dollars*278;
	System.out.println(dollars+ "DOLLARS IN RUPEES = "+rupees);
	System.out.println("ENTER FEET TO CONVERT INTO INCHES");
	int feet = sc.nextInt();
	int inches = feet*12;
	System.out.println(feet+ "FEETS IN INCHEES = "+inches);
	System.out.println("ENTER METER TO CONVERT INTO CENTIMETER");
	int meter = sc.nextInt();
	int centiMeter = meter*100;
	System.out.println(meter+ "METER INTO CENTIMETER = "+centiMeter);
	System.out.println("ENTER HOURS TO CONVERT INTO SECONDS");
	int hours = sc.nextInt();
	int seconds = hours*3600;
	System.out.println(hours+ "HOURS IN SECONDS = "+seconds);
	}
	
}
