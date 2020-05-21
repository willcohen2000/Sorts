import java.util.Random;

public class Sorts {


    public static void main(String[] args) {
        Mergesort mergesort = new Mergesort();
        SelectionSort selectionSort = new SelectionSort();
        InsertionSort insertionSort = new InsertionSort();

        Sort title = new Sort(true);
        int[] test = getRandomIntArray(100);
        int[] test2 = getRandomIntArray(100);
        int[] test3 = getRandomIntArray(100);
        mergesort.sort(test);
        selectionSort.sort(test2);
        insertionSort.sort(test3);
        //System.out.println("Unsorted: " + Arrays.toString(test));
        // System.out.println("Sorted: " + Arrays.toString(mergesort.sort(test)));
        Sort[] sorts = {title, mergesort, selectionSort, insertionSort, mergesort};
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
            System.out.println(sort.getFormattedString(5555));
        }
        System.out.println("|----------------------------------------------------------------|");
    }

}
