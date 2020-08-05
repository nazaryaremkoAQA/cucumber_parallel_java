package cucumberskeleton.pages;

import cucumberskeleton.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;


public class BucketBlock extends BasePage {

    public @FindBy(xpath = "//span[contains(text(),'Proceed')]")
    WebElement proceed;

    public BucketBlock(){
        super();
    }

    @Override
    protected ExpectedCondition getPageLoadCondition() {
        return null;
    }
}
