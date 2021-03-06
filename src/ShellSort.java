public class ShellSort extends Sort {

    public ShellSort() {
        super(-1, "Shell Sort", "O(n^2)");
    }

    public double test() {
        return 2;
    }

    public static int[] sort(int[] arr) {
        int h = 1;

        while (h < (arr.length / 3)) {
            h = 3 * h + 1;
        }

        while (h >= 1) {
            for (int i = h; i < arr.length; i++) {
                for (int j = i; j >= h && (arr[j] < arr[j - h]); j -= h) {
                    int jh = arr[j - h];
                    arr[j - h] = arr[j];
                    arr[j] = jh;
                }
            }
            h = h / 3;
        }

        return arr;
    }


}
