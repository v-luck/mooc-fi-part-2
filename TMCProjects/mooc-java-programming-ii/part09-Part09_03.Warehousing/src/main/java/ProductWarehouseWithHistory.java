public class ProductWarehouseWithHistory extends ProductWarehouse {
    private ChangeHistory changeHistory;
    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        super.addToWarehouse(initialBalance);
        this.changeHistory = new ChangeHistory();
        this.changeHistory.add(initialBalance);
    }

    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        this.changeHistory.add(this.getBalance());
    }

    public double takeFromWarehouse(double amount) {
        double returnType = super.takeFromWarehouse(amount);
        this.changeHistory.add(this.getBalance());
        return returnType;
    }

    public void printAnalysis() {
        System.out.printf("Product: %s\nHistory: %s\nLargest amount of product: %.1f\nSmallest amount of product: %.1f\nAverage: %.1f", this.getName(), this.changeHistory.toString(), this.changeHistory.maxValue(), this.changeHistory.minValue(), this.changeHistory.average());
    }


    public String history() {
        return this.changeHistory.toString();
    }
}
