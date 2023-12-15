package Generic_Utilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.DeviceRotation;

public class Android_Gesture {

    public void back(AndroidDriver driver){

        driver.pressKey(new KeyEvent(AndroidKey.BACK));
    }

    public void home(AndroidDriver driver){

        driver.pressKey(new KeyEvent(AndroidKey.HOME));
    }

    public void recentapp(AndroidDriver driver){
        driver.pressKey(new KeyEvent(AndroidKey.APP_SWITCH));
    }

    public void rotate(AndroidDriver driver,int x, int y, int z){
        DeviceRotation landscape = new DeviceRotation(x, y, z);
        driver.rotate(landscape);
    }
}
