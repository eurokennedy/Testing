import com.aventstack.extentreports.ExtentReports;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

public class DemoTest {
    private static WebDriver webDriver;
    private static final String BASE_URL = "http://thedemosite.co.uk/";
    DemoHomePage HomePage = PageFactory.initElements(webDriver, DemoHomePage.class);
    DemoAddPage AddPage = PageFactory.initElements(webDriver, DemoAddPage.class);
    DemoLoginPage LogPage = PageFactory.initElements(webDriver, DemoLoginPage.class);


    @BeforeClass
    public static void setUp() {

        webDriver = new ChromeDriver();
        webDriver.navigate().to(BASE_URL);
    }

    @Before
    public void Before(){
        SpreadSheetReader spreadSheetReader= new SpreadSheetReader("testdata");
    }

    @Test

    public void Internet() {
        try {
            TimeUnit.MILLISECONDS.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();

        }
        HomePage.ClickAdd();
        AddPage.CreateUser("Not Declan");
        AddPage.CreatePW("Suppiti");
        AddPage.ClickSave();
        HomePage.ClickLogin();
        LogPage.EnterUser("Not Declan");
        LogPage.EnterPW("Suppiti");
        LogPage.ClickSave();
    }

    @After
    public void Screen() {
        try {
            ScreenShot.take(webDriver, "sup");
        } catch (Exception e) {
            e.printStackTrace();
        }

        webDriver.close();
        webDriver.quit();

    }

}

