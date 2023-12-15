package Generic_Utilities;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

public class DragAndDrop {
    public void dragAndDrop(AndroidDriver driver, WebElement element, int endx, int endy) throws InterruptedException {
        driver.executeScript("mobile: dragGesture", ImmutableMap.of(
                "elementId", ((RemoteWebElement) element).getId(),
                "endX", endx,
                "endY", endy
        ));
    }
}
