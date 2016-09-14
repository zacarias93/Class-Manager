package lee.zac.ClassManager;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by zaclee on 9/14/16.
 */
public class InventoryTest {

    Inventory inv;
    Product prod;
    Product prod2;
    double delta = 10^-15;

    @Before
    public void setUpTest() {
        inv = new Inventory();
        prod = new Product(1.00,"apple",100);
        prod2 = new Product(2.00,"banana",50);
        inv.addToInventory(prod);
        inv.addToInventory(prod2);
    }


    @Test
    public void totalValueOfProductTest() {
        double expected = 100;
        double actual = inv.totalValueOfProduct(prod);
        Assert.assertEquals(expected,actual,delta);
    }

    @Test
    public void valueOfInventoryTest() {
        double expected = 200;
        double actual = inv.valueOfInventory();
        Assert.assertEquals(expected,actual,delta);
    }
}
