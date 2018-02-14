package Shopping;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentPage {
    @FindBy(css = ".standard-checkout > span:nth-child(1)")
    private WebElement CheckoutBox;

    @FindBy(css = "#email")
    private WebElement EmailBox;

    @FindBy(css = "#passwd")
    private WebElement PassBox;

    @FindBy (css= "#SubmitLogin")
    private WebElement SubmitBut;

    @FindBy(css = "button.button:nth-child(4)")
    private WebElement ProceedBox;

    @FindBy(css="#cgv")
    private WebElement CheckBox;

    @FindBy(css="#button.button:nth-child(4)")
    private WebElement Proceed2;

    @FindBy(css=".cheque > span:nth-child(1)")
    private WebElement PayCheck;

    @FindBy(css="button.button-medium")
    private WebElement ConfirmOrder;

    public void Checkout1(String A) {CheckoutBox.sendKeys(A);}
    public void InputEmail(String B) { EmailBox.sendKeys(B); }
    public void InputPass(String B) { PassBox.sendKeys(B); }
    public void ClickSubmit() {SubmitBut.click(); }
    public void ClickProceed() {ProceedBox.click(); }
    public void ClickCheck() {CheckBox.click(); }
    public void ClickProceed1() {Proceed2.click(); }
    public void ClickChecque() {PayCheck.click(); }
    public void ClickConfirm() {ConfirmOrder.click(); }
}
