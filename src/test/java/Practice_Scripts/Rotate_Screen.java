package Practice_Scripts;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;




public class Rotate_Screen {

    @Test
    public <Rotatable> void rotate() throws InterruptedException, MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("Pixel 7 API 30");
        options.setApp("//Users//sivakumar//IdeaProjects//TestVagrant_Appium//src//test//java//Resource//flipkart.apk");
        options.setCapability("appWaitActivity", "com.flipkart.android.activity.FirstLaunchActivity");
        AppiumDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);

        Thread.sleep(3000);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //  wait.until(ExpectedConditions.);
        driver.findElement(AppiumBy.xpath("//android.widget." +
                "TextView[@resource-id=\"com.flipkart.android:id/custom_back_icon\"]")).click();
        Thread.sleep(20000);
        driver.findElement(AppiumBy.xpath("(//android.widget.FrameLayout" +
                "[@resource-id=\"com.flipkart.android:id/main_content\"])" +
                "[2]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]" +
                "/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.ImageView")).click();


        Thread.sleep(5000);


    }
}
