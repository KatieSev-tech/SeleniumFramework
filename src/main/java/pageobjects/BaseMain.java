package pageobjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class BaseMain {
    public ChromeDriver driver;

    public BaseMain(ChromeDriver driver) {
        this.driver = driver;
    }

    public void windowHandling () {
        List<String> tabHandler = new ArrayList<>(driver.getWindowHandles());
        int tab = tabHandler.size();
        for (int i = 0; i < tabHandler.size(); i++) {
            driver.switchTo().window(tabHandler.get(tab));
        }
    }

    public void scrollingPage (){
        int pixels = 3000;
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0," + pixels + ")", "");
    }
}

