package Generic_Utilities;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.JavascriptExecutor;

public class Scroll {
    public void scroll(AppiumDriver driver, String text){
        driver.findElement(AppiumBy.androidUIAutomator(
         "new UiScrollable(new UiSelector()).scrollIntoView(text(\""+text+"\"));"));
    }
    public void scroll(AndroidDriver driver){
        // Java
        boolean canScrollMore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture",
                ImmutableMap.of(
                "left", 100, "top", 100, "width", 200, "height", 200,
                "direction", "down",
                "percent", 10.0
        ));
    }
}
