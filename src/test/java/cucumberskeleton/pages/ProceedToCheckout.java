package cucumberskeleton.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;

import java.io.IOException;

public class ProceedToCheckout extends BasePage {

    public @FindBy(xpath = "//span[text()='Proceed to checkout']")
    WebElement proceedToCheckout;

    public ProceedToCheckout() throws IOException {
    }

    @Override
    protected ExpectedCondition getPageLoadCondition() {
        return null;
    }
}
