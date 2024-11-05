package factoryDevices;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class Android implements IDevice{

    @Override
    public AppiumDriver create() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("appium:deviceName","Pixel7V13");
        capabilities.setCapability("appium:platformVersion","13.0");
        //whendo
//        capabilities.setCapability("appium:appPackage","com.vrproductiveapps.whendo");
//        capabilities.setCapability("appium:appActivity","com.vrproductiveapps.whendo.ui.HomeActivity");
        //alarm
        capabilities.setCapability("appium:appPackage","com.google.android.deskclock");
        capabilities.setCapability("appium:appActivity","com.android.deskclock.DeskClock");
        //youtube
//        capabilities.setCapability("appium:appPackage","com.google.android.youtube");
//        capabilities.setCapability("appium:appActivity","com.google.android.apps.youtube.app.WatchWhileActivity");
        capabilities.setCapability("appium:platformName","Android");
        capabilities.setCapability("appium:automationName","uiautomator2");
        AppiumDriver driver = null;
        try {
            driver = new AndroidDriver(new URL("http://127.0.0.1:4723/"), capabilities);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        return driver;
    }
}
