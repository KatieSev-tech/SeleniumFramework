package pageobjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class BaseMain {
<<<<<<< Updated upstream
=======

    String menuList = "//body[1]/div[1]/div[1]/div[1]/div[2]/a";
    int listSizeActual;
    int listSizeExpected = 4;
    String expectedTitle = "My Fork - your educational solution";
    String actualTitle;
    String socialsMenuList = "//body/div[@id='app']/div[3]/div[1]/a";
    int listSocialsListExpected = 3;
    int listSocialsListActual;
    int pixels;


>>>>>>> Stashed changes
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

<<<<<<< Updated upstream
    public void scrollingPage (){
        int pixels = 3000;
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0," + pixels + ")", "");
    }
=======
    public void windowHandling () {
        List<String> tabHandler = new ArrayList<>(driver.getWindowHandles());
        int tab = tabHandler.size();
        driver.switchTo().window(tabHandler.get(tab));
        driver.navigate().to(tabHandler.get(tab));
    }


        public void scrollingPage () {

            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0," + pixels + ")", "");
        }
>>>>>>> Stashed changes
}

