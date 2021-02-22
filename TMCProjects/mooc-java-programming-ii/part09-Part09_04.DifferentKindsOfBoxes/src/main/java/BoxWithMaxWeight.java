import java.util.ArrayList;

public class BoxWithMaxWeight extends Box {
    private int capacity;
    private ArrayList<Item> itemArrayList;

    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
        this.itemArrayList = new ArrayList<>();
    }

    public void add(Item item) {
        int currentCapacity = 0;
        for (Item itemInArrayList : itemArrayList) {
            currentCapacity += itemInArrayList.getWeight();
        }

        if (currentCapacity + item.getWeight() <= capacity) {
            this.itemArrayList.add(item);
        }
    }

    public boolean isInBox(Item item) {
        if (itemArrayList.contains(item)) {
            return true;
        }
        return false;
    }
}
