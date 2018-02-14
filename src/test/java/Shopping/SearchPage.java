package Shopping;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage {
    @FindBy(css = "#search_query_top")
    private WebElement SearchBox;

    @FindBy(css = ".shopping_cart > a:nth-child(1) > b:nth-child(1)")
    private WebElement ShoppingCart;

    @FindBy(css = "li.ajax_block_product:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > a:nth-child(1) > img:nth-child(1)")
    private WebElement Dress;

    @FindBy(css = "#.login")
    private WebElement LoginButton;

    public void InputSearch(String A){SearchBox.sendKeys(A);}
    public void GoCart(String B) { ShoppingCart.sendKeys(B); }
    public void ClickDress() { Dress.click(); }
    public void ClickLogin() {LoginButton.click(); }
}
