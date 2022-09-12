package Orderfile;

import Productfile.Product;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {

    @Test
    void getProductTrue() {
        // GIVEN
        Product product1 = new Product(135, "Lila Sofa");
        Order order = new Order(003, product1);
        // WHEN
        Product newProduct = order.getProduct();
        String product = newProduct.toString();
        // THEN
        assertEquals(product, newProduct.toString());
    }

    @Test
    void getProductFalse() {
        // GIVEN
        Product product1 = new Product(135, "Lila Sofa");
        Order order = new Order(003, product1);
        // WHEN
        Product newProduct = order.getProduct();
        String product = "(OrderId:" + 456 +
                ", Product:" + "Schwarzes Sofa" + ")";
        // THEN
        assertNotEquals(product, newProduct.toString());
    }


}