package march02;

import java.util.HashMap;
import java.util.Map;

public final class Product {

    private int productId;

    private String productName;

    private Double price;

    public Product(int productId, String productName, Double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public Double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" + "Product id=" + productId + ", productName=' " + productName + "Price =" + price + '}';
    }

    public static void main(String[] args) {

        Map<Product, Integer> map = new HashMap<>();
        Product prod1 = new Product(1001, "Mint Toothpaste", 10.50);
        Product prod2 = new Product(1002, "Whitening Toothpaste", 20.00);
        Product prod3 = new Product(1003, "Regular Toothpaste", 15.00);

        map.put(prod1, 1001);
        map.put(prod2, 1002);
        map.put(prod3, 1003);

        System.out.println(map
        );
    }
}
