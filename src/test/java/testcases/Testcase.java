package testcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Testcase {
    @Test
    public void startBrowser(){
        System.setProperty("webdriver.chrome.driver","/Users/katerynasevriukova/IdeaProjects/SeleniumProject/src/test/resources/executables/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);

        driver.get("https://www.thebroad.org/");

    }


}
