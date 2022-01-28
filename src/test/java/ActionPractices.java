import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ActionPractices {
    WebDriver driver;

    @Test
    public void hoverOverTest() {
        driver = WebDriverFactory.getDriver("Chrome");

        driver.get("http://practice.cybertekschool.com/hovers");
        Actions actions = new Actions(driver);


        WebElement img1 = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/img"));
        WebElement img2 = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/img"));
        WebElement img3 = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[3]/img"));

        WebElement text1 = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/div/h5"));
        WebElement text2 = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/h5"));
        WebElement text3 = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[3]/div/h5"));

        actions.moveToElement(img1).perform();
        Assert.assertTrue(text1.isDisplayed(), "Text 1");
        actions.moveToElement(img2).perform();
        Assert.assertTrue(text2.isDisplayed(), "Text 2");
        actions.moveToElement(img3).perform();
        Assert.assertTrue(text3.isDisplayed(), "Text 3");


    }
}
