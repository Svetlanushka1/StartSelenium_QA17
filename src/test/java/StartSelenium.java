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
        wd.get("https://telranedu.web.app/login");
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
       /* //WebElement element = wd.findElement(By.tagName("a"));
        WebElement element = wd.findElement(By.xpath("//a"));

        //wd.findElement(By.cssSelector("div a:nth-child(3)"));
        wd.findElement(By.xpath("//body"));

        //List<WebElement> elementsDiv = wd.findElements(By.tagName("div"));
        List<WebElement> elementsDiv = wd.findElements(By.xpath("//div"));*/

        //WebElement tabHOME = wd.findElement(By.linkText("HOME"));
        WebElement tabHOME = wd.findElement(By.xpath("(//a[text()='HOME'])"));
        System.out.println(tabHOME.getText());

      /*  //wd.findElement(By.id("root"));
        //wd.findElement(By.cssSelector("#root"));
        wd.findElement(By.xpath("//*[@id ='root']"));

        wd.findElement(By.partialLinkText("lo"));
        wd.findElement(By.cssSelector("[href^='/ab']"));
        wd.findElement(By.xpath("//*[starts-with(@href,'/lo')]"));


        wd.findElement(By.cssSelector("[href*='og']"));
        wd.findElement(By.xpath("//*[contains(@href,'og'])"));

        wd.findElement(By.cssSelector("[href$='gin']"));*/

        List<WebElement> buttons = wd.findElements(By.tagName("button"));
        WebElement loginBtn = wd.findElement(By.xpath("//button[@name='login']"));
             System.out.println(loginBtn.getText());
        WebElement registrationBtn = wd.findElement(By.xpath("//button[@name='registration']"));
            System.out.println(registrationBtn.getText());
    }

    @AfterMethod
    public void postCondition(){
        wd.quit();

    }
}

