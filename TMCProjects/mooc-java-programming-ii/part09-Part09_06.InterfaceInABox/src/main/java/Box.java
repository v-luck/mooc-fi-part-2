import java.util.ArrayList;

public class Box implements Packable {
    private ArrayList<Packable> arrayList;
    private double maxWeight;

    public Box(double maxWeight) {
        this.arrayList = new ArrayList<>();
        this.maxWeight = maxWeight;
    }

    public void add(Packable packable) {
        if (this.weight() + packable.weight() < maxWeight) {
            this.arrayList.add(packable);
        }
    }

    public double weight() {
        double weight = 0;
        for (Packable packable : arrayList) {
            weight += packable.weight();
        }

        return weight;
    }

    public int totalItems() {
        int totalItems = 0;
        for (Packable packable : arrayList) {
            totalItems ++;
        }

        return totalItems;
    }


    public String toString() {
        return String.format("Box: %d items, total weight %.1f kg", this.totalItems(), this.weight());
    }
}
