package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class SearchPage {
    AndroidDriver driver;
    By searchInput = By.id("search_input");

    public SearchPage(AndroidDriver driver){
        this.driver = driver;
    }

    public void search(String keyword){
        driver.findElement(searchInput).sendKeys(keyword);
    }
}