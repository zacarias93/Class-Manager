package lee.zac.ClassManager;

/**
 * Created by zaclee on 9/14/16.
 */
public class App {

    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        Product apple = new Product(1,"apple",100);
        Product orange = new Product(2,"orange",200);
        Product banana = new Product(3,"banana",300);

        inventory.addToInventory(apple);
        inventory.addToInventory(orange);
        inventory.addToInventory(banana);

        System.out.println(inventory.totalValueOfProduct(apple));
        System.out.println(inventory.totalValueOfProduct(orange));
        System.out.println(inventory.totalValueOfProduct(banana));
        System.out.println(inventory.valueOfInventory());






    }
}
