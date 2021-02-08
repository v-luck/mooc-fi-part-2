public class Person {
    private String name;
    private String street;

    public Person(String name, String street) {
        this.name = name;
        this.street = street;
    }

    public String toString() {
        return String.format("%s\n  %s", this.name, this.street);
    }
}
