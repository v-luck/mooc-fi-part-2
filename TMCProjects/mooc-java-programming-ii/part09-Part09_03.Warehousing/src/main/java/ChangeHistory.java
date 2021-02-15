import java.util.ArrayList;

public class ChangeHistory {
    private ArrayList<Double> history;
    public ChangeHistory() {
        history = new ArrayList<>();
    }

    public void add (double status){
        history.add(status);
    }

    public void clear() {
        history.clear();
    }

    public double maxValue() {
        if (history.size() != 0) {
            double max = history.get(0);
            for (double historyValue : history) {
                if (historyValue > max) {
                    max = historyValue;
                }
            }
            return max;
        }
        return 0;
    }
    public double minValue() {
        if (history.size() != 0) {
            double min = history.get(0);
            for (double historyValue : history) {
                if (historyValue < min) {
                    min = historyValue;
                }
            }
            return min;
        }
        return 0;
    }

    public double average() {
        if (history.size() == 0) {
            return 0;
        }
        double totalSum = 0;
        for (double historyValue : history) {
            totalSum += historyValue;
        }
        return totalSum / history.size();

    }

    public String toString() {
        return history.toString();
    }



}
