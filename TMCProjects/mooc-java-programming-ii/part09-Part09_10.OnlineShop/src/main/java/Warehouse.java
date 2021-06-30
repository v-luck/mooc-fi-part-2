import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Warehouse {
    private Map<String, Integer> priceMap;
    private Map<String, Integer> stockMap;
    public Warehouse() {
        this.priceMap = new HashMap<>();
        this.stockMap = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
        priceMap.put(product, price);
        stockMap.put(product, stock);
    }

    public int price(String product) {
        if (priceMap.get(product) == null) {
            return -99;
        }
        return priceMap.get(product);
    }

    public int stock(String product) {
        if (stockMap.containsKey(product)) {
            return stockMap.get(product);
        } else {
            return 0;
        }
    }

    public boolean take(String product) {
        if (stockMap.containsKey(product)) {
            if (stockMap.get(product) == 0) {
                return false;
            } else {
                stockMap.replace(product, stockMap.get(product) - 1);

                return true;
            }
        }
        return false;
    }

    public Set<String> products() {
        return this.stockMap.keySet();
    }
}
