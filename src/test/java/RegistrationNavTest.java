import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class RegistrationNavTest extends BaseTest {

    @Test
    public void registrationNavigation() throws InterruptedException {

        ChromeOptions optionVal = new ChromeOptions();
        optionVal.addArguments("--remote-allow-origins=*");
        WebDriver driverMine = new ChromeDriver(optionVal);
        driverMine.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driverMine.get(urlHome);
        Thread.sleep(5000);

        WebElement registrationLink = driverMine.findElement(By.xpath("//form//a[contains(text(),'Registration')]"));

        registrationLink.click();
        Thread.sleep(5000);

        Assert.assertEquals(driverMine.getCurrentUrl(),"https://qa.koel.app/registration");

        driverMine.quit();

    }




}
