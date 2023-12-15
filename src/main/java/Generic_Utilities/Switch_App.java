package Generic_Utilities;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.android.AndroidDriver;

public class Switch_App {
    public void switch_App(AndroidDriver driver,String activity, String classname){

        driver.executeScript("mobile: "+activity, ImmutableMap.of("intent",classname));
    }
}
