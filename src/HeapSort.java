import java.util.Arrays;

public class HeapSort {

    public static void main(String[] args) {
        MaxHeap test = new MaxHeap(20);
        test.insert(5);
        test.insert(11);
        test.insert(15);
        test.insert(4);
        test.insert(11);
        test.insert(8);
        test.insert(16);
        test.insert(19);
        test.insert(3);
        test.print();

        test.deleteMax();
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
            int max = tree[1];
            tree[1] = tree[N];
            tree[N] = 0;
            N--;
            sink(1);
            return max;
        }

        private void swim(int index) {
            if (index != 1 && tree[index] > tree[index / 2]) {
                int temp = tree[index];
                tree[index] = tree[index / 2];
                tree[index / 2] = temp;
                swim(index / 2);
            }
        }

        private void sink(int index) {
            if (2 * index <= N && tree[index] < tree[2 * index]) {
                int temp = tree[index];
                tree[index] = tree[2 * index];
                tree[2 * index] = temp;
                sink(index * 2);
            } else if (2 * index + 1 <= N && tree[index] < tree[2 * index + 1]) {
                int temp = tree[index];
                tree[index] = tree[2 * index] + 1;
                tree[2 * index + 1] = temp;
                sink(index * 2 + 1);
            }
        }

        public void print() {
            System.out.println(Arrays.toString(tree));
        }

    }


}
