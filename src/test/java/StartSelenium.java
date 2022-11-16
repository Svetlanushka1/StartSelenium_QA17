import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class StartSelenium {
    WebDriver wd;

    @BeforeMethod
    public void preCondition() {
        wd = new ChromeDriver();
        wd.get("https://telranedu.web.app/home");

    }
    @Test
    public void testName(){
        System.out.println("Test starts");

    }
    @AfterMethod
    public void postCondition(){
        //wd.quit();

    }
}
