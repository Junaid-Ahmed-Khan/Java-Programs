public class replaceCharWithOcc {
    public static void main(String[] args) {
        
        String str = "aaabbbcc";
        char[] charArr = str.toCharArray();
        String ans = "";
        for(int i = 0 ; i < str.length() ; i++)
        {
            char currentChar = charArr[i];
            int charCount = 1;
            while (i+1 < charArr.length && charArr[i+1] == currentChar)
            {
                charCount++;
                i++;

            }
            ans += currentChar+charCount;
        }
        System.out.println(ans);
        

    }
}
