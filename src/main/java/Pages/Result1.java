package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.awt.*;

public class Result1 extends BasePage{
    public Result1(WebDriver driver) throws AWTException {
        super(driver);
    }

    @FindBy(id = "result-stats")
    private WebElement resultStats;

    @FindBy(xpath = "//div[@class='EIaa9b']")
    private WebElement relatSearchBox;

    public WebElement GetrelatSearchBox() {
        return relatSearchBox;
    }
   public WebElement GetresultStats(){
        return resultStats;
   }
}
