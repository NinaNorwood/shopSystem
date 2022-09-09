import java.util.Objects;

public class Product {

    private Integer productNumber;
    private String productName;

    public Product(int productNumber, String productName) {
        this.productNumber = productNumber;
        this.productName = productName;
    }

    public int getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(int productNumber) {
        this.productNumber = productNumber;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product that = (Product) o;

        if (productNumber != that.productNumber) return false;
        return Objects.equals(productName, that.productName);
    }

    @Override
    public int hashCode() {
        int result = productNumber;
        result = 31 * result + (productName != null ? productName.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ProductRepo{" +
                "productNumber=" + productNumber +
                ", productName='" + productName + '\'' +
                '}';
    }
}
