package cucumberskeleton.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;

import java.io.IOException;
import java.util.List;

public class YourLogoMainPage extends BasePage {

    public @FindBy(xpath = "//a[contains(text(),'Sign in')]")
    WebElement signIn;
    public @FindBy(xpath = "//a[text()='Women']")
    WebElement women;

    public @FindBy(id = "contact-link")
    WebElement contactUs;

    public @FindBy(xpath = "//a[@title='T-shirts']")
    List<WebElement> tShirt;

    public YourLogoMainPage() throws IOException {

    }

    @Override
    protected ExpectedCondition getPageLoadCondition() {
        return null;
    }

}
