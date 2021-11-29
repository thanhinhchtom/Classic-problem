import java.util.Arrays;

public class anagrams {
    public boolean anagrams(String str1, String str2) {
        int[] str1array = new int[256];
        int[] str2array = new int[256];
        for (int i = 0; i < str1.length(); i++) {
            str1array[(int) str1.charAt(i)]++;
        }
        for (int i = 0; i < str2.length(); i++) {
            str2array[(int) str2.charAt(i)]++;
        }
        if (Arrays.equals(str1array, str2array)) {
            return true;
        } else return false;
    }
}
