package Practice_Scripts;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.openqa.selenium.DeviceRotation;
import org.testng.annotations.Test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class Launch_App {
    @Test
    public void launch() throws MalformedURLException, InterruptedException {
        //Start Server
//        AppiumDriverLocalService service = new AppiumServiceBuilder().withAppiumJS(new File("//usr//local//lib//node_modules//appium//lib//main.js"))
//                .withIPAddress("127.0.0.1").usingPort(4723).build();
//        service.start();
//        Thread.sleep(3000);
        // Set Desire capabilities
        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("emulator-5554");
        options.setApp("//Users//sivakumar//IdeaProjects//TestVagrant_Appium//src//test//java//Resource//sample_app.apk");
        options.setCapability("appWaitActivity","com.swaglabsmobileapp.MainActivity");
        //options.setCapability("appWaitActivity","com.flipkart.android.activity.FirstLaunchActivity");

        AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
//        Thread.sleep(3000);
//        DeviceRotation landscape = new DeviceRotation(0, 0, 90);
        Thread.sleep(5000);

        driver.executeScript("mobile: startActivity", ImmutableMap.of("intent","com.flipkart.android/.activity.HomeFragmentHolderActivity"));
       // driver.rotate(landscape);
        Thread.sleep(3000);
//        driver.quit();

//        service.stop();
    }
}
