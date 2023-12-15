package Generic_Utilities;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.remote.RemoteWebElement;

import java.time.Duration;

public class Swipe {

    public void swipeIntoElement(AppiumDriver driver, int startX, int startY, int endX, int endY){


        PointerInput input = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence swipe = new Sequence(input, 0);
        swipe.addAction(input.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), startX, startY));
        swipe.addAction(input.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        swipe.addAction(input.createPointerMove(Duration.ofMillis(500), PointerInput.Origin.viewport(), endX, endY));
        swipe.addAction(input.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(ImmutableList.of(swipe));
    }

    public void swipeIntoElement(AndroidDriver driver, WebElement element,String direction){
        driver.executeScript("gesture: swipe", ImmutableMap.of(
                "elementId", ((RemoteWebElement)element).getId(),
                "percentage", 50,
                "direction", direction
        ));
    }
    public void swipeIntoElement(AndroidDriver driver, String gesture,WebElement element,String direction){
        driver.executeScript("gesture: "+gesture, ImmutableMap.of(
                "elementId", ((RemoteWebElement)element).getId(),
                "percentage", 50,
                "direction", direction
        ));
    }
    public void swipeIntoElement(AndroidDriver driver, WebElement element) {

        driver.executeScript("mobile: swipeGesture", ImmutableMap.of(
                "elementId", ((RemoteWebElement)element).getId(),
                "direction", "left",
                "percent", 0.75
        ));
    }


}
