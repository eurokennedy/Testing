package Shopping;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
    @FindBy(css = "#search_query_top")
    private WebElement SearchBox;

    @FindBy(css = "#.shopping_cart > a:nth-child(1) > b:nth-child(1)")
    private WebElement ShoppingCart;

    @FindBy(css = "#contact-link > a:nth-child(1)")
    private WebElement ContactUs;

    @FindBy(css = "#.login")
    private WebElement LoginButton;

    public void Search(String A){
        SearchBox.sendKeys(A);
    }
    public void GoCart(String B) { ShoppingCart.sendKeys(B); }
    public void ContactUs() { ContactUs.click(); }
    public void ClickLogin() {LoginButton.click(); }
}
