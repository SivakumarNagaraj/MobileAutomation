package Practice_Scripts;

import Generic_Utilities.Base_class;
import Generic_Utilities.Scroll;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.testng.annotations.Test;

import java.time.Duration;

public class loginApp extends Base_class {
    @Test
    public void login() throws InterruptedException {

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"standard_user\"]")).click();
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"LOGIN\"]")).click();

//         driver.findElement(AppiumBy.androidUIAutomator(
//         "new UiScrollable(new UiSelector()).scrollIntoView(text(\"Terms of Service | Privacy Policy\"));"));

        Scroll sc = new Scroll();
        sc.scroll(driver,"Terms of Service | Privacy Policy");
        System.out.println("Pass");


        Thread.sleep(5000);
    }
}
