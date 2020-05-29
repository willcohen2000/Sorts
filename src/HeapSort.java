import java.util.Arrays;

public class HeapSort {

    public static void main(String[] args) {
        MaxHeap test = new MaxHeap(100);
        test.insert(5);
        test.insert(11);
        test.insert(15);
        test.insert(4);
        test.print();
    }

    private static class MaxHeap {

        private int[] tree;
        int N;

        public MaxHeap(int capacity) {
            tree = new int[capacity + 1];
        }

        public boolean isEmpty() {
            return (N == 0);
        }

        public void insert(int x) {
            tree[N + 1] = x;
            swim(N + 1);
            N++;
        }

        public int deleteMax() {
            return 0;
        }

        private void swim(int index) {

        }

        private void sink(int index) {

        }

        public void print() {
            System.out.println(Arrays.toString(tree));
        }

    }


}
