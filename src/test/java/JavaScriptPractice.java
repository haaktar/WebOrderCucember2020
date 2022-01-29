import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class JavaScriptPractice {

    WebDriver driver;

    @Test
    public void javaScriptExecutor() {
        driver = WebDriverFactory.getDriver("Chrome");
        driver.get("http://practice.cybertekschool.com/infinite_scroll");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,10200)");


    }
}
