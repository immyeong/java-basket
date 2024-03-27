import java.util.Objects;

public class Product {
    private int lastNo = 0;
    private int key;
    private String name;
    private int price;

    // Constructor
    public Product(String name, int price) {
        this.key = ++lastNo;
        this.name = name;
        this.price = price;
    }

    // Getters and setters

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    // Override equals() method
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Product product = (Product) obj;
        return key == product.key &&
                Double.compare(product.price, price) == 0 &&
                Objects.equals(name, product.name);
    }

    // Override hashCode() method
    @Override
    public int hashCode() {
        return Objects.hash(key, name, price);
    }

    // Other methods, if any
}