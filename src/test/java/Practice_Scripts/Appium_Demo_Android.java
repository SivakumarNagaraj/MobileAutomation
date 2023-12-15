package Practice_Scripts;

import Generic_Utilities.*;
import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Appium_Demo_Android extends Baseclass_Demo {

    @Test
    public void click() throws InterruptedException {
        WebElement ele = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"Views\"]"));
        ele.click();
        Thread.sleep(5000);
    }

    @Test
    public void dragAndDrop() throws InterruptedException {
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"Views\"]")).click();
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"Drag and Drop\"]")).click();
        WebElement source = driver.findElement(AppiumBy.xpath("//android.view.View[@resource-id=\"io.appium.android.apis:id/drag_dot_1\"]"));
        new DragAndDrop().dragAndDrop(driver,source,651,663);
        Thread.sleep(5000);
    }
    @Test
    public void swipe() throws InterruptedException {
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"Views\"]")).click();
        driver.findElement(AppiumBy.accessibilityId("Gallery")).click();
        driver.findElement(AppiumBy.accessibilityId("1. Photos")).click();
        WebElement element = driver.findElement(AppiumBy.xpath("//android.widget.Gallery[@resource-id=\"io.appium.android.apis:id/gallery\"]/android.widget.ImageView[1]"));
        new Swipe().swipeIntoElement(driver,element);
        Thread.sleep(5000);

    }
    @Test
    public void scroll() throws InterruptedException {
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"Views\"]")).click();
        new Scroll().scroll(driver,"WebView3");
        Thread.sleep(5000);

    }
    @Test
    public void longclick() throws InterruptedException {
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"Views\"]")).click();
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"Expandable Lists\"]")).click();
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"1. Custom Adapter\"]")).click();
        WebElement element = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"People Names\"]"));
        new LongPress().longPressOnElement(driver, element);
        Thread.sleep(5000);
    }
    @Test
    public void actions() throws InterruptedException {
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"Views\"]")).click();
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"Expandable Lists\"]")).click();
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"1. Custom Adapter\"]")).click();
        Android_Gesture gesture = new Android_Gesture();
        gesture.rotate(driver,0,0,90);
        Thread.sleep(2000);
        gesture.back(driver);
        Thread.sleep(2000);
        gesture.home(driver);
        Thread.sleep(2000);
        gesture.recentapp(driver);
    }

}
