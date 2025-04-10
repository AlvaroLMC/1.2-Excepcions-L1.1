package SaleProducts;

public class Main {
    public static void main(String[] args) {
        Sale sale = new Sale();

        try {
            sale.perform();
        } catch (EmptySaleException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }

        sale.addProducts(new Product("water", 2.50));
        sale.addProducts(new Product("apple", 6.00));

        try {
            sale.perform();
        } catch (EmptySaleException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }

        try {
            System.out.println(sale.getProducts().get(10).name());
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: You have accessed a non-existent list!");
        }
    }
}