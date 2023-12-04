package Pages;

import BaseTest.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePage extends BaseTest {

    // Locator for the search input field
     By search = By.id("search");
     By searchResults = By.xpath("//*[@id='maincontent']/div[1]/h1/span"); // Replace with the actual locator for search results

     By NaviagteHome = By.id("ui-id-4");
     By Findcetegory = By.cssSelector(".nav-2 > .level-top > span");
     By ClickTops = By.cssSelector("#ui-id-9"); // Updated the locator for ClickTops
     By topsCategory = By.xpath("//*[@id='narrow-by-list']/div[1]/div[1]");
     By selectjacket = By.xpath("//*[@id='narrow-by-list']/div[1]/div[2]/ol/li[1]/a");
     By SelectColour = By.xpath("//*[@id='narrow-by-list']/div[5]/div[1]");
     By SelectWhiteColoure = By.xpath("//*[@id='narrow-by-list']/div[5]/div[2]/div/div/a[9]/div");
WebDriver driver;
    public HomePage() {
    }

    public void searchFunction(WebDriver driver) {
        driver.findElement(search).click();
        driver.findElement(search).sendKeys("bottom");
        driver.findElement(search).sendKeys(Keys.ENTER);
    }

    public void NavigteToHome(WebDriver driver) {
        driver.findElement(NaviagteHome).click();
    }

    public void SelectCategory(WebDriver driver) {
        WebElement categoryElement = driver.findElement(Findcetegory);
        Actions builder = new Actions(driver);
        builder.moveToElement(categoryElement).perform();
    }

    public void SelectTops(WebDriver driver) {
        driver.findElement(ClickTops).click();
    }

    public void SelectTopsCategory(WebDriver driver) {
        WebElement topsCategoryElement = driver.findElement(topsCategory);
        Actions builder = new Actions(driver);
        builder.moveToElement(topsCategoryElement).perform();
        driver.findElement(selectjacket).click();
    }

    public void SelectTopColour(WebDriver driver) {
        WebElement selectColourElement = driver.findElement(SelectColour);
        Actions builder = new Actions(driver);
        builder.moveToElement(selectColourElement).perform();
        driver.findElement(SelectWhiteColoure).click();
    }

    public boolean areSearchResultsCorrect() {
        // Implement logic to check if the correct search results are displayed
        // For example, you can check the presence of specific elements in the search results
        return driver.findElement(searchResults).isDisplayed();
    }
}
