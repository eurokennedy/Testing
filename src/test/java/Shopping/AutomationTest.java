package Shopping;

import org.junit.*;
import DemoTesting.ScreenShot;
import DemoTesting.SpreadSheetReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

public class AutomationTest {
    private static WebDriver webDriver;
    private static final String BASE_URL = "http://automationpractice.com/index.php";
    ContactPage Contactpage = PageFactory.initElements(webDriver, ContactPage.class);
    DressPage Dresspage = PageFactory.initElements(webDriver, DressPage.class);
    HomePage Homepage = PageFactory.initElements(webDriver, HomePage.class);
    LoginPage Loginpage = PageFactory.initElements(webDriver, LoginPage.class);
    PaymentPage Paymentpage = PageFactory.initElements(webDriver, PaymentPage.class);
    SearchPage Searchpage = PageFactory.initElements(webDriver, SearchPage.class);

    @BeforeClass
    public static void setUp() {

        webDriver = new ChromeDriver();
        webDriver.navigate().to(BASE_URL);
    }

    @Before
    public void ReSet() {

        webDriver.navigate().to(BASE_URL);
    }

    @Test
        public void Loggingin() {
            try {
                TimeUnit.MILLISECONDS.sleep(20000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Homepage.ClickLogin();
            Loginpage.InputUser("sam.henderson991@gmail.com");
            Loginpage.InputPass("Hound");
            Loginpage.ClickLogin();
        try {
            ScreenShot.take(webDriver, "sup3");
        } catch (Exception e) {
            e.printStackTrace();
        }
        }
    @Test
    public void SearchnAdd() {
        try {
            TimeUnit.MILLISECONDS.sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();

        }
        Homepage.Search("dress");
        Searchpage.ClickDress();
        Dresspage.ClickAdd();
        Dresspage.ClickProceed();
        try {
            ScreenShot.take(webDriver, "sup2");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void CustomerMessage() {
        try {
            TimeUnit.MILLISECONDS.sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();

        }
        Homepage.ContactUs();
        Contactpage.Subjecthead("C");
        Contactpage.Emailadd("sam.henderson991@gmail.com");
        Contactpage.Orderref("ZIM");
        Contactpage.MessageBox("AHHHHHH!!!");
        Contactpage.ClickSend();
        try {
            ScreenShot.take(webDriver, "sup1");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    @Test
    public void WishList() {
        try {
            TimeUnit.MILLISECONDS.sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Homepage.Search("dress");
        Searchpage.ClickDress();
        Dresspage.ClickWish();
        try {
            ScreenShot.take(webDriver, "sup");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @After

    public void Take() {
        try {
            ScreenShot.take(webDriver, "supaa");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @AfterClass
        public static void Close(){
        webDriver.close();
        webDriver.quit();
    }
}
