
public class Test {
    public static void main(String[] args) {
        
    }
    static String mergeAlternately(String word1, String word2) {
        int word1Length =word1.length(),  word2Length =word2.length(),count1=0,count2=0;
           StringBuffer result =new StringBuffer();
        if(word1 ==null && word1Length==0){
            return word2;
        }
        if(word2 ==null && word2Length==0){
            return word1;
        }
        for(int i=0;i<word1Length+word2Length;i++){
            if(word1Length!=0 && word2Length!=0 && i%2==0){
                result.append(word1.charAt(count1));
                word1Length--;
                count1++;
            }
            else if(word1Length!=0 && word2Length!=0 && i%2!=0){
                 result.append(word2.charAt(count2));
                word2Length--;
                count2++;
            }
          else  if(word1Length==0 && word2Length!=0){
                 result.append(word2.charAt(count2));
                word2Length--;
                count2++;
            }
           else {
                 result.append(word1.charAt(count1));
                word1Length--;
                count1++;
            }
                
         }
        return result.toString();
        
    }
}
