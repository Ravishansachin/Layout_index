package PageTest;

import Pages.HomePage;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class HomepageTest {

    @Test
    public void testHomePage() {
        WebDriver driver = null; // Initialize your WebDriver instance

        HomePage home = new HomePage();
        home.searchFunction(driver);

        // Assuming you have a method in HomePage class to get search results
        boolean areSearchResultsCorrect = home.areSearchResultsCorrect();

        // Assert that the correct search results are displayed
        Assert.assertTrue("The correct search results are not displayed.", areSearchResultsCorrect);

        home.NavigteToHome(driver);
        home.SelectCategory(driver); // Assuming you want to select a category before tops
        home.SelectTops(driver);
        home.SelectTopsCategory(driver);
        home.SelectTopColour(driver);

        // Assuming you have a method in HomePage class to validate the filtered results
        boolean areFilterResultsCorrect = home.areFilterResultsCorrect();

        // Assert that the filtered results match the filter criteria
        Assert.assertTrue("The results returned do not match the filter criteria.", areFilterResultsCorrect);
    }
}
