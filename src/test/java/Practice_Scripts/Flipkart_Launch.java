package Practice_Scripts;

import Generic_Utilities.Swipe;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

public class Flipkart_Launch {

    @Test
    public void launch() throws InterruptedException, MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("emulator-5554");
        options.setApp("//Users//sivakumar//IdeaProjects//TestVagrant_Appium//src//test//java//Resource//flipkart.apk");
        options.setCapability("appWaitActivity", "com.flipkart.android.activity.FirstLaunchActivity");
        AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);

       // Thread.sleep(3000);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
        driver.findElement(AppiumBy.xpath("//android.widget." +
                "TextView[@resource-id=\"com.flipkart.android:id/custom_back_icon\"]")).click();
        Thread.sleep(20000);
        WebElement cancel = driver.findElement(AppiumBy.xpath("(//android.widget.FrameLayout" +
                "[@resource-id=\"com.flipkart.android:id/main_content\"])" +
                "[2]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]" +
                "/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.ImageView"));
        cancel.click();
        //wait.until(ExpectedConditions.elementToBeClickable(cancel));
        Thread.sleep(5000);
        //Left

        WebElement startElement = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"NextGen Brands \"]"));
        WebElement endElement= driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"SuperCoin \"]"));
        WebElement out =  wait.until(presenceOfElementLocated(AppiumBy.xpath("//android.widget.TextView[@text=\"NextGen Brands \"]")));
// Java

//        new Swipe().swipeIntoElement(driver,out,"left");
          new Swipe().swipeIntoElement(driver,"swipe", out,"left");
//        driver.executeScript("gesture: swipe", ImmutableMap.of(
//                "elementId", ((RemoteWebElement)out).getId(),
//                "percentage", 50,
//                "direction", "left"
//
//        ));        // Get the coordinates of the starting and ending elements
//        int startX = startElement.getLocation().getX();
//        int startY = startElement.getLocation().getY();
//        int endX = endElement.getLocation().getX();//+ startElement.getSize().getWidth()+5;
//        int endY = endElement.getLocation().getY();// + startElement.getSize().getHeight();
//
//        Swipe swipe = new Swipe();
//        swipe.swipeIntoElement(driver,startX,startY,endX,endY);


        Thread.sleep(3000);


    }
}
