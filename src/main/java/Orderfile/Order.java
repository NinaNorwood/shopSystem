package Orderfile;

import Productfile.Product;

public class Order {

   private Integer orderId;
   private Product product;

    public Order(Integer orderId, Product product) {
        this.orderId = orderId;
        this.product = product;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public Product getProduct() {
        return product;
    }

    @Override
    public String toString() {
        return "(OrderId:" + orderId +
                ", Product:" + product + ")";
    }
}
