package base;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import java.net.URL;

public class DriverFactory {
    public static AndroidDriver initDriver() throws Exception {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("Android");
        options.setDeviceName("Pixel_7");
        options.setAutomationName("UiAutomator2");
        options.setAppPackage("com.what3words.android");
        options.setAppActivity(".ui.start.StartActivity");

        return new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
    }
}