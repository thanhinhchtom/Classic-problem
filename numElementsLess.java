public class numElementsLess {
    public int numElLess (int[] input, int compareNum) {
        int numEl = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] <= compareNum) {
                numEl++;
            }
        }
        return numEl;
    }
}
