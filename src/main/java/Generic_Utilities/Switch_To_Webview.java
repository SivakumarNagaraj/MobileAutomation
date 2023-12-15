package Generic_Utilities;

import io.appium.java_client.android.AndroidDriver;

import java.util.Set;

public class Switch_To_Webview {
    // Need to set the chromedriver exe into the options
    public void switchWebView(AndroidDriver driver){
        Set<String> contexts = driver.getContextHandles();
        for (String context:contexts) {
            driver.context(context);
        }
    }
}
