package PageTest;

import Pages.AddToCart;
import org.junit.Assert;
import org.junit.Test;

public class AddToCartTest {

    @Test
    public void nav() {
        AddToCart add = new AddToCart();
        add.homenv();
    }

    @Test
    public void Cart() {
        AddToCart add = new AddToCart();
        add.selectGear();
        add.addToCart();

        // Validation: Check if the item is added to the cart successfully
        boolean isAddedToCart = add.isItemAddedToCartSuccessfully();
        Assert.assertTrue("Item is not added to the cart successfully.", isAddedToCart);
    }
}
