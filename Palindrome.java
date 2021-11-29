public class Palindrome {
    public boolean check_palindrome(String str){
        int n = str.length();
        for (int i = 0; i < n / 2; i++){
            if (!str.substring(i, i + 1).equals(str.substring(n - 1 - i, n - i))){
                //if the last character is not the same as the first, return false
                return false;
            }
        }
        return true;
    }
    public String reverse_string(String str) {
        String result = "";
        int n = str.length();
        for (int i = 0; i < str.length(); i++) {
            result = result + str.substring(n - i - 1, n - i);  //add to result from the last character to the first one
        }
        return result;
    }
}
