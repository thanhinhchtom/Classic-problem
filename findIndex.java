public class findIndex {
    public int getIndex(int[] input, int target) {
        int index = -1;
        for (int i = 0; i < input.length; i++) {
            if (input[i] == target) {
                index = i;
            }
        }
        return index;
    }
}
