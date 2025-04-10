package SaleProducts;

public class Main {
    public static void main(String[] args) {
        Sale sale = new Sale();

        // Probar la excepción
        try {
            sale.perform();
        } catch (EmptySaleException e) {
            System.out.println("Excepción capturada: " + e.getMessage());
        }

        // Añadir
        sale.addProducts(new Product("Agua", 2.50));
        sale.addProducts(new Product("Manzanas", 6.00));

        // Intentar realizar la venta nuevamente
        try {
            sale.perform();
        } catch (EmptySaleException e) {
            System.out.println("Excepción capturada: " + e.getMessage());
        }

        // Capturar IndexOutOfBoundsException
        try {
            System.out.println(sale.getProducts().get(10).name());
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: has accedido a una lista inexistente!");
        }
    }
}