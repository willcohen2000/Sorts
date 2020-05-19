public class Sorts {


    public static void main(String[] args) {
        Mergesort mergesort = new Mergesort();
        Sort title = new Sort(true);
        Sort[] sorts = {title, mergesort, mergesort, mergesort, mergesort};
        compare(sorts);
    }

    public static void compare(Sort[] sorts) {
        for (Sort sort : sorts) {
            System.out.println("|----------------------------------------------------------------|");
            System.out.println(sort.getFormattedString(1000));
        }
        System.out.println("|----------------------------------------------------------------|");
    }

}
