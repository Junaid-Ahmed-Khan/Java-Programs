
public class pattern2 {
    public static void main(String[] args) {
        int num = 1;
        char c = 'A';
        for(int i = 1 ; i<= 8 ; i++)
        {
            if (i%2 == 0){
                for(int j = 1 ; j<= i ; j++){
                    System.out.print(c);
                }
                c++;
            }
            else{
            for(int j = 1 ; j<= i ; j++){
                System.out.print(num);
            }
            num++; 
            }
            System.out.println(); 
        }
        
    }
}
