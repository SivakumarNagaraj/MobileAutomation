package Generic_Utilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class BrowserBaseclass {
    protected AndroidDriver driver;

    @BeforeMethod
    public void launch() throws MalformedURLException, InterruptedException {

        UiAutomator2Options options = new UiAutomator2Options();
        options.setChromedriverExecutable("/Users/sivakumar/Downloads/chromedriver-mac-x64");
        options.setDeviceName("emulator-5554");
        options.setCapability("browserName","Chrome");
        options.setCapability("appWaitActivity", "io.appium.android.apis.ApiDemos");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @AfterMethod
    public void close(){
        driver.quit();

    }
}
