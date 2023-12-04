package Pages;

import BaseTest.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class AddToCart extends BaseTest {
WebDriver driver;
    By NaviagteHome2 = By.id("ui-id-4");
    By ClickGear = By.id("your_gear_element_id"); // Replace with the actual ID of the gear element
    By ClickBag = By.xpath("//*[@id='ui-id-25']/span");
    By ClickAddToCart = By.xpath("//*[@id='maincontent']/div[3]/div[1]/div[3]/ol/li[1]/div/div/div[3]/div/div[1]/form/button/span");

    public AddToCart() {
    }

    public void homenv() {
        driver.findElement(NaviagteHome2).click();
    }

    public void selectGear() {
        WebElement gearElement = driver.findElement(ClickGear);
        Actions builder = new Actions(driver);
        builder.moveToElement(gearElement).perform();
        driver.findElement(ClickBag).click();
    }

    public void addToCart() {
        driver.findElement(ClickAddToCart).click();
    }

    public boolean isItemAddedToCartSuccessfully() {
        // Implement the logic to check if the item is added to the cart successfully
        // You might check for a confirmation message, change in cart count, or any other relevant indicator
        // Return true if successful, false otherwise
        return true; // Replace with actual logic
    }
}
