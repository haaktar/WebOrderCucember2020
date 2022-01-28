import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class UploadPractice {

    WebDriver driver;

    @Test
    public void uploadFile() {

        driver = WebDriverFactory.getDriver("Chrome");
        driver.get("http://practice.cybertekschool.com/upload");
        driver.manage().window().maximize();

        String path = "/Users/hakan/Downloads/Evde Kimse Yok - Ahmet Büke ( PDFDrive ) (1).pdf";
        WebElement uploadInput = driver.findElement(By.id("file-upload"));
        uploadInput.sendKeys(path);

        WebElement uploadButton = driver.findElement(By.id("file-submit"));
        uploadButton.click();


    }
}
