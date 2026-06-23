package base;

import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.*;

public class BaseTest {
    protected AndroidDriver driver;

    @BeforeMethod
    public void setup() throws Exception {
        driver = DriverFactory.initDriver();
    }

    @AfterMethod
    public void tearDown() {
        if(driver != null) driver.quit();
    }
}