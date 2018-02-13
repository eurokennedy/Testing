import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import org.junit.Test;
public class LoginTest {
    private static WebDriver webDriver;
    private static final String BASE_URL = "http://thedemosite.co.uk/";
    @BeforeClass
    public static void setUp() {
        webDriver = new ChromeDriver();
        webDriver.navigate().to(BASE_URL);
    }
    @Test
    public void Internet(){
        try {
            TimeUnit.MILLISECONDS.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement CreateUserButton = webDriver.findElement(By.cssSelector("body > div:nth-child(1) > center:nth-child(1) > table:nth-child(6) > tbody:nth-child(1) > tr:nth-child(2) > td:nth-child(1) > div:nth-child(2) > center:nth-child(1) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(2) > p:nth-child(1) > small:nth-child(1) > a:nth-child(6)"));
        CreateUserButton.click();
        WebElement addUser = webDriver.findElement(By.cssSelector(".auto-style1 > form:nth-child(6) > div:nth-child(1) > center:nth-child(1) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(1) > div:nth-child(1) > center:nth-child(1) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(2) > p:nth-child(1) > input:nth-child(1)"));
        addUser.sendKeys("THE SHAFEEQ");
        WebElement addPass = webDriver.findElement(By.cssSelector(".auto-style1 > form:nth-child(6) > div:nth-child(1) > center:nth-child(1) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(1) > div:nth-child(1) > center:nth-child(1) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(2) > td:nth-child(2) > p:nth-child(1) > input:nth-child(1)"));
        addPass.sendKeys("Passw");
        WebElement SaveButton = webDriver.findElement(By.cssSelector(".auto-style1 > form:nth-child(6) > div:nth-child(1) > center:nth-child(1) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(1) > div:nth-child(1) > center:nth-child(1) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(3) > td:nth-child(2) > p:nth-child(1) > input:nth-child(1)"));
        SaveButton.click();
        WebElement LogButton = webDriver.findElement(By.cssSelector("body > div:nth-child(1) > center:nth-child(1) > table:nth-child(6) > tbody:nth-child(1) > tr:nth-child(2) > td:nth-child(1) > div:nth-child(2) > center:nth-child(1) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(2) > p:nth-child(1) > small:nth-child(1) > a:nth-child(7)"));
        LogButton.click();
        WebElement User = webDriver.findElement(By.cssSelector(".auto-style1 > form:nth-child(8) > div:nth-child(1) > center:nth-child(1) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(1) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(2) > p:nth-child(1) > input:nth-child(1)"));
        User.sendKeys("THE SHAFEEQ");
        WebElement Pass = webDriver.findElement(By.cssSelector(".auto-style1 > form:nth-child(8) > div:nth-child(1) > center:nth-child(1) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(1) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(2) > td:nth-child(2) > p:nth-child(1) > input:nth-child(1)"));
        Pass.sendKeys("Passw");
        WebElement TestButton = webDriver.findElement(By.cssSelector(".auto-style1 > form:nth-child(8) > div:nth-child(1) > center:nth-child(1) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(1) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(3) > td:nth-child(2) > p:nth-child(1) > input:nth-child(1)"));
        TestButton.click();
        WebElement joy = webDriver.findElement(By.cssSelector("<b>**Successful Login**</b>"));
        WebElement sad = webDriver.findElement(By.cssSelector("<b>**Successful Login**</b>"));
        Assert.assertEquals("Success", "<b>**Successful Login**</b>",joy.getText());
        Assert.assertEquals("Failed", "<b>**Failed Login**</b>", sad.getText());

    }
    @After
    public void cleanUp() {
        webDriver.close();
        webDriver.quit();
    }


}


