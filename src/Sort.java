public class Sort {

    private double runtime;
    private String name;
    private String timeComplexity;
    boolean isTitle;

    public Sort(double runtime, String name, String timeComplexity) {
        this.runtime = runtime;
        this.name = name;
        this.timeComplexity = timeComplexity;
        isTitle = false;
    }

    public Sort(boolean isTitle) {
        this.isTitle = true;
    }

    public String getRuntime() {
        if (isTitle) {
            return "Runtime";
        }
        long start = System.nanoTime();
        sort();
        long finish = System.nanoTime();
        System.out.println(name + " took " + String.format("%.8f", ((finish - start) * Math.pow(10, -9))));
        return String.format("%.8f", ((finish - start) * Math.pow(10, -9)));
    }

    public String getName() {
        if (isTitle) {
            return "Sort Name";
        }
        return this.name;
    }

    public String getTimeComplexity() {
        if (isTitle) {
            return "Time Complexity";
        }
        return String.valueOf(this.timeComplexity);
    }

    public int[] sort() {
        return null;
    }

    public String getFormattedString(int numItems) {
        String name = this.getName();
        for (int i = 0; i < (15 - this.getName().length()); i++) {
            name += " ";
        }
        name += "|";

        String numberItems = numItems + " items";
        if (isTitle) {
            numberItems = "Number Items";
        }
        int numberItemsLen = numberItems.length();
        for (int i = 0; i < (15 - numberItemsLen); i++) {
            numberItems += " ";
        }
        numberItems += "|";

        String runtime = this.getRuntime() + "s";
        for (int i = 0; i < (10 - this.getRuntime().length()); i++) {
            runtime += " ";
        }
        runtime += "|";

        String timeComplexity = this.getTimeComplexity();
        for (int i = 0; i < (17 - this.getTimeComplexity().length()); i++) {
            timeComplexity += " ";
        }
        timeComplexity += "|";

        return "| " + name + " " + numberItems + " " + runtime + " " + timeComplexity;
    }

}
