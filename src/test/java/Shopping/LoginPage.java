package Shopping;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

    @FindBy(css = "#email")
    private WebElement EmailBox;

    @FindBy(css = "#passwd")
    private WebElement PassBox;

    @FindBy(css = "#SubmitLogin")
    private WebElement LoginButton;

    public void InputUser(String A){
        EmailBox.sendKeys(A);
    }
    public void InputPass(String B) { PassBox.sendKeys(B); }
    public void ClickLogin() {LoginButton.click(); }
}
