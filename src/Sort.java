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
        return String.valueOf(this.runtime) + "s";
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

        String runtime = this.getRuntime();
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
