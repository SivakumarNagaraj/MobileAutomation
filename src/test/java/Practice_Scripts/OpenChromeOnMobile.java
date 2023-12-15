package Practice_Scripts;

import Generic_Utilities.BrowserBaseclass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class OpenChromeOnMobile extends BrowserBaseclass {

    @Test
    public void openChrome(){
        driver.get("https://www.google.com");
        driver.findElement(By.name("q")).sendKeys("SivaKumar");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
    }
}
