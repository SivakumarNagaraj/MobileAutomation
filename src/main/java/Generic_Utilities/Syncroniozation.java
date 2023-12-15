package Generic_Utilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Syncroniozation {

    public void implicitlyWait(AppiumDriver driver, int sec){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));
    }
    public void Explicitlywait(AppiumDriver driver, int sec){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(sec));
    }
}
