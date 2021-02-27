public class CheckString {
    public static void main(String[] args) {
       String[] word1 = {"ab", "c"};
         String[] word2 = {"a", "bc"};
      
        System.out.println(arrayStringsAreEqual(word1,word2));
    }
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder str1 =new StringBuilder();
         StringBuilder str2 =new StringBuilder();
        for(int i =0;i<word1.length;i++){
            str1 =str1.append(word1[i]);
        }
         for(int i =0;i<word2.length;i++){
            str2 =str2.append(word2[i]);
        }
        return str1.toString().equals(str2.toString());
    }
}
