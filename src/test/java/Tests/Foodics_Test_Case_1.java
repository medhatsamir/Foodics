package Tests;

import Pages.GoogleHome;
import Pages.Result1;
import org.testng.annotations.Test;

import java.awt.*;

import static org.testng.Assert.*;

public class Foodics_Test_Case_1 extends BaseTest{
    GoogleHome googleHome;
    Result1 result1;

    @Test
    public void Foodics1() throws AWTException, InterruptedException {
        googleHome = new GoogleHome(driver);

        googleHome.GetSearchBar().sendKeys("Word one"); //Write the First Word
        googleHome.ClearSearchBar(); //clear first word
        googleHome.GetSearchBar().sendKeys("Word two"); //write the second word
        result1 = googleHome.ClickEnter(); //search for the second word
        assertNotEquals(result1.GetresultStats().getText().length(), 0); //get number of results in UI and assert on it that it's not equal 0
        result1.ScrollDownToBottomOfPage(); //scroll to bottom of the page
        assertTrue(result1.searchSuggestions(result1.GetrelatSearchBox())); //assert on the Suggestions Results
        driver.quit(); //close driver

    }
}
