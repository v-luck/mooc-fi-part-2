import java.util.ArrayList;

public class OneItemBox extends Box {
    private ArrayList<Item> itemArrayList;

    public OneItemBox() {
        this.itemArrayList = new ArrayList<>();
    }

    public void add(Item item) {
        if (itemArrayList.size() == 0) {
            itemArrayList.add(item);
        }
    }

    public boolean isInBox(Item item) {
        if (itemArrayList.contains(item)) {
            return true;
        }
        return false;
    }


}
