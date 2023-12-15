package Generic_Utilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class Base_class {
    protected AppiumDriver driver;
    @BeforeMethod
    public void LaunchApp() throws MalformedURLException {

        //Start Server
//        AppiumDriverLocalService service = new AppiumServiceBuilder().withAppiumJS(new File("//usr//local//lib//node_modules//appium//lib//main.js"))
//                .withIPAddress("127.0.0.1").usingPort(4723).build();
//        service.start();
//        Thread.sleep(3000);
        // Set Desire capabilities
        Syncroniozation sync = new Syncroniozation();
        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("emulator-5554");
        options.setApp("//Users//sivakumar//IdeaProjects//TestVagrant_Appium//src//test//java//Resource//sample_app.apk");
        options.setCapability("appWaitActivity", "com.swaglabsmobileapp.MainActivity");
         driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
         sync.implicitlyWait(driver,10);
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }
    @AfterMethod
    public void CloseApp(){

        driver.quit();
    }
}
