import java.util.HashMap;
import java.util.Map;

public class ProductRepo {

    private Map<Integer, Product> products = new HashMap<>();

    public ProductRepo() {
        Product product1 = new Product(1, "Blaue Couch");
        Product product2 = new Product(2, "Rote Couch");
        Product product3 = new Product(3, "Grüne Couch");

        products.put(product1.getProductNumber(), product1);
        products.put(product2.getProductNumber(), product2);
        products.put(product3.getProductNumber(), product3);
    }


    //    Einzelnes Produkt anzeigen lassen:
    public Product showProduct (Integer number){
        Product foundProducts = products.get(number);
        System.out.println(foundProducts);

        return foundProducts;
    }







}
