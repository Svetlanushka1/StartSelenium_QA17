import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.sql.SQLOutput;
import java.util.List;

public class TableTest {

    WebDriver wd;


    @BeforeMethod
    public void init() {
        wd = new ChromeDriver();
        wd.navigate().to("https://www.w3schools.com/css/css_table.asp");
    }


    /* @Test
     public void tableTestCSSCW(){
         WebElement canada = wd.findElement(By.cssSelector("#customers tr:nth-child(8) td:last-child"));
         String text = canada.getText();
         System.out.println(text);
         Assert.assertEquals(text,"Canada");
     }
     */

    @Test
    public void tableHW() {
        // get row 4 content
        WebElement company = wd.findElement(By.cssSelector("table#customers tr th:first-child"));
        String text = company.getText();
        Assert.assertEquals(text, "Company");
        System.out.println(text);

        WebElement contact = wd.findElement(By.cssSelector("table#customers tr th:nth-child(2)"));
        String text2 = contact.getText();
        Assert.assertEquals(text2, "Contact");

        WebElement helenBennett = wd.findElement(By.cssSelector("table#customers tr:nth-child(5) td:nth-child(2)"));
        String text3 = helenBennett.getText();
        //Assert.assertEquals(text3,"Helen Bennett");

        // check if there is text "Mexico" there
        //WebElement mexico = wd.findElement(By.cssSelector("table#customers tr:nth-child(4) td:last-child"));
        String mexicoText = wd.findElement(By.cssSelector("table#customers tr:nth-child(4) td:last-child")).getText();
        Assert.assertEquals(mexicoText, "Mexico");
        Assert.assertTrue(mexicoText.contains("Mexico"));
        wd.quit();
    }

    @Test
    public void tableHW2() {
        // print amount of table rows
        List<WebElement> tableRows = wd.findElements(By.cssSelector("#customers tr"));
        System.out.println(tableRows.size());

        // print amount of table cols
        List<WebElement> tableCols = wd.findElements(By.cssSelector("#customers tr th"));
        System.out.println(tableCols.size());

        // print content of row3
        //System.out.println(tableCols.get(6).get(7).get(8));

        // print content of last col
        //List<WebElement> customersList = wd.findElements(By.cssSelector("#customers td"));


        // print number of row with name "Philip Cramer"
        String contact7 = wd.findElement(By.cssSelector("#customers tr:nth-child(7) td:nth-child(2)")).getText();
        Assert.assertTrue(contact7.contains("Philip Cramer"));


    }

    @AfterMethod
    public void tearDown() {
        wd.quit();
    }

}
