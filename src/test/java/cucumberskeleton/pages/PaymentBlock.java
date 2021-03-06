package cucumberskeleton.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;

import java.io.IOException;

public class PaymentBlock extends BasePage {

    public @FindBy(xpath = "//a[@title='Pay by bank wire']")
    WebElement payByBank;

    public @FindBy(xpath = "//span[text()='I confirm my order']")
    WebElement confirm;

    public @FindBy(xpath = "//span[@class='price']")
    WebElement price;

    public PaymentBlock() throws IOException {
        super();
    }

    @Override
    protected ExpectedCondition getPageLoadCondition() {
        return null;
    }
}
