package Practice_Scripts;

import Generic_Utilities.Base_class;
import Generic_Utilities.Scroll;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Add_Cart extends Base_class {
    @Test
    public void cart() throws InterruptedException {

        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"standard_user\"]")).click();
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"LOGIN\"]")).click();
        WebElement product = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"test-Item title\" and @text=\"Sauce Labs Backpack\"]"));
        product.click();
        String productname = product.getText();
        Thread.sleep(4000);
        Scroll sc = new Scroll();
        sc.scroll(driver,"ADD TO CART");
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"ADD TO CART\"]")).click();
        driver.findElement(AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"test-Cart\"]/android.view.ViewGroup/android.widget.ImageView")).click();
        String cartproductname = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Sauce Labs Backpack\"]")).getText();
        Thread.sleep(4000);
        Assert.assertEquals(productname,cartproductname);

    }
}
