import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DemoAddPage {
    @FindBy(css =".auto-style1 > form:nth-child(6) > div:nth-child(1) > center:nth-child(1) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(1) > div:nth-child(1) > center:nth-child(1) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(2) > p:nth-child(1) > input:nth-child(1)")
    private WebElement UserCrBox;
    @FindBy(css =".auto-style1 > form:nth-child(6) > div:nth-child(1) > center:nth-child(1) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(1) > div:nth-child(1) > center:nth-child(1) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(2) > td:nth-child(2) > p:nth-child(1) > input:nth-child(1)")
    private WebElement PWCrBox;
    @FindBy(css =".auto-style1 > form:nth-child(6) > div:nth-child(1) > center:nth-child(1) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(1) > div:nth-child(1) > center:nth-child(1) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(3) > td:nth-child(2) > p:nth-child(1) > input:nth-child(1)")
    private WebElement SaveBut;

    public void CreateUser(String A){
       UserCrBox.sendKeys(A);
    }
    public void CreatePW(String B) {
        PWCrBox.sendKeys(B);
    }
    public void ClickSave() {
        SaveBut.click();
    }
}
