package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class HomePage {
    AndroidDriver driver;
    By searchIcon = By.id("search_bar");

    public HomePage(AndroidDriver driver){
        this.driver = driver;
    }

    public void openSearch(){
        driver.findElement(searchIcon).click();
    }
}