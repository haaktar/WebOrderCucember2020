import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UploadPractice {

    WebDriver driver;

    public void uploadFile() {

        driver = WebDriverFactory.getDriver("Chrome");
        driver.get("http://practice.cybertekschool.com/upload");
        driver.manage().window().maximize();

        String path = "/Users/hakan/Downloads/Evde Kimse Yok - Ahmet Büke ( PDFDrive ) (1).pdf";
        WebElement uploadInput = driver.findElement(By.id("file-upload"));

        uploadInput.sendKeys(path);


    }
}
