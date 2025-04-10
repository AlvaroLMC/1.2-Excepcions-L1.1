package SaleProducts;

import java.util.ArrayList;
import java.util.List;

public class Sale {
    private final List<Product> products;
    private double total;

    public Sale() {
        products = new ArrayList<>();
        total = 0;
    }

    public void addProducts(Product product) {
        products.add(product);
    }

    public void perform() throws EmptySaleException {
        if (products.isEmpty()) {
            throw new EmptySaleException();
        } else {
            total = 0;
            for (Product p : products) {
                total += p.price();
            }
            System.out.println("Venta realizada con èxito. Total: " + total + "€");
        }
    }

    public List<Product> getProducts() {
        return products;
    }
}