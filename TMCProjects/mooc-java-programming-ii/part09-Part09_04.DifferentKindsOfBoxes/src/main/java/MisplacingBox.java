import java.util.ArrayList;

public class MisplacingBox extends Box {
    private ArrayList<Item> itemArrayList;

    public MisplacingBox() {
        this.itemArrayList = new ArrayList<>();
    }

    public void add(Item item) {
        itemArrayList.add(item);
    }

    public boolean isInBox(Item item) {
        return false;
    }

}
