package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.awt.*;

public class GoogleHome extends BasePage {

    public GoogleHome(WebDriver driver) throws AWTException {
        super(driver);
    }

    @FindBy(id="APjFqb")
    private WebElement SearchBar;

    @FindBy(name="btnK")
    private WebElement SearchBtn;


    public WebElement GetSearchBar() {return SearchBar;}

    public WebElement GetSearchBtn() {return SearchBtn;}



    public Result1 clickOnSearchBtn() throws AWTException {
        GetSearchBtn().click();
        return new Result1(driver);
    }

    public void ClearSearchBar(){
        GetSearchBar().clear();
    }
    public void SearchFor(String word) throws AWTException {
        GetSearchBar().sendKeys(word);
        clickOnSearchBtn();
    }


}
