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

    @Test
    public void tableTestCSSCW() {
        //WebElement canada = wd.findElement(By.cssSelector("#customers tr:nth-child(8) td:last-child"));
        WebElement canada = wd.findElement(By.xpath("//table[@id='customers']//tr[8]/td[last()]")); //"td[text()='Canada']"
        String text = canada.getText();
        System.out.println(text);
        //Assert.assertEquals(text,"Canada");
    }


     @Test
    public void tableHW() {
        // get row 4 content
        //WebElement company = wd.findElement(By.cssSelector("table#customers tr th:first-child"));
        WebElement company = wd.findElement(By.xpath("//th[text()='Company']"));
        String text = company.getText();
        //Assert.assertEquals(text, "Company");
            System.out.println(text);

        //WebElement contact = wd.findElement(By.cssSelector("table#customers tr th:nth-child(2)"));
        WebElement contact = wd.findElement(By.xpath("//th[2][text()='Contact']")); //"//table[@='customers']//tr[4]"));
            System.out.println(contact.getText());
        //Assert.assertEquals(text2, "Contact");

        //WebElement helenBennett = wd.findElement(By.cssSelector("table#customers tr:nth-child(5) td:nth-child(2)"));
        WebElement helenBennett = wd.findElement(By.xpath("//td[contains(.,'Helen')]"));
             System.out.println(helenBennett.getText());
        //Assert.assertEquals(text3,"Helen Bennett");

        // check if there is text "Mexico" there
        //String mexicoText = wd.findElement(By.cssSelector("table#customers tr:nth-child(4) td:last-child")).getText();
        String mexicoText = wd.findElement(By.xpath("//tr[4]/td[3]")).getText();
        Assert.assertEquals(mexicoText, "Mexico");
        Assert.assertTrue(mexicoText.contains("Mexico"));
        wd.quit();
    }
    @Test

    public void tableHW2() {
        // print amount of table rows
        //List<WebElement> listRows = wd.findElements(By.cssSelector("#customers tr"));
        List<WebElement> listRows = wd.findElements(By.xpath("//table[@id='customers']//tr"));
        //body[1]/div[7]/div[1]/div[1]/table[1]/tbody[1]/tr
        System.out.println(listRows.size());

        // print amount of table cols
       // List<WebElement> listCols = wd.findElements(By.cssSelector("#customers tr th"));
        List<WebElement> listCols = wd.findElements(By.xpath("//table[@id='customers']//td[3]"));
        System.out.println(listCols.size());
    }

    @Test
    public void contentTable() {

        // print content of row3
        //List<WebElement> row3 = wd.findElements(By.cssSelector("table#customers tr:nth-child(4) td"));
        List<WebElement> row3 = wd.findElements(By.xpath("//tr[4]//td"));
        //"table[@id='customers']"//tr[4]//td"
        String text_td = " ";
        for (WebElement element : row3) {
            System.out.println(element.getText());
            //check contents:
            text_td = element.getText();
            if (text_td.contains("Mexico"))
                System.out.println("true");

        }
        System.out.println(text_td.contains("Mexico"));

        // print content of last col
        //List<WebElement> lastCol = wd.findElements(By.cssSelector("table#customers td:last-child"));
        List<WebElement> lastCol = wd.findElements(By.xpath("//td[3]"));
        for (WebElement e : lastCol) {
            System.out.println(e.getText());

        }
    }

//****************************************************************

    @Test
    public void rowIndex() {
        // print number of row with name "Philip Cramer"
        //List<WebElement> row7 = wd.findElements(By.cssSelector("#customers tr"));
        List<WebElement> row7 = wd.findElements(By.xpath("//*[@id='customers']//tr"));

        int i = 0;
        for (; i < row7.size(); i++) {

            if (row7.get(i).getText().contains("Philip Cramer")) {
                System.out.println(i + 1);
                break;
            }
        }
        System.out.println("row:"+ i);
        wd.quit();
    }


    @AfterMethod
    public void tearDown() {
        wd.quit();
    }

}
