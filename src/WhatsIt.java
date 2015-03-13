public class WhatsIt {
    private int values [];
    private double average;

    public WhatsIt () {
        values = new int[10];
        findAvg();
    }

    public WhatsIt (int n []) {
        values = n;
        findAvg();
    }

    public void findAvg () {
        double sum = 0;
        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }
        average = 1.0 * sum / values.length;
    }

    public String toString() {
        return "Average: " + average + " Length: " + values.length;
    }
} 