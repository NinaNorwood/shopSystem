import Orderfile.Order;
import Orderfile.OrderRepo;
import Productfile.Product;
import Productfile.ProductRepo;

import java.util.Collection;

public class ShopService {

    private ProductRepo productRepo = new ProductRepo();
    private OrderRepo orderRepo = new OrderRepo();

    public Product getProduct(int productId) {
            return productRepo.get(productId);
    }

    public Collection listProducts() {
        return productRepo.list();
    }

    public Order addOrder(Order order) {
        return orderRepo.add(order);
    }

    public Order getOrder(int order) {
        return orderRepo.get(order);
    }

    public Collection listOrder() {
        return orderRepo.list();
    }

    public Product addProducts(Product product) {
        return productRepo.add(product);
    }

}
