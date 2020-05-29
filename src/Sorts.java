import java.util.Random;

public class Sorts {


    public static void main(String[] args) {
        Mergesort mergesort = new Mergesort();
        SelectionSort selectionSort = new SelectionSort();
        InsertionSort insertionSort = new InsertionSort();
        BubbleSort bubbleSort = new BubbleSort();
        ShellSort shellSort = new ShellSort();
        QuickSort quickSort = new QuickSort();

        System.out.println(quickSort.getRuntime());
        System.out.println(shellSort.getRuntime());

        Sort title = new Sort(true);
        int num = 100000;
        int[] test = getRandomIntArray(num);
        int[] test2 = getRandomIntArray(num);
        int[] test3 = getRandomIntArray(num);
        int[] test4 = getRandomIntArray(num);
        int[] test5 = getRandomIntArray(num);
        int[] test6 = getRandomIntArray(num);

        mergesort.sort(test);
        selectionSort.sort(test2);
        insertionSort.sort(test3);
        bubbleSort.sort(test4);
        shellSort.sort(test5);
        quickSort.sort(test5);

        Sort[] sorts = {title, mergesort, selectionSort, insertionSort, bubbleSort, shellSort, quickSort};
        compare(sorts);
    }

    public static int[] getRandomIntArray(int numItems) {
        int min = 0;
        int max = numItems * 2;

        int[] randomArr = new int[numItems];
        Random random = new Random();

        for (int i = 0; i < randomArr.length; i++) {
            randomArr[i] = random.nextInt(max);
        }

        return randomArr;
    }

    public static void compare(Sort[] sorts) {
        for (Sort sort : sorts) {
            System.out.println("|----------------------------------------------------------------|");
            System.out.println(sort.getFormattedString(10000));
        }
        System.out.println("|----------------------------------------------------------------|");
    }

}
