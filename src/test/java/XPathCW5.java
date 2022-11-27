import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class XPathCW5 {
    WebDriver wd;

    @BeforeMethod
    public void preCondition() {
        wd = new ChromeDriver();
        wd.get("https://telranedu.web.app/home");
        wd.navigate().forward();
        wd.navigate().refresh();

    }
    @Test
    public void xPathCW5(){
        System.out.println("test started");
        //tagName:
        WebElement element = wd.findElement(By.tagName("a"));
        wd.findElement(By.cssSelector("a"));
        wd.findElement(By.xpath("//a"));
        //List<WebElement> elements = wd.findElements(By.tagName("div"));
        // System.out.println(elements.size());

        //ID:
        wd.findElement(By.id("root"));
        wd.findElement(By.cssSelector("#root"));
        wd.findElement(By.xpath("//*[@id='root']"));

        // login:
        wd.findElement(By.cssSelector("[href='/login']"));
        wd.findElement(By.xpath("//*[@href='/login']"));

        //start-with:
        wd.findElement(By.cssSelector("[href^='/lo']"));
        wd.findElement(By.xpath("//*[starts-with(@href,'/lo')]"));

        //contains
        wd.findElement(By.cssSelector("[href*='og']"));
        wd.findElement(By.xpath("//*[contains(@href,'og'])"));
        // end
        wd.findElement(By.cssSelector("[href$='gin']"));
        //no xpath

        // text
        wd.findElement(By.linkText("HOME"));
        wd.findElement(By.xpath("//*[text('HOME'])"));
        wd.findElement(By.xpath("//*[.='HOME']"));

        wd.findElement(By.partialLinkText("HO"));
        List<WebElement> buttons = wd.findElements(By.tagName("button"));
        //input[@placeholder='Email']
        //div[@class='login_login__3EHKB']/input[@placeholder='Email']
    }
    @AfterMethod
    public void postCondition(){
        wd.quit();

    }
}
