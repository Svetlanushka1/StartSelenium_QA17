import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.List;

public class StartSelenium {
    WebDriver wd;

    @BeforeMethod
    public void preCondition() {
        wd = new ChromeDriver();
        wd.get("https://telranedu.web.app/home");
        wd.navigate().forward();
        wd.navigate().refresh();

    }
   /* @Test
    public void testNameCW(){
        WebElement element = wd.findElement(By.tagName("a"));
        List<WebElement> Elements = wd.findElements(By.tagName("div"));
        System.out.println(Elements.size());
        wd.findElement(By.id("root"));
        wd.findElement(By.linkText("HOME"));
        wd.findElement(By.partialLinkText("HO"));
        System.out.println();
        WebElement div = wd.findElement(By.tagName("div"));
        wd.quit();
    }
        @Test
    public void byCssHW3(){
        wd.get("https://telranedu.web.app/login");
        List<WebElement> listA = wd.findElements(By.tagName("a"));
            System.out.println(listA.size());

        wd.findElement(By.className("login_login__3EHKB"));
        //wd.findElement(By.linkText("email"));
        //wd.findElement(By.partialLinkText("em"));
        //wd.findElement(By.id("root"));

        WebElement homeTab = wd.findElement(By.cssSelector("[href='/home']"));
            System.out.println("homeTab");
        WebElement loginTab = wd.findElement(By.cssSelector(".active"));
            System.out.println("loginTab");
        WebElement emailField = wd.findElement(By.cssSelector("input[placeholder='Email']"));
            System.out.println("emailField");
        WebElement passwordField = wd.findElement(By.cssSelector("input[placeholder='Password']"));
            System.out.println("passwordField");
        WebElement loginButton = wd.findElement(By.cssSelector("button[name='login']"));
            System.out.println("loginButton");
        WebElement registrationButton = wd.findElement(By.cssSelector("button[name='registration']"));
            System.out.println("registrationButton");
            wd.quit();

    }*/
    @Test
    public void newStrategy() {
        WebElement element = wd.findElement(By.tagName("a"));
        wd.findElement(By.cssSelector("div a:nth-child(3)"));


        List<WebElement> elements = wd.findElements(By.tagName("div"));
        wd.findElement(By.cssSelector("div a:nth-child(3)"));

        wd.findElement(By.linkText("HOME"));
        //wd.findElement(By.cssSelector("[href='/about']"));


        wd.findElement(By.id("root"));
        wd.findElement(By.cssSelector("#root"));

        wd.findElement(By.partialLinkText("AB"));
        wd.findElement(By.cssSelector("[href^='/ab']"));
        wd.findElement(By.cssSelector("[href*='ou']"));
        wd.findElement(By.cssSelector("[href$='out']"));

        List<WebElement> buttons = wd.findElements(By.tagName("button"));
    }

    @AfterMethod
    public void postCondition(){
        wd.quit();

    }
}

