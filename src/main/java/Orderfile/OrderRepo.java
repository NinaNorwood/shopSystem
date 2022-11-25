package Orderfile;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

public class OrderRepo {

    Map<Integer, Order> orderMap = new HashMap<>();

    /** Order hinzufügen  */
    public Order add(Order addedOrder) {
        orderMap.put(addedOrder.getOrderId(), addedOrder);
        return addedOrder;
    }

    /** Einzelne Order anzeigen  */
    public Order get(Integer number) {
        Order foundOrder = orderMap.get(number);
        System.out.println(foundOrder);
        if (foundOrder == null) {
            throw new NoSuchElementException("No order with this id found");
        }

        return foundOrder;
    }

    /** Alle Order anzeigen  */
    public Collection list(){
        Collection orderList = orderMap.values();
        System.out.println(orderList);

        return orderList;
    }

}
