package Shopping;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DressPage {
    @FindBy (css = "button.exclusive")
    private WebElement AddCart;

    @FindBy (css = "a.btn:nth-child(2) > span:nth-child(1)")
    private WebElement Proceed;

    @FindBy (css = "button.exclusive")
    private WebElement Wish;
    @FindBy (css = ".fancybox-item")
    private WebElement CloseWish;

    public void ClickAdd() {AddCart.click(); }
    public void ClickProceed() {Proceed.click(); }
    public void ClickWish() {Wish.click(); }
    public void ClickClose() {CloseWish.click(); }
}
