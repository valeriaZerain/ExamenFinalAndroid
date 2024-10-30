package basic;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class AddContactTest {
    AppiumDriver driver;
    @BeforeEach
    public void openApp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("appium:deviceName","Pixel7V13");
        capabilities.setCapability("appium:platformVersion","13.0");
        capabilities.setCapability("appium:appPackage","com.google.android.contacts");
        capabilities.setCapability("appium:appActivity","com.android.contacts.activities.PeopleActivity");
        capabilities.setCapability("appium:platformName","Android");
        capabilities.setCapability("appium:automationName","uiautomator2");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/"),capabilities);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }
    @AfterEach
    public void closeApp(){
        driver.quit();
    }

    @Test
    public void addContact() throws InterruptedException {
        String firstName = "Val";
        String lastName = "Zerain";
        String fullName = firstName + " " + lastName;
        String phone = "(666) 444-321";
        driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"android:id/button2\"]")).click();
        driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Create contact\"]")).click();
        driver.findElement(By.xpath("//android.widget.EditText[@text=\"First name\"]")).sendKeys(firstName);
        driver.findElement(By.xpath("//android.widget.EditText[@text=\"Last name\"]")).sendKeys(lastName);
        driver.findElement(By.xpath("//android.widget.EditText[@text=\"Phone\"]")).sendKeys(phone);
        driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"com.google.android.contacts:id/toolbar_button\"]")).click();
        Thread.sleep(10000);
        String actualFullname = driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.google.android.contacts:id/large_title\"]")).getText();
        String actualPhone = driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.google.android.contacts:id/header\"]")).getText();
        Assertions.assertEquals(fullName, actualFullname);
        Assertions.assertEquals(phone, actualPhone);
    }
}
