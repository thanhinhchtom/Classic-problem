import java.util.Arrays;

public class kLargestElements {
    public int[] kLargest (int[] input, int k) {
        int[] result = new int[k];

        System.arraycopy(input, 0, result, 0, k);
        Arrays.sort(result);
        for (int i = k; i < input.length; i++) {
            if (input[i] > result[0]) {
                result[0] = input[i];
                Arrays.sort(result);
            }
        }
        return result;
    }

}
