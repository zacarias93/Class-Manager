package lee.zac.ClassManager;

import java.util.ArrayList;

/**
 * Created by zaclee on 9/14/16.
 */
public class Inventory {

    private double valueOfInventory=0;
    private ArrayList<Product> inventory = new ArrayList<Product>();


    double totalValueOfProduct(Product prod) {
        return prod.getPrice()*prod.getQuantity();
    }
    double valueOfInventory() {
        for(int i=0; i<inventory.size(); i++) {
            valueOfInventory += totalValueOfProduct(inventory.get(i));
        }
        return valueOfInventory;
    }

    void addToInventory(Product prod) {
        inventory.add(prod);
    }
}
