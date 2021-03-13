public class PalindromsCheck {
    public static void main(String[] args) {
        String str ="abcdcba";
       System.out.println(checkPalindrm(str));
    }

    private static boolean checkPalindrm(String str) {
        int low =0, high =str.length()-1;
        while(low<high){
            if(str.charAt(low) == str.charAt(high)){
                low++;
                high--;
                
            }
            else return false;

            }

        return true;
    }
}
