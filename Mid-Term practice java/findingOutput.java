public class findingOutput {
    public static void main(String[] args) {
        String S1 = "Java Programming";
        String S2 = "is taught";
        String S3 = "at Colorado State";
        int Size = S3.length()+3;
        System.out.println(Size);
        char cChar = S1.charAt(10);
        System.out.println(cChar);
        String subStr = S1.substring(1,7);
        subStr = subStr.replaceAll(" " , "");
        System.out.println(subStr);
    }
}
