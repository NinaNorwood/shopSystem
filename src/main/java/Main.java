import Orderfile.Order;
import Productfile.Product;

public class Main {

    public static void main(String[] args) {

        ShopService products= new ShopService();

        Product product1 = new Product(123, "Blaues Sofa");
        Product product2 = new Product(456, "Rotes Sofa");
        Product product3 = new Product(789, "Grünes Sofa");

        products.addProducts(product1);
        products.addProducts(product2);
        products.addProducts(product3);

       products.getProduct(123);

       products.listProducts();

        Order order1 = new Order(001, product3);
        Order order2 = new Order(002, product1);

        products.addOrder(order1);
        products.addOrder(order2);

        products.getOrder(002);

        products.listOrder();

    }

}
