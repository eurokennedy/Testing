package Shopping;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactPage {
    @FindBy(css = "#id_contact")
    private WebElement SubjectHead;

    @FindBy(css = "#email")
    private WebElement EmailAdd;

    @FindBy(css = "#id_order")
    private WebElement OrderRef;

    @FindBy(css = "#message")
    private WebElement MessageBox;

    @FindBy(css = "#submitMessage")
    private WebElement SendBut;

    public void Subjecthead(String A){
        SubjectHead.sendKeys(A);
    }
    public void Emailadd(String B) { EmailAdd.sendKeys(B); }
    public void Orderref(String B) { OrderRef.sendKeys(B); }
    public void MessageBox(String B) { MessageBox.sendKeys(B); }
    public void ClickSend() {SendBut.click(); }
}
