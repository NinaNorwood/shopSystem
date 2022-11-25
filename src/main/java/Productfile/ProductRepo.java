package Productfile;

import java.util.*;

public class ProductRepo {

    private Map<Integer, Product> productMap = new HashMap<>();

    /** Produkt hinzufügen  */
    public Product add(Product addedP) {
        productMap.put(addedP.getProductId(), addedP);
        return addedP;
    }

    /** Einzelnes Produkt anzeigen  */
    public Product get(int number) {
        Product product = productMap.get(number);
        System.out.println(product);
        if (product == null) {
            throw new NoSuchElementException("No product with this id found");
        }
        return product;
    }

    /** Alle Produkte anzeigen  */
    public Collection list(){
        Collection productList = productMap.values();
        System.out.println(productList);

        return productList;
    }

}
