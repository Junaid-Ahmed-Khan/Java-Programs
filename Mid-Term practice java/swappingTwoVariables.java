public class swappingTwoVariables {
    
    public static void main(String[] args) {
        
        int n1= 15, n2= 30;
        n1 = n1^n2;
        n2 = n1^n2;
        n1 = n1^n2;
    
        System.out.println(n1);
        System.out.println(n2);
    }
}
