public class Mergesort extends Sort {

    private int[] values;
    private int[] auxilary;

    public Mergesort() {
        super(-1, "Merge Sort", "O(nlog(n))");
    }

    private void merge(int lo, int mid, int hi) {

    }

    private void mergeSort(int lo, int hi) {
        if (hi - lo != 1) {
            System.out.println(hi);
            System.out.println(lo);
            int mid = lo + (hi - lo) / 2;
            System.out.println(mid);
            mergeSort(lo, mid);
            mergeSort(mid + 1, hi);
            merge(lo, mid, hi);
        }
        System.out.println("how many times called");
    }

    public int[] sort(int[] arr) {
        values = arr;
        auxilary = new int[arr.length];
        mergeSort(0, values.length - 1);
        return null;
    }

}
