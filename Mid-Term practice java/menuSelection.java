import java.util.*;
public class menuSelection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menuSelect ;
        char yesNoOption ;
        do {
            System.out.println("********WELCOME TO SELECTION MENU ********");
            System.out.println("1. CHECK WHETHER THE TRIANGLE IS RIGHT OBTUSE OR ACCUTE");
            System.out.println("2. CHECK NUMBER POSITIVE OR NEGETIVE ");
            System.out.println("3. CALCULATOR PROGRAM");
            System.out.println("4. EXIT");
            System.out.println("PLESASE SELECT ANY ONE OPTION");
            menuSelect = sc.nextInt();
            switch (menuSelect) {
                case 1 :
                do {
                    int triagle;
                    System.out.println("ENTER THE VALUE OF TRINGLE ");
                    triagle = sc.nextInt();
                    
                    if (triagle == 90) {
                        System.out.println("IT IS RIGHT TRIANGLE");
                    }
                    else if (triagle < 90) {
                        System.out.println("IT IS ACCUTE ANGLE");
                        
                    }
                    else if(triagle>90){
                        System.out.println("IT IS OBTUSE ANGLE");
                    }
                    System.out.println("DO YOU WANT TO CONTINE Y OR N");
                    yesNoOption = sc.next().charAt(0);
                } while (yesNoOption != 'N');
               
            }
            
        } while (menuSelect != 4);

        
       

    }
}
