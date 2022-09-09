import java.util.Objects;

public class Order {

   private Integer orderNumber;
   private String orderName;


    public Order(int orderNumber, String orderName) {
        this.orderNumber = orderNumber;
        this.orderName = orderName;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Order orderRepo = (Order) o;

        if (orderNumber != orderRepo.orderNumber) return false;
        return Objects.equals(orderName, orderRepo.orderName);
    }

    @Override
    public int hashCode() {
        int result = orderNumber;
        result = 31 * result + (orderName != null ? orderName.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "OrderRepo{" +
                "orderNumber=" + orderNumber +
                ", orderName='" + orderName + '\'' +
                '}';
    }
}
