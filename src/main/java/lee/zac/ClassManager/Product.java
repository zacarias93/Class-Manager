package lee.zac.ClassManager;

/**
 * Created by zaclee on 9/14/16.
 */
public class Product {

    private double price;
    private String id;
    private int quantity;
    private double totalValueOfProduct;

    Product (double price, String id, int quantity) {
        this.price = price;
        this.id = id;
        this.quantity = quantity;
        this.totalValueOfProduct= price*quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
