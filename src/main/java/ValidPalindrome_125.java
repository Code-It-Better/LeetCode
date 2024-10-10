public class ValidPalindrome_125 {
    public static void main(String[] args) {
        System.out.println(isPalindrome("0P"));
    }

    public static boolean isPalindrome(String s) {
        char[] word = s.replaceAll("[^a-z|A-Z|0-9]", "").toLowerCase().toCharArray();
        for (int i = 0; i < word.length/2; i++) {
            if(word[i]!= word[word.length-i-1]){
                return false;
            }
        }
        return true;
    }
}
