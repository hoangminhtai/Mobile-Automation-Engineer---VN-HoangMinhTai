package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class ResultPage {
    AndroidDriver driver;

    By resultList = By.id("result_list");
    By errorMessage = By.id("error_message");

    public ResultPage(AndroidDriver driver){
        this.driver = driver;
    }

    public boolean isResultDisplayed(){
        return driver.findElement(resultList).isDisplayed();
    }

    public String getErrorMessage(){
        return driver.findElement(errorMessage).getText();
    }
}